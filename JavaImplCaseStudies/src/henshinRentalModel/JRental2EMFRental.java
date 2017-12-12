package henshinRentalModel;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;

import rentalService.Branch;
import rentalService.Car;
import rentalService.Client;
import rentalService.Rental;
import rentalService.Reservation;
import rentalServiceModel.BranchArray;
import rentalServiceModel.RentalElement;
import rentalServiceModel.RentalServiceFactory;

public class JRental2EMFRental extends JObjectGraph2EMFObjectGraph {

	@Override
	protected void doConversion() {
		assert (jRoot instanceof Rental);

		convertObjects();
		convertLinks();
		addAllToContainer();
	}

	private void convertObjects() {
		Rental jRental = (Rental) this.jRoot;

		rentalServiceModel.Rental eRental = RentalServiceFactory.eINSTANCE.createRental();
		this.eRoot = eRental;
		this.jObject2EObject.put(jRental, eRental);
		this.eObject2JObject.put(eRental, jRental);
		this.allEObjects.add(eRental);

		for (Branch jBranch : jRental.branches) {
			rentalServiceModel.Branch eBranch = RentalServiceFactory.eINSTANCE.createBranch();
			eBranch.setCity(jBranch.city);
			eBranch.setCMax(jBranch.cMax);
			eBranch.setRMax(jBranch.rMax);
			this.jObject2EObject.put(jBranch, eBranch);
			this.eObject2JObject.put(eBranch, jBranch);
			this.allEObjects.add(eBranch);
			
			for (Client jOf  : jBranch.of) {
				rentalServiceModel.Client eOf = RentalServiceFactory.eINSTANCE.createClient();
				eOf.setCName(jOf.cName);
				eOf.setCID(jOf.cID);
				this.jObject2EObject.put(jOf, eOf);
				this.eObject2JObject.put(eOf, jOf);
				this.allEObjects.add(eOf);
			}
			
			for (Car jAt  : jBranch.at) {
				rentalServiceModel.Car eAt = RentalServiceFactory.eINSTANCE.createCar();
				eAt.setRegistration(jAt.registration);
				this.jObject2EObject.put(jAt, eAt);
				this.eObject2JObject.put(eAt, jAt);
				this.allEObjects.add(eAt);
			}
		}

		for (Reservation jReservation : jRental.reservations) {
			rentalServiceModel.Reservation eReservation = RentalServiceFactory.eINSTANCE.createReservation();
			eReservation.setReference(jReservation.reference);
			this.jObject2EObject.put(jReservation, eReservation);
			this.eObject2JObject.put(eReservation, jReservation);
			this.allEObjects.add(eReservation);

			Client jMade = jReservation.made;
			rentalServiceModel.Client eMade = RentalServiceFactory.eINSTANCE.createClient();
			eMade.setCName(jMade.cName);
			eMade.setCID(jMade.cID);
			this.jObject2EObject.put(jMade, eMade);
			this.eObject2JObject.put(eMade, jMade);
			this.allEObjects.add(eMade);

			Car jFor = jReservation.For;
			rentalServiceModel.Car eFor = RentalServiceFactory.eINSTANCE.createCar();
			eFor.setRegistration(jFor.registration);
			this.jObject2EObject.put(jFor, eFor);
			this.eObject2JObject.put(eFor, jFor);
			this.allEObjects.add(eFor);
		}
	}

	private void convertLinks() {
		ArrayList<EObject> allEObjectsCopy = new ArrayList<EObject>();
		allEObjectsCopy.addAll(allEObjects);

		for (EObject eObject : allEObjectsCopy) {
			Object jObject = eObject2JObject.get(eObject);

			if (jObject instanceof Rental) {
				connectRental((Rental) jObject);
			} else if (jObject instanceof Branch) {
				connectBranch((Branch) jObject);
			} else if (jObject instanceof Reservation) {
				connectReservation((Reservation) jObject);
			} else if (jObject instanceof Car) {
				connectCar((Car) jObject);
			} else if (jObject instanceof Client) {
				connectClient((Client) jObject);
			} else {
				throw new RuntimeException("Should never happen!");
			}
		}
	}

	private void connectRental(Rental jRental) {
		rentalServiceModel.Rental eRental = (rentalServiceModel.Rental) this.jObject2EObject.get(jRental);

		BranchArray branches = RentalServiceFactory.eINSTANCE.createBranchArray();
		branches.setSize(jRental.branches.length);
		allEObjects.add(branches);
		eRental.setBranches(branches);
		for (Branch jBranch : jRental.branches) {
			rentalServiceModel.Branch eBranch = (rentalServiceModel.Branch) this.jObject2EObject.get(jBranch);
			branches.getIndex().add(eBranch);
		}

		rentalServiceModel.ArrayList reservations = RentalServiceFactory.eINSTANCE.createArrayList();
		reservations.setSize(jRental.reservations.size());
		allEObjects.add(reservations);
		eRental.setReservations(reservations);
		for (Reservation jReservation : jRental.reservations) {
			rentalServiceModel.Reservation eReservation = (rentalServiceModel.Reservation) this.jObject2EObject
					.get(jReservation);
			reservations.getIndex().add(eReservation);
		}
	}

	private void connectBranch(Branch jBranch) {
		rentalServiceModel.Branch eBranch = (rentalServiceModel.Branch) this.jObject2EObject.get(jBranch);

		rentalServiceModel.ArrayList at = RentalServiceFactory.eINSTANCE.createArrayList();
		at.setSize(jBranch.at.size());
		allEObjects.add(at);
		eBranch.setAt(at);
		for (Car jCar : jBranch.at) {
			rentalServiceModel.Car eCar = (rentalServiceModel.Car) this.jObject2EObject.get(jCar);
			at.getIndex().add(eCar);
		}
		
		rentalServiceModel.ArrayList of = RentalServiceFactory.eINSTANCE.createArrayList();
		of.setSize(jBranch.of.size());
		allEObjects.add(of);
		eBranch.setOf(of);
		for (Client jClient : jBranch.of) {
			rentalServiceModel.Client eClient = (rentalServiceModel.Client) this.jObject2EObject.get(jClient);
			of.getIndex().add(eClient);
		}
	}

	private void connectReservation(Reservation jReservation) {
		rentalServiceModel.Reservation eReservation = (rentalServiceModel.Reservation) this.jObject2EObject.get(jReservation);
		
		eReservation.setDropoff((rentalServiceModel.Branch) this.jObject2EObject.get(jReservation.dropoff));
		eReservation.setPickup((rentalServiceModel.Branch) this.jObject2EObject.get(jReservation.pickup));
		eReservation.setMade((rentalServiceModel.Client) this.jObject2EObject.get(jReservation.made));
		eReservation.setFor((rentalServiceModel.Car) this.jObject2EObject.get(jReservation.For));
	}

	private void connectCar(Car jCar) {
		// nothing to do
	}

	private void connectClient(Client jClient) {
		// nothing to do
	}
	
	private void addAllToContainer(){
		rentalServiceModel.Rental eRental = (rentalServiceModel.Rental) eRoot;
		for (EObject eObject : allEObjects) {
			if (eObject == eRental) {
				continue;
			}

			eRental.getRentalelements().add((RentalElement) eObject);
		}
	}
}
