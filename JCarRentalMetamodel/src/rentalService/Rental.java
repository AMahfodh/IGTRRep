/**
 */
package rentalService;

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
 *   <li>{@link rentalService.Rental#getBranches <em>Branches</em>}</li>
 *   <li>{@link rentalService.Rental#getReservations <em>Reservations</em>}</li>
 * </ul>
 *
 * @see rentalService.RentalServicePackage#getRental()
 * @model
 * @generated
 */
public interface Rental extends EObject {
	/**
	 * Returns the value of the '<em><b>Branches</b></em>' reference list.
	 * The list contents are of type {@link rentalService.BranchArray}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branches</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches</em>' reference list.
	 * @see rentalService.RentalServicePackage#getRental_Branches()
	 * @model
	 * @generated
	 */
	EList<BranchArray> getBranches();

	/**
	 * Returns the value of the '<em><b>Reservations</b></em>' reference list.
	 * The list contents are of type {@link rentalService.Reservation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reservations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservations</em>' reference list.
	 * @see rentalService.RentalServicePackage#getRental_Reservations()
	 * @model
	 * @generated
	 */
	EList<Reservation> getReservations();

} // Rental
