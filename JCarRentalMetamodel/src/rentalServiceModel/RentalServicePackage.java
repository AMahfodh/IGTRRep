/**
 */
package rentalServiceModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see rentalServiceModel.RentalServiceFactory
 * @model kind="package"
 * @generated
 */
public interface RentalServicePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rentalServiceModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/rentalServiceModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rentalServiceModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RentalServicePackage eINSTANCE = rentalServiceModel.impl.RentalServicePackageImpl.init();

	/**
	 * The meta object id for the '{@link rentalServiceModel.impl.RentalElementImpl <em>Rental Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rentalServiceModel.impl.RentalElementImpl
	 * @see rentalServiceModel.impl.RentalServicePackageImpl#getRentalElement()
	 * @generated
	 */
	int RENTAL_ELEMENT = 8;

	/**
	 * The number of structural features of the '<em>Rental Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Rental Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rentalServiceModel.impl.BranchImpl <em>Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rentalServiceModel.impl.BranchImpl
	 * @see rentalServiceModel.impl.RentalServicePackageImpl#getBranch()
	 * @generated
	 */
	int BRANCH = 0;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__CITY = RENTAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CMax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__CMAX = RENTAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>RMax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__RMAX = RENTAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__AT = RENTAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__OF = RENTAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_FEATURE_COUNT = RENTAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_OPERATION_COUNT = RENTAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rentalServiceModel.impl.ArrayListElementImpl <em>Array List Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rentalServiceModel.impl.ArrayListElementImpl
	 * @see rentalServiceModel.impl.RentalServicePackageImpl#getArrayListElement()
	 * @generated
	 */
	int ARRAY_LIST_ELEMENT = 7;

	/**
	 * The number of structural features of the '<em>Array List Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_LIST_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Array List Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_LIST_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rentalServiceModel.impl.CarImpl <em>Car</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rentalServiceModel.impl.CarImpl
	 * @see rentalServiceModel.impl.RentalServicePackageImpl#getCar()
	 * @generated
	 */
	int CAR = 1;

	/**
	 * The feature id for the '<em><b>Registration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__REGISTRATION = ARRAY_LIST_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Car</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_FEATURE_COUNT = ARRAY_LIST_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Car</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_OPERATION_COUNT = ARRAY_LIST_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rentalServiceModel.impl.ClientImpl <em>Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rentalServiceModel.impl.ClientImpl
	 * @see rentalServiceModel.impl.RentalServicePackageImpl#getClient()
	 * @generated
	 */
	int CLIENT = 2;

	/**
	 * The feature id for the '<em><b>CName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__CNAME = ARRAY_LIST_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__CID = ARRAY_LIST_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_FEATURE_COUNT = ARRAY_LIST_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_OPERATION_COUNT = ARRAY_LIST_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rentalServiceModel.impl.ReservationImpl <em>Reservation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rentalServiceModel.impl.ReservationImpl
	 * @see rentalServiceModel.impl.RentalServicePackageImpl#getReservation()
	 * @generated
	 */
	int RESERVATION = 3;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__REFERENCE = RENTAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Made</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__MADE = RENTAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pickup</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__PICKUP = RENTAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dropoff</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__DROPOFF = RENTAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__FOR = RENTAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Reservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_FEATURE_COUNT = RENTAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Reservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_OPERATION_COUNT = RENTAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rentalServiceModel.impl.RentalImpl <em>Rental</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rentalServiceModel.impl.RentalImpl
	 * @see rentalServiceModel.impl.RentalServicePackageImpl#getRental()
	 * @generated
	 */
	int RENTAL = 4;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL__BRANCHES = 0;

	/**
	 * The feature id for the '<em><b>Reservations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL__RESERVATIONS = 1;

	/**
	 * The feature id for the '<em><b>Rentalelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL__RENTALELEMENTS = 2;

	/**
	 * The number of structural features of the '<em>Rental</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Rental</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rentalServiceModel.impl.BranchArrayImpl <em>Branch Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rentalServiceModel.impl.BranchArrayImpl
	 * @see rentalServiceModel.impl.RentalServicePackageImpl#getBranchArray()
	 * @generated
	 */
	int BRANCH_ARRAY = 5;

	/**
	 * The feature id for the '<em><b>Index</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_ARRAY__INDEX = RENTAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_ARRAY__SIZE = RENTAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Branch Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_ARRAY_FEATURE_COUNT = RENTAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Branch Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_ARRAY_OPERATION_COUNT = RENTAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rentalServiceModel.impl.ArrayListImpl <em>Array List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rentalServiceModel.impl.ArrayListImpl
	 * @see rentalServiceModel.impl.RentalServicePackageImpl#getArrayList()
	 * @generated
	 */
	int ARRAY_LIST = 6;

	/**
	 * The feature id for the '<em><b>Index</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_LIST__INDEX = RENTAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_LIST__SIZE = RENTAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Array List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_LIST_FEATURE_COUNT = RENTAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Array List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_LIST_OPERATION_COUNT = RENTAL_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link rentalServiceModel.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch</em>'.
	 * @see rentalServiceModel.Branch
	 * @generated
	 */
	EClass getBranch();

	/**
	 * Returns the meta object for the attribute '{@link rentalServiceModel.Branch#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see rentalServiceModel.Branch#getCity()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_City();

	/**
	 * Returns the meta object for the attribute '{@link rentalServiceModel.Branch#getCMax <em>CMax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CMax</em>'.
	 * @see rentalServiceModel.Branch#getCMax()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_CMax();

	/**
	 * Returns the meta object for the attribute '{@link rentalServiceModel.Branch#getRMax <em>RMax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RMax</em>'.
	 * @see rentalServiceModel.Branch#getRMax()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_RMax();

	/**
	 * Returns the meta object for the reference '{@link rentalServiceModel.Branch#getAt <em>At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>At</em>'.
	 * @see rentalServiceModel.Branch#getAt()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_At();

	/**
	 * Returns the meta object for the reference '{@link rentalServiceModel.Branch#getOf <em>Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Of</em>'.
	 * @see rentalServiceModel.Branch#getOf()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_Of();

	/**
	 * Returns the meta object for class '{@link rentalServiceModel.Car <em>Car</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Car</em>'.
	 * @see rentalServiceModel.Car
	 * @generated
	 */
	EClass getCar();

	/**
	 * Returns the meta object for the attribute '{@link rentalServiceModel.Car#getRegistration <em>Registration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registration</em>'.
	 * @see rentalServiceModel.Car#getRegistration()
	 * @see #getCar()
	 * @generated
	 */
	EAttribute getCar_Registration();

	/**
	 * Returns the meta object for class '{@link rentalServiceModel.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client</em>'.
	 * @see rentalServiceModel.Client
	 * @generated
	 */
	EClass getClient();

	/**
	 * Returns the meta object for the attribute '{@link rentalServiceModel.Client#getCName <em>CName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CName</em>'.
	 * @see rentalServiceModel.Client#getCName()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_CName();

	/**
	 * Returns the meta object for the attribute '{@link rentalServiceModel.Client#getCID <em>CID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CID</em>'.
	 * @see rentalServiceModel.Client#getCID()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_CID();

	/**
	 * Returns the meta object for class '{@link rentalServiceModel.Reservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservation</em>'.
	 * @see rentalServiceModel.Reservation
	 * @generated
	 */
	EClass getReservation();

	/**
	 * Returns the meta object for the attribute '{@link rentalServiceModel.Reservation#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see rentalServiceModel.Reservation#getReference()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_Reference();

	/**
	 * Returns the meta object for the reference '{@link rentalServiceModel.Reservation#getMade <em>Made</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Made</em>'.
	 * @see rentalServiceModel.Reservation#getMade()
	 * @see #getReservation()
	 * @generated
	 */
	EReference getReservation_Made();

	/**
	 * Returns the meta object for the reference '{@link rentalServiceModel.Reservation#getPickup <em>Pickup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pickup</em>'.
	 * @see rentalServiceModel.Reservation#getPickup()
	 * @see #getReservation()
	 * @generated
	 */
	EReference getReservation_Pickup();

	/**
	 * Returns the meta object for the reference '{@link rentalServiceModel.Reservation#getDropoff <em>Dropoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dropoff</em>'.
	 * @see rentalServiceModel.Reservation#getDropoff()
	 * @see #getReservation()
	 * @generated
	 */
	EReference getReservation_Dropoff();

	/**
	 * Returns the meta object for the reference '{@link rentalServiceModel.Reservation#getFor <em>For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>For</em>'.
	 * @see rentalServiceModel.Reservation#getFor()
	 * @see #getReservation()
	 * @generated
	 */
	EReference getReservation_For();

	/**
	 * Returns the meta object for class '{@link rentalServiceModel.Rental <em>Rental</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rental</em>'.
	 * @see rentalServiceModel.Rental
	 * @generated
	 */
	EClass getRental();

	/**
	 * Returns the meta object for the reference '{@link rentalServiceModel.Rental#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Branches</em>'.
	 * @see rentalServiceModel.Rental#getBranches()
	 * @see #getRental()
	 * @generated
	 */
	EReference getRental_Branches();

	/**
	 * Returns the meta object for the reference '{@link rentalServiceModel.Rental#getReservations <em>Reservations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reservations</em>'.
	 * @see rentalServiceModel.Rental#getReservations()
	 * @see #getRental()
	 * @generated
	 */
	EReference getRental_Reservations();

	/**
	 * Returns the meta object for the containment reference list '{@link rentalServiceModel.Rental#getRentalelements <em>Rentalelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rentalelements</em>'.
	 * @see rentalServiceModel.Rental#getRentalelements()
	 * @see #getRental()
	 * @generated
	 */
	EReference getRental_Rentalelements();

	/**
	 * Returns the meta object for class '{@link rentalServiceModel.BranchArray <em>Branch Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch Array</em>'.
	 * @see rentalServiceModel.BranchArray
	 * @generated
	 */
	EClass getBranchArray();

	/**
	 * Returns the meta object for the reference list '{@link rentalServiceModel.BranchArray#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Index</em>'.
	 * @see rentalServiceModel.BranchArray#getIndex()
	 * @see #getBranchArray()
	 * @generated
	 */
	EReference getBranchArray_Index();

	/**
	 * Returns the meta object for the attribute '{@link rentalServiceModel.BranchArray#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see rentalServiceModel.BranchArray#getSize()
	 * @see #getBranchArray()
	 * @generated
	 */
	EAttribute getBranchArray_Size();

	/**
	 * Returns the meta object for class '{@link rentalServiceModel.ArrayList <em>Array List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array List</em>'.
	 * @see rentalServiceModel.ArrayList
	 * @generated
	 */
	EClass getArrayList();

	/**
	 * Returns the meta object for the reference list '{@link rentalServiceModel.ArrayList#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Index</em>'.
	 * @see rentalServiceModel.ArrayList#getIndex()
	 * @see #getArrayList()
	 * @generated
	 */
	EReference getArrayList_Index();

	/**
	 * Returns the meta object for the attribute '{@link rentalServiceModel.ArrayList#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see rentalServiceModel.ArrayList#getSize()
	 * @see #getArrayList()
	 * @generated
	 */
	EAttribute getArrayList_Size();

	/**
	 * Returns the meta object for class '{@link rentalServiceModel.ArrayListElement <em>Array List Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array List Element</em>'.
	 * @see rentalServiceModel.ArrayListElement
	 * @generated
	 */
	EClass getArrayListElement();

	/**
	 * Returns the meta object for class '{@link rentalServiceModel.RentalElement <em>Rental Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rental Element</em>'.
	 * @see rentalServiceModel.RentalElement
	 * @generated
	 */
	EClass getRentalElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RentalServiceFactory getRentalServiceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link rentalServiceModel.impl.BranchImpl <em>Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rentalServiceModel.impl.BranchImpl
		 * @see rentalServiceModel.impl.RentalServicePackageImpl#getBranch()
		 * @generated
		 */
		EClass BRANCH = eINSTANCE.getBranch();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__CITY = eINSTANCE.getBranch_City();

		/**
		 * The meta object literal for the '<em><b>CMax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__CMAX = eINSTANCE.getBranch_CMax();

		/**
		 * The meta object literal for the '<em><b>RMax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__RMAX = eINSTANCE.getBranch_RMax();

		/**
		 * The meta object literal for the '<em><b>At</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH__AT = eINSTANCE.getBranch_At();

		/**
		 * The meta object literal for the '<em><b>Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH__OF = eINSTANCE.getBranch_Of();

		/**
		 * The meta object literal for the '{@link rentalServiceModel.impl.CarImpl <em>Car</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rentalServiceModel.impl.CarImpl
		 * @see rentalServiceModel.impl.RentalServicePackageImpl#getCar()
		 * @generated
		 */
		EClass CAR = eINSTANCE.getCar();

		/**
		 * The meta object literal for the '<em><b>Registration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAR__REGISTRATION = eINSTANCE.getCar_Registration();

		/**
		 * The meta object literal for the '{@link rentalServiceModel.impl.ClientImpl <em>Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rentalServiceModel.impl.ClientImpl
		 * @see rentalServiceModel.impl.RentalServicePackageImpl#getClient()
		 * @generated
		 */
		EClass CLIENT = eINSTANCE.getClient();

		/**
		 * The meta object literal for the '<em><b>CName</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__CNAME = eINSTANCE.getClient_CName();

		/**
		 * The meta object literal for the '<em><b>CID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__CID = eINSTANCE.getClient_CID();

		/**
		 * The meta object literal for the '{@link rentalServiceModel.impl.ReservationImpl <em>Reservation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rentalServiceModel.impl.ReservationImpl
		 * @see rentalServiceModel.impl.RentalServicePackageImpl#getReservation()
		 * @generated
		 */
		EClass RESERVATION = eINSTANCE.getReservation();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__REFERENCE = eINSTANCE.getReservation_Reference();

		/**
		 * The meta object literal for the '<em><b>Made</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION__MADE = eINSTANCE.getReservation_Made();

		/**
		 * The meta object literal for the '<em><b>Pickup</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION__PICKUP = eINSTANCE.getReservation_Pickup();

		/**
		 * The meta object literal for the '<em><b>Dropoff</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION__DROPOFF = eINSTANCE.getReservation_Dropoff();

		/**
		 * The meta object literal for the '<em><b>For</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION__FOR = eINSTANCE.getReservation_For();

		/**
		 * The meta object literal for the '{@link rentalServiceModel.impl.RentalImpl <em>Rental</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rentalServiceModel.impl.RentalImpl
		 * @see rentalServiceModel.impl.RentalServicePackageImpl#getRental()
		 * @generated
		 */
		EClass RENTAL = eINSTANCE.getRental();

		/**
		 * The meta object literal for the '<em><b>Branches</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENTAL__BRANCHES = eINSTANCE.getRental_Branches();

		/**
		 * The meta object literal for the '<em><b>Reservations</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENTAL__RESERVATIONS = eINSTANCE.getRental_Reservations();

		/**
		 * The meta object literal for the '<em><b>Rentalelements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENTAL__RENTALELEMENTS = eINSTANCE.getRental_Rentalelements();

		/**
		 * The meta object literal for the '{@link rentalServiceModel.impl.BranchArrayImpl <em>Branch Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rentalServiceModel.impl.BranchArrayImpl
		 * @see rentalServiceModel.impl.RentalServicePackageImpl#getBranchArray()
		 * @generated
		 */
		EClass BRANCH_ARRAY = eINSTANCE.getBranchArray();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH_ARRAY__INDEX = eINSTANCE.getBranchArray_Index();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH_ARRAY__SIZE = eINSTANCE.getBranchArray_Size();

		/**
		 * The meta object literal for the '{@link rentalServiceModel.impl.ArrayListImpl <em>Array List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rentalServiceModel.impl.ArrayListImpl
		 * @see rentalServiceModel.impl.RentalServicePackageImpl#getArrayList()
		 * @generated
		 */
		EClass ARRAY_LIST = eINSTANCE.getArrayList();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_LIST__INDEX = eINSTANCE.getArrayList_Index();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_LIST__SIZE = eINSTANCE.getArrayList_Size();

		/**
		 * The meta object literal for the '{@link rentalServiceModel.impl.ArrayListElementImpl <em>Array List Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rentalServiceModel.impl.ArrayListElementImpl
		 * @see rentalServiceModel.impl.RentalServicePackageImpl#getArrayListElement()
		 * @generated
		 */
		EClass ARRAY_LIST_ELEMENT = eINSTANCE.getArrayListElement();

		/**
		 * The meta object literal for the '{@link rentalServiceModel.impl.RentalElementImpl <em>Rental Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rentalServiceModel.impl.RentalElementImpl
		 * @see rentalServiceModel.impl.RentalServicePackageImpl#getRentalElement()
		 * @generated
		 */
		EClass RENTAL_ELEMENT = eINSTANCE.getRentalElement();

	}

} //RentalServicePackage
