/**
 */
package rentalService;

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
 * @see rentalService.RentalServiceFactory
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
	String eNAME = "rentalService";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/rentalService";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rentalService";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RentalServicePackage eINSTANCE = rentalService.impl.RentalServicePackageImpl.init();

	/**
	 * The meta object id for the '{@link rentalService.impl.BranchImpl <em>Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rentalService.impl.BranchImpl
	 * @see rentalService.impl.RentalServicePackageImpl#getBranch()
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
	int BRANCH__CITY = 0;

	/**
	 * The feature id for the '<em><b>CMax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__CMAX = 1;

	/**
	 * The feature id for the '<em><b>RMax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__RMAX = 2;

	/**
	 * The feature id for the '<em><b>At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__AT = 3;

	/**
	 * The feature id for the '<em><b>Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__OF = 4;

	/**
	 * The number of structural features of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rentalService.impl.ArrayListElementImpl <em>Array List Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rentalService.impl.ArrayListElementImpl
	 * @see rentalService.impl.RentalServicePackageImpl#getArrayListElement()
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
	 * The meta object id for the '{@link rentalService.impl.CarImpl <em>Car</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rentalService.impl.CarImpl
	 * @see rentalService.impl.RentalServicePackageImpl#getCar()
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
	 * The meta object id for the '{@link rentalService.impl.ClientImpl <em>Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rentalService.impl.ClientImpl
	 * @see rentalService.impl.RentalServicePackageImpl#getClient()
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
	 * The meta object id for the '{@link rentalService.impl.ReservationImpl <em>Reservation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rentalService.impl.ReservationImpl
	 * @see rentalService.impl.RentalServicePackageImpl#getReservation()
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
	int RESERVATION__REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Made</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__MADE = 1;

	/**
	 * The feature id for the '<em><b>Pickup</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__PICKUP = 2;

	/**
	 * The feature id for the '<em><b>Dropoff</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__DROPOFF = 3;

	/**
	 * The feature id for the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__FOR = 4;

	/**
	 * The number of structural features of the '<em>Reservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Reservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rentalService.impl.RentalImpl <em>Rental</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rentalService.impl.RentalImpl
	 * @see rentalService.impl.RentalServicePackageImpl#getRental()
	 * @generated
	 */
	int RENTAL = 4;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL__BRANCHES = 0;

	/**
	 * The feature id for the '<em><b>Reservations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL__RESERVATIONS = 1;

	/**
	 * The number of structural features of the '<em>Rental</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rental</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link rentalService.impl.BranchArrayImpl <em>Branch Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rentalService.impl.BranchArrayImpl
	 * @see rentalService.impl.RentalServicePackageImpl#getBranchArray()
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
	int BRANCH_ARRAY__INDEX = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_ARRAY__SIZE = 1;

	/**
	 * The number of structural features of the '<em>Branch Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_ARRAY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Branch Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_ARRAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rentalService.impl.ArrayListImpl <em>Array List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rentalService.impl.ArrayListImpl
	 * @see rentalService.impl.RentalServicePackageImpl#getArrayList()
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
	int ARRAY_LIST__INDEX = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_LIST__SIZE = 1;

	/**
	 * The number of structural features of the '<em>Array List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_LIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Array List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_LIST_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link rentalService.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch</em>'.
	 * @see rentalService.Branch
	 * @generated
	 */
	EClass getBranch();

	/**
	 * Returns the meta object for the attribute '{@link rentalService.Branch#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see rentalService.Branch#getCity()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_City();

	/**
	 * Returns the meta object for the attribute '{@link rentalService.Branch#getCMax <em>CMax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CMax</em>'.
	 * @see rentalService.Branch#getCMax()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_CMax();

	/**
	 * Returns the meta object for the attribute '{@link rentalService.Branch#getRMax <em>RMax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RMax</em>'.
	 * @see rentalService.Branch#getRMax()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_RMax();

	/**
	 * Returns the meta object for the reference '{@link rentalService.Branch#getAt <em>At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>At</em>'.
	 * @see rentalService.Branch#getAt()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_At();

	/**
	 * Returns the meta object for the reference '{@link rentalService.Branch#getOf <em>Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Of</em>'.
	 * @see rentalService.Branch#getOf()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_Of();

	/**
	 * Returns the meta object for class '{@link rentalService.Car <em>Car</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Car</em>'.
	 * @see rentalService.Car
	 * @generated
	 */
	EClass getCar();

	/**
	 * Returns the meta object for the attribute '{@link rentalService.Car#getRegistration <em>Registration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registration</em>'.
	 * @see rentalService.Car#getRegistration()
	 * @see #getCar()
	 * @generated
	 */
	EAttribute getCar_Registration();

	/**
	 * Returns the meta object for class '{@link rentalService.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client</em>'.
	 * @see rentalService.Client
	 * @generated
	 */
	EClass getClient();

	/**
	 * Returns the meta object for the attribute '{@link rentalService.Client#getCName <em>CName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CName</em>'.
	 * @see rentalService.Client#getCName()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_CName();

	/**
	 * Returns the meta object for the attribute '{@link rentalService.Client#getCID <em>CID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CID</em>'.
	 * @see rentalService.Client#getCID()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_CID();

	/**
	 * Returns the meta object for class '{@link rentalService.Reservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservation</em>'.
	 * @see rentalService.Reservation
	 * @generated
	 */
	EClass getReservation();

	/**
	 * Returns the meta object for the attribute '{@link rentalService.Reservation#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see rentalService.Reservation#getReference()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_Reference();

	/**
	 * Returns the meta object for the reference '{@link rentalService.Reservation#getMade <em>Made</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Made</em>'.
	 * @see rentalService.Reservation#getMade()
	 * @see #getReservation()
	 * @generated
	 */
	EReference getReservation_Made();

	/**
	 * Returns the meta object for the reference '{@link rentalService.Reservation#getPickup <em>Pickup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pickup</em>'.
	 * @see rentalService.Reservation#getPickup()
	 * @see #getReservation()
	 * @generated
	 */
	EReference getReservation_Pickup();

	/**
	 * Returns the meta object for the reference '{@link rentalService.Reservation#getDropoff <em>Dropoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dropoff</em>'.
	 * @see rentalService.Reservation#getDropoff()
	 * @see #getReservation()
	 * @generated
	 */
	EReference getReservation_Dropoff();

	/**
	 * Returns the meta object for the reference '{@link rentalService.Reservation#getFor <em>For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>For</em>'.
	 * @see rentalService.Reservation#getFor()
	 * @see #getReservation()
	 * @generated
	 */
	EReference getReservation_For();

	/**
	 * Returns the meta object for class '{@link rentalService.Rental <em>Rental</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rental</em>'.
	 * @see rentalService.Rental
	 * @generated
	 */
	EClass getRental();

	/**
	 * Returns the meta object for the reference list '{@link rentalService.Rental#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Branches</em>'.
	 * @see rentalService.Rental#getBranches()
	 * @see #getRental()
	 * @generated
	 */
	EReference getRental_Branches();

	/**
	 * Returns the meta object for the reference list '{@link rentalService.Rental#getReservations <em>Reservations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reservations</em>'.
	 * @see rentalService.Rental#getReservations()
	 * @see #getRental()
	 * @generated
	 */
	EReference getRental_Reservations();

	/**
	 * Returns the meta object for class '{@link rentalService.BranchArray <em>Branch Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch Array</em>'.
	 * @see rentalService.BranchArray
	 * @generated
	 */
	EClass getBranchArray();

	/**
	 * Returns the meta object for the reference list '{@link rentalService.BranchArray#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Index</em>'.
	 * @see rentalService.BranchArray#getIndex()
	 * @see #getBranchArray()
	 * @generated
	 */
	EReference getBranchArray_Index();

	/**
	 * Returns the meta object for the attribute '{@link rentalService.BranchArray#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see rentalService.BranchArray#getSize()
	 * @see #getBranchArray()
	 * @generated
	 */
	EAttribute getBranchArray_Size();

	/**
	 * Returns the meta object for class '{@link rentalService.ArrayList <em>Array List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array List</em>'.
	 * @see rentalService.ArrayList
	 * @generated
	 */
	EClass getArrayList();

	/**
	 * Returns the meta object for the reference list '{@link rentalService.ArrayList#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Index</em>'.
	 * @see rentalService.ArrayList#getIndex()
	 * @see #getArrayList()
	 * @generated
	 */
	EReference getArrayList_Index();

	/**
	 * Returns the meta object for the attribute '{@link rentalService.ArrayList#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see rentalService.ArrayList#getSize()
	 * @see #getArrayList()
	 * @generated
	 */
	EAttribute getArrayList_Size();

	/**
	 * Returns the meta object for class '{@link rentalService.ArrayListElement <em>Array List Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array List Element</em>'.
	 * @see rentalService.ArrayListElement
	 * @generated
	 */
	EClass getArrayListElement();

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
		 * The meta object literal for the '{@link rentalService.impl.BranchImpl <em>Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rentalService.impl.BranchImpl
		 * @see rentalService.impl.RentalServicePackageImpl#getBranch()
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
		 * The meta object literal for the '{@link rentalService.impl.CarImpl <em>Car</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rentalService.impl.CarImpl
		 * @see rentalService.impl.RentalServicePackageImpl#getCar()
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
		 * The meta object literal for the '{@link rentalService.impl.ClientImpl <em>Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rentalService.impl.ClientImpl
		 * @see rentalService.impl.RentalServicePackageImpl#getClient()
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
		 * The meta object literal for the '{@link rentalService.impl.ReservationImpl <em>Reservation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rentalService.impl.ReservationImpl
		 * @see rentalService.impl.RentalServicePackageImpl#getReservation()
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
		 * The meta object literal for the '{@link rentalService.impl.RentalImpl <em>Rental</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rentalService.impl.RentalImpl
		 * @see rentalService.impl.RentalServicePackageImpl#getRental()
		 * @generated
		 */
		EClass RENTAL = eINSTANCE.getRental();

		/**
		 * The meta object literal for the '<em><b>Branches</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENTAL__BRANCHES = eINSTANCE.getRental_Branches();

		/**
		 * The meta object literal for the '<em><b>Reservations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENTAL__RESERVATIONS = eINSTANCE.getRental_Reservations();

		/**
		 * The meta object literal for the '{@link rentalService.impl.BranchArrayImpl <em>Branch Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rentalService.impl.BranchArrayImpl
		 * @see rentalService.impl.RentalServicePackageImpl#getBranchArray()
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
		 * The meta object literal for the '{@link rentalService.impl.ArrayListImpl <em>Array List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rentalService.impl.ArrayListImpl
		 * @see rentalService.impl.RentalServicePackageImpl#getArrayList()
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
		 * The meta object literal for the '{@link rentalService.impl.ArrayListElementImpl <em>Array List Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rentalService.impl.ArrayListElementImpl
		 * @see rentalService.impl.RentalServicePackageImpl#getArrayListElement()
		 * @generated
		 */
		EClass ARRAY_LIST_ELEMENT = eINSTANCE.getArrayListElement();

	}

} //RentalServicePackage
