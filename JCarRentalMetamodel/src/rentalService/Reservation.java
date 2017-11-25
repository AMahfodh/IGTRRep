/**
 */
package rentalService;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reservation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rentalService.Reservation#getReference <em>Reference</em>}</li>
 *   <li>{@link rentalService.Reservation#getMade <em>Made</em>}</li>
 *   <li>{@link rentalService.Reservation#getPickup <em>Pickup</em>}</li>
 *   <li>{@link rentalService.Reservation#getDropoff <em>Dropoff</em>}</li>
 *   <li>{@link rentalService.Reservation#getFor <em>For</em>}</li>
 * </ul>
 *
 * @see rentalService.RentalServicePackage#getReservation()
 * @model
 * @generated
 */
public interface Reservation extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' attribute.
	 * @see #setReference(String)
	 * @see rentalService.RentalServicePackage#getReservation_Reference()
	 * @model
	 * @generated
	 */
	String getReference();

	/**
	 * Sets the value of the '{@link rentalService.Reservation#getReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' attribute.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(String value);

	/**
	 * Returns the value of the '<em><b>Made</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Made</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Made</em>' reference.
	 * @see #setMade(Client)
	 * @see rentalService.RentalServicePackage#getReservation_Made()
	 * @model
	 * @generated
	 */
	Client getMade();

	/**
	 * Sets the value of the '{@link rentalService.Reservation#getMade <em>Made</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Made</em>' reference.
	 * @see #getMade()
	 * @generated
	 */
	void setMade(Client value);

	/**
	 * Returns the value of the '<em><b>Pickup</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pickup</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pickup</em>' reference.
	 * @see #setPickup(Branch)
	 * @see rentalService.RentalServicePackage#getReservation_Pickup()
	 * @model
	 * @generated
	 */
	Branch getPickup();

	/**
	 * Sets the value of the '{@link rentalService.Reservation#getPickup <em>Pickup</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pickup</em>' reference.
	 * @see #getPickup()
	 * @generated
	 */
	void setPickup(Branch value);

	/**
	 * Returns the value of the '<em><b>Dropoff</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dropoff</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dropoff</em>' reference.
	 * @see #setDropoff(Branch)
	 * @see rentalService.RentalServicePackage#getReservation_Dropoff()
	 * @model
	 * @generated
	 */
	Branch getDropoff();

	/**
	 * Sets the value of the '{@link rentalService.Reservation#getDropoff <em>Dropoff</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dropoff</em>' reference.
	 * @see #getDropoff()
	 * @generated
	 */
	void setDropoff(Branch value);

	/**
	 * Returns the value of the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For</em>' reference.
	 * @see #setFor(Car)
	 * @see rentalService.RentalServicePackage#getReservation_For()
	 * @model
	 * @generated
	 */
	Car getFor();

	/**
	 * Sets the value of the '{@link rentalService.Reservation#getFor <em>For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For</em>' reference.
	 * @see #getFor()
	 * @generated
	 */
	void setFor(Car value);

} // Reservation
