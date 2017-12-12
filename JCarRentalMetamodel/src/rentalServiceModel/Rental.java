/**
 */
package rentalServiceModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rental</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rentalServiceModel.Rental#getBranches <em>Branches</em>}</li>
 *   <li>{@link rentalServiceModel.Rental#getReservations <em>Reservations</em>}</li>
 *   <li>{@link rentalServiceModel.Rental#getRentalelements <em>Rentalelements</em>}</li>
 * </ul>
 *
 * @see rentalServiceModel.RentalServicePackage#getRental()
 * @model
 * @generated
 */
public interface Rental extends EObject {
	/**
	 * Returns the value of the '<em><b>Branches</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branches</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches</em>' reference.
	 * @see #setBranches(BranchArray)
	 * @see rentalServiceModel.RentalServicePackage#getRental_Branches()
	 * @model
	 * @generated
	 */
	BranchArray getBranches();

	/**
	 * Sets the value of the '{@link rentalServiceModel.Rental#getBranches <em>Branches</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branches</em>' reference.
	 * @see #getBranches()
	 * @generated
	 */
	void setBranches(BranchArray value);

	/**
	 * Returns the value of the '<em><b>Reservations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reservations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservations</em>' reference.
	 * @see #setReservations(ArrayList)
	 * @see rentalServiceModel.RentalServicePackage#getRental_Reservations()
	 * @model
	 * @generated
	 */
	ArrayList getReservations();

	/**
	 * Sets the value of the '{@link rentalServiceModel.Rental#getReservations <em>Reservations</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reservations</em>' reference.
	 * @see #getReservations()
	 * @generated
	 */
	void setReservations(ArrayList value);

	/**
	 * Returns the value of the '<em><b>Rentalelements</b></em>' containment reference list.
	 * The list contents are of type {@link rentalServiceModel.RentalElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rentalelements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rentalelements</em>' containment reference list.
	 * @see rentalServiceModel.RentalServicePackage#getRental_Rentalelements()
	 * @model containment="true"
	 * @generated
	 */
	EList<RentalElement> getRentalelements();

} // Rental
