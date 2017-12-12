/**
 */
package rentalServiceModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rentalServiceModel.ArrayList#getIndex <em>Index</em>}</li>
 *   <li>{@link rentalServiceModel.ArrayList#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see rentalServiceModel.RentalServicePackage#getArrayList()
 * @model
 * @generated
 */
public interface ArrayList extends RentalElement {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' reference list.
	 * The list contents are of type {@link rentalServiceModel.ArrayListElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' reference list.
	 * @see rentalServiceModel.RentalServicePackage#getArrayList_Index()
	 * @model
	 * @generated
	 */
	EList<ArrayListElement> getIndex();

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see rentalServiceModel.RentalServicePackage#getArrayList_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link rentalServiceModel.ArrayList#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

} // ArrayList
