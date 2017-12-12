/**
 */
package rentalServiceModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Car</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rentalServiceModel.Car#getRegistration <em>Registration</em>}</li>
 * </ul>
 *
 * @see rentalServiceModel.RentalServicePackage#getCar()
 * @model
 * @generated
 */
public interface Car extends ArrayListElement, RentalElement {
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
	 * @see rentalServiceModel.RentalServicePackage#getCar_Registration()
	 * @model
	 * @generated
	 */
	String getRegistration();

	/**
	 * Sets the value of the '{@link rentalServiceModel.Car#getRegistration <em>Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registration</em>' attribute.
	 * @see #getRegistration()
	 * @generated
	 */
	void setRegistration(String value);

} // Car
