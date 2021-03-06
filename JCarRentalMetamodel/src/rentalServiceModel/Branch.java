/**
 */
package rentalServiceModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rentalServiceModel.Branch#getCity <em>City</em>}</li>
 *   <li>{@link rentalServiceModel.Branch#getCMax <em>CMax</em>}</li>
 *   <li>{@link rentalServiceModel.Branch#getRMax <em>RMax</em>}</li>
 *   <li>{@link rentalServiceModel.Branch#getAt <em>At</em>}</li>
 *   <li>{@link rentalServiceModel.Branch#getOf <em>Of</em>}</li>
 * </ul>
 *
 * @see rentalServiceModel.RentalServicePackage#getBranch()
 * @model
 * @generated
 */
public interface Branch extends RentalElement {
	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see rentalServiceModel.RentalServicePackage#getBranch_City()
	 * @model
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link rentalServiceModel.Branch#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>CMax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CMax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CMax</em>' attribute.
	 * @see #setCMax(int)
	 * @see rentalServiceModel.RentalServicePackage#getBranch_CMax()
	 * @model
	 * @generated
	 */
	int getCMax();

	/**
	 * Sets the value of the '{@link rentalServiceModel.Branch#getCMax <em>CMax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CMax</em>' attribute.
	 * @see #getCMax()
	 * @generated
	 */
	void setCMax(int value);

	/**
	 * Returns the value of the '<em><b>RMax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RMax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RMax</em>' attribute.
	 * @see #setRMax(int)
	 * @see rentalServiceModel.RentalServicePackage#getBranch_RMax()
	 * @model
	 * @generated
	 */
	int getRMax();

	/**
	 * Sets the value of the '{@link rentalServiceModel.Branch#getRMax <em>RMax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RMax</em>' attribute.
	 * @see #getRMax()
	 * @generated
	 */
	void setRMax(int value);

	/**
	 * Returns the value of the '<em><b>At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>At</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>At</em>' reference.
	 * @see #setAt(ArrayList)
	 * @see rentalServiceModel.RentalServicePackage#getBranch_At()
	 * @model
	 * @generated
	 */
	ArrayList getAt();

	/**
	 * Sets the value of the '{@link rentalServiceModel.Branch#getAt <em>At</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>At</em>' reference.
	 * @see #getAt()
	 * @generated
	 */
	void setAt(ArrayList value);

	/**
	 * Returns the value of the '<em><b>Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Of</em>' reference.
	 * @see #setOf(ArrayList)
	 * @see rentalServiceModel.RentalServicePackage#getBranch_Of()
	 * @model
	 * @generated
	 */
	ArrayList getOf();

	/**
	 * Sets the value of the '{@link rentalServiceModel.Branch#getOf <em>Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Of</em>' reference.
	 * @see #getOf()
	 * @generated
	 */
	void setOf(ArrayList value);

} // Branch
