/**
 */
package rentalServiceModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import rentalServiceModel.ArrayList;
import rentalServiceModel.BranchArray;
import rentalServiceModel.Rental;
import rentalServiceModel.RentalElement;
import rentalServiceModel.RentalServicePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rental</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rentalServiceModel.impl.RentalImpl#getBranches <em>Branches</em>}</li>
 *   <li>{@link rentalServiceModel.impl.RentalImpl#getReservations <em>Reservations</em>}</li>
 *   <li>{@link rentalServiceModel.impl.RentalImpl#getRentalelements <em>Rentalelements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RentalImpl extends MinimalEObjectImpl.Container implements Rental {
	/**
	 * The cached value of the '{@link #getBranches() <em>Branches</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranches()
	 * @generated
	 * @ordered
	 */
	protected BranchArray branches;

	/**
	 * The cached value of the '{@link #getReservations() <em>Reservations</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservations()
	 * @generated
	 * @ordered
	 */
	protected ArrayList reservations;

	/**
	 * The cached value of the '{@link #getRentalelements() <em>Rentalelements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRentalelements()
	 * @generated
	 * @ordered
	 */
	protected EList<RentalElement> rentalelements;

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
	public BranchArray getBranches() {
		if (branches != null && branches.eIsProxy()) {
			InternalEObject oldBranches = (InternalEObject)branches;
			branches = (BranchArray)eResolveProxy(oldBranches);
			if (branches != oldBranches) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RentalServicePackage.RENTAL__BRANCHES, oldBranches, branches));
			}
		}
		return branches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BranchArray basicGetBranches() {
		return branches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBranches(BranchArray newBranches) {
		BranchArray oldBranches = branches;
		branches = newBranches;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RentalServicePackage.RENTAL__BRANCHES, oldBranches, branches));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList getReservations() {
		if (reservations != null && reservations.eIsProxy()) {
			InternalEObject oldReservations = (InternalEObject)reservations;
			reservations = (ArrayList)eResolveProxy(oldReservations);
			if (reservations != oldReservations) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RentalServicePackage.RENTAL__RESERVATIONS, oldReservations, reservations));
			}
		}
		return reservations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList basicGetReservations() {
		return reservations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReservations(ArrayList newReservations) {
		ArrayList oldReservations = reservations;
		reservations = newReservations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RentalServicePackage.RENTAL__RESERVATIONS, oldReservations, reservations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RentalElement> getRentalelements() {
		if (rentalelements == null) {
			rentalelements = new EObjectContainmentEList<RentalElement>(RentalElement.class, this, RentalServicePackage.RENTAL__RENTALELEMENTS);
		}
		return rentalelements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RentalServicePackage.RENTAL__RENTALELEMENTS:
				return ((InternalEList<?>)getRentalelements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
				if (resolve) return getBranches();
				return basicGetBranches();
			case RentalServicePackage.RENTAL__RESERVATIONS:
				if (resolve) return getReservations();
				return basicGetReservations();
			case RentalServicePackage.RENTAL__RENTALELEMENTS:
				return getRentalelements();
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
				setBranches((BranchArray)newValue);
				return;
			case RentalServicePackage.RENTAL__RESERVATIONS:
				setReservations((ArrayList)newValue);
				return;
			case RentalServicePackage.RENTAL__RENTALELEMENTS:
				getRentalelements().clear();
				getRentalelements().addAll((Collection<? extends RentalElement>)newValue);
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
				setBranches((BranchArray)null);
				return;
			case RentalServicePackage.RENTAL__RESERVATIONS:
				setReservations((ArrayList)null);
				return;
			case RentalServicePackage.RENTAL__RENTALELEMENTS:
				getRentalelements().clear();
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
				return branches != null;
			case RentalServicePackage.RENTAL__RESERVATIONS:
				return reservations != null;
			case RentalServicePackage.RENTAL__RENTALELEMENTS:
				return rentalelements != null && !rentalelements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RentalImpl
