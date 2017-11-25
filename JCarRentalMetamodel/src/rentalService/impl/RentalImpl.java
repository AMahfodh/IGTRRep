/**
 */
package rentalService.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import rentalService.BranchArray;
import rentalService.Rental;
import rentalService.RentalServicePackage;
import rentalService.Reservation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rental</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rentalService.impl.RentalImpl#getBranches <em>Branches</em>}</li>
 *   <li>{@link rentalService.impl.RentalImpl#getReservations <em>Reservations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RentalImpl extends MinimalEObjectImpl.Container implements Rental {
	/**
	 * The cached value of the '{@link #getBranches() <em>Branches</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranches()
	 * @generated
	 * @ordered
	 */
	protected EList<BranchArray> branches;

	/**
	 * The cached value of the '{@link #getReservations() <em>Reservations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservations()
	 * @generated
	 * @ordered
	 */
	protected EList<Reservation> reservations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RentalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RentalServicePackage.Literals.RENTAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BranchArray> getBranches() {
		if (branches == null) {
			branches = new EObjectResolvingEList<BranchArray>(BranchArray.class, this, RentalServicePackage.RENTAL__BRANCHES);
		}
		return branches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reservation> getReservations() {
		if (reservations == null) {
			reservations = new EObjectResolvingEList<Reservation>(Reservation.class, this, RentalServicePackage.RENTAL__RESERVATIONS);
		}
		return reservations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RentalServicePackage.RENTAL__BRANCHES:
				return getBranches();
			case RentalServicePackage.RENTAL__RESERVATIONS:
				return getReservations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RentalServicePackage.RENTAL__BRANCHES:
				getBranches().clear();
				getBranches().addAll((Collection<? extends BranchArray>)newValue);
				return;
			case RentalServicePackage.RENTAL__RESERVATIONS:
				getReservations().clear();
				getReservations().addAll((Collection<? extends Reservation>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RentalServicePackage.RENTAL__BRANCHES:
				getBranches().clear();
				return;
			case RentalServicePackage.RENTAL__RESERVATIONS:
				getReservations().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RentalServicePackage.RENTAL__BRANCHES:
				return branches != null && !branches.isEmpty();
			case RentalServicePackage.RENTAL__RESERVATIONS:
				return reservations != null && !reservations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RentalImpl
