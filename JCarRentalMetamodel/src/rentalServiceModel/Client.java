/**
 */
package rentalServiceModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rentalServiceModel.Client#getCName <em>CName</em>}</li>
 *   <li>{@link rentalServiceModel.Client#getCID <em>CID</em>}</li>
 * </ul>
 *
 * @see rentalServiceModel.RentalServicePackage#getClient()
 * @model
 * @generated
 */
public interface Client extends ArrayListElement, RentalElement {
	/**
	 * Returns the value of the '<em><b>CName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CName</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CName</em>' attribute.
	 * @see #setCName(String)
	 * @see rentalServiceModel.RentalServicePackage#getClient_CName()
	 * @model
	 * @generated
	 */
	String getCName();

	/**
	 * Sets the value of the '{@link rentalServiceModel.Client#getCName <em>CName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CName</em>' attribute.
	 * @see #getCName()
	 * @generated
	 */
	void setCName(String value);

	/**
	 * Returns the value of the '<em><b>CID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CID</em>' attribute.
	 * @see #setCID(String)
	 * @see rentalServiceModel.RentalServicePackage#getClient_CID()
	 * @model
	 * @generated
	 */
	String getCID();

	/**
	 * Sets the value of the '{@link rentalServiceModel.Client#getCID <em>CID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CID</em>' attribute.
	 * @see #getCID()
	 * @generated
	 */
	void setCID(String value);

} // Client
