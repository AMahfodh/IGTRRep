/**
 */
package rentalService;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rentalService.Client#getCName <em>CName</em>}</li>
 *   <li>{@link rentalService.Client#getCID <em>CID</em>}</li>
 * </ul>
 *
 * @see rentalService.RentalServicePackage#getClient()
 * @model
 * @generated
 */
public interface Client extends ArrayListElement {
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
	 * @see rentalService.RentalServicePackage#getClient_CName()
	 * @model
	 * @generated
	 */
	String getCName();

	/**
	 * Sets the value of the '{@link rentalService.Client#getCName <em>CName</em>}' attribute.
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
	 * @see rentalService.RentalServicePackage#getClient_CID()
	 * @model
	 * @generated
	 */
	String getCID();

	/**
	 * Sets the value of the '{@link rentalService.Client#getCID <em>CID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CID</em>' attribute.
	 * @see #getCID()
	 * @generated
	 */
	void setCID(String value);

} // Client
