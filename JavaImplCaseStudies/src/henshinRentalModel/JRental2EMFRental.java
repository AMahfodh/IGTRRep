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
			this.jObject2EObject.put(jBranch, eBranch);
			this.eObject2JObject.put(eBranch, jBranch);
			this.allEObjects.add(eBranch);
		}

		for (Reservation jReservation : jRental.reservations) {
			rentalServiceModel.Reservation eReservation = RentalServiceFactory.eINSTANCE.createReservation();
			this.jObject2EObject.put(jReservation, eReservation);
			this.eObject2JObject.put(eReservation, jReservation);
			this.allEObjects.add(eReservation);

			Client jClient = jReservation.made;
			rentalServiceModel.Client eClient = RentalServiceFactory.eINSTANCE.createClient();
			this.jObject2EObject.put(jClient, eClient);
			this.eObject2JObject.put(eClient, jClient);
			this.allEObjects.add(eClient);

			Car jCar = jReservation.For;
			rentalServiceModel.Car eCar = RentalServiceFactory.eINSTANCE.createCar();
			this.jObject2EObject.put(jCar, eCar);
			this.eObject2JObject.put(eCar, jCar);
			this.allEObjects.add(eCar);
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
		allEObjects.add(branches);
		eRental.setBranches(branches);
		for (Branch jBranch : jRental.branches) {
			rentalServiceModel.Branch eBranch = (rentalServiceModel.Branch) this.jObject2EObject.get(jBranch);
			branches.getIndex().add(eBranch);
		}

		rentalServiceModel.ArrayList reservations = RentalServiceFactory.eINSTANCE.createArrayList();
		allEObjects.add(reservations);
		eRental.setReservations(reservations);
		for (Reservation jReservation : jRental.reservations) {
			rentalServiceModel.Reservation eReservation = (rentalServiceModel.Reservation) this.jObject2EObject
					.get(jReservation);
			reservations.getIndex().add(eReservation);
		}

		for (EObject eObject : allEObjects) {
			if (eObject == eRental) {
				continue;
			}

			eRental.getRentalelements().add((RentalElement) eObject);
		}
	}

	private void connectBranch(Branch jBranch) {
		rentalServiceModel.Branch eBranch = (rentalServiceModel.Branch) this.jObject2EObject.get(jBranch);

		rentalServiceModel.ArrayList at = RentalServiceFactory.eINSTANCE.createArrayList();
		allEObjects.add(at);
		eBranch.setAt(at);
		for (Car jCar : jBranch.at) {
			rentalServiceModel.Car eCar = (rentalServiceModel.Car) this.jObject2EObject.get(jCar);
			at.getIndex().add(eCar);
		}
		
		rentalServiceModel.ArrayList of = RentalServiceFactory.eINSTANCE.createArrayList();
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
}
