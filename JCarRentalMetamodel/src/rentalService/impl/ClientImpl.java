/**
 */
package rentalService.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import rentalService.Client;
import rentalService.RentalServicePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rentalService.impl.ClientImpl#getCName <em>CName</em>}</li>
 *   <li>{@link rentalService.impl.ClientImpl#getCID <em>CID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClientImpl extends ArrayListElementImpl implements Client {
	/**
	 * The default value of the '{@link #getCName() <em>CName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCName()
	 * @generated
	 * @ordered
	 */
	protected static final String CNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCName() <em>CName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCName()
	 * @generated
	 * @ordered
	 */
	protected String cName = CNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCID() <em>CID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCID()
	 * @generated
	 * @ordered
	 */
	protected static final String CID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCID() <em>CID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCID()
	 * @generated
	 * @ordered
	 */
	protected String cID = CID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RentalServicePackage.Literals.CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCName() {
		return cName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCName(String newCName) {
		String oldCName = cName;
		cName = newCName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RentalServicePackage.CLIENT__CNAME, oldCName, cName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCID() {
		return cID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCID(String newCID) {
		String oldCID = cID;
		cID = newCID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RentalServicePackage.CLIENT__CID, oldCID, cID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RentalServicePackage.CLIENT__CNAME:
				return getCName();
			case RentalServicePackage.CLIENT__CID:
				return getCID();
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
			case RentalServicePackage.CLIENT__CNAME:
				setCName((String)newValue);
				return;
			case RentalServicePackage.CLIENT__CID:
				setCID((String)newValue);
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
			case RentalServicePackage.CLIENT__CNAME:
				setCName(CNAME_EDEFAULT);
				return;
			case RentalServicePackage.CLIENT__CID:
				setCID(CID_EDEFAULT);
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
			case RentalServicePackage.CLIENT__CNAME:
				return CNAME_EDEFAULT == null ? cName != null : !CNAME_EDEFAULT.equals(cName);
			case RentalServicePackage.CLIENT__CID:
				return CID_EDEFAULT == null ? cID != null : !CID_EDEFAULT.equals(cID);
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
		result.append(" (cName: ");
		result.append(cName);
		result.append(", cID: ");
		result.append(cID);
		result.append(')');
		return result.toString();
	}

} //ClientImpl
