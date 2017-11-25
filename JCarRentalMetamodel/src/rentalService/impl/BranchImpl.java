/**
 */
package rentalService.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import rentalService.ArrayList;
import rentalService.Branch;
import rentalService.RentalServicePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rentalService.impl.BranchImpl#getCity <em>City</em>}</li>
 *   <li>{@link rentalService.impl.BranchImpl#getCMax <em>CMax</em>}</li>
 *   <li>{@link rentalService.impl.BranchImpl#getRMax <em>RMax</em>}</li>
 *   <li>{@link rentalService.impl.BranchImpl#getAt <em>At</em>}</li>
 *   <li>{@link rentalService.impl.BranchImpl#getOf <em>Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BranchImpl extends MinimalEObjectImpl.Container implements Branch {
	/**
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected String city = CITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCMax() <em>CMax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCMax()
	 * @generated
	 * @ordered
	 */
	protected static final int CMAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCMax() <em>CMax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCMax()
	 * @generated
	 * @ordered
	 */
	protected int cMax = CMAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getRMax() <em>RMax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRMax()
	 * @generated
	 * @ordered
	 */
	protected static final int RMAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRMax() <em>RMax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRMax()
	 * @generated
	 * @ordered
	 */
	protected int rMax = RMAX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAt() <em>At</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAt()
	 * @generated
	 * @ordered
	 */
	protected ArrayList at;

	/**
	 * The cached value of the '{@link #getOf() <em>Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOf()
	 * @generated
	 * @ordered
	 */
	protected ArrayList of;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BranchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RentalServicePackage.Literals.BRANCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(String newCity) {
		String oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RentalServicePackage.BRANCH__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCMax() {
		return cMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCMax(int newCMax) {
		int oldCMax = cMax;
		cMax = newCMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RentalServicePackage.BRANCH__CMAX, oldCMax, cMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRMax() {
		return rMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRMax(int newRMax) {
		int oldRMax = rMax;
		rMax = newRMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RentalServicePackage.BRANCH__RMAX, oldRMax, rMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList getAt() {
		if (at != null && at.eIsProxy()) {
			InternalEObject oldAt = (InternalEObject)at;
			at = (ArrayList)eResolveProxy(oldAt);
			if (at != oldAt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RentalServicePackage.BRANCH__AT, oldAt, at));
			}
		}
		return at;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList basicGetAt() {
		return at;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAt(ArrayList newAt) {
		ArrayList oldAt = at;
		at = newAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RentalServicePackage.BRANCH__AT, oldAt, at));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList getOf() {
		if (of != null && of.eIsProxy()) {
			InternalEObject oldOf = (InternalEObject)of;
			of = (ArrayList)eResolveProxy(oldOf);
			if (of != oldOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RentalServicePackage.BRANCH__OF, oldOf, of));
			}
		}
		return of;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList basicGetOf() {
		return of;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOf(ArrayList newOf) {
		ArrayList oldOf = of;
		of = newOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RentalServicePackage.BRANCH__OF, oldOf, of));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RentalServicePackage.BRANCH__CITY:
				return getCity();
			case RentalServicePackage.BRANCH__CMAX:
				return getCMax();
			case RentalServicePackage.BRANCH__RMAX:
				return getRMax();
			case RentalServicePackage.BRANCH__AT:
				if (resolve) return getAt();
				return basicGetAt();
			case RentalServicePackage.BRANCH__OF:
				if (resolve) return getOf();
				return basicGetOf();
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
			case RentalServicePackage.BRANCH__CITY:
				setCity((String)newValue);
				return;
			case RentalServicePackage.BRANCH__CMAX:
				setCMax((Integer)newValue);
				return;
			case RentalServicePackage.BRANCH__RMAX:
				setRMax((Integer)newValue);
				return;
			case RentalServicePackage.BRANCH__AT:
				setAt((ArrayList)newValue);
				return;
			case RentalServicePackage.BRANCH__OF:
				setOf((ArrayList)newValue);
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
			case RentalServicePackage.BRANCH__CITY:
				setCity(CITY_EDEFAULT);
				return;
			case RentalServicePackage.BRANCH__CMAX:
				setCMax(CMAX_EDEFAULT);
				return;
			case RentalServicePackage.BRANCH__RMAX:
				setRMax(RMAX_EDEFAULT);
				return;
			case RentalServicePackage.BRANCH__AT:
				setAt((ArrayList)null);
				return;
			case RentalServicePackage.BRANCH__OF:
				setOf((ArrayList)null);
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
			case RentalServicePackage.BRANCH__CITY:
				return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
			case RentalServicePackage.BRANCH__CMAX:
				return cMax != CMAX_EDEFAULT;
			case RentalServicePackage.BRANCH__RMAX:
				return rMax != RMAX_EDEFAULT;
			case RentalServicePackage.BRANCH__AT:
				return at != null;
			case RentalServicePackage.BRANCH__OF:
				return of != null;
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
		result.append(" (city: ");
		result.append(city);
		result.append(", cMax: ");
		result.append(cMax);
		result.append(", rMax: ");
		result.append(rMax);
		result.append(')');
		return result.toString();
	}

} //BranchImpl
