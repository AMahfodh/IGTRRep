/**
 */
package rentalServiceModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import rentalServiceModel.Branch;
import rentalServiceModel.Car;
import rentalServiceModel.Client;
import rentalServiceModel.RentalServicePackage;
import rentalServiceModel.Reservation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reservation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rentalServiceModel.impl.ReservationImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link rentalServiceModel.impl.ReservationImpl#getMade <em>Made</em>}</li>
 *   <li>{@link rentalServiceModel.impl.ReservationImpl#getPickup <em>Pickup</em>}</li>
 *   <li>{@link rentalServiceModel.impl.ReservationImpl#getDropoff <em>Dropoff</em>}</li>
 *   <li>{@link rentalServiceModel.impl.ReservationImpl#getFor <em>For</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReservationImpl extends RentalElementImpl implements Reservation {
	/**
	 * The default value of the '{@link #getReference() <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected String reference = REFERENCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMade() <em>Made</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMade()
	 * @generated
	 * @ordered
	 */
	protected Client made;

	/**
	 * The cached value of the '{@link #getPickup() <em>Pickup</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPickup()
	 * @generated
	 * @ordered
	 */
	protected Branch pickup;

	/**
	 * The cached value of the '{@link #getDropoff() <em>Dropoff</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDropoff()
	 * @generated
	 * @ordered
	 */
	protected Branch dropoff;

	/**
	 * The cached value of the '{@link #getFor() <em>For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFor()
	 * @generated
	 * @ordered
	 */
	protected Car for_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RentalServicePackage.Literals.RESERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(String newReference) {
		String oldReference = reference;
		reference = newReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RentalServicePackage.RESERVATION__REFERENCE, oldReference, reference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client getMade() {
		if (made != null && made.eIsProxy()) {
			InternalEObject oldMade = (InternalEObject)made;
			made = (Client)eResolveProxy(oldMade);
			if (made != oldMade) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RentalServicePackage.RESERVATION__MADE, oldMade, made));
			}
		}
		return made;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client basicGetMade() {
		return made;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMade(Client newMade) {
		Client oldMade = made;
		made = newMade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RentalServicePackage.RESERVATION__MADE, oldMade, made));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Branch getPickup() {
		if (pickup != null && pickup.eIsProxy()) {
			InternalEObject oldPickup = (InternalEObject)pickup;
			pickup = (Branch)eResolveProxy(oldPickup);
			if (pickup != oldPickup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RentalServicePackage.RESERVATION__PICKUP, oldPickup, pickup));
			}
		}
		return pickup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Branch basicGetPickup() {
		return pickup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPickup(Branch newPickup) {
		Branch oldPickup = pickup;
		pickup = newPickup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RentalServicePackage.RESERVATION__PICKUP, oldPickup, pickup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Branch getDropoff() {
		if (dropoff != null && dropoff.eIsProxy()) {
			InternalEObject oldDropoff = (InternalEObject)dropoff;
			dropoff = (Branch)eResolveProxy(oldDropoff);
			if (dropoff != oldDropoff) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RentalServicePackage.RESERVATION__DROPOFF, oldDropoff, dropoff));
			}
		}
		return dropoff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Branch basicGetDropoff() {
		return dropoff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDropoff(Branch newDropoff) {
		Branch oldDropoff = dropoff;
		dropoff = newDropoff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RentalServicePackage.RESERVATION__DROPOFF, oldDropoff, dropoff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Car getFor() {
		if (for_ != null && for_.eIsProxy()) {
			InternalEObject oldFor = (InternalEObject)for_;
			for_ = (Car)eResolveProxy(oldFor);
			if (for_ != oldFor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RentalServicePackage.RESERVATION__FOR, oldFor, for_));
			}
		}
		return for_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Car basicGetFor() {
		return for_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFor(Car newFor) {
		Car oldFor = for_;
		for_ = newFor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RentalServicePackage.RESERVATION__FOR, oldFor, for_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RentalServicePackage.RESERVATION__REFERENCE:
				return getReference();
			case RentalServicePackage.RESERVATION__MADE:
				if (resolve) return getMade();
				return basicGetMade();
			case RentalServicePackage.RESERVATION__PICKUP:
				if (resolve) return getPickup();
				return basicGetPickup();
			case RentalServicePackage.RESERVATION__DROPOFF:
				if (resolve) return getDropoff();
				return basicGetDropoff();
			case RentalServicePackage.RESERVATION__FOR:
				if (resolve) return getFor();
				return basicGetFor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RentalServicePackage.RESERVATION__REFERENCE:
				setReference((String)newValue);
				return;
			case RentalServicePackage.RESERVATION__MADE:
				setMade((Client)newValue);
				return;
			case RentalServicePackage.RESERVATION__PICKUP:
				setPickup((Branch)newValue);
				return;
			case RentalServicePackage.RESERVATION__DROPOFF:
				setDropoff((Branch)newValue);
				return;
			case RentalServicePackage.RESERVATION__FOR:
				setFor((Car)newValue);
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
			case RentalServicePackage.RESERVATION__REFERENCE:
				setReference(REFERENCE_EDEFAULT);
				return;
			case RentalServicePackage.RESERVATION__MADE:
				setMade((Client)null);
				return;
			case RentalServicePackage.RESERVATION__PICKUP:
				setPickup((Branch)null);
				return;
			case RentalServicePackage.RESERVATION__DROPOFF:
				setDropoff((Branch)null);
				return;
			case RentalServicePackage.RESERVATION__FOR:
				setFor((Car)null);
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
			case RentalServicePackage.RESERVATION__REFERENCE:
				return REFERENCE_EDEFAULT == null ? reference != null : !REFERENCE_EDEFAULT.equals(reference);
			case RentalServicePackage.RESERVATION__MADE:
				return made != null;
			case RentalServicePackage.RESERVATION__PICKUP:
				return pickup != null;
			case RentalServicePackage.RESERVATION__DROPOFF:
				return dropoff != null;
			case RentalServicePackage.RESERVATION__FOR:
				return for_ != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (reference: ");
		result.append(reference);
		result.append(')');
		return result.toString();
	}

} //ReservationImpl
