/**
 */
package rentalService;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Car</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rentalService.Car#getRegistration <em>Registration</em>}</li>
 * </ul>
 *
 * @see rentalService.RentalServicePackage#getCar()
 * @model
 * @generated
 */
public interface Car extends ArrayListElement {
	/**
	 * Returns the value of the '<em><b>Registration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registration</em>' attribute.
	 * @see #setRegistration(String)
	 * @see rentalService.RentalServicePackage#getCar_Registration()
	 * @model
	 * @generated
	 */
	String getRegistration();

	/**
	 * Sets the value of the '{@link rentalService.Car#getRegistration <em>Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registration</em>' attribute.
	 * @see #getRegistration()
	 * @generated
	 */
	void setRegistration(String value);

} // Car
