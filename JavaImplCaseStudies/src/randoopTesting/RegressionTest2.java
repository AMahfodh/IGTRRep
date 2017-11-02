package randoopTesting;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test001");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation18 = rental0.showClientReservations("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(arraylist_reservation18);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test002");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.lang.String str7 = rental0.makeReservation("hi!", "", "");
        rentalService.Rental rental8 = new rentalService.Rental();
        java.lang.String str11 = rental8.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental8.showClientReservations("");
        rental8.cancelReservation("");
        rentalService.Rental rental16 = new rentalService.Rental();
        rental16.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car20 = rental16.showCars("");
        rental16.dropoffCar("hi!");
        rental16.dropoffCar("");
        rental16.dropoffCar("hi!");
        rentalService.Branch branch27 = null;
        rentalService.Branch[] branch_array28 = new rentalService.Branch[] { branch27 };
        rental16.initialise(branch_array28);
        rental8.initialise(branch_array28);
        rental0.initialise(branch_array28);
        rental0.cancelReservation("");
        rental0.pickupCar("hi!");
        rental0.cancelClientReservation("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
        org.junit.Assert.assertNull(arraylist_car20);
        org.junit.Assert.assertNotNull(branch_array28);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test003");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.cancelReservation("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation18 = rental0.showClientReservations("hi!");
        rental0.pickupCar("");
        rental0.cancelReservation("hi!");
        java.lang.String str25 = rental0.registerClient("", "");
        rental0.cancelClientReservation("");
        rental0.dropoffCar("hi!");
        rentalService.Rental rental30 = new rentalService.Rental();
        rental30.pickupCar("");
        rental30.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation36 = rental30.showClientReservations("hi!");
        rental30.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client40 = rental30.showClients("");
        rentalService.Rental rental41 = new rentalService.Rental();
        rental41.pickupCar("");
        rental41.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car47 = rental41.showCars("");
        rental41.cancelClientReservation("hi!");
        rental41.cancelReservation("");
        rentalService.Rental rental52 = new rentalService.Rental();
        java.lang.String str55 = rental52.registerClient("", "");
        rental52.cancelReservation("hi!");
        rental52.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car61 = rental52.showCars("");
        rentalService.Rental rental62 = new rentalService.Rental();
        rental62.pickupCar("");
        rental62.dropoffCar("");
        rental62.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation70 = rental62.showClientReservations("hi!");
        rental62.cancelReservation("hi!");
        rental62.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car76 = rental62.showCars("");
        rental62.dropoffCar("");
        rentalService.Rental rental79 = new rentalService.Rental();
        rental79.pickupCar("");
        rental79.dropoffCar("");
        rental79.pickupCar("");
        rentalService.Branch branch86 = null;
        rentalService.Branch[] branch_array87 = new rentalService.Branch[] { branch86 };
        rental79.initialise(branch_array87);
        rental62.initialise(branch_array87);
        rental52.initialise(branch_array87);
        rental41.initialise(branch_array87);
        rental30.initialise(branch_array87);
        rental0.initialise(branch_array87);
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation18);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(arraylist_reservation36);
        org.junit.Assert.assertNull(arraylist_client40);
        org.junit.Assert.assertNull(arraylist_car47);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(arraylist_car61);
        org.junit.Assert.assertNotNull(arraylist_reservation70);
        org.junit.Assert.assertNull(arraylist_car76);
        org.junit.Assert.assertNotNull(branch_array87);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test004");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        rental0.pickupCar("hi!");
        java.lang.String str15 = rental0.registerClient("hi!", "");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("");
        java.lang.String str22 = rental0.registerClient("", "");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test005");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str22 = rental0.makeReservation("", "hi!", "hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client24 = rental0.showClients("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation26 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(arraylist_client24);
        org.junit.Assert.assertNotNull(arraylist_reservation26);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test006");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rentalService.Branch[] branch_array5 = null;
        rental0.initialise(branch_array5);
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("");
        rentalService.Rental rental11 = new rentalService.Rental();
        rental11.pickupCar("");
        rental11.dropoffCar("");
        rental11.pickupCar("");
        rentalService.Branch branch18 = null;
        rentalService.Branch[] branch_array19 = new rentalService.Branch[] { branch18 };
        rental11.initialise(branch_array19);
        rental0.initialise(branch_array19);
        java.util.ArrayList<rentalService.Car> arraylist_car23 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation33 = rental0.showClientReservations("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(arraylist_client10);
        org.junit.Assert.assertNotNull(branch_array19);
        org.junit.Assert.assertNull(arraylist_car23);
        org.junit.Assert.assertNotNull(arraylist_reservation33);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test007");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("");
        rental0.cancelReservation("hi!");
        rentalService.Rental rental16 = new rentalService.Rental();
        rental16.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car20 = rental16.showCars("");
        rental16.dropoffCar("");
        rentalService.Rental rental23 = new rentalService.Rental();
        rental23.pickupCar("");
        rental23.dropoffCar("");
        rental23.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation31 = rental23.showClientReservations("hi!");
        rental23.cancelReservation("hi!");
        rental23.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car37 = rental23.showCars("");
        rental23.dropoffCar("");
        rentalService.Rental rental40 = new rentalService.Rental();
        rental40.pickupCar("");
        rental40.dropoffCar("");
        rental40.pickupCar("");
        rentalService.Branch branch47 = null;
        rentalService.Branch[] branch_array48 = new rentalService.Branch[] { branch47 };
        rental40.initialise(branch_array48);
        rental23.initialise(branch_array48);
        rental16.initialise(branch_array48);
        rental0.initialise(branch_array48);
        rental0.dropoffCar("");
        rental0.cancelReservation("");
        rentalService.Branch[] branch_array57 = null;
        rental0.initialise(branch_array57);
        java.util.ArrayList<rentalService.Client> arraylist_client60 = rental0.showClients("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
        org.junit.Assert.assertNull(arraylist_car20);
        org.junit.Assert.assertNotNull(arraylist_reservation31);
        org.junit.Assert.assertNull(arraylist_car37);
        org.junit.Assert.assertNotNull(branch_array48);
        org.junit.Assert.assertNull(arraylist_client60);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test008");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.pickupCar("hi!");
        rentalService.Rental rental19 = new rentalService.Rental();
        rental19.pickupCar("");
        rental19.dropoffCar("");
        rental19.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation27 = rental19.showClientReservations("hi!");
        rentalService.Branch[] branch_array28 = new rentalService.Branch[] {};
        rental19.initialise(branch_array28);
        rental0.initialise(branch_array28);
        rental0.pickupCar("hi!");
        rental0.cancelReservation("");
        rental0.pickupCar("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(arraylist_reservation27);
        org.junit.Assert.assertNotNull(branch_array28);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test009");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental0.showCars("");
        rentalService.Rental rental13 = new rentalService.Rental();
        java.lang.String str16 = rental13.registerClient("", "");
        rental13.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation20 = rental13.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation22 = rental13.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car24 = rental13.showCars("");
        rentalService.Rental rental25 = new rentalService.Rental();
        rental25.pickupCar("");
        rental25.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation31 = rental25.showClientReservations("hi!");
        rental25.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client35 = rental25.showClients("");
        rentalService.Rental rental36 = new rentalService.Rental();
        rental36.pickupCar("");
        rental36.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car42 = rental36.showCars("");
        rental36.cancelClientReservation("hi!");
        rental36.cancelReservation("");
        rentalService.Rental rental47 = new rentalService.Rental();
        java.lang.String str50 = rental47.registerClient("", "");
        rental47.cancelReservation("hi!");
        rental47.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car56 = rental47.showCars("");
        rentalService.Rental rental57 = new rentalService.Rental();
        rental57.pickupCar("");
        rental57.dropoffCar("");
        rental57.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation65 = rental57.showClientReservations("hi!");
        rental57.cancelReservation("hi!");
        rental57.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car71 = rental57.showCars("");
        rental57.dropoffCar("");
        rentalService.Rental rental74 = new rentalService.Rental();
        rental74.pickupCar("");
        rental74.dropoffCar("");
        rental74.pickupCar("");
        rentalService.Branch branch81 = null;
        rentalService.Branch[] branch_array82 = new rentalService.Branch[] { branch81 };
        rental74.initialise(branch_array82);
        rental57.initialise(branch_array82);
        rental47.initialise(branch_array82);
        rental36.initialise(branch_array82);
        rental25.initialise(branch_array82);
        rental13.initialise(branch_array82);
        rental0.initialise(branch_array82);
        java.util.ArrayList<rentalService.Car> arraylist_car91 = rental0.showCars("");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation95 = rental0.showClientReservations("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(arraylist_reservation20);
        org.junit.Assert.assertNotNull(arraylist_reservation22);
        org.junit.Assert.assertNull(arraylist_car24);
        org.junit.Assert.assertNotNull(arraylist_reservation31);
        org.junit.Assert.assertNull(arraylist_client35);
        org.junit.Assert.assertNull(arraylist_car42);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(arraylist_car56);
        org.junit.Assert.assertNotNull(arraylist_reservation65);
        org.junit.Assert.assertNull(arraylist_car71);
        org.junit.Assert.assertNotNull(branch_array82);
        org.junit.Assert.assertNull(arraylist_car91);
        org.junit.Assert.assertNotNull(arraylist_reservation95);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test010");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("");
        rental0.cancelReservation("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test011");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rentalService.Rental rental5 = new rentalService.Rental();
        rental5.pickupCar("");
        rental5.dropoffCar("");
        rental5.pickupCar("");
        rentalService.Branch branch12 = null;
        rentalService.Branch[] branch_array13 = new rentalService.Branch[] { branch12 };
        rental5.initialise(branch_array13);
        rental0.initialise(branch_array13);
        rental0.dropoffCar("hi!");
        try {
            java.lang.String str21 = rental0.makeReservation("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(branch_array13);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test012");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation10 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental0.showCars("");
        rental0.pickupCar("hi!");
        rental0.cancelReservation("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation10);
        org.junit.Assert.assertNull(arraylist_car12);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test013");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.dropoffCar("");
        rentalService.Rental rental17 = new rentalService.Rental();
        rental17.pickupCar("");
        rental17.dropoffCar("");
        rental17.pickupCar("");
        rentalService.Branch branch24 = null;
        rentalService.Branch[] branch_array25 = new rentalService.Branch[] { branch24 };
        rental17.initialise(branch_array25);
        rental0.initialise(branch_array25);
        rental0.cancelClientReservation("");
        rental0.cancelClientReservation("");
        rental0.dropoffCar("");
        java.lang.String str36 = rental0.registerClient("", "");
        try {
            java.lang.String str40 = rental0.makeReservation("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(branch_array25);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test014");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rentalService.Rental rental5 = new rentalService.Rental();
        rental5.pickupCar("");
        rental5.dropoffCar("");
        rental5.pickupCar("");
        rentalService.Branch branch12 = null;
        rentalService.Branch[] branch_array13 = new rentalService.Branch[] { branch12 };
        rental5.initialise(branch_array13);
        rental0.initialise(branch_array13);
        rental0.dropoffCar("hi!");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation21 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation23 = rental0.showClientReservations("");
        try {
            java.lang.String str27 = rental0.makeReservation("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(branch_array13);
        org.junit.Assert.assertNotNull(arraylist_reservation21);
        org.junit.Assert.assertNotNull(arraylist_reservation23);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test015");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Client> arraylist_client12 = rental0.showClients("hi!");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Car> arraylist_car20 = rental0.showCars("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client22 = rental0.showClients("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNull(arraylist_client12);
        org.junit.Assert.assertNull(arraylist_car20);
        org.junit.Assert.assertNull(arraylist_client22);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test016");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("");
        rental0.dropoffCar("hi!");
        java.lang.String str24 = rental0.makeReservation("", "", "");
        rental0.pickupCar("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test017");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        java.lang.String str19 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str25 = rental0.makeReservation("hi!", "", "hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car29 = rental0.showCars("hi!");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client35 = rental0.showClients("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(arraylist_car29);
        org.junit.Assert.assertNull(arraylist_client35);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test018");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.dropoffCar("");
        rentalService.Rental rental17 = new rentalService.Rental();
        rental17.pickupCar("");
        rental17.dropoffCar("");
        rental17.pickupCar("");
        rentalService.Branch branch24 = null;
        rentalService.Branch[] branch_array25 = new rentalService.Branch[] { branch24 };
        rental17.initialise(branch_array25);
        rental0.initialise(branch_array25);
        rentalService.Rental rental28 = new rentalService.Rental();
        rental28.pickupCar("");
        rental28.dropoffCar("");
        rental28.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation36 = rental28.showClientReservations("hi!");
        rentalService.Branch[] branch_array37 = new rentalService.Branch[] {};
        rental28.initialise(branch_array37);
        rental0.initialise(branch_array37);
        java.util.ArrayList<rentalService.Client> arraylist_client41 = rental0.showClients("hi!");
        java.lang.String str44 = rental0.registerClient("", "hi!");
        rental0.pickupCar("hi!");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car50 = rental0.showCars("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(branch_array25);
        org.junit.Assert.assertNotNull(arraylist_reservation36);
        org.junit.Assert.assertNotNull(branch_array37);
        org.junit.Assert.assertNull(arraylist_client41);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(arraylist_car50);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test019");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("");
        java.lang.String str12 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Client> arraylist_client14 = rental0.showClients("");
        java.util.ArrayList<rentalService.Client> arraylist_client16 = rental0.showClients("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(arraylist_client14);
        org.junit.Assert.assertNull(arraylist_client16);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test020");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.dropoffCar("");
        rentalService.Rental rental17 = new rentalService.Rental();
        rental17.pickupCar("");
        rental17.dropoffCar("");
        rental17.pickupCar("");
        rentalService.Branch branch24 = null;
        rentalService.Branch[] branch_array25 = new rentalService.Branch[] { branch24 };
        rental17.initialise(branch_array25);
        rental0.initialise(branch_array25);
        rentalService.Rental rental28 = new rentalService.Rental();
        rental28.pickupCar("");
        rental28.dropoffCar("");
        rental28.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation36 = rental28.showClientReservations("hi!");
        rentalService.Branch[] branch_array37 = new rentalService.Branch[] {};
        rental28.initialise(branch_array37);
        rental0.initialise(branch_array37);
        java.util.ArrayList<rentalService.Client> arraylist_client41 = rental0.showClients("hi!");
        java.lang.String str44 = rental0.registerClient("", "hi!");
        rental0.pickupCar("hi!");
        rental0.dropoffCar("");
        java.lang.String str52 = rental0.makeReservation("hi!", "", "");
        rental0.cancelReservation("hi!");
        rental0.dropoffCar("");
        rental0.pickupCar("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(branch_array25);
        org.junit.Assert.assertNotNull(arraylist_reservation36);
        org.junit.Assert.assertNotNull(branch_array37);
        org.junit.Assert.assertNull(arraylist_client41);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str52);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test021");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.cancelClientReservation("");
        java.util.ArrayList<rentalService.Car> arraylist_car18 = rental0.showCars("");
        rental0.cancelClientReservation("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(arraylist_car18);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test022");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car6 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        java.lang.String str13 = rental0.registerClient("", "hi!");
        java.lang.String str16 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation18 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation20 = rental0.showClientReservations("");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        org.junit.Assert.assertNull(arraylist_car6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(arraylist_reservation18);
        org.junit.Assert.assertNotNull(arraylist_reservation20);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test023");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str22 = rental0.makeReservation("", "hi!", "hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client24 = rental0.showClients("");
        java.lang.String str28 = rental0.makeReservation("", "", "");
        rental0.dropoffCar("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(arraylist_client24);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test024");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation5 = rental0.showClientReservations("");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Client> arraylist_client9 = rental0.showClients("");
        rental0.dropoffCar("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation5);
        org.junit.Assert.assertNull(arraylist_client9);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test025");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        java.lang.String str20 = rental0.makeReservation("", "", "hi!");
        rentalService.Rental rental21 = new rentalService.Rental();
        rental21.pickupCar("");
        rental21.dropoffCar("");
        rental21.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation29 = rental21.showClientReservations("hi!");
        rentalService.Branch[] branch_array30 = new rentalService.Branch[] {};
        rental21.initialise(branch_array30);
        java.util.ArrayList<rentalService.Client> arraylist_client33 = rental21.showClients("hi!");
        rental21.dropoffCar("hi!");
        rental21.cancelReservation("hi!");
        rentalService.Rental rental38 = new rentalService.Rental();
        rental38.pickupCar("");
        rental38.dropoffCar("");
        rental38.pickupCar("");
        rentalService.Branch branch45 = null;
        rentalService.Branch[] branch_array46 = new rentalService.Branch[] { branch45 };
        rental38.initialise(branch_array46);
        rental21.initialise(branch_array46);
        rental0.initialise(branch_array46);
        try {
            java.util.ArrayList<rentalService.Client> arraylist_client51 = rental0.showClients("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(arraylist_reservation29);
        org.junit.Assert.assertNotNull(branch_array30);
        org.junit.Assert.assertNull(arraylist_client33);
        org.junit.Assert.assertNotNull(branch_array46);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test026");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation10 = rental0.showClientReservations("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation16 = rental0.showClientReservations("");
        rental0.pickupCar("");
        rental0.cancelClientReservation("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNotNull(arraylist_reservation10);
        org.junit.Assert.assertNotNull(arraylist_reservation16);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test027");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client18 = rental0.showClients("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client20 = rental0.showClients("");
        java.lang.String str24 = rental0.makeReservation("", "hi!", "hi!");
        java.lang.String str28 = rental0.makeReservation("", "", "hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(arraylist_client18);
        org.junit.Assert.assertNull(arraylist_client20);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test028");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation11 = rental0.showClientReservations("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car15 = rental0.showCars("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNotNull(arraylist_reservation9);
        org.junit.Assert.assertNotNull(arraylist_reservation11);
        org.junit.Assert.assertNull(arraylist_car15);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test029");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.pickupCar("hi!");
        rental0.cancelClientReservation("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        java.lang.String str18 = rental0.makeReservation("hi!", "", "");
        rental0.pickupCar("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test030");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("");
        rental0.cancelClientReservation("");
        rental0.cancelClientReservation("hi!");
        rentalService.Rental rental18 = new rentalService.Rental();
        java.lang.String str21 = rental18.registerClient("", "");
        rental18.cancelReservation("hi!");
        rental18.pickupCar("");
        rental18.pickupCar("");
        rental18.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation31 = rental18.showClientReservations("");
        rental18.cancelReservation("hi!");
        rentalService.Rental rental34 = new rentalService.Rental();
        rental34.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car38 = rental34.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation40 = rental34.showClientReservations("hi!");
        rental34.dropoffCar("");
        java.lang.String str46 = rental34.makeReservation("", "", "");
        rentalService.Branch[] branch_array47 = null;
        rental34.initialise(branch_array47);
        java.util.ArrayList<rentalService.Client> arraylist_client50 = rental34.showClients("");
        rentalService.Rental rental51 = new rentalService.Rental();
        rental51.pickupCar("");
        rental51.dropoffCar("");
        rental51.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation59 = rental51.showClientReservations("");
        rentalService.Rental rental60 = new rentalService.Rental();
        java.lang.String str63 = rental60.registerClient("", "");
        rental60.cancelReservation("hi!");
        rental60.pickupCar("");
        rental60.pickupCar("");
        rentalService.Rental rental70 = new rentalService.Rental();
        rental70.pickupCar("");
        rental70.dropoffCar("");
        rentalService.Rental rental75 = new rentalService.Rental();
        rental75.pickupCar("");
        rental75.dropoffCar("");
        rental75.pickupCar("");
        rentalService.Branch branch82 = null;
        rentalService.Branch[] branch_array83 = new rentalService.Branch[] { branch82 };
        rental75.initialise(branch_array83);
        rental70.initialise(branch_array83);
        rental60.initialise(branch_array83);
        rental51.initialise(branch_array83);
        rental34.initialise(branch_array83);
        rental18.initialise(branch_array83);
        rental0.initialise(branch_array83);
        try {
            java.util.ArrayList<rentalService.Client> arraylist_client92 = rental0.showClients("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(arraylist_reservation31);
        org.junit.Assert.assertNull(arraylist_car38);
        org.junit.Assert.assertNotNull(arraylist_reservation40);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(arraylist_client50);
        org.junit.Assert.assertNotNull(arraylist_reservation59);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(branch_array83);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test031");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.cancelReservation("");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        java.lang.String str21 = rental0.registerClient("", "hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test032");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation10 = rental0.showClientReservations("");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNotNull(arraylist_reservation10);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test033");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client4 = rental0.showClients("");
        org.junit.Assert.assertNull(arraylist_client4);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test034");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental0.showCars("");
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(arraylist_car12);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test035");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.cancelReservation("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation18 = rental0.showClientReservations("hi!");
        rental0.pickupCar("");
        rental0.cancelReservation("hi!");
        java.lang.String str25 = rental0.registerClient("", "");
        rentalService.Rental rental26 = new rentalService.Rental();
        java.lang.String str29 = rental26.registerClient("", "");
        rental26.cancelReservation("hi!");
        rental26.pickupCar("");
        rental26.pickupCar("");
        rentalService.Rental rental36 = new rentalService.Rental();
        rental36.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car40 = rental36.showCars("");
        rental36.dropoffCar("hi!");
        rental36.dropoffCar("");
        rental36.dropoffCar("hi!");
        rentalService.Branch branch47 = null;
        rentalService.Branch[] branch_array48 = new rentalService.Branch[] { branch47 };
        rental36.initialise(branch_array48);
        rental26.initialise(branch_array48);
        rental0.initialise(branch_array48);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation53 = rental0.showClientReservations("hi!");
        rental0.cancelClientReservation("");
        try {
            java.lang.String str58 = rental0.registerClient("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation18);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(arraylist_car40);
        org.junit.Assert.assertNotNull(branch_array48);
        org.junit.Assert.assertNotNull(arraylist_reservation53);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test036");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        rentalService.Branch branch11 = null;
        rentalService.Branch[] branch_array12 = new rentalService.Branch[] { branch11 };
        rental0.initialise(branch_array12);
        rentalService.Rental rental14 = new rentalService.Rental();
        rental14.pickupCar("");
        rental14.dropoffCar("");
        rentalService.Rental rental19 = new rentalService.Rental();
        rental19.pickupCar("");
        rental19.dropoffCar("");
        rental19.pickupCar("");
        rentalService.Branch branch26 = null;
        rentalService.Branch[] branch_array27 = new rentalService.Branch[] { branch26 };
        rental19.initialise(branch_array27);
        rental14.initialise(branch_array27);
        rental0.initialise(branch_array27);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation32 = rental0.showClientReservations("");
        rental0.pickupCar("");
        try {
            java.util.ArrayList<rentalService.Client> arraylist_client36 = rental0.showClients("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(branch_array12);
        org.junit.Assert.assertNotNull(branch_array27);
        org.junit.Assert.assertNotNull(arraylist_reservation32);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test037");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test038");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car6 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        rental0.cancelClientReservation("");
        rental0.cancelClientReservation("hi!");
        org.junit.Assert.assertNull(arraylist_car6);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test039");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str12 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation14 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car16 = rental0.showCars("");
        rental0.cancelClientReservation("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(arraylist_reservation14);
        org.junit.Assert.assertNull(arraylist_car16);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test040");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str22 = rental0.makeReservation("", "", "");
        rentalService.Rental rental23 = new rentalService.Rental();
        java.lang.String str26 = rental23.registerClient("", "");
        rental23.cancelReservation("hi!");
        rental23.pickupCar("");
        rental23.pickupCar("");
        rentalService.Rental rental33 = new rentalService.Rental();
        rental33.pickupCar("");
        rental33.dropoffCar("");
        rentalService.Rental rental38 = new rentalService.Rental();
        rental38.pickupCar("");
        rental38.dropoffCar("");
        rental38.pickupCar("");
        rentalService.Branch branch45 = null;
        rentalService.Branch[] branch_array46 = new rentalService.Branch[] { branch45 };
        rental38.initialise(branch_array46);
        rental33.initialise(branch_array46);
        rental23.initialise(branch_array46);
        rental23.cancelClientReservation("hi!");
        rental23.dropoffCar("");
        rentalService.Rental rental54 = new rentalService.Rental();
        rental54.pickupCar("");
        rental54.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car60 = rental54.showCars("");
        rental54.cancelClientReservation("hi!");
        rental54.dropoffCar("hi!");
        rentalService.Rental rental65 = new rentalService.Rental();
        rental65.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car69 = rental65.showCars("");
        rentalService.Branch[] branch_array70 = null;
        rental65.initialise(branch_array70);
        rental65.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client75 = rental65.showClients("");
        rentalService.Rental rental76 = new rentalService.Rental();
        rental76.pickupCar("");
        rental76.dropoffCar("");
        rental76.pickupCar("");
        rentalService.Branch branch83 = null;
        rentalService.Branch[] branch_array84 = new rentalService.Branch[] { branch83 };
        rental76.initialise(branch_array84);
        rental65.initialise(branch_array84);
        rental54.initialise(branch_array84);
        rental23.initialise(branch_array84);
        rental0.initialise(branch_array84);
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client93 = rental0.showClients("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(branch_array46);
        org.junit.Assert.assertNull(arraylist_car60);
        org.junit.Assert.assertNull(arraylist_car69);
        org.junit.Assert.assertNull(arraylist_client75);
        org.junit.Assert.assertNotNull(branch_array84);
        org.junit.Assert.assertNull(arraylist_client93);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test041");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation5 = rental0.showClientReservations("");
        java.lang.String str8 = rental0.registerClient("", "hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation10 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(arraylist_reservation10);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test042");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation10 = rental0.showClientReservations("hi!");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.pickupCar("");
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(arraylist_reservation10);
        org.junit.Assert.assertNull(arraylist_car14);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test043");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car11 = rental0.showCars("");
        rentalService.Rental rental12 = new rentalService.Rental();
        rental12.pickupCar("");
        rental12.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation18 = rental12.showClientReservations("hi!");
        rental12.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client22 = rental12.showClients("");
        rentalService.Rental rental23 = new rentalService.Rental();
        rental23.pickupCar("");
        rental23.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car29 = rental23.showCars("");
        rental23.cancelClientReservation("hi!");
        rental23.cancelReservation("");
        rentalService.Rental rental34 = new rentalService.Rental();
        java.lang.String str37 = rental34.registerClient("", "");
        rental34.cancelReservation("hi!");
        rental34.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car43 = rental34.showCars("");
        rentalService.Rental rental44 = new rentalService.Rental();
        rental44.pickupCar("");
        rental44.dropoffCar("");
        rental44.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation52 = rental44.showClientReservations("hi!");
        rental44.cancelReservation("hi!");
        rental44.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car58 = rental44.showCars("");
        rental44.dropoffCar("");
        rentalService.Rental rental61 = new rentalService.Rental();
        rental61.pickupCar("");
        rental61.dropoffCar("");
        rental61.pickupCar("");
        rentalService.Branch branch68 = null;
        rentalService.Branch[] branch_array69 = new rentalService.Branch[] { branch68 };
        rental61.initialise(branch_array69);
        rental44.initialise(branch_array69);
        rental34.initialise(branch_array69);
        rental23.initialise(branch_array69);
        rental12.initialise(branch_array69);
        rental0.initialise(branch_array69);
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNotNull(arraylist_reservation9);
        org.junit.Assert.assertNull(arraylist_car11);
        org.junit.Assert.assertNotNull(arraylist_reservation18);
        org.junit.Assert.assertNull(arraylist_client22);
        org.junit.Assert.assertNull(arraylist_car29);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(arraylist_car43);
        org.junit.Assert.assertNotNull(arraylist_reservation52);
        org.junit.Assert.assertNull(arraylist_car58);
        org.junit.Assert.assertNotNull(branch_array69);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test044");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rentalService.Branch[] branch_array5 = null;
        rental0.initialise(branch_array5);
        java.util.ArrayList<rentalService.Car> arraylist_car8 = rental0.showCars("");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation14 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car16 = rental0.showCars("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(arraylist_car8);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNotNull(arraylist_reservation14);
        org.junit.Assert.assertNull(arraylist_car16);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test045");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.lang.String str9 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        rentalService.Rental rental14 = new rentalService.Rental();
        java.lang.String str17 = rental14.registerClient("", "");
        rental14.cancelReservation("hi!");
        rental14.pickupCar("");
        rental14.pickupCar("");
        rental14.dropoffCar("hi!");
        rental14.cancelReservation("hi!");
        rental14.cancelReservation("");
        rentalService.Rental rental30 = new rentalService.Rental();
        java.lang.String str33 = rental30.registerClient("", "");
        rental30.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation37 = rental30.showClientReservations("hi!");
        java.lang.String str41 = rental30.makeReservation("hi!", "", "");
        rental30.cancelReservation("");
        rentalService.Rental rental44 = new rentalService.Rental();
        java.lang.String str47 = rental44.registerClient("", "");
        rental44.cancelReservation("hi!");
        rental44.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car53 = rental44.showCars("");
        rentalService.Rental rental54 = new rentalService.Rental();
        rental54.pickupCar("");
        rental54.dropoffCar("");
        rental54.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation62 = rental54.showClientReservations("hi!");
        rental54.cancelReservation("hi!");
        rental54.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car68 = rental54.showCars("");
        rental54.dropoffCar("");
        rentalService.Rental rental71 = new rentalService.Rental();
        rental71.pickupCar("");
        rental71.dropoffCar("");
        rental71.pickupCar("");
        rentalService.Branch branch78 = null;
        rentalService.Branch[] branch_array79 = new rentalService.Branch[] { branch78 };
        rental71.initialise(branch_array79);
        rental54.initialise(branch_array79);
        rental44.initialise(branch_array79);
        rental30.initialise(branch_array79);
        rental14.initialise(branch_array79);
        rental0.initialise(branch_array79);
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation89 = rental0.showClientReservations("");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(arraylist_reservation37);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(arraylist_car53);
        org.junit.Assert.assertNotNull(arraylist_reservation62);
        org.junit.Assert.assertNull(arraylist_car68);
        org.junit.Assert.assertNotNull(branch_array79);
        org.junit.Assert.assertNotNull(arraylist_reservation89);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test046");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation14 = rental0.showClientReservations("");
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNotNull(arraylist_reservation14);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test047");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.dropoffCar("");
        rentalService.Rental rental17 = new rentalService.Rental();
        rental17.pickupCar("");
        rental17.dropoffCar("");
        rental17.pickupCar("");
        rentalService.Branch branch24 = null;
        rentalService.Branch[] branch_array25 = new rentalService.Branch[] { branch24 };
        rental17.initialise(branch_array25);
        rental0.initialise(branch_array25);
        rentalService.Rental rental28 = new rentalService.Rental();
        rental28.pickupCar("");
        rental28.dropoffCar("");
        rental28.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation36 = rental28.showClientReservations("hi!");
        rentalService.Branch[] branch_array37 = new rentalService.Branch[] {};
        rental28.initialise(branch_array37);
        rental0.initialise(branch_array37);
        java.util.ArrayList<rentalService.Client> arraylist_client41 = rental0.showClients("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation43 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Client> arraylist_client45 = rental0.showClients("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation47 = rental0.showClientReservations("hi!");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(branch_array25);
        org.junit.Assert.assertNotNull(arraylist_reservation36);
        org.junit.Assert.assertNotNull(branch_array37);
        org.junit.Assert.assertNull(arraylist_client41);
        org.junit.Assert.assertNotNull(arraylist_reservation43);
        org.junit.Assert.assertNull(arraylist_client45);
        org.junit.Assert.assertNotNull(arraylist_reservation47);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test048");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.lang.String str9 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        rentalService.Branch[] branch_array14 = null;
        rental0.initialise(branch_array14);
        rental0.cancelClientReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation19 = rental0.showClientReservations("hi!");
        try {
            java.util.ArrayList<rentalService.Client> arraylist_client21 = rental0.showClients("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(arraylist_reservation19);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test049");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rentalService.Rental rental5 = new rentalService.Rental();
        rental5.pickupCar("");
        rental5.dropoffCar("");
        rental5.pickupCar("");
        rentalService.Branch branch12 = null;
        rentalService.Branch[] branch_array13 = new rentalService.Branch[] { branch12 };
        rental5.initialise(branch_array13);
        rental0.initialise(branch_array13);
        rental0.cancelClientReservation("");
        java.lang.String str20 = rental0.registerClient("", "");
        org.junit.Assert.assertNotNull(branch_array13);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test050");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("");
        rental0.cancelReservation("hi!");
        rental0.dropoffCar("");
        org.junit.Assert.assertNull(arraylist_car4);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test051");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.dropoffCar("");
        rentalService.Rental rental17 = new rentalService.Rental();
        rental17.pickupCar("");
        rental17.dropoffCar("");
        rental17.pickupCar("");
        rentalService.Branch branch24 = null;
        rentalService.Branch[] branch_array25 = new rentalService.Branch[] { branch24 };
        rental17.initialise(branch_array25);
        rental0.initialise(branch_array25);
        rental0.cancelClientReservation("");
        rental0.cancelClientReservation("");
        try {
            java.util.ArrayList<rentalService.Car> arraylist_car33 = rental0.showCars("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(branch_array25);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test052");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.lang.String str9 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car13 = rental0.showCars("");
        rentalService.Rental rental14 = new rentalService.Rental();
        rental14.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car18 = rental14.showCars("");
        rental14.dropoffCar("");
        rentalService.Rental rental21 = new rentalService.Rental();
        rental21.pickupCar("");
        rental21.dropoffCar("");
        rental21.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation29 = rental21.showClientReservations("hi!");
        rental21.cancelReservation("hi!");
        rental21.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car35 = rental21.showCars("");
        rental21.dropoffCar("");
        rentalService.Rental rental38 = new rentalService.Rental();
        rental38.pickupCar("");
        rental38.dropoffCar("");
        rental38.pickupCar("");
        rentalService.Branch branch45 = null;
        rentalService.Branch[] branch_array46 = new rentalService.Branch[] { branch45 };
        rental38.initialise(branch_array46);
        rental21.initialise(branch_array46);
        rental14.initialise(branch_array46);
        rental0.initialise(branch_array46);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation52 = rental0.showClientReservations("");
        java.lang.String str56 = rental0.makeReservation("", "", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(arraylist_car13);
        org.junit.Assert.assertNull(arraylist_car18);
        org.junit.Assert.assertNotNull(arraylist_reservation29);
        org.junit.Assert.assertNull(arraylist_car35);
        org.junit.Assert.assertNotNull(branch_array46);
        org.junit.Assert.assertNotNull(arraylist_reservation52);
        org.junit.Assert.assertNull(str56);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test053");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.lang.String str9 = rental0.registerClient("", "hi!");
        java.lang.String str12 = rental0.registerClient("", "");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation16 = rental0.showClientReservations("hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(arraylist_reservation16);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test054");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Client> arraylist_client12 = rental0.showClients("hi!");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Car> arraylist_car20 = rental0.showCars("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car22 = rental0.showCars("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNull(arraylist_client12);
        org.junit.Assert.assertNull(arraylist_car20);
        org.junit.Assert.assertNull(arraylist_car22);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test055");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        rental0.cancelReservation("");
        java.lang.String str17 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation19 = rental0.showClientReservations("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client23 = rental0.showClients("");
        rental0.dropoffCar("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(arraylist_reservation19);
        org.junit.Assert.assertNull(arraylist_client23);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test056");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.pickupCar("hi!");
        rental0.cancelClientReservation("");
        java.util.ArrayList<rentalService.Car> arraylist_car20 = rental0.showCars("");
        java.util.ArrayList<rentalService.Client> arraylist_client22 = rental0.showClients("");
        rentalService.Rental rental23 = new rentalService.Rental();
        rental23.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car27 = rental23.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation29 = rental23.showClientReservations("hi!");
        rental23.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation33 = rental23.showClientReservations("hi!");
        rentalService.Rental rental34 = new rentalService.Rental();
        rental34.pickupCar("");
        rental34.dropoffCar("");
        rental34.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation42 = rental34.showClientReservations("hi!");
        rental34.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation46 = rental34.showClientReservations("hi!");
        rental34.dropoffCar("hi!");
        rentalService.Rental rental49 = new rentalService.Rental();
        java.lang.String str52 = rental49.registerClient("", "");
        rental49.cancelReservation("hi!");
        rental49.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car58 = rental49.showCars("");
        rentalService.Rental rental59 = new rentalService.Rental();
        rental59.pickupCar("");
        rental59.dropoffCar("");
        rental59.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation67 = rental59.showClientReservations("hi!");
        rental59.cancelReservation("hi!");
        rental59.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car73 = rental59.showCars("");
        rental59.dropoffCar("");
        rentalService.Rental rental76 = new rentalService.Rental();
        rental76.pickupCar("");
        rental76.dropoffCar("");
        rental76.pickupCar("");
        rentalService.Branch branch83 = null;
        rentalService.Branch[] branch_array84 = new rentalService.Branch[] { branch83 };
        rental76.initialise(branch_array84);
        rental59.initialise(branch_array84);
        rental49.initialise(branch_array84);
        rental34.initialise(branch_array84);
        rental23.initialise(branch_array84);
        rental0.initialise(branch_array84);
        rental0.pickupCar("");
        try {
            java.lang.String str96 = rental0.makeReservation("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(arraylist_car20);
        org.junit.Assert.assertNull(arraylist_client22);
        org.junit.Assert.assertNull(arraylist_car27);
        org.junit.Assert.assertNotNull(arraylist_reservation29);
        org.junit.Assert.assertNotNull(arraylist_reservation33);
        org.junit.Assert.assertNotNull(arraylist_reservation42);
        org.junit.Assert.assertNotNull(arraylist_reservation46);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(arraylist_car58);
        org.junit.Assert.assertNotNull(arraylist_reservation67);
        org.junit.Assert.assertNull(arraylist_car73);
        org.junit.Assert.assertNotNull(branch_array84);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test057");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.lang.String str9 = rental0.registerClient("", "hi!");
        java.lang.String str12 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation14 = rental0.showClientReservations("hi!");
        rental0.cancelClientReservation("");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(arraylist_reservation14);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test058");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rentalService.Rental rental17 = new rentalService.Rental();
        rental17.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car21 = rental17.showCars("");
        rental17.dropoffCar("hi!");
        rental17.dropoffCar("");
        rental17.cancelReservation("hi!");
        java.lang.String str30 = rental17.registerClient("", "hi!");
        rental17.cancelClientReservation("");
        java.util.ArrayList<rentalService.Client> arraylist_client34 = rental17.showClients("");
        rentalService.Rental rental35 = new rentalService.Rental();
        java.lang.String str38 = rental35.registerClient("", "");
        rental35.cancelReservation("hi!");
        rental35.pickupCar("");
        rental35.pickupCar("");
        rentalService.Rental rental45 = new rentalService.Rental();
        rental45.pickupCar("");
        rental45.dropoffCar("");
        rentalService.Rental rental50 = new rentalService.Rental();
        rental50.pickupCar("");
        rental50.dropoffCar("");
        rental50.pickupCar("");
        rentalService.Branch branch57 = null;
        rentalService.Branch[] branch_array58 = new rentalService.Branch[] { branch57 };
        rental50.initialise(branch_array58);
        rental45.initialise(branch_array58);
        rental35.initialise(branch_array58);
        rental17.initialise(branch_array58);
        rental0.initialise(branch_array58);
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client67 = rental0.showClients("");
        java.lang.String str70 = rental0.registerClient("", "hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car21);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(arraylist_client34);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(branch_array58);
        org.junit.Assert.assertNull(arraylist_client67);
        org.junit.Assert.assertNull(str70);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test059");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation18 = rental0.showClientReservations("hi!");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client22 = rental0.showClients("");
        rental0.pickupCar("hi!");
        rental0.dropoffCar("hi!");
        rentalService.Rental rental27 = new rentalService.Rental();
        rental27.pickupCar("");
        rental27.dropoffCar("");
        rental27.pickupCar("");
        java.lang.String str36 = rental27.registerClient("", "hi!");
        rental27.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car40 = rental27.showCars("");
        rentalService.Rental rental41 = new rentalService.Rental();
        rental41.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car45 = rental41.showCars("");
        rental41.dropoffCar("");
        rentalService.Rental rental48 = new rentalService.Rental();
        rental48.pickupCar("");
        rental48.dropoffCar("");
        rental48.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation56 = rental48.showClientReservations("hi!");
        rental48.cancelReservation("hi!");
        rental48.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car62 = rental48.showCars("");
        rental48.dropoffCar("");
        rentalService.Rental rental65 = new rentalService.Rental();
        rental65.pickupCar("");
        rental65.dropoffCar("");
        rental65.pickupCar("");
        rentalService.Branch branch72 = null;
        rentalService.Branch[] branch_array73 = new rentalService.Branch[] { branch72 };
        rental65.initialise(branch_array73);
        rental48.initialise(branch_array73);
        rental41.initialise(branch_array73);
        rental27.initialise(branch_array73);
        rentalService.Rental rental78 = new rentalService.Rental();
        rental78.pickupCar("");
        rental78.dropoffCar("");
        rental78.pickupCar("");
        rentalService.Branch branch85 = null;
        rentalService.Branch[] branch_array86 = new rentalService.Branch[] { branch85 };
        rental78.initialise(branch_array86);
        rental27.initialise(branch_array86);
        rental0.initialise(branch_array86);
        rental0.cancelReservation("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNotNull(arraylist_reservation18);
        org.junit.Assert.assertNull(arraylist_client22);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(arraylist_car40);
        org.junit.Assert.assertNull(arraylist_car45);
        org.junit.Assert.assertNotNull(arraylist_reservation56);
        org.junit.Assert.assertNull(arraylist_car62);
        org.junit.Assert.assertNotNull(branch_array73);
        org.junit.Assert.assertNotNull(branch_array86);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test060");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rentalService.Branch[] branch_array5 = null;
        rental0.initialise(branch_array5);
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("");
        rentalService.Rental rental11 = new rentalService.Rental();
        rental11.pickupCar("");
        rental11.dropoffCar("");
        rental11.pickupCar("");
        rentalService.Branch branch18 = null;
        rentalService.Branch[] branch_array19 = new rentalService.Branch[] { branch18 };
        rental11.initialise(branch_array19);
        rental0.initialise(branch_array19);
        java.util.ArrayList<rentalService.Car> arraylist_car23 = rental0.showCars("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car27 = rental0.showCars("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(arraylist_client10);
        org.junit.Assert.assertNotNull(branch_array19);
        org.junit.Assert.assertNull(arraylist_car23);
        org.junit.Assert.assertNull(arraylist_car27);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test061");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("");
        java.lang.String str14 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation16 = rental0.showClientReservations("hi!");
        rental0.cancelClientReservation("");
        rental0.cancelClientReservation("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(arraylist_client10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(arraylist_reservation16);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test062");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation15 = rental0.showClientReservations("");
        rental0.pickupCar("");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client21 = rental0.showClients("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
        org.junit.Assert.assertNotNull(arraylist_reservation15);
        org.junit.Assert.assertNull(arraylist_client21);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test063");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.cancelReservation("");
        rental0.cancelClientReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation18 = rental0.showClientReservations("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation18);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test064");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental0.showCars("");
        rentalService.Rental rental13 = new rentalService.Rental();
        java.lang.String str16 = rental13.registerClient("", "");
        rental13.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation20 = rental13.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation22 = rental13.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car24 = rental13.showCars("");
        rentalService.Rental rental25 = new rentalService.Rental();
        rental25.pickupCar("");
        rental25.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation31 = rental25.showClientReservations("hi!");
        rental25.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client35 = rental25.showClients("");
        rentalService.Rental rental36 = new rentalService.Rental();
        rental36.pickupCar("");
        rental36.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car42 = rental36.showCars("");
        rental36.cancelClientReservation("hi!");
        rental36.cancelReservation("");
        rentalService.Rental rental47 = new rentalService.Rental();
        java.lang.String str50 = rental47.registerClient("", "");
        rental47.cancelReservation("hi!");
        rental47.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car56 = rental47.showCars("");
        rentalService.Rental rental57 = new rentalService.Rental();
        rental57.pickupCar("");
        rental57.dropoffCar("");
        rental57.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation65 = rental57.showClientReservations("hi!");
        rental57.cancelReservation("hi!");
        rental57.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car71 = rental57.showCars("");
        rental57.dropoffCar("");
        rentalService.Rental rental74 = new rentalService.Rental();
        rental74.pickupCar("");
        rental74.dropoffCar("");
        rental74.pickupCar("");
        rentalService.Branch branch81 = null;
        rentalService.Branch[] branch_array82 = new rentalService.Branch[] { branch81 };
        rental74.initialise(branch_array82);
        rental57.initialise(branch_array82);
        rental47.initialise(branch_array82);
        rental36.initialise(branch_array82);
        rental25.initialise(branch_array82);
        rental13.initialise(branch_array82);
        rental0.initialise(branch_array82);
        java.util.ArrayList<rentalService.Car> arraylist_car91 = rental0.showCars("");
        rental0.pickupCar("hi!");
        try {
            java.util.ArrayList<rentalService.Car> arraylist_car95 = rental0.showCars("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(arraylist_reservation20);
        org.junit.Assert.assertNotNull(arraylist_reservation22);
        org.junit.Assert.assertNull(arraylist_car24);
        org.junit.Assert.assertNotNull(arraylist_reservation31);
        org.junit.Assert.assertNull(arraylist_client35);
        org.junit.Assert.assertNull(arraylist_car42);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(arraylist_car56);
        org.junit.Assert.assertNotNull(arraylist_reservation65);
        org.junit.Assert.assertNull(arraylist_car71);
        org.junit.Assert.assertNotNull(branch_array82);
        org.junit.Assert.assertNull(arraylist_car91);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test065");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation16 = rental0.showClientReservations("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(arraylist_reservation16);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test066");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("");
        rentalService.Rental rental9 = new rentalService.Rental();
        java.lang.String str12 = rental9.registerClient("", "");
        rental9.cancelReservation("hi!");
        rental9.pickupCar("");
        rental9.pickupCar("");
        rentalService.Rental rental19 = new rentalService.Rental();
        rental19.pickupCar("");
        rental19.dropoffCar("");
        rentalService.Rental rental24 = new rentalService.Rental();
        rental24.pickupCar("");
        rental24.dropoffCar("");
        rental24.pickupCar("");
        rentalService.Branch branch31 = null;
        rentalService.Branch[] branch_array32 = new rentalService.Branch[] { branch31 };
        rental24.initialise(branch_array32);
        rental19.initialise(branch_array32);
        rental9.initialise(branch_array32);
        rental0.initialise(branch_array32);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation38 = rental0.showClientReservations("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(branch_array32);
        org.junit.Assert.assertNotNull(arraylist_reservation38);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test067");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car11 = rental0.showCars("");
        rentalService.Rental rental12 = new rentalService.Rental();
        rental12.pickupCar("");
        rental12.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation18 = rental12.showClientReservations("hi!");
        rental12.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client22 = rental12.showClients("");
        rentalService.Rental rental23 = new rentalService.Rental();
        rental23.pickupCar("");
        rental23.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car29 = rental23.showCars("");
        rental23.cancelClientReservation("hi!");
        rental23.cancelReservation("");
        rentalService.Rental rental34 = new rentalService.Rental();
        java.lang.String str37 = rental34.registerClient("", "");
        rental34.cancelReservation("hi!");
        rental34.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car43 = rental34.showCars("");
        rentalService.Rental rental44 = new rentalService.Rental();
        rental44.pickupCar("");
        rental44.dropoffCar("");
        rental44.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation52 = rental44.showClientReservations("hi!");
        rental44.cancelReservation("hi!");
        rental44.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car58 = rental44.showCars("");
        rental44.dropoffCar("");
        rentalService.Rental rental61 = new rentalService.Rental();
        rental61.pickupCar("");
        rental61.dropoffCar("");
        rental61.pickupCar("");
        rentalService.Branch branch68 = null;
        rentalService.Branch[] branch_array69 = new rentalService.Branch[] { branch68 };
        rental61.initialise(branch_array69);
        rental44.initialise(branch_array69);
        rental34.initialise(branch_array69);
        rental23.initialise(branch_array69);
        rental12.initialise(branch_array69);
        rental0.initialise(branch_array69);
        rental0.cancelClientReservation("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNotNull(arraylist_reservation9);
        org.junit.Assert.assertNull(arraylist_car11);
        org.junit.Assert.assertNotNull(arraylist_reservation18);
        org.junit.Assert.assertNull(arraylist_client22);
        org.junit.Assert.assertNull(arraylist_car29);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(arraylist_car43);
        org.junit.Assert.assertNotNull(arraylist_reservation52);
        org.junit.Assert.assertNull(arraylist_car58);
        org.junit.Assert.assertNotNull(branch_array69);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test068");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("");
        rental0.cancelReservation("");
        rental0.dropoffCar("");
        rental0.dropoffCar("");
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(arraylist_client10);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test069");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rentalService.Rental rental15 = new rentalService.Rental();
        rental15.pickupCar("");
        rental15.dropoffCar("");
        rental15.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation23 = rental15.showClientReservations("hi!");
        rental15.cancelReservation("hi!");
        rental15.cancelClientReservation("hi!");
        rental15.pickupCar("");
        rental15.dropoffCar("hi!");
        rentalService.Rental rental32 = new rentalService.Rental();
        rental32.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car36 = rental32.showCars("");
        rental32.dropoffCar("hi!");
        rental32.dropoffCar("");
        rental32.cancelReservation("hi!");
        java.lang.String str45 = rental32.registerClient("", "hi!");
        rental32.cancelClientReservation("");
        java.util.ArrayList<rentalService.Client> arraylist_client49 = rental32.showClients("");
        rentalService.Rental rental50 = new rentalService.Rental();
        java.lang.String str53 = rental50.registerClient("", "");
        rental50.cancelReservation("hi!");
        rental50.pickupCar("");
        rental50.pickupCar("");
        rentalService.Rental rental60 = new rentalService.Rental();
        rental60.pickupCar("");
        rental60.dropoffCar("");
        rentalService.Rental rental65 = new rentalService.Rental();
        rental65.pickupCar("");
        rental65.dropoffCar("");
        rental65.pickupCar("");
        rentalService.Branch branch72 = null;
        rentalService.Branch[] branch_array73 = new rentalService.Branch[] { branch72 };
        rental65.initialise(branch_array73);
        rental60.initialise(branch_array73);
        rental50.initialise(branch_array73);
        rental32.initialise(branch_array73);
        rental15.initialise(branch_array73);
        rental0.initialise(branch_array73);
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car83 = rental0.showCars("");
        rental0.dropoffCar("");
        rental0.cancelClientReservation("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(arraylist_reservation23);
        org.junit.Assert.assertNull(arraylist_car36);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(arraylist_client49);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(branch_array73);
        org.junit.Assert.assertNull(arraylist_car83);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test070");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        java.lang.String str19 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str25 = rental0.makeReservation("hi!", "", "hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client29 = rental0.showClients("hi!");
        java.lang.String str32 = rental0.registerClient("hi!", "");
        rental0.pickupCar("");
        rental0.pickupCar("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(arraylist_client29);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test071");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        rental0.pickupCar("");
        rental0.cancelClientReservation("");
        java.lang.String str14 = rental0.registerClient("", "");
        rental0.pickupCar("hi!");
        java.lang.String str20 = rental0.makeReservation("hi!", "", "");
        rentalService.Rental rental21 = new rentalService.Rental();
        rental21.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car25 = rental21.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation27 = rental21.showClientReservations("hi!");
        rental21.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation31 = rental21.showClientReservations("");
        rental21.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client35 = rental21.showClients("");
        rentalService.Rental rental36 = new rentalService.Rental();
        java.lang.String str39 = rental36.registerClient("", "");
        rental36.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation43 = rental36.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation45 = rental36.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation47 = rental36.showClientReservations("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation49 = rental36.showClientReservations("hi!");
        rentalService.Rental rental50 = new rentalService.Rental();
        rental50.pickupCar("");
        rental50.dropoffCar("");
        rental50.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation58 = rental50.showClientReservations("hi!");
        rental50.cancelReservation("hi!");
        rental50.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car64 = rental50.showCars("");
        rental50.dropoffCar("");
        rentalService.Rental rental67 = new rentalService.Rental();
        rental67.pickupCar("");
        rental67.dropoffCar("");
        rental67.pickupCar("");
        rentalService.Branch branch74 = null;
        rentalService.Branch[] branch_array75 = new rentalService.Branch[] { branch74 };
        rental67.initialise(branch_array75);
        rental50.initialise(branch_array75);
        rental36.initialise(branch_array75);
        rental21.initialise(branch_array75);
        rental0.initialise(branch_array75);
        java.lang.String str83 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation85 = rental0.showClientReservations("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(arraylist_car25);
        org.junit.Assert.assertNotNull(arraylist_reservation27);
        org.junit.Assert.assertNotNull(arraylist_reservation31);
        org.junit.Assert.assertNull(arraylist_client35);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(arraylist_reservation43);
        org.junit.Assert.assertNotNull(arraylist_reservation45);
        org.junit.Assert.assertNotNull(arraylist_reservation47);
        org.junit.Assert.assertNotNull(arraylist_reservation49);
        org.junit.Assert.assertNotNull(arraylist_reservation58);
        org.junit.Assert.assertNull(arraylist_car64);
        org.junit.Assert.assertNotNull(branch_array75);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertNotNull(arraylist_reservation85);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test072");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car6 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        rentalService.Rental rental11 = new rentalService.Rental();
        java.lang.String str14 = rental11.registerClient("", "");
        rental11.cancelReservation("hi!");
        rental11.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car20 = rental11.showCars("");
        rentalService.Rental rental21 = new rentalService.Rental();
        rental21.pickupCar("");
        rental21.dropoffCar("");
        rental21.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation29 = rental21.showClientReservations("hi!");
        rental21.cancelReservation("hi!");
        rental21.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car35 = rental21.showCars("");
        rental21.dropoffCar("");
        rentalService.Rental rental38 = new rentalService.Rental();
        rental38.pickupCar("");
        rental38.dropoffCar("");
        rental38.pickupCar("");
        rentalService.Branch branch45 = null;
        rentalService.Branch[] branch_array46 = new rentalService.Branch[] { branch45 };
        rental38.initialise(branch_array46);
        rental21.initialise(branch_array46);
        rental11.initialise(branch_array46);
        rental0.initialise(branch_array46);
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.cancelReservation("");
        org.junit.Assert.assertNull(arraylist_car6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(arraylist_car20);
        org.junit.Assert.assertNotNull(arraylist_reservation29);
        org.junit.Assert.assertNull(arraylist_car35);
        org.junit.Assert.assertNotNull(branch_array46);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test073");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rentalService.Branch[] branch_array5 = null;
        rental0.initialise(branch_array5);
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("");
        rentalService.Rental rental11 = new rentalService.Rental();
        rental11.pickupCar("");
        rental11.dropoffCar("");
        rental11.pickupCar("");
        rentalService.Branch branch18 = null;
        rentalService.Branch[] branch_array19 = new rentalService.Branch[] { branch18 };
        rental11.initialise(branch_array19);
        rental0.initialise(branch_array19);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation23 = rental0.showClientReservations("");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation27 = rental0.showClientReservations("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(arraylist_client10);
        org.junit.Assert.assertNotNull(branch_array19);
        org.junit.Assert.assertNotNull(arraylist_reservation23);
        org.junit.Assert.assertNotNull(arraylist_reservation27);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test074");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.dropoffCar("");
        rentalService.Rental rental17 = new rentalService.Rental();
        rental17.pickupCar("");
        rental17.dropoffCar("");
        rental17.pickupCar("");
        rentalService.Branch branch24 = null;
        rentalService.Branch[] branch_array25 = new rentalService.Branch[] { branch24 };
        rental17.initialise(branch_array25);
        rental0.initialise(branch_array25);
        rental0.cancelClientReservation("");
        rental0.cancelReservation("");
        rental0.cancelClientReservation("");
        rental0.pickupCar("");
        rental0.cancelReservation("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(branch_array25);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test075");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.pickupCar("hi!");
        rentalService.Rental rental19 = new rentalService.Rental();
        rental19.pickupCar("");
        rental19.dropoffCar("");
        rental19.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation27 = rental19.showClientReservations("hi!");
        rentalService.Branch[] branch_array28 = new rentalService.Branch[] {};
        rental19.initialise(branch_array28);
        rental0.initialise(branch_array28);
        rental0.cancelReservation("hi!");
        java.lang.String str35 = rental0.registerClient("hi!", "hi!");
        rental0.pickupCar("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(arraylist_reservation27);
        org.junit.Assert.assertNotNull(branch_array28);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test076");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("");
        rentalService.Rental rental7 = new rentalService.Rental();
        rental7.pickupCar("");
        rental7.dropoffCar("");
        rental7.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation15 = rental7.showClientReservations("hi!");
        rental7.cancelReservation("hi!");
        rental7.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car21 = rental7.showCars("");
        rental7.dropoffCar("");
        rentalService.Rental rental24 = new rentalService.Rental();
        rental24.pickupCar("");
        rental24.dropoffCar("");
        rental24.pickupCar("");
        rentalService.Branch branch31 = null;
        rentalService.Branch[] branch_array32 = new rentalService.Branch[] { branch31 };
        rental24.initialise(branch_array32);
        rental7.initialise(branch_array32);
        rental0.initialise(branch_array32);
        rentalService.Rental rental36 = new rentalService.Rental();
        rental36.pickupCar("");
        rental36.dropoffCar("");
        rental36.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation44 = rental36.showClientReservations("hi!");
        rental36.cancelReservation("hi!");
        rental36.cancelClientReservation("hi!");
        rental36.pickupCar("hi!");
        rental36.pickupCar("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car54 = rental36.showCars("");
        java.util.ArrayList<rentalService.Client> arraylist_client56 = rental36.showClients("");
        rentalService.Rental rental57 = new rentalService.Rental();
        rental57.pickupCar("");
        rental57.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation63 = rental57.showClientReservations("hi!");
        rental57.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client67 = rental57.showClients("");
        rentalService.Rental rental68 = new rentalService.Rental();
        rental68.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car72 = rental68.showCars("");
        rentalService.Branch[] branch_array73 = null;
        rental68.initialise(branch_array73);
        rental68.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client78 = rental68.showClients("");
        rentalService.Rental rental79 = new rentalService.Rental();
        rental79.pickupCar("");
        rental79.dropoffCar("");
        rental79.pickupCar("");
        rentalService.Branch branch86 = null;
        rentalService.Branch[] branch_array87 = new rentalService.Branch[] { branch86 };
        rental79.initialise(branch_array87);
        rental68.initialise(branch_array87);
        rental57.initialise(branch_array87);
        rental36.initialise(branch_array87);
        rental0.initialise(branch_array87);
        rental0.pickupCar("");
        try {
            java.util.ArrayList<rentalService.Car> arraylist_car96 = rental0.showCars("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation15);
        org.junit.Assert.assertNull(arraylist_car21);
        org.junit.Assert.assertNotNull(branch_array32);
        org.junit.Assert.assertNotNull(arraylist_reservation44);
        org.junit.Assert.assertNull(arraylist_car54);
        org.junit.Assert.assertNull(arraylist_client56);
        org.junit.Assert.assertNotNull(arraylist_reservation63);
        org.junit.Assert.assertNull(arraylist_client67);
        org.junit.Assert.assertNull(arraylist_car72);
        org.junit.Assert.assertNull(arraylist_client78);
        org.junit.Assert.assertNotNull(branch_array87);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test077");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.lang.String str9 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        rentalService.Branch[] branch_array14 = null;
        rental0.initialise(branch_array14);
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation19 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("");
        java.lang.String str24 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Car> arraylist_car26 = rental0.showCars("");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(arraylist_reservation19);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(arraylist_car26);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test078");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        rentalService.Branch branch11 = null;
        rentalService.Branch[] branch_array12 = new rentalService.Branch[] { branch11 };
        rental0.initialise(branch_array12);
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        try {
            java.util.ArrayList<rentalService.Car> arraylist_car21 = rental0.showCars("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(branch_array12);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test079");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rentalService.Branch[] branch_array5 = null;
        rental0.initialise(branch_array5);
        java.util.ArrayList<rentalService.Car> arraylist_car8 = rental0.showCars("");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rentalService.Rental rental13 = new rentalService.Rental();
        rental13.pickupCar("");
        rental13.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car19 = rental13.showCars("");
        rental13.cancelClientReservation("hi!");
        rental13.cancelReservation("");
        rentalService.Rental rental24 = new rentalService.Rental();
        rental24.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car28 = rental24.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation30 = rental24.showClientReservations("hi!");
        rental24.dropoffCar("");
        java.lang.String str36 = rental24.makeReservation("", "", "");
        rentalService.Branch[] branch_array37 = null;
        rental24.initialise(branch_array37);
        java.util.ArrayList<rentalService.Client> arraylist_client40 = rental24.showClients("");
        rentalService.Rental rental41 = new rentalService.Rental();
        rental41.pickupCar("");
        rental41.dropoffCar("");
        rental41.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation49 = rental41.showClientReservations("");
        rentalService.Rental rental50 = new rentalService.Rental();
        java.lang.String str53 = rental50.registerClient("", "");
        rental50.cancelReservation("hi!");
        rental50.pickupCar("");
        rental50.pickupCar("");
        rentalService.Rental rental60 = new rentalService.Rental();
        rental60.pickupCar("");
        rental60.dropoffCar("");
        rentalService.Rental rental65 = new rentalService.Rental();
        rental65.pickupCar("");
        rental65.dropoffCar("");
        rental65.pickupCar("");
        rentalService.Branch branch72 = null;
        rentalService.Branch[] branch_array73 = new rentalService.Branch[] { branch72 };
        rental65.initialise(branch_array73);
        rental60.initialise(branch_array73);
        rental50.initialise(branch_array73);
        rental41.initialise(branch_array73);
        rental24.initialise(branch_array73);
        rental13.initialise(branch_array73);
        rental0.initialise(branch_array73);
        rental0.cancelClientReservation("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(arraylist_car8);
        org.junit.Assert.assertNull(arraylist_car19);
        org.junit.Assert.assertNull(arraylist_car28);
        org.junit.Assert.assertNotNull(arraylist_reservation30);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(arraylist_client40);
        org.junit.Assert.assertNotNull(arraylist_reservation49);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(branch_array73);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test080");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.dropoffCar("");
        rentalService.Rental rental17 = new rentalService.Rental();
        rental17.pickupCar("");
        rental17.dropoffCar("");
        rental17.pickupCar("");
        rentalService.Branch branch24 = null;
        rentalService.Branch[] branch_array25 = new rentalService.Branch[] { branch24 };
        rental17.initialise(branch_array25);
        rental0.initialise(branch_array25);
        rentalService.Rental rental28 = new rentalService.Rental();
        rental28.pickupCar("");
        rental28.dropoffCar("");
        rental28.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation36 = rental28.showClientReservations("hi!");
        rentalService.Branch[] branch_array37 = new rentalService.Branch[] {};
        rental28.initialise(branch_array37);
        rental0.initialise(branch_array37);
        java.util.ArrayList<rentalService.Client> arraylist_client41 = rental0.showClients("hi!");
        java.lang.String str44 = rental0.registerClient("", "hi!");
        rental0.pickupCar("hi!");
        rental0.dropoffCar("");
        java.lang.String str52 = rental0.makeReservation("hi!", "", "");
        rental0.cancelReservation("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(branch_array25);
        org.junit.Assert.assertNotNull(arraylist_reservation36);
        org.junit.Assert.assertNotNull(branch_array37);
        org.junit.Assert.assertNull(arraylist_client41);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str52);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test081");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.pickupCar("hi!");
        rentalService.Rental rental19 = new rentalService.Rental();
        rental19.pickupCar("");
        rental19.dropoffCar("");
        rental19.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation27 = rental19.showClientReservations("hi!");
        rentalService.Branch[] branch_array28 = new rentalService.Branch[] {};
        rental19.initialise(branch_array28);
        rental0.initialise(branch_array28);
        rental0.cancelReservation("hi!");
        java.lang.String str35 = rental0.registerClient("hi!", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation37 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car39 = rental0.showCars("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(arraylist_reservation27);
        org.junit.Assert.assertNotNull(branch_array28);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(arraylist_reservation37);
        org.junit.Assert.assertNull(arraylist_car39);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test082");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.lang.String str7 = rental0.makeReservation("hi!", "", "");
        rentalService.Rental rental8 = new rentalService.Rental();
        java.lang.String str11 = rental8.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental8.showClientReservations("");
        rental8.cancelReservation("");
        rentalService.Rental rental16 = new rentalService.Rental();
        rental16.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car20 = rental16.showCars("");
        rental16.dropoffCar("hi!");
        rental16.dropoffCar("");
        rental16.dropoffCar("hi!");
        rentalService.Branch branch27 = null;
        rentalService.Branch[] branch_array28 = new rentalService.Branch[] { branch27 };
        rental16.initialise(branch_array28);
        rental8.initialise(branch_array28);
        rental0.initialise(branch_array28);
        rental0.cancelReservation("");
        rental0.pickupCar("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation39 = rental0.showClientReservations("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
        org.junit.Assert.assertNull(arraylist_car20);
        org.junit.Assert.assertNotNull(branch_array28);
        org.junit.Assert.assertNotNull(arraylist_reservation39);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test083");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        java.lang.String str23 = rental0.registerClient("", "hi!");
        java.lang.String str27 = rental0.makeReservation("hi!", "", "hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test084");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str12 = rental0.makeReservation("", "", "");
        rentalService.Branch[] branch_array13 = null;
        rental0.initialise(branch_array13);
        rentalService.Rental rental15 = new rentalService.Rental();
        rental15.pickupCar("");
        rental15.dropoffCar("");
        rental15.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation23 = rental15.showClientReservations("hi!");
        rental15.cancelReservation("hi!");
        rental15.cancelClientReservation("hi!");
        rental15.pickupCar("hi!");
        rental15.pickupCar("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car33 = rental15.showCars("");
        rental15.dropoffCar("hi!");
        rentalService.Rental rental36 = new rentalService.Rental();
        java.lang.String str39 = rental36.registerClient("", "");
        rental36.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation43 = rental36.showClientReservations("hi!");
        java.lang.String str47 = rental36.makeReservation("hi!", "", "");
        rental36.cancelReservation("");
        java.lang.String str53 = rental36.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Client> arraylist_client55 = rental36.showClients("");
        rental36.cancelReservation("hi!");
        rentalService.Rental rental58 = new rentalService.Rental();
        java.lang.String str61 = rental58.registerClient("", "");
        rental58.cancelReservation("hi!");
        rental58.pickupCar("");
        rental58.pickupCar("");
        rentalService.Rental rental68 = new rentalService.Rental();
        rental68.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car72 = rental68.showCars("");
        rental68.dropoffCar("hi!");
        rental68.dropoffCar("");
        rental68.dropoffCar("hi!");
        rentalService.Branch branch79 = null;
        rentalService.Branch[] branch_array80 = new rentalService.Branch[] { branch79 };
        rental68.initialise(branch_array80);
        rental58.initialise(branch_array80);
        rental36.initialise(branch_array80);
        rental15.initialise(branch_array80);
        rental0.initialise(branch_array80);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(arraylist_reservation23);
        org.junit.Assert.assertNull(arraylist_car33);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(arraylist_reservation43);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(arraylist_client55);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNull(arraylist_car72);
        org.junit.Assert.assertNotNull(branch_array80);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test085");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("hi!");
        java.lang.String str12 = rental0.registerClient("", "hi!");
        rentalService.Rental rental13 = new rentalService.Rental();
        java.lang.String str16 = rental13.registerClient("", "");
        rental13.cancelReservation("hi!");
        rental13.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car22 = rental13.showCars("");
        rentalService.Rental rental23 = new rentalService.Rental();
        rental23.pickupCar("");
        rental23.dropoffCar("");
        rental23.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation31 = rental23.showClientReservations("hi!");
        rental23.cancelReservation("hi!");
        rental23.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car37 = rental23.showCars("");
        rental23.dropoffCar("");
        rentalService.Rental rental40 = new rentalService.Rental();
        rental40.pickupCar("");
        rental40.dropoffCar("");
        rental40.pickupCar("");
        rentalService.Branch branch47 = null;
        rentalService.Branch[] branch_array48 = new rentalService.Branch[] { branch47 };
        rental40.initialise(branch_array48);
        rental23.initialise(branch_array48);
        rental13.initialise(branch_array48);
        rental0.initialise(branch_array48);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation54 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        try {
            java.util.ArrayList<rentalService.Car> arraylist_car60 = rental0.showCars("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNotNull(arraylist_reservation9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(arraylist_car22);
        org.junit.Assert.assertNotNull(arraylist_reservation31);
        org.junit.Assert.assertNull(arraylist_car37);
        org.junit.Assert.assertNotNull(branch_array48);
        org.junit.Assert.assertNotNull(arraylist_reservation54);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test086");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client18 = rental0.showClients("");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation24 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation26 = rental0.showClientReservations("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(arraylist_client18);
        org.junit.Assert.assertNotNull(arraylist_reservation24);
        org.junit.Assert.assertNotNull(arraylist_reservation26);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test087");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car15 = rental0.showCars("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
        org.junit.Assert.assertNull(arraylist_car15);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test088");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("");
        rental0.cancelClientReservation("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client19 = rental0.showClients("");
        rental0.cancelReservation("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
        org.junit.Assert.assertNull(arraylist_client19);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test089");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.lang.String str9 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car13 = rental0.showCars("");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation17 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation19 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation21 = rental0.showClientReservations("");
        rental0.dropoffCar("hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(arraylist_car13);
        org.junit.Assert.assertNotNull(arraylist_reservation17);
        org.junit.Assert.assertNotNull(arraylist_reservation19);
        org.junit.Assert.assertNotNull(arraylist_reservation21);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test090");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        java.lang.String str16 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Car> arraylist_car18 = rental0.showCars("");
        java.lang.String str22 = rental0.makeReservation("hi!", "", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNotNull(arraylist_reservation9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(arraylist_car18);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test091");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str12 = rental0.makeReservation("", "", "");
        rentalService.Branch[] branch_array13 = null;
        rental0.initialise(branch_array13);
        java.util.ArrayList<rentalService.Client> arraylist_client16 = rental0.showClients("");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation20 = rental0.showClientReservations("hi!");
        rental0.cancelClientReservation("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(arraylist_client16);
        org.junit.Assert.assertNotNull(arraylist_reservation20);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test092");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("");
        java.lang.String str19 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test093");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        rentalService.Branch branch11 = null;
        rentalService.Branch[] branch_array12 = new rentalService.Branch[] { branch11 };
        rental0.initialise(branch_array12);
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("");
        rental0.cancelClientReservation("hi!");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(branch_array12);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test094");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.cancelClientReservation("");
        rental0.dropoffCar("hi!");
        rentalService.Rental rental19 = new rentalService.Rental();
        java.lang.String str22 = rental19.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation24 = rental19.showClientReservations("");
        rental19.cancelReservation("");
        rental19.cancelClientReservation("hi!");
        rental19.dropoffCar("");
        rentalService.Rental rental31 = new rentalService.Rental();
        rental31.pickupCar("");
        rental31.dropoffCar("");
        rental31.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation39 = rental31.showClientReservations("hi!");
        rentalService.Branch[] branch_array40 = new rentalService.Branch[] {};
        rental31.initialise(branch_array40);
        rental19.initialise(branch_array40);
        rental0.initialise(branch_array40);
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(arraylist_reservation24);
        org.junit.Assert.assertNotNull(arraylist_reservation39);
        org.junit.Assert.assertNotNull(branch_array40);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test095");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation10 = rental0.showClientReservations("hi!");
        java.lang.String str14 = rental0.makeReservation("", "", "");
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(arraylist_reservation10);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test096");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Client> arraylist_client12 = rental0.showClients("hi!");
        rentalService.Rental rental13 = new rentalService.Rental();
        java.lang.String str16 = rental13.registerClient("", "");
        rental13.cancelReservation("hi!");
        rental13.pickupCar("");
        rental13.pickupCar("");
        rentalService.Rental rental23 = new rentalService.Rental();
        rental23.pickupCar("");
        rental23.dropoffCar("");
        rentalService.Rental rental28 = new rentalService.Rental();
        rental28.pickupCar("");
        rental28.dropoffCar("");
        rental28.pickupCar("");
        rentalService.Branch branch35 = null;
        rentalService.Branch[] branch_array36 = new rentalService.Branch[] { branch35 };
        rental28.initialise(branch_array36);
        rental23.initialise(branch_array36);
        rental13.initialise(branch_array36);
        rental0.initialise(branch_array36);
        try {
            java.util.ArrayList<rentalService.Client> arraylist_client42 = rental0.showClients("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNull(arraylist_client12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(branch_array36);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test097");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str12 = rental0.makeReservation("", "", "");
        rentalService.Branch[] branch_array13 = null;
        rental0.initialise(branch_array13);
        java.util.ArrayList<rentalService.Client> arraylist_client16 = rental0.showClients("");
        java.util.ArrayList<rentalService.Client> arraylist_client18 = rental0.showClients("");
        try {
            java.util.ArrayList<rentalService.Car> arraylist_car20 = rental0.showCars("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(arraylist_client16);
        org.junit.Assert.assertNull(arraylist_client18);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test098");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.lang.String str7 = rental0.makeReservation("hi!", "", "");
        rentalService.Rental rental8 = new rentalService.Rental();
        java.lang.String str11 = rental8.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental8.showClientReservations("");
        rental8.cancelReservation("");
        rentalService.Rental rental16 = new rentalService.Rental();
        rental16.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car20 = rental16.showCars("");
        rental16.dropoffCar("hi!");
        rental16.dropoffCar("");
        rental16.dropoffCar("hi!");
        rentalService.Branch branch27 = null;
        rentalService.Branch[] branch_array28 = new rentalService.Branch[] { branch27 };
        rental16.initialise(branch_array28);
        rental8.initialise(branch_array28);
        rental0.initialise(branch_array28);
        rental0.cancelReservation("");
        rental0.pickupCar("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
        org.junit.Assert.assertNull(arraylist_car20);
        org.junit.Assert.assertNotNull(branch_array28);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test099");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        java.lang.String str10 = rental0.makeReservation("hi!", "", "");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test100");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation5 = rental0.showClientReservations("");
        rental0.cancelReservation("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("hi!");
        java.lang.String str14 = rental0.registerClient("", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation5);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test101");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("hi!");
        rental0.pickupCar("hi!");
        rentalService.Rental rental17 = new rentalService.Rental();
        rental17.pickupCar("");
        rental17.dropoffCar("");
        rental17.pickupCar("");
        rentalService.Branch branch24 = null;
        rentalService.Branch[] branch_array25 = new rentalService.Branch[] { branch24 };
        rental17.initialise(branch_array25);
        rental0.initialise(branch_array25);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation29 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation31 = rental0.showClientReservations("");
        rental0.cancelReservation("");
        try {
            java.lang.String str36 = rental0.registerClient("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array25);
        org.junit.Assert.assertNotNull(arraylist_reservation29);
        org.junit.Assert.assertNotNull(arraylist_reservation31);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test102");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        java.lang.String str15 = rental0.makeReservation("", "", "");
        rental0.cancelReservation("");
        rental0.cancelReservation("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNotNull(arraylist_reservation9);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test103");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        java.lang.String str17 = rental0.makeReservation("", "", "");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client25 = rental0.showClients("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation27 = rental0.showClientReservations("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(arraylist_client25);
        org.junit.Assert.assertNotNull(arraylist_reservation27);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test104");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        rental0.cancelReservation("");
        rentalService.Rental rental14 = new rentalService.Rental();
        java.lang.String str17 = rental14.registerClient("", "");
        rental14.cancelReservation("hi!");
        rental14.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car23 = rental14.showCars("");
        rentalService.Rental rental24 = new rentalService.Rental();
        rental24.pickupCar("");
        rental24.dropoffCar("");
        rental24.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation32 = rental24.showClientReservations("hi!");
        rental24.cancelReservation("hi!");
        rental24.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car38 = rental24.showCars("");
        rental24.dropoffCar("");
        rentalService.Rental rental41 = new rentalService.Rental();
        rental41.pickupCar("");
        rental41.dropoffCar("");
        rental41.pickupCar("");
        rentalService.Branch branch48 = null;
        rentalService.Branch[] branch_array49 = new rentalService.Branch[] { branch48 };
        rental41.initialise(branch_array49);
        rental24.initialise(branch_array49);
        rental14.initialise(branch_array49);
        rental0.initialise(branch_array49);
        java.util.ArrayList<rentalService.Client> arraylist_client55 = rental0.showClients("");
        java.lang.String str58 = rental0.registerClient("", "");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("");
        java.lang.String str69 = rental0.registerClient("", "");
        rental0.cancelClientReservation("");
        rental0.dropoffCar("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(arraylist_car23);
        org.junit.Assert.assertNotNull(arraylist_reservation32);
        org.junit.Assert.assertNull(arraylist_car38);
        org.junit.Assert.assertNotNull(branch_array49);
        org.junit.Assert.assertNull(arraylist_client55);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(str69);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test105");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        rentalService.Rental rental15 = new rentalService.Rental();
        java.lang.String str18 = rental15.registerClient("", "");
        rental15.cancelReservation("hi!");
        rental15.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car24 = rental15.showCars("");
        rentalService.Rental rental25 = new rentalService.Rental();
        rental25.pickupCar("");
        rental25.dropoffCar("");
        rental25.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation33 = rental25.showClientReservations("hi!");
        rental25.cancelReservation("hi!");
        rental25.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car39 = rental25.showCars("");
        rental25.dropoffCar("");
        rentalService.Rental rental42 = new rentalService.Rental();
        rental42.pickupCar("");
        rental42.dropoffCar("");
        rental42.pickupCar("");
        rentalService.Branch branch49 = null;
        rentalService.Branch[] branch_array50 = new rentalService.Branch[] { branch49 };
        rental42.initialise(branch_array50);
        rental25.initialise(branch_array50);
        rental15.initialise(branch_array50);
        rental0.initialise(branch_array50);
        rental0.cancelClientReservation("");
        java.lang.String str59 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation61 = rental0.showClientReservations("");
        try {
            java.util.ArrayList<rentalService.Car> arraylist_car63 = rental0.showCars("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(arraylist_car24);
        org.junit.Assert.assertNotNull(arraylist_reservation33);
        org.junit.Assert.assertNull(arraylist_car39);
        org.junit.Assert.assertNotNull(branch_array50);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(arraylist_reservation61);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test106");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client18 = rental0.showClients("");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        rentalService.Rental rental23 = new rentalService.Rental();
        rental23.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car27 = rental23.showCars("");
        rental23.dropoffCar("hi!");
        rental23.dropoffCar("");
        rental23.dropoffCar("hi!");
        rentalService.Branch branch34 = null;
        rentalService.Branch[] branch_array35 = new rentalService.Branch[] { branch34 };
        rental23.initialise(branch_array35);
        rentalService.Rental rental37 = new rentalService.Rental();
        rental37.pickupCar("");
        rental37.dropoffCar("");
        rentalService.Rental rental42 = new rentalService.Rental();
        rental42.pickupCar("");
        rental42.dropoffCar("");
        rental42.pickupCar("");
        rentalService.Branch branch49 = null;
        rentalService.Branch[] branch_array50 = new rentalService.Branch[] { branch49 };
        rental42.initialise(branch_array50);
        rental37.initialise(branch_array50);
        rental23.initialise(branch_array50);
        rental0.initialise(branch_array50);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation56 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation58 = rental0.showClientReservations("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(arraylist_client18);
        org.junit.Assert.assertNull(arraylist_car27);
        org.junit.Assert.assertNotNull(branch_array35);
        org.junit.Assert.assertNotNull(branch_array50);
        org.junit.Assert.assertNotNull(arraylist_reservation56);
        org.junit.Assert.assertNotNull(arraylist_reservation58);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test107");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("");
        rental0.cancelReservation("");
        rental0.dropoffCar("");
        java.lang.String str23 = rental0.makeReservation("hi!", "", "");
        rental0.cancelClientReservation("");
        rental0.cancelClientReservation("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation31 = rental0.showClientReservations("");
        rental0.dropoffCar("");
        java.lang.String str36 = rental0.registerClient("", "hi!");
        rental0.pickupCar("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(arraylist_reservation31);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test108");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rentalService.Branch[] branch_array5 = null;
        rental0.initialise(branch_array5);
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("");
        rentalService.Rental rental11 = new rentalService.Rental();
        rental11.pickupCar("");
        rental11.dropoffCar("");
        rental11.pickupCar("");
        rentalService.Branch branch18 = null;
        rentalService.Branch[] branch_array19 = new rentalService.Branch[] { branch18 };
        rental11.initialise(branch_array19);
        rental0.initialise(branch_array19);
        java.util.ArrayList<rentalService.Car> arraylist_car23 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("");
        try {
            java.lang.String str31 = rental0.makeReservation("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(arraylist_client10);
        org.junit.Assert.assertNotNull(branch_array19);
        org.junit.Assert.assertNull(arraylist_car23);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test109");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client18 = rental0.showClients("");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation24 = rental0.showClientReservations("");
        rentalService.Branch[] branch_array25 = null;
        rental0.initialise(branch_array25);
        java.util.ArrayList<rentalService.Client> arraylist_client28 = rental0.showClients("");
        java.util.ArrayList<rentalService.Client> arraylist_client30 = rental0.showClients("");
        rental0.cancelReservation("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(arraylist_client18);
        org.junit.Assert.assertNotNull(arraylist_reservation24);
        org.junit.Assert.assertNull(arraylist_client28);
        org.junit.Assert.assertNull(arraylist_client30);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test110");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation5 = rental0.showClientReservations("");
        rental0.cancelReservation("");
        rental0.cancelClientReservation("hi!");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation5);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test111");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car6 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelClientReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation18 = rental0.showClientReservations("hi!");
        org.junit.Assert.assertNull(arraylist_car6);
        org.junit.Assert.assertNull(arraylist_car12);
        org.junit.Assert.assertNotNull(arraylist_reservation18);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test112");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.pickupCar("hi!");
        rental0.cancelClientReservation("");
        rental0.cancelClientReservation("");
        rental0.cancelClientReservation("hi!");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client26 = rental0.showClients("");
        rental0.cancelReservation("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(arraylist_client26);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test113");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        rentalService.Branch branch11 = null;
        rentalService.Branch[] branch_array12 = new rentalService.Branch[] { branch11 };
        rental0.initialise(branch_array12);
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        try {
            java.lang.String str22 = rental0.registerClient("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(branch_array12);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test114");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        rental0.pickupCar("");
        rental0.dropoffCar("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test115");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rentalService.Branch[] branch_array5 = null;
        rental0.initialise(branch_array5);
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("");
        rentalService.Rental rental11 = new rentalService.Rental();
        rental11.pickupCar("");
        rental11.dropoffCar("");
        rental11.pickupCar("");
        rentalService.Branch branch18 = null;
        rentalService.Branch[] branch_array19 = new rentalService.Branch[] { branch18 };
        rental11.initialise(branch_array19);
        rental0.initialise(branch_array19);
        java.util.ArrayList<rentalService.Car> arraylist_car23 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client27 = rental0.showClients("");
        try {
            java.lang.String str31 = rental0.makeReservation("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(arraylist_client10);
        org.junit.Assert.assertNotNull(branch_array19);
        org.junit.Assert.assertNull(arraylist_car23);
        org.junit.Assert.assertNull(arraylist_client27);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test116");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        java.lang.String str19 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str25 = rental0.makeReservation("hi!", "", "hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car29 = rental0.showCars("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client31 = rental0.showClients("");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(arraylist_car29);
        org.junit.Assert.assertNull(arraylist_client31);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test117");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation14 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car16 = rental0.showCars("");
        rentalService.Rental rental17 = new rentalService.Rental();
        java.lang.String str20 = rental17.registerClient("", "");
        rental17.cancelReservation("hi!");
        rental17.pickupCar("");
        rental17.pickupCar("");
        rental17.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation30 = rental17.showClientReservations("");
        rental17.cancelReservation("hi!");
        rentalService.Rental rental33 = new rentalService.Rental();
        rental33.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car37 = rental33.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation39 = rental33.showClientReservations("hi!");
        rental33.dropoffCar("");
        java.lang.String str45 = rental33.makeReservation("", "", "");
        rentalService.Branch[] branch_array46 = null;
        rental33.initialise(branch_array46);
        java.util.ArrayList<rentalService.Client> arraylist_client49 = rental33.showClients("");
        rentalService.Rental rental50 = new rentalService.Rental();
        rental50.pickupCar("");
        rental50.dropoffCar("");
        rental50.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation58 = rental50.showClientReservations("");
        rentalService.Rental rental59 = new rentalService.Rental();
        java.lang.String str62 = rental59.registerClient("", "");
        rental59.cancelReservation("hi!");
        rental59.pickupCar("");
        rental59.pickupCar("");
        rentalService.Rental rental69 = new rentalService.Rental();
        rental69.pickupCar("");
        rental69.dropoffCar("");
        rentalService.Rental rental74 = new rentalService.Rental();
        rental74.pickupCar("");
        rental74.dropoffCar("");
        rental74.pickupCar("");
        rentalService.Branch branch81 = null;
        rentalService.Branch[] branch_array82 = new rentalService.Branch[] { branch81 };
        rental74.initialise(branch_array82);
        rental69.initialise(branch_array82);
        rental59.initialise(branch_array82);
        rental50.initialise(branch_array82);
        rental33.initialise(branch_array82);
        rental17.initialise(branch_array82);
        rental0.initialise(branch_array82);
        rental0.cancelClientReservation("hi!");
        try {
            java.lang.String str95 = rental0.makeReservation("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNotNull(arraylist_reservation14);
        org.junit.Assert.assertNull(arraylist_car16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(arraylist_reservation30);
        org.junit.Assert.assertNull(arraylist_car37);
        org.junit.Assert.assertNotNull(arraylist_reservation39);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(arraylist_client49);
        org.junit.Assert.assertNotNull(arraylist_reservation58);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(branch_array82);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test118");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rentalService.Rental rental10 = new rentalService.Rental();
        rental10.pickupCar("");
        rental10.dropoffCar("");
        rentalService.Rental rental15 = new rentalService.Rental();
        rental15.pickupCar("");
        rental15.dropoffCar("");
        rental15.pickupCar("");
        rentalService.Branch branch22 = null;
        rentalService.Branch[] branch_array23 = new rentalService.Branch[] { branch22 };
        rental15.initialise(branch_array23);
        rental10.initialise(branch_array23);
        rental0.initialise(branch_array23);
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client30 = rental0.showClients("");
        rental0.cancelReservation("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(branch_array23);
        org.junit.Assert.assertNull(arraylist_client30);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test119");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.lang.String str9 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        rentalService.Branch[] branch_array14 = null;
        rental0.initialise(branch_array14);
        rentalService.Rental rental16 = new rentalService.Rental();
        java.lang.String str19 = rental16.registerClient("", "");
        rental16.cancelReservation("hi!");
        rental16.pickupCar("");
        rental16.pickupCar("");
        rentalService.Rental rental26 = new rentalService.Rental();
        rental26.pickupCar("");
        rental26.dropoffCar("");
        rentalService.Rental rental31 = new rentalService.Rental();
        rental31.pickupCar("");
        rental31.dropoffCar("");
        rental31.pickupCar("");
        rentalService.Branch branch38 = null;
        rentalService.Branch[] branch_array39 = new rentalService.Branch[] { branch38 };
        rental31.initialise(branch_array39);
        rental26.initialise(branch_array39);
        rental16.initialise(branch_array39);
        rental0.initialise(branch_array39);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation45 = rental0.showClientReservations("hi!");
        java.lang.String str48 = rental0.registerClient("", "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(branch_array39);
        org.junit.Assert.assertNotNull(arraylist_reservation45);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test120");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.dropoffCar("");
        rentalService.Rental rental17 = new rentalService.Rental();
        rental17.pickupCar("");
        rental17.dropoffCar("");
        rental17.pickupCar("");
        rentalService.Branch branch24 = null;
        rentalService.Branch[] branch_array25 = new rentalService.Branch[] { branch24 };
        rental17.initialise(branch_array25);
        rental0.initialise(branch_array25);
        rental0.cancelClientReservation("");
        rental0.cancelReservation("");
        rental0.cancelClientReservation("");
        rental0.dropoffCar("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(branch_array25);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test121");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("");
        rental0.cancelReservation("");
        rental0.dropoffCar("");
        java.lang.String str23 = rental0.makeReservation("hi!", "", "");
        rental0.cancelClientReservation("");
        rental0.cancelClientReservation("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car31 = rental0.showCars("");
        rental0.pickupCar("hi!");
        rental0.pickupCar("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(arraylist_car31);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test122");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        rental0.cancelReservation("");
        rentalService.Rental rental14 = new rentalService.Rental();
        java.lang.String str17 = rental14.registerClient("", "");
        rental14.cancelReservation("hi!");
        rental14.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car23 = rental14.showCars("");
        rentalService.Rental rental24 = new rentalService.Rental();
        rental24.pickupCar("");
        rental24.dropoffCar("");
        rental24.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation32 = rental24.showClientReservations("hi!");
        rental24.cancelReservation("hi!");
        rental24.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car38 = rental24.showCars("");
        rental24.dropoffCar("");
        rentalService.Rental rental41 = new rentalService.Rental();
        rental41.pickupCar("");
        rental41.dropoffCar("");
        rental41.pickupCar("");
        rentalService.Branch branch48 = null;
        rentalService.Branch[] branch_array49 = new rentalService.Branch[] { branch48 };
        rental41.initialise(branch_array49);
        rental24.initialise(branch_array49);
        rental14.initialise(branch_array49);
        rental0.initialise(branch_array49);
        rental0.cancelClientReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation57 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation59 = rental0.showClientReservations("");
        java.lang.String str62 = rental0.registerClient("", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(arraylist_car23);
        org.junit.Assert.assertNotNull(arraylist_reservation32);
        org.junit.Assert.assertNull(arraylist_car38);
        org.junit.Assert.assertNotNull(branch_array49);
        org.junit.Assert.assertNotNull(arraylist_reservation57);
        org.junit.Assert.assertNotNull(arraylist_reservation59);
        org.junit.Assert.assertNull(str62);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test123");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation20 = rental0.showClientReservations("");
        java.lang.String str23 = rental0.registerClient("", "hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(arraylist_reservation20);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test124");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        rental0.pickupCar("");
        rental0.cancelClientReservation("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("");
        rentalService.Rental rental16 = new rentalService.Rental();
        java.lang.String str19 = rental16.registerClient("", "");
        rental16.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation23 = rental16.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation25 = rental16.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car27 = rental16.showCars("");
        rentalService.Rental rental28 = new rentalService.Rental();
        rental28.pickupCar("");
        rental28.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation34 = rental28.showClientReservations("hi!");
        rental28.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client38 = rental28.showClients("");
        rentalService.Rental rental39 = new rentalService.Rental();
        rental39.pickupCar("");
        rental39.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car45 = rental39.showCars("");
        rental39.cancelClientReservation("hi!");
        rental39.cancelReservation("");
        rentalService.Rental rental50 = new rentalService.Rental();
        java.lang.String str53 = rental50.registerClient("", "");
        rental50.cancelReservation("hi!");
        rental50.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car59 = rental50.showCars("");
        rentalService.Rental rental60 = new rentalService.Rental();
        rental60.pickupCar("");
        rental60.dropoffCar("");
        rental60.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation68 = rental60.showClientReservations("hi!");
        rental60.cancelReservation("hi!");
        rental60.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car74 = rental60.showCars("");
        rental60.dropoffCar("");
        rentalService.Rental rental77 = new rentalService.Rental();
        rental77.pickupCar("");
        rental77.dropoffCar("");
        rental77.pickupCar("");
        rentalService.Branch branch84 = null;
        rentalService.Branch[] branch_array85 = new rentalService.Branch[] { branch84 };
        rental77.initialise(branch_array85);
        rental60.initialise(branch_array85);
        rental50.initialise(branch_array85);
        rental39.initialise(branch_array85);
        rental28.initialise(branch_array85);
        rental16.initialise(branch_array85);
        rental0.initialise(branch_array85);
        rental0.pickupCar("hi!");
        rental0.cancelClientReservation("");
        rental0.cancelReservation("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(arraylist_reservation23);
        org.junit.Assert.assertNotNull(arraylist_reservation25);
        org.junit.Assert.assertNull(arraylist_car27);
        org.junit.Assert.assertNotNull(arraylist_reservation34);
        org.junit.Assert.assertNull(arraylist_client38);
        org.junit.Assert.assertNull(arraylist_car45);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(arraylist_car59);
        org.junit.Assert.assertNotNull(arraylist_reservation68);
        org.junit.Assert.assertNull(arraylist_car74);
        org.junit.Assert.assertNotNull(branch_array85);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test125");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        java.lang.String str10 = rental0.makeReservation("hi!", "", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation14 = rental0.showClientReservations("hi!");
        rental0.cancelClientReservation("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(arraylist_reservation14);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test126");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str11 = rental0.registerClient("", "hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car13 = rental0.showCars("");
        rental0.cancelClientReservation("");
        rental0.cancelReservation("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(arraylist_car13);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test127");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("hi!");
        rental0.pickupCar("hi!");
        rentalService.Rental rental16 = new rentalService.Rental();
        rental16.pickupCar("");
        rental16.dropoffCar("");
        rentalService.Rental rental21 = new rentalService.Rental();
        rental21.pickupCar("");
        rental21.dropoffCar("");
        rental21.pickupCar("");
        rentalService.Branch branch28 = null;
        rentalService.Branch[] branch_array29 = new rentalService.Branch[] { branch28 };
        rental21.initialise(branch_array29);
        rental16.initialise(branch_array29);
        rental0.initialise(branch_array29);
        rental0.cancelClientReservation("hi!");
        java.lang.String str38 = rental0.makeReservation("hi!", "", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
        org.junit.Assert.assertNotNull(branch_array29);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test128");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car11 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car15 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNull(arraylist_car11);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
        org.junit.Assert.assertNull(arraylist_car15);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test129");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        java.lang.String str17 = rental0.makeReservation("", "", "");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client25 = rental0.showClients("");
        rental0.cancelReservation("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(arraylist_client25);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test130");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        rentalService.Branch branch7 = null;
        rentalService.Branch[] branch_array8 = new rentalService.Branch[] { branch7 };
        rental0.initialise(branch_array8);
        rental0.cancelClientReservation("");
        java.lang.String str14 = rental0.registerClient("", "hi!");
        rental0.dropoffCar("");
        try {
            java.util.ArrayList<rentalService.Client> arraylist_client18 = rental0.showClients("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(branch_array8);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test131");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        java.lang.String str19 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str25 = rental0.makeReservation("hi!", "", "hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car29 = rental0.showCars("hi!");
        rental0.pickupCar("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(arraylist_car29);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test132");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("");
        rental0.dropoffCar("");
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(arraylist_client10);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test133");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        rental0.cancelReservation("");
        rentalService.Rental rental14 = new rentalService.Rental();
        java.lang.String str17 = rental14.registerClient("", "");
        rental14.cancelReservation("hi!");
        rental14.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car23 = rental14.showCars("");
        rentalService.Rental rental24 = new rentalService.Rental();
        rental24.pickupCar("");
        rental24.dropoffCar("");
        rental24.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation32 = rental24.showClientReservations("hi!");
        rental24.cancelReservation("hi!");
        rental24.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car38 = rental24.showCars("");
        rental24.dropoffCar("");
        rentalService.Rental rental41 = new rentalService.Rental();
        rental41.pickupCar("");
        rental41.dropoffCar("");
        rental41.pickupCar("");
        rentalService.Branch branch48 = null;
        rentalService.Branch[] branch_array49 = new rentalService.Branch[] { branch48 };
        rental41.initialise(branch_array49);
        rental24.initialise(branch_array49);
        rental14.initialise(branch_array49);
        rental0.initialise(branch_array49);
        java.util.ArrayList<rentalService.Client> arraylist_client55 = rental0.showClients("");
        java.lang.String str58 = rental0.registerClient("", "");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("hi!");
        try {
            java.lang.String str65 = rental0.registerClient("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(arraylist_car23);
        org.junit.Assert.assertNotNull(arraylist_reservation32);
        org.junit.Assert.assertNull(arraylist_car38);
        org.junit.Assert.assertNotNull(branch_array49);
        org.junit.Assert.assertNull(arraylist_client55);
        org.junit.Assert.assertNull(str58);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test134");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car6 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        rentalService.Rental rental11 = new rentalService.Rental();
        java.lang.String str14 = rental11.registerClient("", "");
        rental11.cancelReservation("hi!");
        rental11.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car20 = rental11.showCars("");
        rentalService.Rental rental21 = new rentalService.Rental();
        rental21.pickupCar("");
        rental21.dropoffCar("");
        rental21.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation29 = rental21.showClientReservations("hi!");
        rental21.cancelReservation("hi!");
        rental21.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car35 = rental21.showCars("");
        rental21.dropoffCar("");
        rentalService.Rental rental38 = new rentalService.Rental();
        rental38.pickupCar("");
        rental38.dropoffCar("");
        rental38.pickupCar("");
        rentalService.Branch branch45 = null;
        rentalService.Branch[] branch_array46 = new rentalService.Branch[] { branch45 };
        rental38.initialise(branch_array46);
        rental21.initialise(branch_array46);
        rental11.initialise(branch_array46);
        rental0.initialise(branch_array46);
        rental0.pickupCar("hi!");
        try {
            java.lang.String str55 = rental0.registerClient("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(arraylist_car6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(arraylist_car20);
        org.junit.Assert.assertNotNull(arraylist_reservation29);
        org.junit.Assert.assertNull(arraylist_car35);
        org.junit.Assert.assertNotNull(branch_array46);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test135");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str22 = rental0.makeReservation("", "hi!", "hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client24 = rental0.showClients("");
        java.lang.String str28 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Client> arraylist_client30 = rental0.showClients("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(arraylist_client24);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(arraylist_client30);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test136");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Client> arraylist_client19 = rental0.showClients("");
        java.lang.String str23 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation25 = rental0.showClientReservations("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
        org.junit.Assert.assertNull(arraylist_client19);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(arraylist_reservation25);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test137");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental0.showCars("");
        java.util.ArrayList<rentalService.Client> arraylist_client14 = rental0.showClients("");
        java.util.ArrayList<rentalService.Car> arraylist_car16 = rental0.showCars("");
        rental0.cancelClientReservation("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car12);
        org.junit.Assert.assertNull(arraylist_client14);
        org.junit.Assert.assertNull(arraylist_car16);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test138");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation14 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car16 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        rental0.cancelClientReservation("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNotNull(arraylist_reservation14);
        org.junit.Assert.assertNull(arraylist_car16);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test139");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.cancelClientReservation("");
        rental0.dropoffCar("");
        rentalService.Rental rental19 = new rentalService.Rental();
        rental19.pickupCar("");
        rental19.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation25 = rental19.showClientReservations("hi!");
        rental19.cancelReservation("hi!");
        rental19.pickupCar("hi!");
        rental19.pickupCar("");
        rentalService.Rental rental32 = new rentalService.Rental();
        rental32.pickupCar("");
        rental32.dropoffCar("");
        rental32.pickupCar("");
        java.lang.String str41 = rental32.registerClient("", "hi!");
        rental32.cancelClientReservation("hi!");
        rental32.cancelReservation("");
        rentalService.Branch[] branch_array46 = null;
        rental32.initialise(branch_array46);
        rentalService.Rental rental48 = new rentalService.Rental();
        java.lang.String str51 = rental48.registerClient("", "");
        rental48.cancelReservation("hi!");
        rental48.pickupCar("");
        rental48.pickupCar("");
        rentalService.Rental rental58 = new rentalService.Rental();
        rental58.pickupCar("");
        rental58.dropoffCar("");
        rentalService.Rental rental63 = new rentalService.Rental();
        rental63.pickupCar("");
        rental63.dropoffCar("");
        rental63.pickupCar("");
        rentalService.Branch branch70 = null;
        rentalService.Branch[] branch_array71 = new rentalService.Branch[] { branch70 };
        rental63.initialise(branch_array71);
        rental58.initialise(branch_array71);
        rental48.initialise(branch_array71);
        rental32.initialise(branch_array71);
        rental19.initialise(branch_array71);
        rental0.initialise(branch_array71);
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(arraylist_reservation25);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(branch_array71);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test140");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation10 = rental0.showClientReservations("");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("");
        rental0.cancelReservation("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNotNull(arraylist_reservation10);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test141");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("hi!");
        rental0.pickupCar("hi!");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation20 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client22 = rental0.showClients("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(arraylist_reservation20);
        org.junit.Assert.assertNull(arraylist_client22);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test142");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str16 = rental0.makeReservation("", "", "");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client20 = rental0.showClients("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(arraylist_client20);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test143");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        java.lang.String str19 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str25 = rental0.makeReservation("hi!", "", "hi!");
        rental0.dropoffCar("");
        rental0.cancelClientReservation("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test144");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.lang.String str9 = rental0.registerClient("", "hi!");
        java.lang.String str12 = rental0.registerClient("", "");
        rental0.pickupCar("");
        rental0.pickupCar("hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test145");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.lang.String str9 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        rentalService.Branch[] branch_array14 = null;
        rental0.initialise(branch_array14);
        java.util.ArrayList<rentalService.Client> arraylist_client17 = rental0.showClients("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation19 = rental0.showClientReservations("hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(arraylist_client17);
        org.junit.Assert.assertNotNull(arraylist_reservation19);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test146");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.lang.String str7 = rental0.makeReservation("hi!", "", "");
        rentalService.Rental rental8 = new rentalService.Rental();
        java.lang.String str11 = rental8.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental8.showClientReservations("");
        rental8.cancelReservation("");
        rentalService.Rental rental16 = new rentalService.Rental();
        rental16.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car20 = rental16.showCars("");
        rental16.dropoffCar("hi!");
        rental16.dropoffCar("");
        rental16.dropoffCar("hi!");
        rentalService.Branch branch27 = null;
        rentalService.Branch[] branch_array28 = new rentalService.Branch[] { branch27 };
        rental16.initialise(branch_array28);
        rental8.initialise(branch_array28);
        rental0.initialise(branch_array28);
        java.lang.String str35 = rental0.makeReservation("", "", "");
        rental0.cancelReservation("");
        try {
            java.util.ArrayList<rentalService.Client> arraylist_client39 = rental0.showClients("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
        org.junit.Assert.assertNull(arraylist_car20);
        org.junit.Assert.assertNotNull(branch_array28);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test147");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.pickupCar("");
        rentalService.Rental rental18 = new rentalService.Rental();
        rental18.pickupCar("");
        rental18.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation24 = rental18.showClientReservations("hi!");
        rental18.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client28 = rental18.showClients("");
        rental18.cancelReservation("");
        rental18.dropoffCar("");
        rentalService.Rental rental33 = new rentalService.Rental();
        rental33.pickupCar("");
        rental33.dropoffCar("");
        rental33.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation41 = rental33.showClientReservations("");
        rentalService.Rental rental42 = new rentalService.Rental();
        java.lang.String str45 = rental42.registerClient("", "");
        rental42.cancelReservation("hi!");
        rental42.pickupCar("");
        rental42.pickupCar("");
        rentalService.Rental rental52 = new rentalService.Rental();
        rental52.pickupCar("");
        rental52.dropoffCar("");
        rentalService.Rental rental57 = new rentalService.Rental();
        rental57.pickupCar("");
        rental57.dropoffCar("");
        rental57.pickupCar("");
        rentalService.Branch branch64 = null;
        rentalService.Branch[] branch_array65 = new rentalService.Branch[] { branch64 };
        rental57.initialise(branch_array65);
        rental52.initialise(branch_array65);
        rental42.initialise(branch_array65);
        rental33.initialise(branch_array65);
        rental18.initialise(branch_array65);
        rental0.initialise(branch_array65);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation24);
        org.junit.Assert.assertNull(arraylist_client28);
        org.junit.Assert.assertNotNull(arraylist_reservation41);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(branch_array65);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test148");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        java.lang.String str19 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str25 = rental0.makeReservation("hi!", "", "hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car29 = rental0.showCars("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client31 = rental0.showClients("");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(arraylist_car29);
        org.junit.Assert.assertNull(arraylist_client31);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test149");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation5 = rental0.showClientReservations("");
        rental0.cancelReservation("");
        rental0.cancelClientReservation("hi!");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation5);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test150");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rentalService.Rental rental10 = new rentalService.Rental();
        rental10.pickupCar("");
        rental10.dropoffCar("");
        rentalService.Rental rental15 = new rentalService.Rental();
        rental15.pickupCar("");
        rental15.dropoffCar("");
        rental15.pickupCar("");
        rentalService.Branch branch22 = null;
        rentalService.Branch[] branch_array23 = new rentalService.Branch[] { branch22 };
        rental15.initialise(branch_array23);
        rental10.initialise(branch_array23);
        rental0.initialise(branch_array23);
        rental0.pickupCar("");
        rental0.pickupCar("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(branch_array23);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test151");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation14 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car16 = rental0.showCars("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation14);
        org.junit.Assert.assertNull(arraylist_car16);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test152");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client18 = rental0.showClients("");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        rentalService.Rental rental23 = new rentalService.Rental();
        rental23.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car27 = rental23.showCars("");
        rental23.dropoffCar("hi!");
        rental23.dropoffCar("");
        rental23.dropoffCar("hi!");
        rentalService.Branch branch34 = null;
        rentalService.Branch[] branch_array35 = new rentalService.Branch[] { branch34 };
        rental23.initialise(branch_array35);
        rentalService.Rental rental37 = new rentalService.Rental();
        rental37.pickupCar("");
        rental37.dropoffCar("");
        rentalService.Rental rental42 = new rentalService.Rental();
        rental42.pickupCar("");
        rental42.dropoffCar("");
        rental42.pickupCar("");
        rentalService.Branch branch49 = null;
        rentalService.Branch[] branch_array50 = new rentalService.Branch[] { branch49 };
        rental42.initialise(branch_array50);
        rental37.initialise(branch_array50);
        rental23.initialise(branch_array50);
        rental0.initialise(branch_array50);
        java.lang.String str57 = rental0.registerClient("", "hi!");
        try {
            java.util.ArrayList<rentalService.Car> arraylist_car59 = rental0.showCars("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(arraylist_client18);
        org.junit.Assert.assertNull(arraylist_car27);
        org.junit.Assert.assertNotNull(branch_array35);
        org.junit.Assert.assertNotNull(branch_array50);
        org.junit.Assert.assertNull(str57);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test153");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car6 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        rental0.pickupCar("");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car18 = rental0.showCars("");
        rental0.cancelClientReservation("");
        java.lang.String str23 = rental0.registerClient("", "hi!");
        org.junit.Assert.assertNull(arraylist_car6);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car18);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test154");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        java.lang.String str18 = rental0.makeReservation("", "", "hi!");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car22 = rental0.showCars("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation26 = rental0.showClientReservations("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(arraylist_car22);
        org.junit.Assert.assertNotNull(arraylist_reservation26);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test155");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental0.showCars("");
        java.util.ArrayList<rentalService.Client> arraylist_client14 = rental0.showClients("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation16 = rental0.showClientReservations("");
        rental0.pickupCar("");
        rental0.cancelClientReservation("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(arraylist_client10);
        org.junit.Assert.assertNull(arraylist_car12);
        org.junit.Assert.assertNull(arraylist_client14);
        org.junit.Assert.assertNotNull(arraylist_reservation16);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test156");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation11 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("hi!");
        rentalService.Rental rental14 = new rentalService.Rental();
        rental14.pickupCar("");
        rental14.dropoffCar("");
        rental14.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation22 = rental14.showClientReservations("hi!");
        rental14.cancelReservation("hi!");
        rental14.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car28 = rental14.showCars("");
        rental14.dropoffCar("");
        rentalService.Rental rental31 = new rentalService.Rental();
        rental31.pickupCar("");
        rental31.dropoffCar("");
        rental31.pickupCar("");
        rentalService.Branch branch38 = null;
        rentalService.Branch[] branch_array39 = new rentalService.Branch[] { branch38 };
        rental31.initialise(branch_array39);
        rental14.initialise(branch_array39);
        rental0.initialise(branch_array39);
        rental0.cancelClientReservation("");
        rental0.cancelClientReservation("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNotNull(arraylist_reservation9);
        org.junit.Assert.assertNotNull(arraylist_reservation11);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
        org.junit.Assert.assertNotNull(arraylist_reservation22);
        org.junit.Assert.assertNull(arraylist_car28);
        org.junit.Assert.assertNotNull(branch_array39);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test157");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("");
        rentalService.Rental rental11 = new rentalService.Rental();
        java.lang.String str14 = rental11.registerClient("", "");
        rental11.cancelReservation("hi!");
        rental11.pickupCar("");
        rental11.pickupCar("");
        rentalService.Rental rental21 = new rentalService.Rental();
        rental21.pickupCar("");
        rental21.dropoffCar("");
        rentalService.Rental rental26 = new rentalService.Rental();
        rental26.pickupCar("");
        rental26.dropoffCar("");
        rental26.pickupCar("");
        rentalService.Branch branch33 = null;
        rentalService.Branch[] branch_array34 = new rentalService.Branch[] { branch33 };
        rental26.initialise(branch_array34);
        rental21.initialise(branch_array34);
        rental11.initialise(branch_array34);
        rental11.cancelClientReservation("hi!");
        rental11.dropoffCar("");
        rentalService.Rental rental42 = new rentalService.Rental();
        rental42.pickupCar("");
        rental42.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car48 = rental42.showCars("");
        rental42.cancelClientReservation("hi!");
        rental42.dropoffCar("hi!");
        rentalService.Rental rental53 = new rentalService.Rental();
        rental53.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car57 = rental53.showCars("");
        rentalService.Branch[] branch_array58 = null;
        rental53.initialise(branch_array58);
        rental53.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client63 = rental53.showClients("");
        rentalService.Rental rental64 = new rentalService.Rental();
        rental64.pickupCar("");
        rental64.dropoffCar("");
        rental64.pickupCar("");
        rentalService.Branch branch71 = null;
        rentalService.Branch[] branch_array72 = new rentalService.Branch[] { branch71 };
        rental64.initialise(branch_array72);
        rental53.initialise(branch_array72);
        rental42.initialise(branch_array72);
        rental11.initialise(branch_array72);
        rental0.initialise(branch_array72);
        rental0.cancelReservation("hi!");
        java.lang.String str83 = rental0.makeReservation("", "", "");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(arraylist_client10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(branch_array34);
        org.junit.Assert.assertNull(arraylist_car48);
        org.junit.Assert.assertNull(arraylist_car57);
        org.junit.Assert.assertNull(arraylist_client63);
        org.junit.Assert.assertNotNull(branch_array72);
        org.junit.Assert.assertNull(str83);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test158");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test159");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.lang.String str9 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        rentalService.Rental rental14 = new rentalService.Rental();
        java.lang.String str17 = rental14.registerClient("", "");
        rental14.cancelReservation("hi!");
        rental14.pickupCar("");
        rental14.pickupCar("");
        rental14.dropoffCar("hi!");
        rental14.cancelReservation("hi!");
        rental14.cancelReservation("");
        rentalService.Rental rental30 = new rentalService.Rental();
        java.lang.String str33 = rental30.registerClient("", "");
        rental30.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation37 = rental30.showClientReservations("hi!");
        java.lang.String str41 = rental30.makeReservation("hi!", "", "");
        rental30.cancelReservation("");
        rentalService.Rental rental44 = new rentalService.Rental();
        java.lang.String str47 = rental44.registerClient("", "");
        rental44.cancelReservation("hi!");
        rental44.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car53 = rental44.showCars("");
        rentalService.Rental rental54 = new rentalService.Rental();
        rental54.pickupCar("");
        rental54.dropoffCar("");
        rental54.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation62 = rental54.showClientReservations("hi!");
        rental54.cancelReservation("hi!");
        rental54.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car68 = rental54.showCars("");
        rental54.dropoffCar("");
        rentalService.Rental rental71 = new rentalService.Rental();
        rental71.pickupCar("");
        rental71.dropoffCar("");
        rental71.pickupCar("");
        rentalService.Branch branch78 = null;
        rentalService.Branch[] branch_array79 = new rentalService.Branch[] { branch78 };
        rental71.initialise(branch_array79);
        rental54.initialise(branch_array79);
        rental44.initialise(branch_array79);
        rental30.initialise(branch_array79);
        rental14.initialise(branch_array79);
        rental0.initialise(branch_array79);
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car89 = rental0.showCars("");
        java.util.ArrayList<rentalService.Client> arraylist_client91 = rental0.showClients("");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(arraylist_reservation37);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(arraylist_car53);
        org.junit.Assert.assertNotNull(arraylist_reservation62);
        org.junit.Assert.assertNull(arraylist_car68);
        org.junit.Assert.assertNotNull(branch_array79);
        org.junit.Assert.assertNull(arraylist_car89);
        org.junit.Assert.assertNull(arraylist_client91);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test160");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rentalService.Rental rental10 = new rentalService.Rental();
        rental10.pickupCar("");
        rental10.dropoffCar("");
        rentalService.Rental rental15 = new rentalService.Rental();
        rental15.pickupCar("");
        rental15.dropoffCar("");
        rental15.pickupCar("");
        rentalService.Branch branch22 = null;
        rentalService.Branch[] branch_array23 = new rentalService.Branch[] { branch22 };
        rental15.initialise(branch_array23);
        rental10.initialise(branch_array23);
        rental0.initialise(branch_array23);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation28 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(branch_array23);
        org.junit.Assert.assertNotNull(arraylist_reservation28);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test161");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rentalService.Rental rental17 = new rentalService.Rental();
        rental17.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car21 = rental17.showCars("");
        rental17.dropoffCar("hi!");
        rental17.dropoffCar("");
        rental17.cancelReservation("hi!");
        java.lang.String str30 = rental17.registerClient("", "hi!");
        rental17.cancelClientReservation("");
        java.util.ArrayList<rentalService.Client> arraylist_client34 = rental17.showClients("");
        rentalService.Rental rental35 = new rentalService.Rental();
        java.lang.String str38 = rental35.registerClient("", "");
        rental35.cancelReservation("hi!");
        rental35.pickupCar("");
        rental35.pickupCar("");
        rentalService.Rental rental45 = new rentalService.Rental();
        rental45.pickupCar("");
        rental45.dropoffCar("");
        rentalService.Rental rental50 = new rentalService.Rental();
        rental50.pickupCar("");
        rental50.dropoffCar("");
        rental50.pickupCar("");
        rentalService.Branch branch57 = null;
        rentalService.Branch[] branch_array58 = new rentalService.Branch[] { branch57 };
        rental50.initialise(branch_array58);
        rental45.initialise(branch_array58);
        rental35.initialise(branch_array58);
        rental17.initialise(branch_array58);
        rental0.initialise(branch_array58);
        rental0.cancelClientReservation("hi!");
        try {
            java.lang.String str69 = rental0.makeReservation("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car21);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(arraylist_client34);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(branch_array58);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test162");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        java.lang.String str15 = rental0.makeReservation("", "", "");
        rental0.pickupCar("");
        java.lang.String str20 = rental0.registerClient("", "hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation22 = rental0.showClientReservations("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNotNull(arraylist_reservation9);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(arraylist_reservation22);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test163");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rentalService.Rental rental5 = new rentalService.Rental();
        rental5.pickupCar("");
        rental5.dropoffCar("");
        rental5.pickupCar("");
        rentalService.Branch branch12 = null;
        rentalService.Branch[] branch_array13 = new rentalService.Branch[] { branch12 };
        rental5.initialise(branch_array13);
        rental0.initialise(branch_array13);
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car19 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation21 = rental0.showClientReservations("");
        org.junit.Assert.assertNotNull(branch_array13);
        org.junit.Assert.assertNull(arraylist_car19);
        org.junit.Assert.assertNotNull(arraylist_reservation21);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test164");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental0.showCars("");
        rentalService.Rental rental13 = new rentalService.Rental();
        java.lang.String str16 = rental13.registerClient("", "");
        rental13.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation20 = rental13.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation22 = rental13.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car24 = rental13.showCars("");
        rentalService.Rental rental25 = new rentalService.Rental();
        rental25.pickupCar("");
        rental25.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation31 = rental25.showClientReservations("hi!");
        rental25.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client35 = rental25.showClients("");
        rentalService.Rental rental36 = new rentalService.Rental();
        rental36.pickupCar("");
        rental36.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car42 = rental36.showCars("");
        rental36.cancelClientReservation("hi!");
        rental36.cancelReservation("");
        rentalService.Rental rental47 = new rentalService.Rental();
        java.lang.String str50 = rental47.registerClient("", "");
        rental47.cancelReservation("hi!");
        rental47.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car56 = rental47.showCars("");
        rentalService.Rental rental57 = new rentalService.Rental();
        rental57.pickupCar("");
        rental57.dropoffCar("");
        rental57.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation65 = rental57.showClientReservations("hi!");
        rental57.cancelReservation("hi!");
        rental57.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car71 = rental57.showCars("");
        rental57.dropoffCar("");
        rentalService.Rental rental74 = new rentalService.Rental();
        rental74.pickupCar("");
        rental74.dropoffCar("");
        rental74.pickupCar("");
        rentalService.Branch branch81 = null;
        rentalService.Branch[] branch_array82 = new rentalService.Branch[] { branch81 };
        rental74.initialise(branch_array82);
        rental57.initialise(branch_array82);
        rental47.initialise(branch_array82);
        rental36.initialise(branch_array82);
        rental25.initialise(branch_array82);
        rental13.initialise(branch_array82);
        rental0.initialise(branch_array82);
        java.util.ArrayList<rentalService.Car> arraylist_car91 = rental0.showCars("");
        rental0.pickupCar("hi!");
        try {
            java.util.ArrayList<rentalService.Client> arraylist_client95 = rental0.showClients("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(arraylist_reservation20);
        org.junit.Assert.assertNotNull(arraylist_reservation22);
        org.junit.Assert.assertNull(arraylist_car24);
        org.junit.Assert.assertNotNull(arraylist_reservation31);
        org.junit.Assert.assertNull(arraylist_client35);
        org.junit.Assert.assertNull(arraylist_car42);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(arraylist_car56);
        org.junit.Assert.assertNotNull(arraylist_reservation65);
        org.junit.Assert.assertNull(arraylist_car71);
        org.junit.Assert.assertNotNull(branch_array82);
        org.junit.Assert.assertNull(arraylist_car91);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test165");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.cancelReservation("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation18 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation20 = rental0.showClientReservations("");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("hi!");
        rental0.pickupCar("");
        java.lang.String str29 = rental0.registerClient("", "");
        java.lang.String str32 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation18);
        org.junit.Assert.assertNotNull(arraylist_reservation20);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test166");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        rental0.pickupCar("");
        rental0.cancelClientReservation("");
        rental0.cancelReservation("");
        rentalService.Rental rental14 = new rentalService.Rental();
        rental14.pickupCar("");
        rental14.dropoffCar("");
        rental14.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation22 = rental14.showClientReservations("hi!");
        rentalService.Branch[] branch_array23 = new rentalService.Branch[] {};
        rental14.initialise(branch_array23);
        rental0.initialise(branch_array23);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNotNull(arraylist_reservation22);
        org.junit.Assert.assertNotNull(branch_array23);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test167");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("");
        rental0.cancelClientReservation("hi!");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test168");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.lang.String str7 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Client> arraylist_client11 = rental0.showClients("");
        java.util.ArrayList<rentalService.Client> arraylist_client13 = rental0.showClients("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation17 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car19 = rental0.showCars("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(arraylist_reservation9);
        org.junit.Assert.assertNull(arraylist_client11);
        org.junit.Assert.assertNull(arraylist_client13);
        org.junit.Assert.assertNotNull(arraylist_reservation17);
        org.junit.Assert.assertNull(arraylist_car19);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test169");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str11 = rental0.registerClient("", "hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car13 = rental0.showCars("");
        rentalService.Rental rental14 = new rentalService.Rental();
        java.lang.String str17 = rental14.registerClient("", "");
        rental14.cancelReservation("hi!");
        rental14.pickupCar("");
        rental14.pickupCar("");
        rental14.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation27 = rental14.showClientReservations("hi!");
        rental14.pickupCar("hi!");
        rentalService.Rental rental30 = new rentalService.Rental();
        rental30.pickupCar("");
        rental30.dropoffCar("");
        rental30.pickupCar("");
        rentalService.Branch branch37 = null;
        rentalService.Branch[] branch_array38 = new rentalService.Branch[] { branch37 };
        rental30.initialise(branch_array38);
        rental30.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation43 = rental30.showClientReservations("hi!");
        rentalService.Rental rental44 = new rentalService.Rental();
        java.lang.String str47 = rental44.registerClient("", "");
        rental44.cancelReservation("hi!");
        rental44.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car53 = rental44.showCars("");
        rentalService.Rental rental54 = new rentalService.Rental();
        rental54.pickupCar("");
        rental54.dropoffCar("");
        rental54.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation62 = rental54.showClientReservations("hi!");
        rental54.cancelReservation("hi!");
        rental54.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car68 = rental54.showCars("");
        rental54.dropoffCar("");
        rentalService.Rental rental71 = new rentalService.Rental();
        rental71.pickupCar("");
        rental71.dropoffCar("");
        rental71.pickupCar("");
        rentalService.Branch branch78 = null;
        rentalService.Branch[] branch_array79 = new rentalService.Branch[] { branch78 };
        rental71.initialise(branch_array79);
        rental54.initialise(branch_array79);
        rental44.initialise(branch_array79);
        rental30.initialise(branch_array79);
        rental14.initialise(branch_array79);
        rental0.initialise(branch_array79);
        try {
            java.lang.String str88 = rental0.registerClient("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(arraylist_car13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(arraylist_reservation27);
        org.junit.Assert.assertNotNull(branch_array38);
        org.junit.Assert.assertNotNull(arraylist_reservation43);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(arraylist_car53);
        org.junit.Assert.assertNotNull(arraylist_reservation62);
        org.junit.Assert.assertNull(arraylist_car68);
        org.junit.Assert.assertNotNull(branch_array79);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test170");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation14 = rental0.showClientReservations("");
        java.lang.String str17 = rental0.registerClient("hi!", "");
        rental0.cancelClientReservation("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test171");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation10 = rental0.showClientReservations("");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNotNull(arraylist_reservation10);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test172");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("");
        rentalService.Rental rental11 = new rentalService.Rental();
        java.lang.String str14 = rental11.registerClient("", "");
        java.lang.String str18 = rental11.makeReservation("hi!", "", "");
        rentalService.Rental rental19 = new rentalService.Rental();
        java.lang.String str22 = rental19.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation24 = rental19.showClientReservations("");
        rental19.cancelReservation("");
        rentalService.Rental rental27 = new rentalService.Rental();
        rental27.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car31 = rental27.showCars("");
        rental27.dropoffCar("hi!");
        rental27.dropoffCar("");
        rental27.dropoffCar("hi!");
        rentalService.Branch branch38 = null;
        rentalService.Branch[] branch_array39 = new rentalService.Branch[] { branch38 };
        rental27.initialise(branch_array39);
        rental19.initialise(branch_array39);
        rental11.initialise(branch_array39);
        rental0.initialise(branch_array39);
        try {
            java.lang.String str47 = rental0.makeReservation("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(arraylist_client10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(arraylist_reservation24);
        org.junit.Assert.assertNull(arraylist_car31);
        org.junit.Assert.assertNotNull(branch_array39);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test173");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        java.lang.String str18 = rental0.makeReservation("", "", "hi!");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car22 = rental0.showCars("");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(arraylist_car22);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test174");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Client> arraylist_client12 = rental0.showClients("hi!");
        rentalService.Rental rental13 = new rentalService.Rental();
        java.lang.String str16 = rental13.registerClient("", "");
        rental13.cancelReservation("hi!");
        rental13.pickupCar("");
        rental13.pickupCar("");
        rentalService.Rental rental23 = new rentalService.Rental();
        rental23.pickupCar("");
        rental23.dropoffCar("");
        rentalService.Rental rental28 = new rentalService.Rental();
        rental28.pickupCar("");
        rental28.dropoffCar("");
        rental28.pickupCar("");
        rentalService.Branch branch35 = null;
        rentalService.Branch[] branch_array36 = new rentalService.Branch[] { branch35 };
        rental28.initialise(branch_array36);
        rental23.initialise(branch_array36);
        rental13.initialise(branch_array36);
        rental0.initialise(branch_array36);
        rental0.cancelReservation("");
        java.lang.String str46 = rental0.makeReservation("hi!", "", "");
        rental0.cancelReservation("");
        java.lang.String str52 = rental0.makeReservation("hi!", "", "");
        try {
            java.lang.String str56 = rental0.makeReservation("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNull(arraylist_client12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(branch_array36);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str52);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test175");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rentalService.Rental rental10 = new rentalService.Rental();
        rental10.pickupCar("");
        rental10.dropoffCar("");
        rentalService.Rental rental15 = new rentalService.Rental();
        rental15.pickupCar("");
        rental15.dropoffCar("");
        rental15.pickupCar("");
        rentalService.Branch branch22 = null;
        rentalService.Branch[] branch_array23 = new rentalService.Branch[] { branch22 };
        rental15.initialise(branch_array23);
        rental10.initialise(branch_array23);
        rental0.initialise(branch_array23);
        rental0.pickupCar("");
        java.lang.String str31 = rental0.registerClient("", "hi!");
        try {
            java.lang.String str34 = rental0.registerClient("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(branch_array23);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test176");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str18 = rental0.registerClient("", "");
        rental0.cancelClientReservation("hi!");
        rentalService.Rental rental21 = new rentalService.Rental();
        java.lang.String str24 = rental21.registerClient("", "");
        rental21.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation28 = rental21.showClientReservations("hi!");
        java.lang.String str32 = rental21.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation34 = rental21.showClientReservations("");
        rental21.cancelClientReservation("");
        rental21.pickupCar("");
        rental21.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation42 = rental21.showClientReservations("");
        rental21.dropoffCar("hi!");
        rentalService.Rental rental45 = new rentalService.Rental();
        rental45.pickupCar("");
        rental45.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car51 = rental45.showCars("");
        rental45.cancelClientReservation("hi!");
        rental45.cancelReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation57 = rental45.showClientReservations("");
        rentalService.Rental rental58 = new rentalService.Rental();
        java.lang.String str61 = rental58.registerClient("", "");
        java.lang.String str65 = rental58.makeReservation("hi!", "", "");
        rentalService.Rental rental66 = new rentalService.Rental();
        java.lang.String str69 = rental66.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation71 = rental66.showClientReservations("");
        rental66.cancelReservation("");
        rentalService.Rental rental74 = new rentalService.Rental();
        rental74.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car78 = rental74.showCars("");
        rental74.dropoffCar("hi!");
        rental74.dropoffCar("");
        rental74.dropoffCar("hi!");
        rentalService.Branch branch85 = null;
        rentalService.Branch[] branch_array86 = new rentalService.Branch[] { branch85 };
        rental74.initialise(branch_array86);
        rental66.initialise(branch_array86);
        rental58.initialise(branch_array86);
        rentalService.Branch branch90 = null;
        rentalService.Branch[] branch_array91 = new rentalService.Branch[] { branch90 };
        rental58.initialise(branch_array91);
        rental45.initialise(branch_array91);
        rental21.initialise(branch_array91);
        rental0.initialise(branch_array91);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(arraylist_reservation28);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(arraylist_reservation34);
        org.junit.Assert.assertNotNull(arraylist_reservation42);
        org.junit.Assert.assertNull(arraylist_car51);
        org.junit.Assert.assertNotNull(arraylist_reservation57);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNotNull(arraylist_reservation71);
        org.junit.Assert.assertNull(arraylist_car78);
        org.junit.Assert.assertNotNull(branch_array86);
        org.junit.Assert.assertNotNull(branch_array91);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test177");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.dropoffCar("");
        rentalService.Rental rental17 = new rentalService.Rental();
        rental17.pickupCar("");
        rental17.dropoffCar("");
        rental17.pickupCar("");
        rentalService.Branch branch24 = null;
        rentalService.Branch[] branch_array25 = new rentalService.Branch[] { branch24 };
        rental17.initialise(branch_array25);
        rental0.initialise(branch_array25);
        rentalService.Rental rental28 = new rentalService.Rental();
        rental28.pickupCar("");
        rental28.dropoffCar("");
        rental28.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation36 = rental28.showClientReservations("hi!");
        rentalService.Branch[] branch_array37 = new rentalService.Branch[] {};
        rental28.initialise(branch_array37);
        rental0.initialise(branch_array37);
        java.util.ArrayList<rentalService.Client> arraylist_client41 = rental0.showClients("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation43 = rental0.showClientReservations("");
        java.lang.String str46 = rental0.registerClient("hi!", "hi!");
        java.lang.String str50 = rental0.makeReservation("", "hi!", "hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client52 = rental0.showClients("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(branch_array25);
        org.junit.Assert.assertNotNull(arraylist_reservation36);
        org.junit.Assert.assertNotNull(branch_array37);
        org.junit.Assert.assertNull(arraylist_client41);
        org.junit.Assert.assertNotNull(arraylist_reservation43);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(arraylist_client52);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test178");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("hi!");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car18 = rental0.showCars("");
        java.util.ArrayList<rentalService.Client> arraylist_client20 = rental0.showClients("");
        java.lang.String str23 = rental0.registerClient("", "");
        rental0.dropoffCar("hi!");
        java.lang.String str28 = rental0.registerClient("", "");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car18);
        org.junit.Assert.assertNull(arraylist_client20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test179");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        rental0.pickupCar("");
        rental0.cancelClientReservation("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("");
        rental0.cancelClientReservation("hi!");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test180");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("hi!");
        rental0.pickupCar("hi!");
        rentalService.Rental rental19 = new rentalService.Rental();
        rental19.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car23 = rental19.showCars("");
        rental19.dropoffCar("hi!");
        rental19.cancelClientReservation("hi!");
        java.lang.String str30 = rental19.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation32 = rental19.showClientReservations("");
        rentalService.Rental rental33 = new rentalService.Rental();
        java.lang.String str36 = rental33.registerClient("", "");
        rental33.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation40 = rental33.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation42 = rental33.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation44 = rental33.showClientReservations("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation46 = rental33.showClientReservations("hi!");
        rentalService.Rental rental47 = new rentalService.Rental();
        rental47.pickupCar("");
        rental47.dropoffCar("");
        rental47.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation55 = rental47.showClientReservations("hi!");
        rental47.cancelReservation("hi!");
        rental47.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car61 = rental47.showCars("");
        rental47.dropoffCar("");
        rentalService.Rental rental64 = new rentalService.Rental();
        rental64.pickupCar("");
        rental64.dropoffCar("");
        rental64.pickupCar("");
        rentalService.Branch branch71 = null;
        rentalService.Branch[] branch_array72 = new rentalService.Branch[] { branch71 };
        rental64.initialise(branch_array72);
        rental47.initialise(branch_array72);
        rental33.initialise(branch_array72);
        rental19.initialise(branch_array72);
        rental0.initialise(branch_array72);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation79 = rental0.showClientReservations("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car23);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(arraylist_reservation32);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(arraylist_reservation40);
        org.junit.Assert.assertNotNull(arraylist_reservation42);
        org.junit.Assert.assertNotNull(arraylist_reservation44);
        org.junit.Assert.assertNotNull(arraylist_reservation46);
        org.junit.Assert.assertNotNull(arraylist_reservation55);
        org.junit.Assert.assertNull(arraylist_car61);
        org.junit.Assert.assertNotNull(branch_array72);
        org.junit.Assert.assertNotNull(arraylist_reservation79);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test181");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        java.lang.String str17 = rental0.registerClient("", "hi!");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation21 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car23 = rental0.showCars("");
        rental0.cancelClientReservation("");
        java.lang.String str29 = rental0.makeReservation("hi!", "", "");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(arraylist_reservation21);
        org.junit.Assert.assertNull(arraylist_car23);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test182");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Client> arraylist_client12 = rental0.showClients("hi!");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation20 = rental0.showClientReservations("");
        rental0.pickupCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelClientReservation("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNull(arraylist_client12);
        org.junit.Assert.assertNotNull(arraylist_reservation20);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test183");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rentalService.Rental rental16 = new rentalService.Rental();
        java.lang.String str19 = rental16.registerClient("", "");
        rental16.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation23 = rental16.showClientReservations("hi!");
        java.lang.String str27 = rental16.makeReservation("hi!", "", "");
        rental16.cancelReservation("");
        rentalService.Rental rental30 = new rentalService.Rental();
        java.lang.String str33 = rental30.registerClient("", "");
        rental30.cancelReservation("hi!");
        rental30.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car39 = rental30.showCars("");
        rentalService.Rental rental40 = new rentalService.Rental();
        rental40.pickupCar("");
        rental40.dropoffCar("");
        rental40.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation48 = rental40.showClientReservations("hi!");
        rental40.cancelReservation("hi!");
        rental40.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car54 = rental40.showCars("");
        rental40.dropoffCar("");
        rentalService.Rental rental57 = new rentalService.Rental();
        rental57.pickupCar("");
        rental57.dropoffCar("");
        rental57.pickupCar("");
        rentalService.Branch branch64 = null;
        rentalService.Branch[] branch_array65 = new rentalService.Branch[] { branch64 };
        rental57.initialise(branch_array65);
        rental40.initialise(branch_array65);
        rental30.initialise(branch_array65);
        rental16.initialise(branch_array65);
        rental0.initialise(branch_array65);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation72 = rental0.showClientReservations("");
        java.lang.String str75 = rental0.registerClient("", "");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation79 = rental0.showClientReservations("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(arraylist_reservation23);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(arraylist_car39);
        org.junit.Assert.assertNotNull(arraylist_reservation48);
        org.junit.Assert.assertNull(arraylist_car54);
        org.junit.Assert.assertNotNull(branch_array65);
        org.junit.Assert.assertNotNull(arraylist_reservation72);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNotNull(arraylist_reservation79);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test184");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        rentalService.Branch branch7 = null;
        rentalService.Branch[] branch_array8 = new rentalService.Branch[] { branch7 };
        rental0.initialise(branch_array8);
        rental0.cancelClientReservation("");
        java.lang.String str14 = rental0.registerClient("", "hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation16 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation18 = rental0.showClientReservations("");
        rental0.dropoffCar("hi!");
        org.junit.Assert.assertNotNull(branch_array8);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(arraylist_reservation16);
        org.junit.Assert.assertNotNull(arraylist_reservation18);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test185");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Client> arraylist_client12 = rental0.showClients("hi!");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        rentalService.Rental rental17 = new rentalService.Rental();
        rental17.pickupCar("");
        rental17.dropoffCar("");
        rental17.pickupCar("");
        rentalService.Branch branch24 = null;
        rentalService.Branch[] branch_array25 = new rentalService.Branch[] { branch24 };
        rental17.initialise(branch_array25);
        rental0.initialise(branch_array25);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation29 = rental0.showClientReservations("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNull(arraylist_client12);
        org.junit.Assert.assertNotNull(branch_array25);
        org.junit.Assert.assertNotNull(arraylist_reservation29);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test186");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        rentalService.Branch branch7 = null;
        rentalService.Branch[] branch_array8 = new rentalService.Branch[] { branch7 };
        rental0.initialise(branch_array8);
        rental0.cancelClientReservation("");
        rental0.dropoffCar("");
        rental0.cancelClientReservation("");
        rental0.cancelClientReservation("");
        java.lang.String str21 = rental0.makeReservation("", "", "");
        org.junit.Assert.assertNotNull(branch_array8);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test187");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client18 = rental0.showClients("");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        rentalService.Rental rental23 = new rentalService.Rental();
        rental23.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car27 = rental23.showCars("");
        rental23.dropoffCar("hi!");
        rental23.dropoffCar("");
        rental23.dropoffCar("hi!");
        rentalService.Branch branch34 = null;
        rentalService.Branch[] branch_array35 = new rentalService.Branch[] { branch34 };
        rental23.initialise(branch_array35);
        rentalService.Rental rental37 = new rentalService.Rental();
        rental37.pickupCar("");
        rental37.dropoffCar("");
        rentalService.Rental rental42 = new rentalService.Rental();
        rental42.pickupCar("");
        rental42.dropoffCar("");
        rental42.pickupCar("");
        rentalService.Branch branch49 = null;
        rentalService.Branch[] branch_array50 = new rentalService.Branch[] { branch49 };
        rental42.initialise(branch_array50);
        rental37.initialise(branch_array50);
        rental23.initialise(branch_array50);
        rental0.initialise(branch_array50);
        java.lang.String str57 = rental0.registerClient("", "hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(arraylist_client18);
        org.junit.Assert.assertNull(arraylist_car27);
        org.junit.Assert.assertNotNull(branch_array35);
        org.junit.Assert.assertNotNull(branch_array50);
        org.junit.Assert.assertNull(str57);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test188");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.lang.String str6 = rental0.registerClient("", "");
        rental0.pickupCar("");
        rental0.cancelClientReservation("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test189");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.lang.String str7 = rental0.makeReservation("hi!", "", "");
        rentalService.Rental rental8 = new rentalService.Rental();
        java.lang.String str11 = rental8.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental8.showClientReservations("");
        rental8.cancelReservation("");
        rentalService.Rental rental16 = new rentalService.Rental();
        rental16.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car20 = rental16.showCars("");
        rental16.dropoffCar("hi!");
        rental16.dropoffCar("");
        rental16.dropoffCar("hi!");
        rentalService.Branch branch27 = null;
        rentalService.Branch[] branch_array28 = new rentalService.Branch[] { branch27 };
        rental16.initialise(branch_array28);
        rental8.initialise(branch_array28);
        rental0.initialise(branch_array28);
        rental0.cancelReservation("");
        rental0.pickupCar("hi!");
        rental0.cancelReservation("hi!");
        rental0.dropoffCar("hi!");
        java.lang.String str42 = rental0.registerClient("", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
        org.junit.Assert.assertNull(arraylist_car20);
        org.junit.Assert.assertNotNull(branch_array28);
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test190");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.dropoffCar("");
        rentalService.Rental rental17 = new rentalService.Rental();
        rental17.pickupCar("");
        rental17.dropoffCar("");
        rental17.pickupCar("");
        rentalService.Branch branch24 = null;
        rentalService.Branch[] branch_array25 = new rentalService.Branch[] { branch24 };
        rental17.initialise(branch_array25);
        rental0.initialise(branch_array25);
        rentalService.Rental rental28 = new rentalService.Rental();
        rental28.pickupCar("");
        rental28.dropoffCar("");
        rental28.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation36 = rental28.showClientReservations("hi!");
        rentalService.Branch[] branch_array37 = new rentalService.Branch[] {};
        rental28.initialise(branch_array37);
        rental0.initialise(branch_array37);
        java.util.ArrayList<rentalService.Client> arraylist_client41 = rental0.showClients("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation43 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Client> arraylist_client45 = rental0.showClients("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation47 = rental0.showClientReservations("hi!");
        java.lang.String str50 = rental0.registerClient("hi!", "");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(branch_array25);
        org.junit.Assert.assertNotNull(arraylist_reservation36);
        org.junit.Assert.assertNotNull(branch_array37);
        org.junit.Assert.assertNull(arraylist_client41);
        org.junit.Assert.assertNotNull(arraylist_reservation43);
        org.junit.Assert.assertNull(arraylist_client45);
        org.junit.Assert.assertNotNull(arraylist_reservation47);
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test191");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental0.showCars("");
        java.util.ArrayList<rentalService.Client> arraylist_client14 = rental0.showClients("");
        java.lang.String str17 = rental0.registerClient("", "");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car12);
        org.junit.Assert.assertNull(arraylist_client14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test192");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation20 = rental0.showClientReservations("hi!");
        rentalService.Rental rental21 = new rentalService.Rental();
        rental21.pickupCar("");
        rental21.dropoffCar("");
        rental21.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation29 = rental21.showClientReservations("hi!");
        rental21.cancelReservation("hi!");
        rental21.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car35 = rental21.showCars("");
        rental21.pickupCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client39 = rental21.showClients("");
        rental21.dropoffCar("hi!");
        rental21.cancelClientReservation("hi!");
        rentalService.Rental rental44 = new rentalService.Rental();
        rental44.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car48 = rental44.showCars("");
        rental44.dropoffCar("hi!");
        rental44.dropoffCar("");
        rental44.dropoffCar("hi!");
        rentalService.Branch branch55 = null;
        rentalService.Branch[] branch_array56 = new rentalService.Branch[] { branch55 };
        rental44.initialise(branch_array56);
        rentalService.Rental rental58 = new rentalService.Rental();
        rental58.pickupCar("");
        rental58.dropoffCar("");
        rentalService.Rental rental63 = new rentalService.Rental();
        rental63.pickupCar("");
        rental63.dropoffCar("");
        rental63.pickupCar("");
        rentalService.Branch branch70 = null;
        rentalService.Branch[] branch_array71 = new rentalService.Branch[] { branch70 };
        rental63.initialise(branch_array71);
        rental58.initialise(branch_array71);
        rental44.initialise(branch_array71);
        rental21.initialise(branch_array71);
        rental0.initialise(branch_array71);
        try {
            java.util.ArrayList<rentalService.Car> arraylist_car78 = rental0.showCars("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(arraylist_reservation20);
        org.junit.Assert.assertNotNull(arraylist_reservation29);
        org.junit.Assert.assertNull(arraylist_car35);
        org.junit.Assert.assertNull(arraylist_client39);
        org.junit.Assert.assertNull(arraylist_car48);
        org.junit.Assert.assertNotNull(branch_array56);
        org.junit.Assert.assertNotNull(branch_array71);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test193");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        java.lang.String str13 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("");
        java.util.ArrayList<rentalService.Client> arraylist_client17 = rental0.showClients("");
        rentalService.Rental rental18 = new rentalService.Rental();
        java.lang.String str21 = rental18.registerClient("", "");
        rental18.cancelReservation("hi!");
        rental18.pickupCar("");
        rental18.pickupCar("");
        rentalService.Rental rental28 = new rentalService.Rental();
        rental28.pickupCar("");
        rental28.dropoffCar("");
        rentalService.Rental rental33 = new rentalService.Rental();
        rental33.pickupCar("");
        rental33.dropoffCar("");
        rental33.pickupCar("");
        rentalService.Branch branch40 = null;
        rentalService.Branch[] branch_array41 = new rentalService.Branch[] { branch40 };
        rental33.initialise(branch_array41);
        rental28.initialise(branch_array41);
        rental18.initialise(branch_array41);
        rental0.initialise(branch_array41);
        java.util.ArrayList<rentalService.Client> arraylist_client47 = rental0.showClients("");
        java.util.ArrayList<rentalService.Client> arraylist_client49 = rental0.showClients("");
        java.lang.String str52 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(arraylist_client17);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(branch_array41);
        org.junit.Assert.assertNull(arraylist_client47);
        org.junit.Assert.assertNull(arraylist_client49);
        org.junit.Assert.assertNull(str52);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test194");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("hi!");
        rental0.pickupCar("hi!");
        rentalService.Rental rental16 = new rentalService.Rental();
        rental16.pickupCar("");
        rental16.dropoffCar("");
        rental16.pickupCar("");
        rentalService.Branch branch23 = null;
        rentalService.Branch[] branch_array24 = new rentalService.Branch[] { branch23 };
        rental16.initialise(branch_array24);
        rental16.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation29 = rental16.showClientReservations("hi!");
        rentalService.Rental rental30 = new rentalService.Rental();
        java.lang.String str33 = rental30.registerClient("", "");
        rental30.cancelReservation("hi!");
        rental30.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car39 = rental30.showCars("");
        rentalService.Rental rental40 = new rentalService.Rental();
        rental40.pickupCar("");
        rental40.dropoffCar("");
        rental40.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation48 = rental40.showClientReservations("hi!");
        rental40.cancelReservation("hi!");
        rental40.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car54 = rental40.showCars("");
        rental40.dropoffCar("");
        rentalService.Rental rental57 = new rentalService.Rental();
        rental57.pickupCar("");
        rental57.dropoffCar("");
        rental57.pickupCar("");
        rentalService.Branch branch64 = null;
        rentalService.Branch[] branch_array65 = new rentalService.Branch[] { branch64 };
        rental57.initialise(branch_array65);
        rental40.initialise(branch_array65);
        rental30.initialise(branch_array65);
        rental16.initialise(branch_array65);
        rental0.initialise(branch_array65);
        java.util.ArrayList<rentalService.Car> arraylist_car72 = rental0.showCars("");
        rental0.pickupCar("hi!");
        rental0.pickupCar("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
        org.junit.Assert.assertNotNull(branch_array24);
        org.junit.Assert.assertNotNull(arraylist_reservation29);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(arraylist_car39);
        org.junit.Assert.assertNotNull(arraylist_reservation48);
        org.junit.Assert.assertNull(arraylist_car54);
        org.junit.Assert.assertNotNull(branch_array65);
        org.junit.Assert.assertNull(arraylist_car72);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test195");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client18 = rental0.showClients("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation22 = rental0.showClientReservations("hi!");
        rentalService.Rental rental23 = new rentalService.Rental();
        rental23.pickupCar("");
        rental23.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car29 = rental23.showCars("");
        rental23.cancelClientReservation("hi!");
        rental23.cancelReservation("");
        rentalService.Rental rental34 = new rentalService.Rental();
        java.lang.String str37 = rental34.registerClient("", "");
        rental34.cancelReservation("hi!");
        rental34.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car43 = rental34.showCars("");
        rentalService.Rental rental44 = new rentalService.Rental();
        rental44.pickupCar("");
        rental44.dropoffCar("");
        rental44.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation52 = rental44.showClientReservations("hi!");
        rental44.cancelReservation("hi!");
        rental44.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car58 = rental44.showCars("");
        rental44.dropoffCar("");
        rentalService.Rental rental61 = new rentalService.Rental();
        rental61.pickupCar("");
        rental61.dropoffCar("");
        rental61.pickupCar("");
        rentalService.Branch branch68 = null;
        rentalService.Branch[] branch_array69 = new rentalService.Branch[] { branch68 };
        rental61.initialise(branch_array69);
        rental44.initialise(branch_array69);
        rental34.initialise(branch_array69);
        rental23.initialise(branch_array69);
        rental0.initialise(branch_array69);
        rental0.dropoffCar("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(arraylist_client18);
        org.junit.Assert.assertNotNull(arraylist_reservation22);
        org.junit.Assert.assertNull(arraylist_car29);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(arraylist_car43);
        org.junit.Assert.assertNotNull(arraylist_reservation52);
        org.junit.Assert.assertNull(arraylist_car58);
        org.junit.Assert.assertNotNull(branch_array69);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test196");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        rental0.dropoffCar("hi!");
        rental0.pickupCar("");
        rental0.cancelClientReservation("");
        rental0.pickupCar("");
        rental0.pickupCar("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test197");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str12 = rental0.makeReservation("", "", "");
        rentalService.Branch[] branch_array13 = null;
        rental0.initialise(branch_array13);
        java.util.ArrayList<rentalService.Client> arraylist_client16 = rental0.showClients("");
        rentalService.Rental rental17 = new rentalService.Rental();
        rental17.pickupCar("");
        rental17.dropoffCar("");
        rental17.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation25 = rental17.showClientReservations("");
        rentalService.Rental rental26 = new rentalService.Rental();
        java.lang.String str29 = rental26.registerClient("", "");
        rental26.cancelReservation("hi!");
        rental26.pickupCar("");
        rental26.pickupCar("");
        rentalService.Rental rental36 = new rentalService.Rental();
        rental36.pickupCar("");
        rental36.dropoffCar("");
        rentalService.Rental rental41 = new rentalService.Rental();
        rental41.pickupCar("");
        rental41.dropoffCar("");
        rental41.pickupCar("");
        rentalService.Branch branch48 = null;
        rentalService.Branch[] branch_array49 = new rentalService.Branch[] { branch48 };
        rental41.initialise(branch_array49);
        rental36.initialise(branch_array49);
        rental26.initialise(branch_array49);
        rental17.initialise(branch_array49);
        rental0.initialise(branch_array49);
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client58 = rental0.showClients("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(arraylist_client16);
        org.junit.Assert.assertNotNull(arraylist_reservation25);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(branch_array49);
        org.junit.Assert.assertNull(arraylist_client58);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test198");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.lang.String str9 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        rentalService.Branch[] branch_array14 = null;
        rental0.initialise(branch_array14);
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car19 = rental0.showCars("");
        try {
            java.util.ArrayList<rentalService.Client> arraylist_client21 = rental0.showClients("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(arraylist_car19);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test199");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rentalService.Branch[] branch_array5 = null;
        rental0.initialise(branch_array5);
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("");
        rentalService.Rental rental11 = new rentalService.Rental();
        rental11.pickupCar("");
        rental11.dropoffCar("");
        rental11.pickupCar("");
        rentalService.Branch branch18 = null;
        rentalService.Branch[] branch_array19 = new rentalService.Branch[] { branch18 };
        rental11.initialise(branch_array19);
        rental0.initialise(branch_array19);
        java.util.ArrayList<rentalService.Car> arraylist_car23 = rental0.showCars("");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(arraylist_client10);
        org.junit.Assert.assertNotNull(branch_array19);
        org.junit.Assert.assertNull(arraylist_car23);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test200");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        java.lang.String str17 = rental0.registerClient("", "hi!");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation21 = rental0.showClientReservations("");
        rentalService.Rental rental22 = new rentalService.Rental();
        java.lang.String str25 = rental22.registerClient("", "");
        rental22.cancelReservation("hi!");
        rental22.pickupCar("");
        rental22.pickupCar("");
        rentalService.Rental rental32 = new rentalService.Rental();
        rental32.pickupCar("");
        rental32.dropoffCar("");
        rentalService.Rental rental37 = new rentalService.Rental();
        rental37.pickupCar("");
        rental37.dropoffCar("");
        rental37.pickupCar("");
        rentalService.Branch branch44 = null;
        rentalService.Branch[] branch_array45 = new rentalService.Branch[] { branch44 };
        rental37.initialise(branch_array45);
        rental32.initialise(branch_array45);
        rental22.initialise(branch_array45);
        rental22.cancelClientReservation("hi!");
        rentalService.Rental rental51 = new rentalService.Rental();
        java.lang.String str54 = rental51.registerClient("", "");
        rental51.cancelReservation("hi!");
        rental51.pickupCar("");
        rental51.pickupCar("");
        rentalService.Rental rental61 = new rentalService.Rental();
        rental61.pickupCar("");
        rental61.dropoffCar("");
        rentalService.Rental rental66 = new rentalService.Rental();
        rental66.pickupCar("");
        rental66.dropoffCar("");
        rental66.pickupCar("");
        rentalService.Branch branch73 = null;
        rentalService.Branch[] branch_array74 = new rentalService.Branch[] { branch73 };
        rental66.initialise(branch_array74);
        rental61.initialise(branch_array74);
        rental51.initialise(branch_array74);
        rental22.initialise(branch_array74);
        rental0.initialise(branch_array74);
        rental0.cancelClientReservation("hi!");
        rental0.cancelClientReservation("");
        rental0.dropoffCar("hi!");
        try {
            java.lang.String str88 = rental0.registerClient("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(arraylist_reservation21);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(branch_array45);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(branch_array74);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test201");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("hi!");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation18 = rental0.showClientReservations("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(arraylist_reservation18);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test202");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("");
        rentalService.Rental rental11 = new rentalService.Rental();
        rental11.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car15 = rental11.showCars("");
        rentalService.Branch[] branch_array16 = null;
        rental11.initialise(branch_array16);
        rental11.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client21 = rental11.showClients("");
        rentalService.Rental rental22 = new rentalService.Rental();
        rental22.pickupCar("");
        rental22.dropoffCar("");
        rental22.pickupCar("");
        rentalService.Branch branch29 = null;
        rentalService.Branch[] branch_array30 = new rentalService.Branch[] { branch29 };
        rental22.initialise(branch_array30);
        rental11.initialise(branch_array30);
        rental0.initialise(branch_array30);
        try {
            java.util.ArrayList<rentalService.Client> arraylist_client35 = rental0.showClients("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(arraylist_client10);
        org.junit.Assert.assertNull(arraylist_car15);
        org.junit.Assert.assertNull(arraylist_client21);
        org.junit.Assert.assertNotNull(branch_array30);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test203");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Client> arraylist_client12 = rental0.showClients("hi!");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Car> arraylist_car20 = rental0.showCars("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation22 = rental0.showClientReservations("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNull(arraylist_client12);
        org.junit.Assert.assertNull(arraylist_car20);
        org.junit.Assert.assertNotNull(arraylist_reservation22);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test204");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation14 = rental0.showClientReservations("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car18 = rental0.showCars("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNotNull(arraylist_reservation14);
        org.junit.Assert.assertNull(arraylist_car18);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test205");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Client> arraylist_client12 = rental0.showClients("hi!");
        rentalService.Rental rental13 = new rentalService.Rental();
        java.lang.String str16 = rental13.registerClient("", "");
        rental13.cancelReservation("hi!");
        rental13.pickupCar("");
        rental13.pickupCar("");
        rentalService.Rental rental23 = new rentalService.Rental();
        rental23.pickupCar("");
        rental23.dropoffCar("");
        rentalService.Rental rental28 = new rentalService.Rental();
        rental28.pickupCar("");
        rental28.dropoffCar("");
        rental28.pickupCar("");
        rentalService.Branch branch35 = null;
        rentalService.Branch[] branch_array36 = new rentalService.Branch[] { branch35 };
        rental28.initialise(branch_array36);
        rental23.initialise(branch_array36);
        rental13.initialise(branch_array36);
        rental0.initialise(branch_array36);
        rental0.cancelReservation("");
        try {
            java.lang.String str45 = rental0.registerClient("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNull(arraylist_client12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(branch_array36);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test206");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car8 = rental0.showCars("");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(arraylist_car8);
        org.junit.Assert.assertNull(arraylist_client10);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test207");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        java.lang.String str16 = rental0.makeReservation("hi!", "", "");
        java.lang.String str19 = rental0.registerClient("", "");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test208");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        java.lang.String str12 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation14 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car16 = rental0.showCars("");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation20 = rental0.showClientReservations("");
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(arraylist_reservation14);
        org.junit.Assert.assertNull(arraylist_car16);
        org.junit.Assert.assertNotNull(arraylist_reservation20);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test209");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("hi!");
        rental0.pickupCar("hi!");
        rentalService.Rental rental19 = new rentalService.Rental();
        rental19.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car23 = rental19.showCars("");
        rental19.dropoffCar("hi!");
        rental19.cancelClientReservation("hi!");
        java.lang.String str30 = rental19.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation32 = rental19.showClientReservations("");
        rentalService.Rental rental33 = new rentalService.Rental();
        java.lang.String str36 = rental33.registerClient("", "");
        rental33.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation40 = rental33.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation42 = rental33.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation44 = rental33.showClientReservations("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation46 = rental33.showClientReservations("hi!");
        rentalService.Rental rental47 = new rentalService.Rental();
        rental47.pickupCar("");
        rental47.dropoffCar("");
        rental47.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation55 = rental47.showClientReservations("hi!");
        rental47.cancelReservation("hi!");
        rental47.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car61 = rental47.showCars("");
        rental47.dropoffCar("");
        rentalService.Rental rental64 = new rentalService.Rental();
        rental64.pickupCar("");
        rental64.dropoffCar("");
        rental64.pickupCar("");
        rentalService.Branch branch71 = null;
        rentalService.Branch[] branch_array72 = new rentalService.Branch[] { branch71 };
        rental64.initialise(branch_array72);
        rental47.initialise(branch_array72);
        rental33.initialise(branch_array72);
        rental19.initialise(branch_array72);
        rental0.initialise(branch_array72);
        java.lang.String str80 = rental0.registerClient("", "hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car23);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(arraylist_reservation32);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(arraylist_reservation40);
        org.junit.Assert.assertNotNull(arraylist_reservation42);
        org.junit.Assert.assertNotNull(arraylist_reservation44);
        org.junit.Assert.assertNotNull(arraylist_reservation46);
        org.junit.Assert.assertNotNull(arraylist_reservation55);
        org.junit.Assert.assertNull(arraylist_car61);
        org.junit.Assert.assertNotNull(branch_array72);
        org.junit.Assert.assertNull(str80);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test210");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client15 = rental0.showClients("");
        rentalService.Rental rental16 = new rentalService.Rental();
        rental16.pickupCar("");
        rental16.dropoffCar("");
        rental16.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation24 = rental16.showClientReservations("hi!");
        rental16.cancelReservation("hi!");
        rental16.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car30 = rental16.showCars("");
        rental16.dropoffCar("");
        rentalService.Rental rental33 = new rentalService.Rental();
        rental33.pickupCar("");
        rental33.dropoffCar("");
        rental33.pickupCar("");
        rentalService.Branch branch40 = null;
        rentalService.Branch[] branch_array41 = new rentalService.Branch[] { branch40 };
        rental33.initialise(branch_array41);
        rental16.initialise(branch_array41);
        rental0.initialise(branch_array41);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
        org.junit.Assert.assertNull(arraylist_client15);
        org.junit.Assert.assertNotNull(arraylist_reservation24);
        org.junit.Assert.assertNull(arraylist_car30);
        org.junit.Assert.assertNotNull(branch_array41);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test211");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str12 = rental0.makeReservation("", "", "");
        rentalService.Branch[] branch_array13 = null;
        rental0.initialise(branch_array13);
        java.util.ArrayList<rentalService.Client> arraylist_client16 = rental0.showClients("");
        rentalService.Rental rental17 = new rentalService.Rental();
        rental17.pickupCar("");
        rental17.dropoffCar("");
        rental17.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation25 = rental17.showClientReservations("");
        rentalService.Rental rental26 = new rentalService.Rental();
        java.lang.String str29 = rental26.registerClient("", "");
        rental26.cancelReservation("hi!");
        rental26.pickupCar("");
        rental26.pickupCar("");
        rentalService.Rental rental36 = new rentalService.Rental();
        rental36.pickupCar("");
        rental36.dropoffCar("");
        rentalService.Rental rental41 = new rentalService.Rental();
        rental41.pickupCar("");
        rental41.dropoffCar("");
        rental41.pickupCar("");
        rentalService.Branch branch48 = null;
        rentalService.Branch[] branch_array49 = new rentalService.Branch[] { branch48 };
        rental41.initialise(branch_array49);
        rental36.initialise(branch_array49);
        rental26.initialise(branch_array49);
        rental17.initialise(branch_array49);
        rental0.initialise(branch_array49);
        java.util.ArrayList<rentalService.Car> arraylist_car56 = rental0.showCars("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(arraylist_client16);
        org.junit.Assert.assertNotNull(arraylist_reservation25);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(branch_array49);
        org.junit.Assert.assertNull(arraylist_car56);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test212");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation10 = rental0.showClientReservations("hi!");
        java.lang.String str13 = rental0.registerClient("", "");
        rentalService.Rental rental14 = new rentalService.Rental();
        rental14.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car18 = rental14.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation20 = rental14.showClientReservations("hi!");
        rental14.dropoffCar("");
        java.lang.String str26 = rental14.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation28 = rental14.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car30 = rental14.showCars("");
        rentalService.Rental rental31 = new rentalService.Rental();
        rental31.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car35 = rental31.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation37 = rental31.showClientReservations("hi!");
        rental31.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation41 = rental31.showClientReservations("hi!");
        rentalService.Rental rental42 = new rentalService.Rental();
        rental42.pickupCar("");
        rental42.dropoffCar("");
        rental42.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation50 = rental42.showClientReservations("hi!");
        rental42.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation54 = rental42.showClientReservations("hi!");
        rental42.dropoffCar("hi!");
        rentalService.Rental rental57 = new rentalService.Rental();
        java.lang.String str60 = rental57.registerClient("", "");
        rental57.cancelReservation("hi!");
        rental57.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car66 = rental57.showCars("");
        rentalService.Rental rental67 = new rentalService.Rental();
        rental67.pickupCar("");
        rental67.dropoffCar("");
        rental67.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation75 = rental67.showClientReservations("hi!");
        rental67.cancelReservation("hi!");
        rental67.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car81 = rental67.showCars("");
        rental67.dropoffCar("");
        rentalService.Rental rental84 = new rentalService.Rental();
        rental84.pickupCar("");
        rental84.dropoffCar("");
        rental84.pickupCar("");
        rentalService.Branch branch91 = null;
        rentalService.Branch[] branch_array92 = new rentalService.Branch[] { branch91 };
        rental84.initialise(branch_array92);
        rental67.initialise(branch_array92);
        rental57.initialise(branch_array92);
        rental42.initialise(branch_array92);
        rental31.initialise(branch_array92);
        rental14.initialise(branch_array92);
        rental0.initialise(branch_array92);
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(arraylist_car18);
        org.junit.Assert.assertNotNull(arraylist_reservation20);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(arraylist_reservation28);
        org.junit.Assert.assertNull(arraylist_car30);
        org.junit.Assert.assertNull(arraylist_car35);
        org.junit.Assert.assertNotNull(arraylist_reservation37);
        org.junit.Assert.assertNotNull(arraylist_reservation41);
        org.junit.Assert.assertNotNull(arraylist_reservation50);
        org.junit.Assert.assertNotNull(arraylist_reservation54);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNull(arraylist_car66);
        org.junit.Assert.assertNotNull(arraylist_reservation75);
        org.junit.Assert.assertNull(arraylist_car81);
        org.junit.Assert.assertNotNull(branch_array92);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test213");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.dropoffCar("");
        rentalService.Rental rental17 = new rentalService.Rental();
        rental17.pickupCar("");
        rental17.dropoffCar("");
        rental17.pickupCar("");
        rentalService.Branch branch24 = null;
        rentalService.Branch[] branch_array25 = new rentalService.Branch[] { branch24 };
        rental17.initialise(branch_array25);
        rental0.initialise(branch_array25);
        rentalService.Rental rental28 = new rentalService.Rental();
        rental28.pickupCar("");
        rental28.dropoffCar("");
        rental28.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation36 = rental28.showClientReservations("hi!");
        rentalService.Branch[] branch_array37 = new rentalService.Branch[] {};
        rental28.initialise(branch_array37);
        rental0.initialise(branch_array37);
        java.util.ArrayList<rentalService.Client> arraylist_client41 = rental0.showClients("hi!");
        java.lang.String str44 = rental0.registerClient("", "hi!");
        rental0.pickupCar("hi!");
        rental0.pickupCar("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation52 = rental0.showClientReservations("");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation56 = rental0.showClientReservations("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(branch_array25);
        org.junit.Assert.assertNotNull(arraylist_reservation36);
        org.junit.Assert.assertNotNull(branch_array37);
        org.junit.Assert.assertNull(arraylist_client41);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(arraylist_reservation52);
        org.junit.Assert.assertNotNull(arraylist_reservation56);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test214");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.lang.String str7 = rental0.makeReservation("hi!", "", "");
        rentalService.Rental rental8 = new rentalService.Rental();
        java.lang.String str11 = rental8.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental8.showClientReservations("");
        rental8.cancelReservation("");
        rentalService.Rental rental16 = new rentalService.Rental();
        rental16.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car20 = rental16.showCars("");
        rental16.dropoffCar("hi!");
        rental16.dropoffCar("");
        rental16.dropoffCar("hi!");
        rentalService.Branch branch27 = null;
        rentalService.Branch[] branch_array28 = new rentalService.Branch[] { branch27 };
        rental16.initialise(branch_array28);
        rental8.initialise(branch_array28);
        rental0.initialise(branch_array28);
        java.lang.String str35 = rental0.makeReservation("", "", "");
        rental0.cancelReservation("");
        try {
            java.lang.String str40 = rental0.registerClient("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
        org.junit.Assert.assertNull(arraylist_car20);
        org.junit.Assert.assertNotNull(branch_array28);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test215");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car17 = rental0.showCars("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
        org.junit.Assert.assertNull(arraylist_car17);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test216");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car6 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        rentalService.Rental rental11 = new rentalService.Rental();
        java.lang.String str14 = rental11.registerClient("", "");
        rental11.cancelReservation("hi!");
        rental11.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car20 = rental11.showCars("");
        rentalService.Rental rental21 = new rentalService.Rental();
        rental21.pickupCar("");
        rental21.dropoffCar("");
        rental21.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation29 = rental21.showClientReservations("hi!");
        rental21.cancelReservation("hi!");
        rental21.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car35 = rental21.showCars("");
        rental21.dropoffCar("");
        rentalService.Rental rental38 = new rentalService.Rental();
        rental38.pickupCar("");
        rental38.dropoffCar("");
        rental38.pickupCar("");
        rentalService.Branch branch45 = null;
        rentalService.Branch[] branch_array46 = new rentalService.Branch[] { branch45 };
        rental38.initialise(branch_array46);
        rental21.initialise(branch_array46);
        rental11.initialise(branch_array46);
        rental0.initialise(branch_array46);
        rental0.pickupCar("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        org.junit.Assert.assertNull(arraylist_car6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(arraylist_car20);
        org.junit.Assert.assertNotNull(arraylist_reservation29);
        org.junit.Assert.assertNull(arraylist_car35);
        org.junit.Assert.assertNotNull(branch_array46);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test217");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.cancelClientReservation("");
        org.junit.Assert.assertNull(arraylist_car4);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test218");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.pickupCar("hi!");
        rentalService.Rental rental19 = new rentalService.Rental();
        rental19.pickupCar("");
        rental19.dropoffCar("");
        rental19.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation27 = rental19.showClientReservations("hi!");
        rentalService.Branch[] branch_array28 = new rentalService.Branch[] {};
        rental19.initialise(branch_array28);
        rental0.initialise(branch_array28);
        rental0.cancelReservation("hi!");
        java.lang.String str35 = rental0.registerClient("hi!", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation37 = rental0.showClientReservations("");
        rental0.cancelReservation("");
        rental0.cancelReservation("hi!");
        java.lang.String str45 = rental0.makeReservation("hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(arraylist_reservation27);
        org.junit.Assert.assertNotNull(branch_array28);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(arraylist_reservation37);
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test219");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.dropoffCar("");
        rentalService.Rental rental17 = new rentalService.Rental();
        rental17.pickupCar("");
        rental17.dropoffCar("");
        rental17.pickupCar("");
        rentalService.Branch branch24 = null;
        rentalService.Branch[] branch_array25 = new rentalService.Branch[] { branch24 };
        rental17.initialise(branch_array25);
        rental0.initialise(branch_array25);
        rental0.cancelClientReservation("");
        rental0.cancelReservation("");
        rental0.cancelClientReservation("");
        rental0.cancelReservation("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(branch_array25);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test220");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client18 = rental0.showClients("");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("hi!");
        rental0.dropoffCar("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(arraylist_client18);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test221");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.cancelClientReservation("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test222");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("");
        rental0.dropoffCar("");
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(arraylist_client10);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test223");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rentalService.Rental rental12 = new rentalService.Rental();
        rental12.pickupCar("");
        rental12.dropoffCar("");
        rental12.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation20 = rental12.showClientReservations("hi!");
        rental12.cancelReservation("hi!");
        rental12.cancelClientReservation("hi!");
        rental12.pickupCar("");
        rental12.pickupCar("");
        java.lang.String str32 = rental12.makeReservation("", "", "");
        rental12.pickupCar("hi!");
        rentalService.Rental rental35 = new rentalService.Rental();
        java.lang.String str38 = rental35.registerClient("", "");
        rental35.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation42 = rental35.showClientReservations("hi!");
        rental35.cancelReservation("hi!");
        rentalService.Rental rental45 = new rentalService.Rental();
        rental45.pickupCar("");
        rental45.dropoffCar("");
        rental45.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation53 = rental45.showClientReservations("hi!");
        rental45.cancelReservation("hi!");
        rental45.cancelClientReservation("hi!");
        rental45.pickupCar("hi!");
        rental45.pickupCar("hi!");
        rentalService.Rental rental62 = new rentalService.Rental();
        rental62.pickupCar("");
        rental62.dropoffCar("");
        rental62.pickupCar("");
        rentalService.Branch branch69 = null;
        rentalService.Branch[] branch_array70 = new rentalService.Branch[] { branch69 };
        rental62.initialise(branch_array70);
        rental45.initialise(branch_array70);
        rental35.initialise(branch_array70);
        rental12.initialise(branch_array70);
        rental0.initialise(branch_array70);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation20);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(arraylist_reservation42);
        org.junit.Assert.assertNotNull(arraylist_reservation53);
        org.junit.Assert.assertNotNull(branch_array70);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test224");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation16 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car18 = rental0.showCars("hi!");
        java.lang.String str21 = rental0.registerClient("hi!", "");
        java.util.ArrayList<rentalService.Client> arraylist_client23 = rental0.showClients("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(arraylist_reservation16);
        org.junit.Assert.assertNull(arraylist_car18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(arraylist_client23);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test225");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        java.util.ArrayList<rentalService.Client> arraylist_client16 = rental0.showClients("");
        java.lang.String str20 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation22 = rental0.showClientReservations("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(arraylist_client16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(arraylist_reservation22);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test226");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str22 = rental0.makeReservation("", "hi!", "hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client24 = rental0.showClients("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation28 = rental0.showClientReservations("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client32 = rental0.showClients("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(arraylist_client24);
        org.junit.Assert.assertNotNull(arraylist_reservation28);
        org.junit.Assert.assertNull(arraylist_client32);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test227");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.cancelClientReservation("");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test228");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        rental0.cancelReservation("");
        rentalService.Rental rental14 = new rentalService.Rental();
        java.lang.String str17 = rental14.registerClient("", "");
        rental14.cancelReservation("hi!");
        rental14.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car23 = rental14.showCars("");
        rentalService.Rental rental24 = new rentalService.Rental();
        rental24.pickupCar("");
        rental24.dropoffCar("");
        rental24.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation32 = rental24.showClientReservations("hi!");
        rental24.cancelReservation("hi!");
        rental24.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car38 = rental24.showCars("");
        rental24.dropoffCar("");
        rentalService.Rental rental41 = new rentalService.Rental();
        rental41.pickupCar("");
        rental41.dropoffCar("");
        rental41.pickupCar("");
        rentalService.Branch branch48 = null;
        rentalService.Branch[] branch_array49 = new rentalService.Branch[] { branch48 };
        rental41.initialise(branch_array49);
        rental24.initialise(branch_array49);
        rental14.initialise(branch_array49);
        rental0.initialise(branch_array49);
        java.util.ArrayList<rentalService.Client> arraylist_client55 = rental0.showClients("");
        java.lang.String str58 = rental0.registerClient("", "");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("");
        rentalService.Rental rental63 = new rentalService.Rental();
        rental63.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car67 = rental63.showCars("");
        rental63.dropoffCar("hi!");
        rental63.dropoffCar("");
        rental63.dropoffCar("hi!");
        rentalService.Branch branch74 = null;
        rentalService.Branch[] branch_array75 = new rentalService.Branch[] { branch74 };
        rental63.initialise(branch_array75);
        rentalService.Rental rental77 = new rentalService.Rental();
        rental77.pickupCar("");
        rental77.dropoffCar("");
        rentalService.Rental rental82 = new rentalService.Rental();
        rental82.pickupCar("");
        rental82.dropoffCar("");
        rental82.pickupCar("");
        rentalService.Branch branch89 = null;
        rentalService.Branch[] branch_array90 = new rentalService.Branch[] { branch89 };
        rental82.initialise(branch_array90);
        rental77.initialise(branch_array90);
        rental63.initialise(branch_array90);
        rental0.initialise(branch_array90);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation96 = rental0.showClientReservations("hi!");
        rental0.pickupCar("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(arraylist_car23);
        org.junit.Assert.assertNotNull(arraylist_reservation32);
        org.junit.Assert.assertNull(arraylist_car38);
        org.junit.Assert.assertNotNull(branch_array49);
        org.junit.Assert.assertNull(arraylist_client55);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(arraylist_car67);
        org.junit.Assert.assertNotNull(branch_array75);
        org.junit.Assert.assertNotNull(branch_array90);
        org.junit.Assert.assertNotNull(arraylist_reservation96);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test229");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation16 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car18 = rental0.showCars("hi!");
        rental0.dropoffCar("hi!");
        java.lang.String str23 = rental0.registerClient("hi!", "");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("");
        java.lang.String str31 = rental0.makeReservation("", "hi!", "");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(arraylist_reservation16);
        org.junit.Assert.assertNull(arraylist_car18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test230");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        rentalService.Branch branch7 = null;
        rentalService.Branch[] branch_array8 = new rentalService.Branch[] { branch7 };
        rental0.initialise(branch_array8);
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("hi!");
        rentalService.Rental rental14 = new rentalService.Rental();
        java.lang.String str17 = rental14.registerClient("", "");
        rental14.cancelReservation("hi!");
        rental14.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car23 = rental14.showCars("");
        rentalService.Rental rental24 = new rentalService.Rental();
        rental24.pickupCar("");
        rental24.dropoffCar("");
        rental24.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation32 = rental24.showClientReservations("hi!");
        rental24.cancelReservation("hi!");
        rental24.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car38 = rental24.showCars("");
        rental24.dropoffCar("");
        rentalService.Rental rental41 = new rentalService.Rental();
        rental41.pickupCar("");
        rental41.dropoffCar("");
        rental41.pickupCar("");
        rentalService.Branch branch48 = null;
        rentalService.Branch[] branch_array49 = new rentalService.Branch[] { branch48 };
        rental41.initialise(branch_array49);
        rental24.initialise(branch_array49);
        rental14.initialise(branch_array49);
        rental0.initialise(branch_array49);
        java.lang.String str56 = rental0.registerClient("", "hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation58 = rental0.showClientReservations("hi!");
        org.junit.Assert.assertNotNull(branch_array8);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(arraylist_car23);
        org.junit.Assert.assertNotNull(arraylist_reservation32);
        org.junit.Assert.assertNull(arraylist_car38);
        org.junit.Assert.assertNotNull(branch_array49);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(arraylist_reservation58);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test231");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        rentalService.Branch branch11 = null;
        rentalService.Branch[] branch_array12 = new rentalService.Branch[] { branch11 };
        rental0.initialise(branch_array12);
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str20 = rental0.registerClient("", "");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation24 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(branch_array12);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(arraylist_reservation24);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test232");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rentalService.Rental rental16 = new rentalService.Rental();
        java.lang.String str19 = rental16.registerClient("", "");
        rental16.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation23 = rental16.showClientReservations("hi!");
        java.lang.String str27 = rental16.makeReservation("hi!", "", "");
        rental16.cancelReservation("");
        rentalService.Rental rental30 = new rentalService.Rental();
        java.lang.String str33 = rental30.registerClient("", "");
        rental30.cancelReservation("hi!");
        rental30.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car39 = rental30.showCars("");
        rentalService.Rental rental40 = new rentalService.Rental();
        rental40.pickupCar("");
        rental40.dropoffCar("");
        rental40.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation48 = rental40.showClientReservations("hi!");
        rental40.cancelReservation("hi!");
        rental40.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car54 = rental40.showCars("");
        rental40.dropoffCar("");
        rentalService.Rental rental57 = new rentalService.Rental();
        rental57.pickupCar("");
        rental57.dropoffCar("");
        rental57.pickupCar("");
        rentalService.Branch branch64 = null;
        rentalService.Branch[] branch_array65 = new rentalService.Branch[] { branch64 };
        rental57.initialise(branch_array65);
        rental40.initialise(branch_array65);
        rental30.initialise(branch_array65);
        rental16.initialise(branch_array65);
        rental0.initialise(branch_array65);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation72 = rental0.showClientReservations("");
        java.lang.String str75 = rental0.registerClient("", "");
        rental0.cancelClientReservation("hi!");
        rental0.dropoffCar("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(arraylist_reservation23);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(arraylist_car39);
        org.junit.Assert.assertNotNull(arraylist_reservation48);
        org.junit.Assert.assertNull(arraylist_car54);
        org.junit.Assert.assertNotNull(branch_array65);
        org.junit.Assert.assertNotNull(arraylist_reservation72);
        org.junit.Assert.assertNull(str75);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test233");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str12 = rental0.makeReservation("", "", "");
        rentalService.Branch[] branch_array13 = null;
        rental0.initialise(branch_array13);
        java.lang.String str17 = rental0.registerClient("", "hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car19 = rental0.showCars("");
        java.lang.String str22 = rental0.registerClient("", "");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(arraylist_car19);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test234");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        rentalService.Branch branch7 = null;
        rentalService.Branch[] branch_array8 = new rentalService.Branch[] { branch7 };
        rental0.initialise(branch_array8);
        rental0.cancelClientReservation("");
        rental0.cancelClientReservation("");
        java.lang.String str16 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Client> arraylist_client18 = rental0.showClients("");
        rental0.cancelReservation("");
        org.junit.Assert.assertNotNull(branch_array8);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(arraylist_client18);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test235");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        org.junit.Assert.assertNotNull(arraylist_reservation6);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test236");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation18 = rental0.showClientReservations("hi!");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client22 = rental0.showClients("");
        rental0.cancelClientReservation("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNotNull(arraylist_reservation18);
        org.junit.Assert.assertNull(arraylist_client22);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test237");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation18 = rental0.showClientReservations("hi!");
        rental0.pickupCar("hi!");
        rental0.cancelClientReservation("hi!");
        rentalService.Rental rental23 = new rentalService.Rental();
        rental23.pickupCar("");
        rental23.dropoffCar("");
        rental23.pickupCar("");
        java.lang.String str32 = rental23.registerClient("", "hi!");
        rental23.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car36 = rental23.showCars("");
        rentalService.Rental rental37 = new rentalService.Rental();
        rental37.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car41 = rental37.showCars("");
        rental37.dropoffCar("");
        rentalService.Rental rental44 = new rentalService.Rental();
        rental44.pickupCar("");
        rental44.dropoffCar("");
        rental44.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation52 = rental44.showClientReservations("hi!");
        rental44.cancelReservation("hi!");
        rental44.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car58 = rental44.showCars("");
        rental44.dropoffCar("");
        rentalService.Rental rental61 = new rentalService.Rental();
        rental61.pickupCar("");
        rental61.dropoffCar("");
        rental61.pickupCar("");
        rentalService.Branch branch68 = null;
        rentalService.Branch[] branch_array69 = new rentalService.Branch[] { branch68 };
        rental61.initialise(branch_array69);
        rental44.initialise(branch_array69);
        rental37.initialise(branch_array69);
        rental23.initialise(branch_array69);
        rentalService.Rental rental74 = new rentalService.Rental();
        rental74.pickupCar("");
        rental74.dropoffCar("");
        rental74.pickupCar("");
        rentalService.Branch branch81 = null;
        rentalService.Branch[] branch_array82 = new rentalService.Branch[] { branch81 };
        rental74.initialise(branch_array82);
        rental23.initialise(branch_array82);
        rental0.initialise(branch_array82);
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car89 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation91 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client93 = rental0.showClients("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNotNull(arraylist_reservation18);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(arraylist_car36);
        org.junit.Assert.assertNull(arraylist_car41);
        org.junit.Assert.assertNotNull(arraylist_reservation52);
        org.junit.Assert.assertNull(arraylist_car58);
        org.junit.Assert.assertNotNull(branch_array69);
        org.junit.Assert.assertNotNull(branch_array82);
        org.junit.Assert.assertNull(arraylist_car89);
        org.junit.Assert.assertNotNull(arraylist_reservation91);
        org.junit.Assert.assertNull(arraylist_client93);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test238");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str12 = rental0.makeReservation("", "", "");
        rentalService.Branch[] branch_array13 = null;
        rental0.initialise(branch_array13);
        rental0.pickupCar("hi!");
        java.lang.String str19 = rental0.registerClient("", "hi!");
        java.lang.String str22 = rental0.registerClient("", "");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test239");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation20 = rental0.showClientReservations("hi!");
        rentalService.Rental rental21 = new rentalService.Rental();
        rental21.pickupCar("");
        rental21.dropoffCar("");
        rental21.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation29 = rental21.showClientReservations("hi!");
        rental21.cancelReservation("hi!");
        rental21.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car35 = rental21.showCars("");
        rental21.pickupCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client39 = rental21.showClients("");
        rental21.dropoffCar("hi!");
        rental21.cancelClientReservation("hi!");
        rentalService.Rental rental44 = new rentalService.Rental();
        rental44.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car48 = rental44.showCars("");
        rental44.dropoffCar("hi!");
        rental44.dropoffCar("");
        rental44.dropoffCar("hi!");
        rentalService.Branch branch55 = null;
        rentalService.Branch[] branch_array56 = new rentalService.Branch[] { branch55 };
        rental44.initialise(branch_array56);
        rentalService.Rental rental58 = new rentalService.Rental();
        rental58.pickupCar("");
        rental58.dropoffCar("");
        rentalService.Rental rental63 = new rentalService.Rental();
        rental63.pickupCar("");
        rental63.dropoffCar("");
        rental63.pickupCar("");
        rentalService.Branch branch70 = null;
        rentalService.Branch[] branch_array71 = new rentalService.Branch[] { branch70 };
        rental63.initialise(branch_array71);
        rental58.initialise(branch_array71);
        rental44.initialise(branch_array71);
        rental21.initialise(branch_array71);
        rental0.initialise(branch_array71);
        java.lang.String str80 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Car> arraylist_car82 = rental0.showCars("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(arraylist_reservation20);
        org.junit.Assert.assertNotNull(arraylist_reservation29);
        org.junit.Assert.assertNull(arraylist_car35);
        org.junit.Assert.assertNull(arraylist_client39);
        org.junit.Assert.assertNull(arraylist_car48);
        org.junit.Assert.assertNotNull(branch_array56);
        org.junit.Assert.assertNotNull(branch_array71);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertNull(arraylist_car82);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test240");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.lang.String str9 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car17 = rental0.showCars("");
        rental0.cancelClientReservation("");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(arraylist_car17);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test241");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation18 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation26 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car28 = rental0.showCars("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(arraylist_reservation18);
        org.junit.Assert.assertNotNull(arraylist_reservation26);
        org.junit.Assert.assertNull(arraylist_car28);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test242");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(arraylist_client10);
        org.junit.Assert.assertNull(arraylist_car12);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test243");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation20 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation24 = rental0.showClientReservations("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(arraylist_reservation20);
        org.junit.Assert.assertNotNull(arraylist_reservation24);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test244");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        rentalService.Branch branch11 = null;
        rentalService.Branch[] branch_array12 = new rentalService.Branch[] { branch11 };
        rental0.initialise(branch_array12);
        rental0.cancelClientReservation("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(branch_array12);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test245");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client18 = rental0.showClients("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client20 = rental0.showClients("");
        java.lang.String str24 = rental0.makeReservation("", "hi!", "hi!");
        rental0.pickupCar("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(arraylist_client18);
        org.junit.Assert.assertNull(arraylist_client20);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test246");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        java.util.ArrayList<rentalService.Client> arraylist_client16 = rental0.showClients("");
        java.lang.String str20 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Client> arraylist_client22 = rental0.showClients("hi!");
        rental0.cancelClientReservation("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(arraylist_client16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(arraylist_client22);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test247");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation10 = rental0.showClientReservations("");
        rental0.dropoffCar("hi!");
        java.lang.String str15 = rental0.registerClient("", "");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Client> arraylist_client19 = rental0.showClients("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNotNull(arraylist_reservation10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(arraylist_client19);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test248");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str22 = rental0.makeReservation("", "", "");
        java.lang.String str25 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation31 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car33 = rental0.showCars("");
        rental0.dropoffCar("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(arraylist_reservation31);
        org.junit.Assert.assertNull(arraylist_car33);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test249");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.dropoffCar("");
        rentalService.Rental rental17 = new rentalService.Rental();
        rental17.pickupCar("");
        rental17.dropoffCar("");
        rental17.pickupCar("");
        rentalService.Branch branch24 = null;
        rentalService.Branch[] branch_array25 = new rentalService.Branch[] { branch24 };
        rental17.initialise(branch_array25);
        rental0.initialise(branch_array25);
        rental0.cancelClientReservation("");
        java.lang.String str32 = rental0.registerClient("", "");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(branch_array25);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test250");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        rental0.cancelReservation("");
        rentalService.Rental rental14 = new rentalService.Rental();
        java.lang.String str17 = rental14.registerClient("", "");
        rental14.cancelReservation("hi!");
        rental14.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car23 = rental14.showCars("");
        rentalService.Rental rental24 = new rentalService.Rental();
        rental24.pickupCar("");
        rental24.dropoffCar("");
        rental24.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation32 = rental24.showClientReservations("hi!");
        rental24.cancelReservation("hi!");
        rental24.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car38 = rental24.showCars("");
        rental24.dropoffCar("");
        rentalService.Rental rental41 = new rentalService.Rental();
        rental41.pickupCar("");
        rental41.dropoffCar("");
        rental41.pickupCar("");
        rentalService.Branch branch48 = null;
        rentalService.Branch[] branch_array49 = new rentalService.Branch[] { branch48 };
        rental41.initialise(branch_array49);
        rental24.initialise(branch_array49);
        rental14.initialise(branch_array49);
        rental0.initialise(branch_array49);
        java.util.ArrayList<rentalService.Client> arraylist_client55 = rental0.showClients("");
        java.lang.String str58 = rental0.registerClient("", "");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str66 = rental0.makeReservation("", "", "");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        try {
            java.lang.String str76 = rental0.makeReservation("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(arraylist_car23);
        org.junit.Assert.assertNotNull(arraylist_reservation32);
        org.junit.Assert.assertNull(arraylist_car38);
        org.junit.Assert.assertNotNull(branch_array49);
        org.junit.Assert.assertNull(arraylist_client55);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(str66);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test251");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.cancelClientReservation("");
        rental0.dropoffCar("");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("");
        rental0.cancelClientReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation28 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation30 = rental0.showClientReservations("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(arraylist_reservation28);
        org.junit.Assert.assertNotNull(arraylist_reservation30);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test252");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.lang.String str8 = rental0.registerClient("", "");
        java.lang.String str11 = rental0.registerClient("", "hi!");
        rental0.dropoffCar("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test253");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        java.lang.String str13 = rental0.registerClient("", "hi!");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test254");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client18 = rental0.showClients("");
        rentalService.Branch branch19 = null;
        rentalService.Branch[] branch_array20 = new rentalService.Branch[] { branch19 };
        rental0.initialise(branch_array20);
        rental0.pickupCar("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_client18);
        org.junit.Assert.assertNotNull(branch_array20);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test255");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation10 = rental0.showClientReservations("hi!");
        rental0.pickupCar("");
        rentalService.Branch[] branch_array13 = null;
        rental0.initialise(branch_array13);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation16 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation18 = rental0.showClientReservations("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(arraylist_reservation10);
        org.junit.Assert.assertNotNull(arraylist_reservation16);
        org.junit.Assert.assertNotNull(arraylist_reservation18);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test256");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("");
        rentalService.Rental rental11 = new rentalService.Rental();
        rental11.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car15 = rental11.showCars("");
        rentalService.Branch[] branch_array16 = null;
        rental11.initialise(branch_array16);
        rental11.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client21 = rental11.showClients("");
        rentalService.Rental rental22 = new rentalService.Rental();
        rental22.pickupCar("");
        rental22.dropoffCar("");
        rental22.pickupCar("");
        rentalService.Branch branch29 = null;
        rentalService.Branch[] branch_array30 = new rentalService.Branch[] { branch29 };
        rental22.initialise(branch_array30);
        rental11.initialise(branch_array30);
        rental0.initialise(branch_array30);
        rental0.cancelReservation("");
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(arraylist_client10);
        org.junit.Assert.assertNull(arraylist_car15);
        org.junit.Assert.assertNull(arraylist_client21);
        org.junit.Assert.assertNotNull(branch_array30);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test257");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rentalService.Rental rental15 = new rentalService.Rental();
        rental15.pickupCar("");
        rental15.dropoffCar("");
        rental15.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation23 = rental15.showClientReservations("hi!");
        rental15.cancelReservation("hi!");
        rental15.cancelClientReservation("hi!");
        rental15.pickupCar("");
        rental15.dropoffCar("hi!");
        rentalService.Rental rental32 = new rentalService.Rental();
        rental32.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car36 = rental32.showCars("");
        rental32.dropoffCar("hi!");
        rental32.dropoffCar("");
        rental32.cancelReservation("hi!");
        java.lang.String str45 = rental32.registerClient("", "hi!");
        rental32.cancelClientReservation("");
        java.util.ArrayList<rentalService.Client> arraylist_client49 = rental32.showClients("");
        rentalService.Rental rental50 = new rentalService.Rental();
        java.lang.String str53 = rental50.registerClient("", "");
        rental50.cancelReservation("hi!");
        rental50.pickupCar("");
        rental50.pickupCar("");
        rentalService.Rental rental60 = new rentalService.Rental();
        rental60.pickupCar("");
        rental60.dropoffCar("");
        rentalService.Rental rental65 = new rentalService.Rental();
        rental65.pickupCar("");
        rental65.dropoffCar("");
        rental65.pickupCar("");
        rentalService.Branch branch72 = null;
        rentalService.Branch[] branch_array73 = new rentalService.Branch[] { branch72 };
        rental65.initialise(branch_array73);
        rental60.initialise(branch_array73);
        rental50.initialise(branch_array73);
        rental32.initialise(branch_array73);
        rental15.initialise(branch_array73);
        rental0.initialise(branch_array73);
        try {
            java.lang.String str83 = rental0.makeReservation("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(arraylist_reservation23);
        org.junit.Assert.assertNull(arraylist_car36);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(arraylist_client49);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(branch_array73);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test258");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rentalService.Branch[] branch_array5 = null;
        rental0.initialise(branch_array5);
        java.util.ArrayList<rentalService.Car> arraylist_car8 = rental0.showCars("");
        java.lang.String str11 = rental0.registerClient("", "");
        rental0.cancelClientReservation("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(arraylist_car8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test259");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rentalService.Rental rental16 = new rentalService.Rental();
        java.lang.String str19 = rental16.registerClient("", "");
        rental16.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation23 = rental16.showClientReservations("hi!");
        java.lang.String str27 = rental16.makeReservation("hi!", "", "");
        rental16.cancelReservation("");
        rentalService.Rental rental30 = new rentalService.Rental();
        java.lang.String str33 = rental30.registerClient("", "");
        rental30.cancelReservation("hi!");
        rental30.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car39 = rental30.showCars("");
        rentalService.Rental rental40 = new rentalService.Rental();
        rental40.pickupCar("");
        rental40.dropoffCar("");
        rental40.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation48 = rental40.showClientReservations("hi!");
        rental40.cancelReservation("hi!");
        rental40.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car54 = rental40.showCars("");
        rental40.dropoffCar("");
        rentalService.Rental rental57 = new rentalService.Rental();
        rental57.pickupCar("");
        rental57.dropoffCar("");
        rental57.pickupCar("");
        rentalService.Branch branch64 = null;
        rentalService.Branch[] branch_array65 = new rentalService.Branch[] { branch64 };
        rental57.initialise(branch_array65);
        rental40.initialise(branch_array65);
        rental30.initialise(branch_array65);
        rental16.initialise(branch_array65);
        rental0.initialise(branch_array65);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation72 = rental0.showClientReservations("");
        java.lang.String str75 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation81 = rental0.showClientReservations("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(arraylist_reservation23);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(arraylist_car39);
        org.junit.Assert.assertNotNull(arraylist_reservation48);
        org.junit.Assert.assertNull(arraylist_car54);
        org.junit.Assert.assertNotNull(branch_array65);
        org.junit.Assert.assertNotNull(arraylist_reservation72);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNotNull(arraylist_reservation81);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test260");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("");
        rental0.cancelReservation("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNotNull(arraylist_reservation9);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test261");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("hi!");
        rental0.pickupCar("hi!");
        rentalService.Rental rental16 = new rentalService.Rental();
        rental16.pickupCar("");
        rental16.dropoffCar("");
        rental16.pickupCar("");
        rentalService.Branch branch23 = null;
        rentalService.Branch[] branch_array24 = new rentalService.Branch[] { branch23 };
        rental16.initialise(branch_array24);
        rental16.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation29 = rental16.showClientReservations("hi!");
        rentalService.Rental rental30 = new rentalService.Rental();
        java.lang.String str33 = rental30.registerClient("", "");
        rental30.cancelReservation("hi!");
        rental30.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car39 = rental30.showCars("");
        rentalService.Rental rental40 = new rentalService.Rental();
        rental40.pickupCar("");
        rental40.dropoffCar("");
        rental40.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation48 = rental40.showClientReservations("hi!");
        rental40.cancelReservation("hi!");
        rental40.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car54 = rental40.showCars("");
        rental40.dropoffCar("");
        rentalService.Rental rental57 = new rentalService.Rental();
        rental57.pickupCar("");
        rental57.dropoffCar("");
        rental57.pickupCar("");
        rentalService.Branch branch64 = null;
        rentalService.Branch[] branch_array65 = new rentalService.Branch[] { branch64 };
        rental57.initialise(branch_array65);
        rental40.initialise(branch_array65);
        rental30.initialise(branch_array65);
        rental16.initialise(branch_array65);
        rental0.initialise(branch_array65);
        java.util.ArrayList<rentalService.Car> arraylist_car72 = rental0.showCars("");
        rental0.pickupCar("hi!");
        rental0.pickupCar("hi!");
        try {
            java.util.ArrayList<rentalService.Client> arraylist_client78 = rental0.showClients("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
        org.junit.Assert.assertNotNull(branch_array24);
        org.junit.Assert.assertNotNull(arraylist_reservation29);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(arraylist_car39);
        org.junit.Assert.assertNotNull(arraylist_reservation48);
        org.junit.Assert.assertNull(arraylist_car54);
        org.junit.Assert.assertNotNull(branch_array65);
        org.junit.Assert.assertNull(arraylist_car72);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test262");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.lang.String str7 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("");
        java.lang.String str12 = rental0.registerClient("", "");
        rental0.cancelClientReservation("hi!");
        rental0.cancelClientReservation("");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation20 = rental0.showClientReservations("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(arraylist_reservation9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(arraylist_reservation20);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test263");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client20 = rental0.showClients("");
        rental0.pickupCar("hi!");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(arraylist_client20);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test264");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test265");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rentalService.Rental rental10 = new rentalService.Rental();
        rental10.pickupCar("");
        rental10.dropoffCar("");
        rentalService.Rental rental15 = new rentalService.Rental();
        rental15.pickupCar("");
        rental15.dropoffCar("");
        rental15.pickupCar("");
        rentalService.Branch branch22 = null;
        rentalService.Branch[] branch_array23 = new rentalService.Branch[] { branch22 };
        rental15.initialise(branch_array23);
        rental10.initialise(branch_array23);
        rental0.initialise(branch_array23);
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car30 = rental0.showCars("");
        try {
            java.lang.String str34 = rental0.makeReservation("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(branch_array23);
        org.junit.Assert.assertNull(arraylist_car30);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test266");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        rental0.pickupCar("");
        rental0.cancelClientReservation("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("");
        rentalService.Rental rental16 = new rentalService.Rental();
        java.lang.String str19 = rental16.registerClient("", "");
        rental16.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation23 = rental16.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation25 = rental16.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car27 = rental16.showCars("");
        rentalService.Rental rental28 = new rentalService.Rental();
        rental28.pickupCar("");
        rental28.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation34 = rental28.showClientReservations("hi!");
        rental28.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client38 = rental28.showClients("");
        rentalService.Rental rental39 = new rentalService.Rental();
        rental39.pickupCar("");
        rental39.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car45 = rental39.showCars("");
        rental39.cancelClientReservation("hi!");
        rental39.cancelReservation("");
        rentalService.Rental rental50 = new rentalService.Rental();
        java.lang.String str53 = rental50.registerClient("", "");
        rental50.cancelReservation("hi!");
        rental50.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car59 = rental50.showCars("");
        rentalService.Rental rental60 = new rentalService.Rental();
        rental60.pickupCar("");
        rental60.dropoffCar("");
        rental60.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation68 = rental60.showClientReservations("hi!");
        rental60.cancelReservation("hi!");
        rental60.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car74 = rental60.showCars("");
        rental60.dropoffCar("");
        rentalService.Rental rental77 = new rentalService.Rental();
        rental77.pickupCar("");
        rental77.dropoffCar("");
        rental77.pickupCar("");
        rentalService.Branch branch84 = null;
        rentalService.Branch[] branch_array85 = new rentalService.Branch[] { branch84 };
        rental77.initialise(branch_array85);
        rental60.initialise(branch_array85);
        rental50.initialise(branch_array85);
        rental39.initialise(branch_array85);
        rental28.initialise(branch_array85);
        rental16.initialise(branch_array85);
        rental0.initialise(branch_array85);
        java.lang.String str95 = rental0.registerClient("", "");
        rental0.cancelClientReservation("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(arraylist_reservation23);
        org.junit.Assert.assertNotNull(arraylist_reservation25);
        org.junit.Assert.assertNull(arraylist_car27);
        org.junit.Assert.assertNotNull(arraylist_reservation34);
        org.junit.Assert.assertNull(arraylist_client38);
        org.junit.Assert.assertNull(arraylist_car45);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(arraylist_car59);
        org.junit.Assert.assertNotNull(arraylist_reservation68);
        org.junit.Assert.assertNull(arraylist_car74);
        org.junit.Assert.assertNotNull(branch_array85);
        org.junit.Assert.assertNull(str95);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test267");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.cancelReservation("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation18 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation20 = rental0.showClientReservations("");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("hi!");
        rental0.pickupCar("");
        java.lang.String str29 = rental0.registerClient("", "");
        java.lang.String str32 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation18);
        org.junit.Assert.assertNotNull(arraylist_reservation20);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test268");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation20 = rental0.showClientReservations("hi!");
        java.lang.String str23 = rental0.registerClient("", "");
        java.lang.String str27 = rental0.makeReservation("hi!", "", "");
        java.lang.String str31 = rental0.makeReservation("", "", "");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(arraylist_reservation20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test269");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("");
        org.junit.Assert.assertNull(arraylist_car4);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test270");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car6 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        rental0.cancelReservation("hi!");
        rentalService.Rental rental13 = new rentalService.Rental();
        rental13.pickupCar("");
        rental13.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car19 = rental13.showCars("");
        rental13.cancelClientReservation("hi!");
        rental13.cancelReservation("");
        rentalService.Rental rental24 = new rentalService.Rental();
        java.lang.String str27 = rental24.registerClient("", "");
        rental24.cancelReservation("hi!");
        rental24.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car33 = rental24.showCars("");
        rentalService.Rental rental34 = new rentalService.Rental();
        rental34.pickupCar("");
        rental34.dropoffCar("");
        rental34.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation42 = rental34.showClientReservations("hi!");
        rental34.cancelReservation("hi!");
        rental34.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car48 = rental34.showCars("");
        rental34.dropoffCar("");
        rentalService.Rental rental51 = new rentalService.Rental();
        rental51.pickupCar("");
        rental51.dropoffCar("");
        rental51.pickupCar("");
        rentalService.Branch branch58 = null;
        rentalService.Branch[] branch_array59 = new rentalService.Branch[] { branch58 };
        rental51.initialise(branch_array59);
        rental34.initialise(branch_array59);
        rental24.initialise(branch_array59);
        rental13.initialise(branch_array59);
        rental0.initialise(branch_array59);
        java.lang.String str67 = rental0.registerClient("", "hi!");
        rental0.dropoffCar("");
        org.junit.Assert.assertNull(arraylist_car6);
        org.junit.Assert.assertNull(arraylist_car19);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(arraylist_car33);
        org.junit.Assert.assertNotNull(arraylist_reservation42);
        org.junit.Assert.assertNull(arraylist_car48);
        org.junit.Assert.assertNotNull(branch_array59);
        org.junit.Assert.assertNull(str67);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test271");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.cancelClientReservation("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car10 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        org.junit.Assert.assertNull(arraylist_car10);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test272");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        rental0.cancelReservation("");
        rentalService.Rental rental14 = new rentalService.Rental();
        java.lang.String str17 = rental14.registerClient("", "");
        rental14.cancelReservation("hi!");
        rental14.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car23 = rental14.showCars("");
        rentalService.Rental rental24 = new rentalService.Rental();
        rental24.pickupCar("");
        rental24.dropoffCar("");
        rental24.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation32 = rental24.showClientReservations("hi!");
        rental24.cancelReservation("hi!");
        rental24.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car38 = rental24.showCars("");
        rental24.dropoffCar("");
        rentalService.Rental rental41 = new rentalService.Rental();
        rental41.pickupCar("");
        rental41.dropoffCar("");
        rental41.pickupCar("");
        rentalService.Branch branch48 = null;
        rentalService.Branch[] branch_array49 = new rentalService.Branch[] { branch48 };
        rental41.initialise(branch_array49);
        rental24.initialise(branch_array49);
        rental14.initialise(branch_array49);
        rental0.initialise(branch_array49);
        java.util.ArrayList<rentalService.Client> arraylist_client55 = rental0.showClients("");
        java.lang.String str58 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation60 = rental0.showClientReservations("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(arraylist_car23);
        org.junit.Assert.assertNotNull(arraylist_reservation32);
        org.junit.Assert.assertNull(arraylist_car38);
        org.junit.Assert.assertNotNull(branch_array49);
        org.junit.Assert.assertNull(arraylist_client55);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(arraylist_reservation60);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test273");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation18 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(arraylist_reservation18);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test274");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        rentalService.Branch branch11 = null;
        rentalService.Branch[] branch_array12 = new rentalService.Branch[] { branch11 };
        rental0.initialise(branch_array12);
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str21 = rental0.makeReservation("", "", "");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(branch_array12);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test275");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation10 = rental0.showClientReservations("hi!");
        rental0.pickupCar("");
        rentalService.Branch[] branch_array13 = null;
        rental0.initialise(branch_array13);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation16 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car18 = rental0.showCars("");
        try {
            java.util.ArrayList<rentalService.Client> arraylist_client20 = rental0.showClients("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(arraylist_reservation10);
        org.junit.Assert.assertNotNull(arraylist_reservation16);
        org.junit.Assert.assertNull(arraylist_car18);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test276");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test277");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        java.lang.String str19 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str24 = rental0.registerClient("", "hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test278");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation11 = rental0.showClientReservations("");
        rental0.dropoffCar("");
        rental0.cancelClientReservation("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNotNull(arraylist_reservation9);
        org.junit.Assert.assertNotNull(arraylist_reservation11);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test279");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car20 = rental0.showCars("");
        rental0.cancelReservation("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(arraylist_car20);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test280");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("");
        java.lang.String str14 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation16 = rental0.showClientReservations("hi!");
        rental0.pickupCar("");
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(arraylist_client10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(arraylist_reservation16);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test281");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car6 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        java.lang.String str13 = rental0.registerClient("", "hi!");
        java.lang.String str16 = rental0.registerClient("", "hi!");
        rental0.cancelReservation("");
        java.lang.String str22 = rental0.makeReservation("", "", "");
        org.junit.Assert.assertNull(arraylist_car6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test282");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation5 = rental0.showClientReservations("");
        rental0.cancelReservation("");
        rental0.cancelClientReservation("hi!");
        rental0.dropoffCar("");
        rentalService.Rental rental12 = new rentalService.Rental();
        rental12.pickupCar("");
        rental12.dropoffCar("");
        rental12.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation20 = rental12.showClientReservations("hi!");
        rentalService.Branch[] branch_array21 = new rentalService.Branch[] {};
        rental12.initialise(branch_array21);
        rental0.initialise(branch_array21);
        rental0.dropoffCar("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation5);
        org.junit.Assert.assertNotNull(arraylist_reservation20);
        org.junit.Assert.assertNotNull(branch_array21);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test283");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        rental0.pickupCar("");
        rental0.cancelClientReservation("");
        java.lang.String str14 = rental0.registerClient("", "");
        rental0.pickupCar("hi!");
        java.lang.String str20 = rental0.makeReservation("hi!", "", "");
        rentalService.Rental rental21 = new rentalService.Rental();
        rental21.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car25 = rental21.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation27 = rental21.showClientReservations("hi!");
        rental21.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation31 = rental21.showClientReservations("");
        rental21.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client35 = rental21.showClients("");
        rentalService.Rental rental36 = new rentalService.Rental();
        java.lang.String str39 = rental36.registerClient("", "");
        rental36.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation43 = rental36.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation45 = rental36.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation47 = rental36.showClientReservations("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation49 = rental36.showClientReservations("hi!");
        rentalService.Rental rental50 = new rentalService.Rental();
        rental50.pickupCar("");
        rental50.dropoffCar("");
        rental50.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation58 = rental50.showClientReservations("hi!");
        rental50.cancelReservation("hi!");
        rental50.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car64 = rental50.showCars("");
        rental50.dropoffCar("");
        rentalService.Rental rental67 = new rentalService.Rental();
        rental67.pickupCar("");
        rental67.dropoffCar("");
        rental67.pickupCar("");
        rentalService.Branch branch74 = null;
        rentalService.Branch[] branch_array75 = new rentalService.Branch[] { branch74 };
        rental67.initialise(branch_array75);
        rental50.initialise(branch_array75);
        rental36.initialise(branch_array75);
        rental21.initialise(branch_array75);
        rental0.initialise(branch_array75);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation82 = rental0.showClientReservations("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(arraylist_car25);
        org.junit.Assert.assertNotNull(arraylist_reservation27);
        org.junit.Assert.assertNotNull(arraylist_reservation31);
        org.junit.Assert.assertNull(arraylist_client35);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(arraylist_reservation43);
        org.junit.Assert.assertNotNull(arraylist_reservation45);
        org.junit.Assert.assertNotNull(arraylist_reservation47);
        org.junit.Assert.assertNotNull(arraylist_reservation49);
        org.junit.Assert.assertNotNull(arraylist_reservation58);
        org.junit.Assert.assertNull(arraylist_car64);
        org.junit.Assert.assertNotNull(branch_array75);
        org.junit.Assert.assertNotNull(arraylist_reservation82);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test284");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.cancelReservation("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation18 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation20 = rental0.showClientReservations("");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation26 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation28 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation30 = rental0.showClientReservations("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation18);
        org.junit.Assert.assertNotNull(arraylist_reservation20);
        org.junit.Assert.assertNotNull(arraylist_reservation26);
        org.junit.Assert.assertNotNull(arraylist_reservation28);
        org.junit.Assert.assertNotNull(arraylist_reservation30);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test285");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.cancelReservation("");
        rental0.cancelClientReservation("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test286");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.dropoffCar("");
        java.lang.String str13 = rental0.registerClient("", "");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test287");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car6 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        java.lang.String str13 = rental0.registerClient("", "hi!");
        java.lang.String str16 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation18 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Client> arraylist_client20 = rental0.showClients("");
        rental0.cancelClientReservation("hi!");
        org.junit.Assert.assertNull(arraylist_car6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(arraylist_reservation18);
        org.junit.Assert.assertNull(arraylist_client20);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test288");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.dropoffCar("");
        rentalService.Rental rental17 = new rentalService.Rental();
        rental17.pickupCar("");
        rental17.dropoffCar("");
        rental17.pickupCar("");
        rentalService.Branch branch24 = null;
        rentalService.Branch[] branch_array25 = new rentalService.Branch[] { branch24 };
        rental17.initialise(branch_array25);
        rental0.initialise(branch_array25);
        rental0.cancelClientReservation("");
        rental0.cancelReservation("");
        java.lang.String str35 = rental0.makeReservation("hi!", "", "");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(branch_array25);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test289");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.cancelReservation("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation18 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("");
        rental0.cancelReservation("");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation28 = rental0.showClientReservations("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation18);
        org.junit.Assert.assertNotNull(arraylist_reservation28);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test290");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        java.lang.String str20 = rental0.makeReservation("", "", "");
        rental0.pickupCar("hi!");
        rentalService.Rental rental23 = new rentalService.Rental();
        java.lang.String str26 = rental23.registerClient("", "");
        rental23.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation30 = rental23.showClientReservations("hi!");
        rental23.cancelReservation("hi!");
        rentalService.Rental rental33 = new rentalService.Rental();
        rental33.pickupCar("");
        rental33.dropoffCar("");
        rental33.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation41 = rental33.showClientReservations("hi!");
        rental33.cancelReservation("hi!");
        rental33.cancelClientReservation("hi!");
        rental33.pickupCar("hi!");
        rental33.pickupCar("hi!");
        rentalService.Rental rental50 = new rentalService.Rental();
        rental50.pickupCar("");
        rental50.dropoffCar("");
        rental50.pickupCar("");
        rentalService.Branch branch57 = null;
        rentalService.Branch[] branch_array58 = new rentalService.Branch[] { branch57 };
        rental50.initialise(branch_array58);
        rental33.initialise(branch_array58);
        rental23.initialise(branch_array58);
        rental0.initialise(branch_array58);
        rental0.pickupCar("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(arraylist_reservation30);
        org.junit.Assert.assertNotNull(arraylist_reservation41);
        org.junit.Assert.assertNotNull(branch_array58);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test291");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        rental0.pickupCar("");
        rental0.cancelClientReservation("");
        rental0.cancelReservation("");
        rental0.cancelClientReservation("hi!");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test292");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        java.lang.String str13 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("");
        rentalService.Rental rental16 = new rentalService.Rental();
        rental16.pickupCar("");
        rental16.dropoffCar("");
        rental16.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation24 = rental16.showClientReservations("hi!");
        rental16.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation28 = rental16.showClientReservations("hi!");
        rental16.dropoffCar("hi!");
        rental16.cancelReservation("");
        rentalService.Rental rental33 = new rentalService.Rental();
        java.lang.String str36 = rental33.registerClient("", "");
        rental33.cancelReservation("hi!");
        rental33.pickupCar("");
        rental33.pickupCar("");
        rentalService.Rental rental43 = new rentalService.Rental();
        rental43.pickupCar("");
        rental43.dropoffCar("");
        rentalService.Rental rental48 = new rentalService.Rental();
        rental48.pickupCar("");
        rental48.dropoffCar("");
        rental48.pickupCar("");
        rentalService.Branch branch55 = null;
        rentalService.Branch[] branch_array56 = new rentalService.Branch[] { branch55 };
        rental48.initialise(branch_array56);
        rental43.initialise(branch_array56);
        rental33.initialise(branch_array56);
        rental16.initialise(branch_array56);
        rentalService.Rental rental61 = new rentalService.Rental();
        java.lang.String str64 = rental61.registerClient("", "");
        rental61.cancelReservation("hi!");
        rental61.pickupCar("");
        rental61.pickupCar("");
        rentalService.Rental rental71 = new rentalService.Rental();
        rental71.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car75 = rental71.showCars("");
        rental71.dropoffCar("hi!");
        rental71.dropoffCar("");
        rental71.dropoffCar("hi!");
        rentalService.Branch branch82 = null;
        rentalService.Branch[] branch_array83 = new rentalService.Branch[] { branch82 };
        rental71.initialise(branch_array83);
        rental61.initialise(branch_array83);
        rental16.initialise(branch_array83);
        rental0.initialise(branch_array83);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation89 = rental0.showClientReservations("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(arraylist_reservation24);
        org.junit.Assert.assertNotNull(arraylist_reservation28);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(branch_array56);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNull(arraylist_car75);
        org.junit.Assert.assertNotNull(branch_array83);
        org.junit.Assert.assertNotNull(arraylist_reservation89);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test293");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.cancelReservation("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation18 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation20 = rental0.showClientReservations("");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation26 = rental0.showClientReservations("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car30 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation32 = rental0.showClientReservations("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation18);
        org.junit.Assert.assertNotNull(arraylist_reservation20);
        org.junit.Assert.assertNotNull(arraylist_reservation26);
        org.junit.Assert.assertNull(arraylist_car30);
        org.junit.Assert.assertNotNull(arraylist_reservation32);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test294");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rentalService.Branch[] branch_array5 = null;
        rental0.initialise(branch_array5);
        rental0.pickupCar("");
        rental0.pickupCar("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test295");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation16 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car18 = rental0.showCars("hi!");
        java.lang.String str21 = rental0.registerClient("hi!", "");
        java.util.ArrayList<rentalService.Car> arraylist_car23 = rental0.showCars("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car25 = rental0.showCars("");
        rental0.pickupCar("hi!");
        rental0.cancelClientReservation("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(arraylist_reservation16);
        org.junit.Assert.assertNull(arraylist_car18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(arraylist_car23);
        org.junit.Assert.assertNull(arraylist_car25);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test296");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str12 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation14 = rental0.showClientReservations("");
        java.lang.String str18 = rental0.makeReservation("hi!", "", "");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(arraylist_reservation14);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test297");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car6 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        rental0.dropoffCar("hi!");
        rentalService.Rental rental11 = new rentalService.Rental();
        rental11.pickupCar("");
        rental11.dropoffCar("");
        rental11.pickupCar("");
        java.lang.String str20 = rental11.registerClient("", "hi!");
        rental11.cancelClientReservation("hi!");
        rental11.cancelReservation("");
        rentalService.Branch[] branch_array25 = null;
        rental11.initialise(branch_array25);
        rentalService.Rental rental27 = new rentalService.Rental();
        java.lang.String str30 = rental27.registerClient("", "");
        rental27.cancelReservation("hi!");
        rental27.pickupCar("");
        rental27.pickupCar("");
        rentalService.Rental rental37 = new rentalService.Rental();
        rental37.pickupCar("");
        rental37.dropoffCar("");
        rentalService.Rental rental42 = new rentalService.Rental();
        rental42.pickupCar("");
        rental42.dropoffCar("");
        rental42.pickupCar("");
        rentalService.Branch branch49 = null;
        rentalService.Branch[] branch_array50 = new rentalService.Branch[] { branch49 };
        rental42.initialise(branch_array50);
        rental37.initialise(branch_array50);
        rental27.initialise(branch_array50);
        rental11.initialise(branch_array50);
        rental0.initialise(branch_array50);
        java.util.ArrayList<rentalService.Client> arraylist_client57 = rental0.showClients("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car61 = rental0.showCars("");
        org.junit.Assert.assertNull(arraylist_car6);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(branch_array50);
        org.junit.Assert.assertNull(arraylist_client57);
        org.junit.Assert.assertNull(arraylist_car61);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test298");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str11 = rental0.registerClient("", "");
        rental0.cancelClientReservation("hi!");
        rentalService.Rental rental14 = new rentalService.Rental();
        java.lang.String str17 = rental14.registerClient("", "");
        rental14.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation21 = rental14.showClientReservations("hi!");
        java.lang.String str25 = rental14.makeReservation("hi!", "", "");
        rental14.cancelReservation("");
        java.lang.String str31 = rental14.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Client> arraylist_client33 = rental14.showClients("");
        rental14.pickupCar("");
        rentalService.Rental rental36 = new rentalService.Rental();
        rental36.pickupCar("");
        rental36.dropoffCar("");
        rental36.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation44 = rental36.showClientReservations("hi!");
        rental36.cancelReservation("hi!");
        rental36.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car50 = rental36.showCars("");
        rental36.dropoffCar("");
        rentalService.Rental rental53 = new rentalService.Rental();
        rental53.pickupCar("");
        rental53.dropoffCar("");
        rental53.pickupCar("");
        rentalService.Branch branch60 = null;
        rentalService.Branch[] branch_array61 = new rentalService.Branch[] { branch60 };
        rental53.initialise(branch_array61);
        rental36.initialise(branch_array61);
        rental14.initialise(branch_array61);
        rental0.initialise(branch_array61);
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(arraylist_reservation21);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(arraylist_client33);
        org.junit.Assert.assertNotNull(arraylist_reservation44);
        org.junit.Assert.assertNull(arraylist_car50);
        org.junit.Assert.assertNotNull(branch_array61);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test299");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation5 = rental0.showClientReservations("");
        rental0.cancelReservation("");
        rentalService.Rental rental8 = new rentalService.Rental();
        rental8.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental8.showCars("");
        rental8.dropoffCar("hi!");
        rental8.dropoffCar("");
        rental8.dropoffCar("hi!");
        rentalService.Branch branch19 = null;
        rentalService.Branch[] branch_array20 = new rentalService.Branch[] { branch19 };
        rental8.initialise(branch_array20);
        rental0.initialise(branch_array20);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation24 = rental0.showClientReservations("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation30 = rental0.showClientReservations("");
        java.lang.String str33 = rental0.registerClient("", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation5);
        org.junit.Assert.assertNull(arraylist_car12);
        org.junit.Assert.assertNotNull(branch_array20);
        org.junit.Assert.assertNotNull(arraylist_reservation24);
        org.junit.Assert.assertNotNull(arraylist_reservation30);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test300");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client18 = rental0.showClients("");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        rentalService.Rental rental23 = new rentalService.Rental();
        rental23.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car27 = rental23.showCars("");
        rental23.dropoffCar("hi!");
        rental23.dropoffCar("");
        rental23.dropoffCar("hi!");
        rentalService.Branch branch34 = null;
        rentalService.Branch[] branch_array35 = new rentalService.Branch[] { branch34 };
        rental23.initialise(branch_array35);
        rentalService.Rental rental37 = new rentalService.Rental();
        rental37.pickupCar("");
        rental37.dropoffCar("");
        rentalService.Rental rental42 = new rentalService.Rental();
        rental42.pickupCar("");
        rental42.dropoffCar("");
        rental42.pickupCar("");
        rentalService.Branch branch49 = null;
        rentalService.Branch[] branch_array50 = new rentalService.Branch[] { branch49 };
        rental42.initialise(branch_array50);
        rental37.initialise(branch_array50);
        rental23.initialise(branch_array50);
        rental0.initialise(branch_array50);
        java.lang.String str57 = rental0.registerClient("", "hi!");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(arraylist_client18);
        org.junit.Assert.assertNull(arraylist_car27);
        org.junit.Assert.assertNotNull(branch_array35);
        org.junit.Assert.assertNotNull(branch_array50);
        org.junit.Assert.assertNull(str57);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test301");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("");
        rental0.cancelClientReservation("");
        rental0.cancelReservation("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test302");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Client> arraylist_client12 = rental0.showClients("hi!");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Car> arraylist_car20 = rental0.showCars("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation22 = rental0.showClientReservations("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNull(arraylist_client12);
        org.junit.Assert.assertNull(arraylist_car20);
        org.junit.Assert.assertNotNull(arraylist_reservation22);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test303");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.lang.String str8 = rental0.makeReservation("", "", "");
        java.lang.String str12 = rental0.makeReservation("hi!", "", "");
        java.lang.String str15 = rental0.registerClient("", "hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test304");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rentalService.Rental rental10 = new rentalService.Rental();
        rental10.pickupCar("");
        rental10.dropoffCar("");
        rentalService.Rental rental15 = new rentalService.Rental();
        rental15.pickupCar("");
        rental15.dropoffCar("");
        rental15.pickupCar("");
        rentalService.Branch branch22 = null;
        rentalService.Branch[] branch_array23 = new rentalService.Branch[] { branch22 };
        rental15.initialise(branch_array23);
        rental10.initialise(branch_array23);
        rental0.initialise(branch_array23);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation28 = rental0.showClientReservations("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(branch_array23);
        org.junit.Assert.assertNotNull(arraylist_reservation28);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test305");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        rental0.cancelReservation("");
        rentalService.Rental rental14 = new rentalService.Rental();
        java.lang.String str17 = rental14.registerClient("", "");
        rental14.cancelReservation("hi!");
        rental14.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car23 = rental14.showCars("");
        rentalService.Rental rental24 = new rentalService.Rental();
        rental24.pickupCar("");
        rental24.dropoffCar("");
        rental24.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation32 = rental24.showClientReservations("hi!");
        rental24.cancelReservation("hi!");
        rental24.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car38 = rental24.showCars("");
        rental24.dropoffCar("");
        rentalService.Rental rental41 = new rentalService.Rental();
        rental41.pickupCar("");
        rental41.dropoffCar("");
        rental41.pickupCar("");
        rentalService.Branch branch48 = null;
        rentalService.Branch[] branch_array49 = new rentalService.Branch[] { branch48 };
        rental41.initialise(branch_array49);
        rental24.initialise(branch_array49);
        rental14.initialise(branch_array49);
        rental0.initialise(branch_array49);
        java.util.ArrayList<rentalService.Client> arraylist_client55 = rental0.showClients("");
        java.lang.String str58 = rental0.registerClient("", "");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation66 = rental0.showClientReservations("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(arraylist_car23);
        org.junit.Assert.assertNotNull(arraylist_reservation32);
        org.junit.Assert.assertNull(arraylist_car38);
        org.junit.Assert.assertNotNull(branch_array49);
        org.junit.Assert.assertNull(arraylist_client55);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(arraylist_reservation66);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test306");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client14 = rental0.showClients("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(arraylist_client14);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test307");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("");
        rental0.cancelReservation("hi!");
        rentalService.Rental rental16 = new rentalService.Rental();
        rental16.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car20 = rental16.showCars("");
        rental16.dropoffCar("");
        rentalService.Rental rental23 = new rentalService.Rental();
        rental23.pickupCar("");
        rental23.dropoffCar("");
        rental23.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation31 = rental23.showClientReservations("hi!");
        rental23.cancelReservation("hi!");
        rental23.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car37 = rental23.showCars("");
        rental23.dropoffCar("");
        rentalService.Rental rental40 = new rentalService.Rental();
        rental40.pickupCar("");
        rental40.dropoffCar("");
        rental40.pickupCar("");
        rentalService.Branch branch47 = null;
        rentalService.Branch[] branch_array48 = new rentalService.Branch[] { branch47 };
        rental40.initialise(branch_array48);
        rental23.initialise(branch_array48);
        rental16.initialise(branch_array48);
        rental0.initialise(branch_array48);
        rental0.dropoffCar("");
        rental0.cancelReservation("");
        rentalService.Branch[] branch_array57 = null;
        rental0.initialise(branch_array57);
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation62 = rental0.showClientReservations("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
        org.junit.Assert.assertNull(arraylist_car20);
        org.junit.Assert.assertNotNull(arraylist_reservation31);
        org.junit.Assert.assertNull(arraylist_car37);
        org.junit.Assert.assertNotNull(branch_array48);
        org.junit.Assert.assertNotNull(arraylist_reservation62);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test308");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car11 = rental0.showCars("");
        java.lang.String str15 = rental0.makeReservation("", "", "");
        rental0.dropoffCar("");
        rental0.dropoffCar("");
        rental0.cancelReservation("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNull(arraylist_car11);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test309");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        rental0.cancelReservation("");
        rental0.dropoffCar("");
        rental0.dropoffCar("");
        rentalService.Rental rental18 = new rentalService.Rental();
        java.lang.String str21 = rental18.registerClient("", "");
        rental18.cancelReservation("hi!");
        rental18.pickupCar("");
        rental18.pickupCar("");
        rental18.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation31 = rental18.showClientReservations("hi!");
        rental18.pickupCar("hi!");
        rentalService.Rental rental34 = new rentalService.Rental();
        rental34.pickupCar("");
        rental34.dropoffCar("");
        rentalService.Rental rental39 = new rentalService.Rental();
        rental39.pickupCar("");
        rental39.dropoffCar("");
        rental39.pickupCar("");
        rentalService.Branch branch46 = null;
        rentalService.Branch[] branch_array47 = new rentalService.Branch[] { branch46 };
        rental39.initialise(branch_array47);
        rental34.initialise(branch_array47);
        rental18.initialise(branch_array47);
        rental0.initialise(branch_array47);
        java.lang.String str54 = rental0.registerClient("", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(arraylist_reservation31);
        org.junit.Assert.assertNotNull(branch_array47);
        org.junit.Assert.assertNull(str54);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test310");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        rentalService.Branch branch7 = null;
        rentalService.Branch[] branch_array8 = new rentalService.Branch[] { branch7 };
        rental0.initialise(branch_array8);
        rental0.cancelClientReservation("");
        rental0.cancelClientReservation("");
        java.util.ArrayList<rentalService.Client> arraylist_client15 = rental0.showClients("");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation19 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation21 = rental0.showClientReservations("");
        org.junit.Assert.assertNotNull(branch_array8);
        org.junit.Assert.assertNull(arraylist_client15);
        org.junit.Assert.assertNotNull(arraylist_reservation19);
        org.junit.Assert.assertNotNull(arraylist_reservation21);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test311");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rentalService.Branch[] branch_array5 = null;
        rental0.initialise(branch_array5);
        java.util.ArrayList<rentalService.Car> arraylist_car8 = rental0.showCars("");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("hi!");
        rental0.pickupCar("hi!");
        java.lang.String str18 = rental0.makeReservation("", "", "");
        rental0.dropoffCar("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(arraylist_car8);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test312");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation10 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental0.showCars("");
        rentalService.Rental rental13 = new rentalService.Rental();
        java.lang.String str16 = rental13.registerClient("", "");
        rental13.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation20 = rental13.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation22 = rental13.showClientReservations("hi!");
        rental13.dropoffCar("hi!");
        java.lang.String str28 = rental13.makeReservation("", "", "");
        rental13.cancelReservation("");
        rentalService.Rental rental31 = new rentalService.Rental();
        rental31.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car35 = rental31.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation37 = rental31.showClientReservations("hi!");
        rental31.dropoffCar("");
        java.lang.String str43 = rental31.makeReservation("", "", "");
        rentalService.Rental rental44 = new rentalService.Rental();
        java.lang.String str47 = rental44.registerClient("", "");
        rental44.cancelReservation("hi!");
        rental44.pickupCar("");
        rental44.pickupCar("");
        rental44.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation57 = rental44.showClientReservations("hi!");
        rental44.pickupCar("hi!");
        rentalService.Rental rental60 = new rentalService.Rental();
        rental60.pickupCar("");
        rental60.dropoffCar("");
        rentalService.Rental rental65 = new rentalService.Rental();
        rental65.pickupCar("");
        rental65.dropoffCar("");
        rental65.pickupCar("");
        rentalService.Branch branch72 = null;
        rentalService.Branch[] branch_array73 = new rentalService.Branch[] { branch72 };
        rental65.initialise(branch_array73);
        rental60.initialise(branch_array73);
        rental44.initialise(branch_array73);
        rental31.initialise(branch_array73);
        rental13.initialise(branch_array73);
        rental0.initialise(branch_array73);
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation10);
        org.junit.Assert.assertNull(arraylist_car12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(arraylist_reservation20);
        org.junit.Assert.assertNotNull(arraylist_reservation22);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(arraylist_car35);
        org.junit.Assert.assertNotNull(arraylist_reservation37);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(arraylist_reservation57);
        org.junit.Assert.assertNotNull(branch_array73);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test313");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.lang.String str9 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car13 = rental0.showCars("");
        java.lang.String str16 = rental0.registerClient("", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(arraylist_car13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test314");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client20 = rental0.showClients("");
        java.lang.String str23 = rental0.registerClient("", "hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation25 = rental0.showClientReservations("hi!");
        java.lang.String str29 = rental0.makeReservation("hi!", "", "");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(arraylist_client20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(arraylist_reservation25);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test315");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.cancelReservation("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation18 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation22 = rental0.showClientReservations("hi!");
        rental0.pickupCar("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation18);
        org.junit.Assert.assertNotNull(arraylist_reservation22);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test316");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Client> arraylist_client12 = rental0.showClients("hi!");
        rentalService.Rental rental13 = new rentalService.Rental();
        java.lang.String str16 = rental13.registerClient("", "");
        rental13.cancelReservation("hi!");
        rental13.pickupCar("");
        rental13.pickupCar("");
        rentalService.Rental rental23 = new rentalService.Rental();
        rental23.pickupCar("");
        rental23.dropoffCar("");
        rentalService.Rental rental28 = new rentalService.Rental();
        rental28.pickupCar("");
        rental28.dropoffCar("");
        rental28.pickupCar("");
        rentalService.Branch branch35 = null;
        rentalService.Branch[] branch_array36 = new rentalService.Branch[] { branch35 };
        rental28.initialise(branch_array36);
        rental23.initialise(branch_array36);
        rental13.initialise(branch_array36);
        rental0.initialise(branch_array36);
        rental0.cancelReservation("");
        java.lang.String str46 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Car> arraylist_car48 = rental0.showCars("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNull(arraylist_client12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(branch_array36);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(arraylist_car48);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test317");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation16 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car18 = rental0.showCars("hi!");
        rental0.dropoffCar("hi!");
        java.lang.String str23 = rental0.registerClient("hi!", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation25 = rental0.showClientReservations("");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client31 = rental0.showClients("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(arraylist_reservation16);
        org.junit.Assert.assertNull(arraylist_car18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(arraylist_reservation25);
        org.junit.Assert.assertNull(arraylist_client31);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test318");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str12 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(arraylist_car14);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test319");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str15 = rental0.registerClient("", "hi!");
        rental0.dropoffCar("");
        rental0.pickupCar("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test320");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car6 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation14 = rental0.showClientReservations("");
        java.lang.String str17 = rental0.registerClient("", "");
        org.junit.Assert.assertNull(arraylist_car6);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNotNull(arraylist_reservation14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test321");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        rentalService.Branch branch7 = null;
        rentalService.Branch[] branch_array8 = new rentalService.Branch[] { branch7 };
        rental0.initialise(branch_array8);
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client13 = rental0.showClients("");
        org.junit.Assert.assertNotNull(branch_array8);
        org.junit.Assert.assertNull(arraylist_client13);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test322");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str12 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation14 = rental0.showClientReservations("");
        rental0.cancelReservation("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(arraylist_reservation14);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test323");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("hi!");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car18 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rentalService.Rental rental21 = new rentalService.Rental();
        java.lang.String str24 = rental21.registerClient("", "");
        rental21.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation28 = rental21.showClientReservations("hi!");
        java.lang.String str32 = rental21.makeReservation("hi!", "", "");
        rental21.cancelReservation("");
        java.lang.String str38 = rental21.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Client> arraylist_client40 = rental21.showClients("");
        rental21.cancelReservation("hi!");
        rentalService.Rental rental43 = new rentalService.Rental();
        java.lang.String str46 = rental43.registerClient("", "");
        rental43.cancelReservation("hi!");
        rental43.pickupCar("");
        rental43.pickupCar("");
        rentalService.Rental rental53 = new rentalService.Rental();
        rental53.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car57 = rental53.showCars("");
        rental53.dropoffCar("hi!");
        rental53.dropoffCar("");
        rental53.dropoffCar("hi!");
        rentalService.Branch branch64 = null;
        rentalService.Branch[] branch_array65 = new rentalService.Branch[] { branch64 };
        rental53.initialise(branch_array65);
        rental43.initialise(branch_array65);
        rental21.initialise(branch_array65);
        rental0.initialise(branch_array65);
        rental0.cancelClientReservation("hi!");
        try {
            java.lang.String str75 = rental0.makeReservation("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car18);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(arraylist_reservation28);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(arraylist_client40);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(arraylist_car57);
        org.junit.Assert.assertNotNull(branch_array65);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test324");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNotNull(arraylist_reservation9);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test325");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("");
        rentalService.Rental rental11 = new rentalService.Rental();
        java.lang.String str14 = rental11.registerClient("", "");
        rental11.cancelReservation("hi!");
        rental11.pickupCar("");
        rental11.pickupCar("");
        rentalService.Rental rental21 = new rentalService.Rental();
        rental21.pickupCar("");
        rental21.dropoffCar("");
        rentalService.Rental rental26 = new rentalService.Rental();
        rental26.pickupCar("");
        rental26.dropoffCar("");
        rental26.pickupCar("");
        rentalService.Branch branch33 = null;
        rentalService.Branch[] branch_array34 = new rentalService.Branch[] { branch33 };
        rental26.initialise(branch_array34);
        rental21.initialise(branch_array34);
        rental11.initialise(branch_array34);
        rental11.cancelClientReservation("hi!");
        rental11.dropoffCar("");
        rentalService.Rental rental42 = new rentalService.Rental();
        rental42.pickupCar("");
        rental42.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car48 = rental42.showCars("");
        rental42.cancelClientReservation("hi!");
        rental42.dropoffCar("hi!");
        rentalService.Rental rental53 = new rentalService.Rental();
        rental53.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car57 = rental53.showCars("");
        rentalService.Branch[] branch_array58 = null;
        rental53.initialise(branch_array58);
        rental53.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client63 = rental53.showClients("");
        rentalService.Rental rental64 = new rentalService.Rental();
        rental64.pickupCar("");
        rental64.dropoffCar("");
        rental64.pickupCar("");
        rentalService.Branch branch71 = null;
        rentalService.Branch[] branch_array72 = new rentalService.Branch[] { branch71 };
        rental64.initialise(branch_array72);
        rental53.initialise(branch_array72);
        rental42.initialise(branch_array72);
        rental11.initialise(branch_array72);
        rental0.initialise(branch_array72);
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation81 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Client> arraylist_client83 = rental0.showClients("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(arraylist_client10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(branch_array34);
        org.junit.Assert.assertNull(arraylist_car48);
        org.junit.Assert.assertNull(arraylist_car57);
        org.junit.Assert.assertNull(arraylist_client63);
        org.junit.Assert.assertNotNull(branch_array72);
        org.junit.Assert.assertNotNull(arraylist_reservation81);
        org.junit.Assert.assertNull(arraylist_client83);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test326");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation16 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car18 = rental0.showCars("hi!");
        rental0.dropoffCar("hi!");
        java.lang.String str23 = rental0.registerClient("hi!", "");
        java.lang.String str27 = rental0.makeReservation("hi!", "", "hi!");
        rentalService.Rental rental28 = new rentalService.Rental();
        rental28.pickupCar("");
        rental28.dropoffCar("");
        rental28.pickupCar("");
        java.lang.String str37 = rental28.registerClient("", "hi!");
        rental28.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car41 = rental28.showCars("");
        rentalService.Rental rental42 = new rentalService.Rental();
        rental42.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car46 = rental42.showCars("");
        rental42.dropoffCar("");
        rentalService.Rental rental49 = new rentalService.Rental();
        rental49.pickupCar("");
        rental49.dropoffCar("");
        rental49.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation57 = rental49.showClientReservations("hi!");
        rental49.cancelReservation("hi!");
        rental49.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car63 = rental49.showCars("");
        rental49.dropoffCar("");
        rentalService.Rental rental66 = new rentalService.Rental();
        rental66.pickupCar("");
        rental66.dropoffCar("");
        rental66.pickupCar("");
        rentalService.Branch branch73 = null;
        rentalService.Branch[] branch_array74 = new rentalService.Branch[] { branch73 };
        rental66.initialise(branch_array74);
        rental49.initialise(branch_array74);
        rental42.initialise(branch_array74);
        rental28.initialise(branch_array74);
        rental0.initialise(branch_array74);
        try {
            java.lang.String str82 = rental0.registerClient("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(arraylist_reservation16);
        org.junit.Assert.assertNull(arraylist_car18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(arraylist_car41);
        org.junit.Assert.assertNull(arraylist_car46);
        org.junit.Assert.assertNotNull(arraylist_reservation57);
        org.junit.Assert.assertNull(arraylist_car63);
        org.junit.Assert.assertNotNull(branch_array74);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test327");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client18 = rental0.showClients("");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation24 = rental0.showClientReservations("");
        rentalService.Branch[] branch_array25 = null;
        rental0.initialise(branch_array25);
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Client> arraylist_client30 = rental0.showClients("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(arraylist_client18);
        org.junit.Assert.assertNotNull(arraylist_reservation24);
        org.junit.Assert.assertNull(arraylist_client30);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test328");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        rentalService.Branch branch11 = null;
        rentalService.Branch[] branch_array12 = new rentalService.Branch[] { branch11 };
        rental0.initialise(branch_array12);
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str20 = rental0.registerClient("", "");
        rental0.pickupCar("hi!");
        java.lang.String str25 = rental0.registerClient("", "");
        rental0.cancelReservation("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(branch_array12);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test329");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.pickupCar("hi!");
        rental0.cancelClientReservation("");
        rental0.pickupCar("");
        rental0.pickupCar("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        org.junit.Assert.assertNotNull(arraylist_reservation6);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test330");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Client> arraylist_client12 = rental0.showClients("hi!");
        rentalService.Rental rental13 = new rentalService.Rental();
        java.lang.String str16 = rental13.registerClient("", "");
        rental13.cancelReservation("hi!");
        rental13.pickupCar("");
        rental13.pickupCar("");
        rentalService.Rental rental23 = new rentalService.Rental();
        rental23.pickupCar("");
        rental23.dropoffCar("");
        rentalService.Rental rental28 = new rentalService.Rental();
        rental28.pickupCar("");
        rental28.dropoffCar("");
        rental28.pickupCar("");
        rentalService.Branch branch35 = null;
        rentalService.Branch[] branch_array36 = new rentalService.Branch[] { branch35 };
        rental28.initialise(branch_array36);
        rental23.initialise(branch_array36);
        rental13.initialise(branch_array36);
        rental0.initialise(branch_array36);
        rental0.cancelReservation("");
        java.lang.String str46 = rental0.makeReservation("hi!", "", "");
        rentalService.Rental rental47 = new rentalService.Rental();
        java.lang.String str50 = rental47.registerClient("", "");
        rental47.cancelReservation("hi!");
        rental47.pickupCar("");
        rental47.pickupCar("");
        rentalService.Rental rental57 = new rentalService.Rental();
        rental57.pickupCar("");
        rental57.dropoffCar("");
        rentalService.Rental rental62 = new rentalService.Rental();
        rental62.pickupCar("");
        rental62.dropoffCar("");
        rental62.pickupCar("");
        rentalService.Branch branch69 = null;
        rentalService.Branch[] branch_array70 = new rentalService.Branch[] { branch69 };
        rental62.initialise(branch_array70);
        rental57.initialise(branch_array70);
        rental47.initialise(branch_array70);
        rental0.initialise(branch_array70);
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNull(arraylist_client12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(branch_array36);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(branch_array70);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test331");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car6 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        rentalService.Rental rental11 = new rentalService.Rental();
        java.lang.String str14 = rental11.registerClient("", "");
        rental11.cancelReservation("hi!");
        rental11.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car20 = rental11.showCars("");
        rentalService.Rental rental21 = new rentalService.Rental();
        rental21.pickupCar("");
        rental21.dropoffCar("");
        rental21.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation29 = rental21.showClientReservations("hi!");
        rental21.cancelReservation("hi!");
        rental21.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car35 = rental21.showCars("");
        rental21.dropoffCar("");
        rentalService.Rental rental38 = new rentalService.Rental();
        rental38.pickupCar("");
        rental38.dropoffCar("");
        rental38.pickupCar("");
        rentalService.Branch branch45 = null;
        rentalService.Branch[] branch_array46 = new rentalService.Branch[] { branch45 };
        rental38.initialise(branch_array46);
        rental21.initialise(branch_array46);
        rental11.initialise(branch_array46);
        rental0.initialise(branch_array46);
        rental0.pickupCar("");
        try {
            java.util.ArrayList<rentalService.Car> arraylist_car54 = rental0.showCars("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(arraylist_car6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(arraylist_car20);
        org.junit.Assert.assertNotNull(arraylist_reservation29);
        org.junit.Assert.assertNull(arraylist_car35);
        org.junit.Assert.assertNotNull(branch_array46);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test332");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str11 = rental0.registerClient("", "hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car13 = rental0.showCars("");
        rental0.cancelClientReservation("");
        rental0.cancelClientReservation("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(arraylist_car13);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test333");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.dropoffCar("");
        rentalService.Rental rental17 = new rentalService.Rental();
        rental17.pickupCar("");
        rental17.dropoffCar("");
        rental17.pickupCar("");
        rentalService.Branch branch24 = null;
        rentalService.Branch[] branch_array25 = new rentalService.Branch[] { branch24 };
        rental17.initialise(branch_array25);
        rental0.initialise(branch_array25);
        rentalService.Rental rental28 = new rentalService.Rental();
        rental28.pickupCar("");
        rental28.dropoffCar("");
        rental28.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation36 = rental28.showClientReservations("hi!");
        rentalService.Branch[] branch_array37 = new rentalService.Branch[] {};
        rental28.initialise(branch_array37);
        rental0.initialise(branch_array37);
        java.util.ArrayList<rentalService.Client> arraylist_client41 = rental0.showClients("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car43 = rental0.showCars("");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(branch_array25);
        org.junit.Assert.assertNotNull(arraylist_reservation36);
        org.junit.Assert.assertNotNull(branch_array37);
        org.junit.Assert.assertNull(arraylist_client41);
        org.junit.Assert.assertNull(arraylist_car43);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test334");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Client> arraylist_client12 = rental0.showClients("hi!");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation20 = rental0.showClientReservations("");
        rental0.pickupCar("");
        rentalService.Rental rental23 = new rentalService.Rental();
        rental23.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car27 = rental23.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation29 = rental23.showClientReservations("hi!");
        rental23.dropoffCar("");
        java.lang.String str35 = rental23.makeReservation("", "", "");
        rental23.pickupCar("");
        rental23.pickupCar("hi!");
        rentalService.Rental rental40 = new rentalService.Rental();
        rental40.pickupCar("");
        rental40.dropoffCar("");
        rental40.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation48 = rental40.showClientReservations("hi!");
        rental40.cancelReservation("hi!");
        rental40.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car54 = rental40.showCars("");
        rental40.dropoffCar("");
        rentalService.Rental rental57 = new rentalService.Rental();
        rental57.pickupCar("");
        rental57.dropoffCar("");
        rental57.pickupCar("");
        rentalService.Branch branch64 = null;
        rentalService.Branch[] branch_array65 = new rentalService.Branch[] { branch64 };
        rental57.initialise(branch_array65);
        rental40.initialise(branch_array65);
        rental23.initialise(branch_array65);
        rental0.initialise(branch_array65);
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNull(arraylist_client12);
        org.junit.Assert.assertNotNull(arraylist_reservation20);
        org.junit.Assert.assertNull(arraylist_car27);
        org.junit.Assert.assertNotNull(arraylist_reservation29);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(arraylist_reservation48);
        org.junit.Assert.assertNull(arraylist_car54);
        org.junit.Assert.assertNotNull(branch_array65);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test335");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str22 = rental0.makeReservation("", "", "");
        java.lang.String str25 = rental0.registerClient("", "");
        rental0.cancelReservation("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation31 = rental0.showClientReservations("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car35 = rental0.showCars("");
        java.util.ArrayList<rentalService.Car> arraylist_car37 = rental0.showCars("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(arraylist_reservation31);
        org.junit.Assert.assertNull(arraylist_car35);
        org.junit.Assert.assertNull(arraylist_car37);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test336");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation16 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car18 = rental0.showCars("hi!");
        rental0.dropoffCar("hi!");
        java.lang.String str23 = rental0.registerClient("hi!", "");
        java.lang.String str27 = rental0.makeReservation("hi!", "", "hi!");
        rentalService.Rental rental28 = new rentalService.Rental();
        rental28.pickupCar("");
        rental28.dropoffCar("");
        rental28.pickupCar("");
        java.lang.String str37 = rental28.registerClient("", "hi!");
        rental28.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car41 = rental28.showCars("");
        rentalService.Rental rental42 = new rentalService.Rental();
        rental42.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car46 = rental42.showCars("");
        rental42.dropoffCar("");
        rentalService.Rental rental49 = new rentalService.Rental();
        rental49.pickupCar("");
        rental49.dropoffCar("");
        rental49.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation57 = rental49.showClientReservations("hi!");
        rental49.cancelReservation("hi!");
        rental49.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car63 = rental49.showCars("");
        rental49.dropoffCar("");
        rentalService.Rental rental66 = new rentalService.Rental();
        rental66.pickupCar("");
        rental66.dropoffCar("");
        rental66.pickupCar("");
        rentalService.Branch branch73 = null;
        rentalService.Branch[] branch_array74 = new rentalService.Branch[] { branch73 };
        rental66.initialise(branch_array74);
        rental49.initialise(branch_array74);
        rental42.initialise(branch_array74);
        rental28.initialise(branch_array74);
        rental0.initialise(branch_array74);
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation83 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation85 = rental0.showClientReservations("");
        rental0.dropoffCar("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(arraylist_reservation16);
        org.junit.Assert.assertNull(arraylist_car18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(arraylist_car41);
        org.junit.Assert.assertNull(arraylist_car46);
        org.junit.Assert.assertNotNull(arraylist_reservation57);
        org.junit.Assert.assertNull(arraylist_car63);
        org.junit.Assert.assertNotNull(branch_array74);
        org.junit.Assert.assertNotNull(arraylist_reservation83);
        org.junit.Assert.assertNotNull(arraylist_reservation85);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test337");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rentalService.Rental rental10 = new rentalService.Rental();
        rental10.pickupCar("");
        rental10.dropoffCar("");
        rentalService.Rental rental15 = new rentalService.Rental();
        rental15.pickupCar("");
        rental15.dropoffCar("");
        rental15.pickupCar("");
        rentalService.Branch branch22 = null;
        rentalService.Branch[] branch_array23 = new rentalService.Branch[] { branch22 };
        rental15.initialise(branch_array23);
        rental10.initialise(branch_array23);
        rental0.initialise(branch_array23);
        rental0.cancelClientReservation("hi!");
        try {
            java.lang.String str32 = rental0.makeReservation("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(branch_array23);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test338");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.dropoffCar("");
        rentalService.Rental rental17 = new rentalService.Rental();
        rental17.pickupCar("");
        rental17.dropoffCar("");
        rental17.pickupCar("");
        rentalService.Branch branch24 = null;
        rentalService.Branch[] branch_array25 = new rentalService.Branch[] { branch24 };
        rental17.initialise(branch_array25);
        rental0.initialise(branch_array25);
        rentalService.Rental rental28 = new rentalService.Rental();
        rental28.pickupCar("");
        rental28.dropoffCar("");
        rental28.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation36 = rental28.showClientReservations("hi!");
        rentalService.Branch[] branch_array37 = new rentalService.Branch[] {};
        rental28.initialise(branch_array37);
        rental0.initialise(branch_array37);
        java.util.ArrayList<rentalService.Client> arraylist_client41 = rental0.showClients("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car43 = rental0.showCars("");
        rental0.cancelReservation("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(branch_array25);
        org.junit.Assert.assertNotNull(arraylist_reservation36);
        org.junit.Assert.assertNotNull(branch_array37);
        org.junit.Assert.assertNull(arraylist_client41);
        org.junit.Assert.assertNull(arraylist_car43);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test339");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.cancelReservation("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation18 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        rental0.cancelClientReservation("");
        rental0.cancelReservation("hi!");
        rental0.dropoffCar("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation18);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test340");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        rentalService.Branch branch11 = null;
        rentalService.Branch[] branch_array12 = new rentalService.Branch[] { branch11 };
        rental0.initialise(branch_array12);
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation23 = rental0.showClientReservations("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(branch_array12);
        org.junit.Assert.assertNotNull(arraylist_reservation23);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test341");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        java.lang.String str18 = rental0.makeReservation("", "", "hi!");
        rentalService.Rental rental19 = new rentalService.Rental();
        rental19.pickupCar("");
        rental19.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car25 = rental19.showCars("");
        rental19.cancelClientReservation("hi!");
        rental19.cancelReservation("");
        java.util.ArrayList<rentalService.Car> arraylist_car31 = rental19.showCars("");
        rentalService.Rental rental32 = new rentalService.Rental();
        rental32.pickupCar("");
        rental32.dropoffCar("");
        rental32.pickupCar("");
        rentalService.Branch branch39 = null;
        rentalService.Branch[] branch_array40 = new rentalService.Branch[] { branch39 };
        rental32.initialise(branch_array40);
        rental32.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation45 = rental32.showClientReservations("hi!");
        rentalService.Rental rental46 = new rentalService.Rental();
        java.lang.String str49 = rental46.registerClient("", "");
        rental46.cancelReservation("hi!");
        rental46.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car55 = rental46.showCars("");
        rentalService.Rental rental56 = new rentalService.Rental();
        rental56.pickupCar("");
        rental56.dropoffCar("");
        rental56.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation64 = rental56.showClientReservations("hi!");
        rental56.cancelReservation("hi!");
        rental56.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car70 = rental56.showCars("");
        rental56.dropoffCar("");
        rentalService.Rental rental73 = new rentalService.Rental();
        rental73.pickupCar("");
        rental73.dropoffCar("");
        rental73.pickupCar("");
        rentalService.Branch branch80 = null;
        rentalService.Branch[] branch_array81 = new rentalService.Branch[] { branch80 };
        rental73.initialise(branch_array81);
        rental56.initialise(branch_array81);
        rental46.initialise(branch_array81);
        rental32.initialise(branch_array81);
        rental19.initialise(branch_array81);
        rental0.initialise(branch_array81);
        rental0.cancelReservation("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(arraylist_car25);
        org.junit.Assert.assertNull(arraylist_car31);
        org.junit.Assert.assertNotNull(branch_array40);
        org.junit.Assert.assertNotNull(arraylist_reservation45);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(arraylist_car55);
        org.junit.Assert.assertNotNull(arraylist_reservation64);
        org.junit.Assert.assertNull(arraylist_car70);
        org.junit.Assert.assertNotNull(branch_array81);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test342");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car6 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation14 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car16 = rental0.showCars("");
        rental0.cancelReservation("hi!");
        rentalService.Rental rental19 = new rentalService.Rental();
        rental19.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car23 = rental19.showCars("");
        rental19.dropoffCar("hi!");
        rental19.dropoffCar("");
        rental19.cancelReservation("hi!");
        rental19.cancelReservation("");
        rental19.cancelReservation("");
        rental19.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation37 = rental19.showClientReservations("hi!");
        rental19.pickupCar("");
        rental19.cancelReservation("hi!");
        java.lang.String str44 = rental19.registerClient("", "");
        rentalService.Rental rental45 = new rentalService.Rental();
        java.lang.String str48 = rental45.registerClient("", "");
        rental45.cancelReservation("hi!");
        rental45.pickupCar("");
        rental45.pickupCar("");
        rentalService.Rental rental55 = new rentalService.Rental();
        rental55.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car59 = rental55.showCars("");
        rental55.dropoffCar("hi!");
        rental55.dropoffCar("");
        rental55.dropoffCar("hi!");
        rentalService.Branch branch66 = null;
        rentalService.Branch[] branch_array67 = new rentalService.Branch[] { branch66 };
        rental55.initialise(branch_array67);
        rental45.initialise(branch_array67);
        rental19.initialise(branch_array67);
        rental0.initialise(branch_array67);
        try {
            java.util.ArrayList<rentalService.Car> arraylist_car73 = rental0.showCars("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(arraylist_car6);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNotNull(arraylist_reservation14);
        org.junit.Assert.assertNull(arraylist_car16);
        org.junit.Assert.assertNull(arraylist_car23);
        org.junit.Assert.assertNotNull(arraylist_reservation37);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(arraylist_car59);
        org.junit.Assert.assertNotNull(branch_array67);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test343");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client18 = rental0.showClients("");
        rental0.cancelReservation("");
        rental0.dropoffCar("hi!");
        java.lang.String str25 = rental0.registerClient("", "");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_client18);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test344");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("hi!");
        rentalService.Rental rental11 = new rentalService.Rental();
        rental11.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car15 = rental11.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation17 = rental11.showClientReservations("hi!");
        rental11.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client21 = rental11.showClients("");
        rentalService.Rental rental22 = new rentalService.Rental();
        java.lang.String str25 = rental22.registerClient("", "");
        rental22.cancelReservation("hi!");
        rental22.pickupCar("");
        rental22.pickupCar("");
        rentalService.Rental rental32 = new rentalService.Rental();
        rental32.pickupCar("");
        rental32.dropoffCar("");
        rentalService.Rental rental37 = new rentalService.Rental();
        rental37.pickupCar("");
        rental37.dropoffCar("");
        rental37.pickupCar("");
        rentalService.Branch branch44 = null;
        rentalService.Branch[] branch_array45 = new rentalService.Branch[] { branch44 };
        rental37.initialise(branch_array45);
        rental32.initialise(branch_array45);
        rental22.initialise(branch_array45);
        rental22.cancelClientReservation("hi!");
        rental22.dropoffCar("");
        rentalService.Rental rental53 = new rentalService.Rental();
        rental53.pickupCar("");
        rental53.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car59 = rental53.showCars("");
        rental53.cancelClientReservation("hi!");
        rental53.dropoffCar("hi!");
        rentalService.Rental rental64 = new rentalService.Rental();
        rental64.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car68 = rental64.showCars("");
        rentalService.Branch[] branch_array69 = null;
        rental64.initialise(branch_array69);
        rental64.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client74 = rental64.showClients("");
        rentalService.Rental rental75 = new rentalService.Rental();
        rental75.pickupCar("");
        rental75.dropoffCar("");
        rental75.pickupCar("");
        rentalService.Branch branch82 = null;
        rentalService.Branch[] branch_array83 = new rentalService.Branch[] { branch82 };
        rental75.initialise(branch_array83);
        rental64.initialise(branch_array83);
        rental53.initialise(branch_array83);
        rental22.initialise(branch_array83);
        rental11.initialise(branch_array83);
        rental0.initialise(branch_array83);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation91 = rental0.showClientReservations("");
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(arraylist_car15);
        org.junit.Assert.assertNotNull(arraylist_reservation17);
        org.junit.Assert.assertNull(arraylist_client21);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(branch_array45);
        org.junit.Assert.assertNull(arraylist_car59);
        org.junit.Assert.assertNull(arraylist_car68);
        org.junit.Assert.assertNull(arraylist_client74);
        org.junit.Assert.assertNotNull(branch_array83);
        org.junit.Assert.assertNotNull(arraylist_reservation91);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test345");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client18 = rental0.showClients("");
        java.util.ArrayList<rentalService.Client> arraylist_client20 = rental0.showClients("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_client18);
        org.junit.Assert.assertNull(arraylist_client20);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test346");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("");
        rental0.cancelReservation("");
        rental0.dropoffCar("");
        java.lang.String str23 = rental0.makeReservation("hi!", "", "");
        rental0.cancelClientReservation("");
        rental0.cancelClientReservation("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car31 = rental0.showCars("");
        java.lang.String str34 = rental0.registerClient("", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(arraylist_car31);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test347");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation11 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("hi!");
        java.lang.String str17 = rental0.makeReservation("hi!", "", "");
        rental0.cancelClientReservation("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNotNull(arraylist_reservation9);
        org.junit.Assert.assertNotNull(arraylist_reservation11);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test348");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rentalService.Rental rental15 = new rentalService.Rental();
        rental15.pickupCar("");
        rental15.dropoffCar("");
        rental15.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation23 = rental15.showClientReservations("hi!");
        rental15.cancelReservation("hi!");
        rental15.cancelClientReservation("hi!");
        rental15.pickupCar("");
        rental15.dropoffCar("hi!");
        rentalService.Rental rental32 = new rentalService.Rental();
        rental32.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car36 = rental32.showCars("");
        rental32.dropoffCar("hi!");
        rental32.dropoffCar("");
        rental32.cancelReservation("hi!");
        java.lang.String str45 = rental32.registerClient("", "hi!");
        rental32.cancelClientReservation("");
        java.util.ArrayList<rentalService.Client> arraylist_client49 = rental32.showClients("");
        rentalService.Rental rental50 = new rentalService.Rental();
        java.lang.String str53 = rental50.registerClient("", "");
        rental50.cancelReservation("hi!");
        rental50.pickupCar("");
        rental50.pickupCar("");
        rentalService.Rental rental60 = new rentalService.Rental();
        rental60.pickupCar("");
        rental60.dropoffCar("");
        rentalService.Rental rental65 = new rentalService.Rental();
        rental65.pickupCar("");
        rental65.dropoffCar("");
        rental65.pickupCar("");
        rentalService.Branch branch72 = null;
        rentalService.Branch[] branch_array73 = new rentalService.Branch[] { branch72 };
        rental65.initialise(branch_array73);
        rental60.initialise(branch_array73);
        rental50.initialise(branch_array73);
        rental32.initialise(branch_array73);
        rental15.initialise(branch_array73);
        rental0.initialise(branch_array73);
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car83 = rental0.showCars("");
        java.lang.String str86 = rental0.registerClient("", "");
        try {
            java.lang.String str89 = rental0.registerClient("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(arraylist_reservation23);
        org.junit.Assert.assertNull(arraylist_car36);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(arraylist_client49);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(branch_array73);
        org.junit.Assert.assertNull(arraylist_car83);
        org.junit.Assert.assertNull(str86);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test349");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation10 = rental0.showClientReservations("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client16 = rental0.showClients("");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation20 = rental0.showClientReservations("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNotNull(arraylist_reservation10);
        org.junit.Assert.assertNull(arraylist_client16);
        org.junit.Assert.assertNotNull(arraylist_reservation20);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test350");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client18 = rental0.showClients("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation20 = rental0.showClientReservations("hi!");
        rentalService.Rental rental21 = new rentalService.Rental();
        rental21.pickupCar("");
        rental21.dropoffCar("");
        rental21.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation29 = rental21.showClientReservations("hi!");
        rental21.cancelReservation("hi!");
        rental21.cancelClientReservation("hi!");
        rental21.pickupCar("hi!");
        rental21.pickupCar("hi!");
        rentalService.Rental rental38 = new rentalService.Rental();
        rental38.pickupCar("");
        rental38.dropoffCar("");
        rental38.pickupCar("");
        rentalService.Branch branch45 = null;
        rentalService.Branch[] branch_array46 = new rentalService.Branch[] { branch45 };
        rental38.initialise(branch_array46);
        rental21.initialise(branch_array46);
        rental0.initialise(branch_array46);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation51 = rental0.showClientReservations("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_client18);
        org.junit.Assert.assertNotNull(arraylist_reservation20);
        org.junit.Assert.assertNotNull(arraylist_reservation29);
        org.junit.Assert.assertNotNull(branch_array46);
        org.junit.Assert.assertNotNull(arraylist_reservation51);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test351");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        rental0.cancelReservation("");
        java.lang.String str17 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation19 = rental0.showClientReservations("");
        rental0.pickupCar("");
        rental0.cancelClientReservation("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(arraylist_reservation19);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test352");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation10 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        rental0.cancelClientReservation("hi!");
        rentalService.Rental rental15 = new rentalService.Rental();
        rental15.pickupCar("");
        rental15.dropoffCar("");
        rental15.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation23 = rental15.showClientReservations("hi!");
        rentalService.Branch[] branch_array24 = new rentalService.Branch[] {};
        rental15.initialise(branch_array24);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation27 = rental15.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car29 = rental15.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation31 = rental15.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car33 = rental15.showCars("hi!");
        rental15.dropoffCar("hi!");
        java.lang.String str38 = rental15.registerClient("hi!", "");
        java.lang.String str42 = rental15.makeReservation("hi!", "", "hi!");
        rentalService.Rental rental43 = new rentalService.Rental();
        rental43.pickupCar("");
        rental43.dropoffCar("");
        rental43.pickupCar("");
        java.lang.String str52 = rental43.registerClient("", "hi!");
        rental43.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car56 = rental43.showCars("");
        rentalService.Rental rental57 = new rentalService.Rental();
        rental57.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car61 = rental57.showCars("");
        rental57.dropoffCar("");
        rentalService.Rental rental64 = new rentalService.Rental();
        rental64.pickupCar("");
        rental64.dropoffCar("");
        rental64.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation72 = rental64.showClientReservations("hi!");
        rental64.cancelReservation("hi!");
        rental64.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car78 = rental64.showCars("");
        rental64.dropoffCar("");
        rentalService.Rental rental81 = new rentalService.Rental();
        rental81.pickupCar("");
        rental81.dropoffCar("");
        rental81.pickupCar("");
        rentalService.Branch branch88 = null;
        rentalService.Branch[] branch_array89 = new rentalService.Branch[] { branch88 };
        rental81.initialise(branch_array89);
        rental64.initialise(branch_array89);
        rental57.initialise(branch_array89);
        rental43.initialise(branch_array89);
        rental15.initialise(branch_array89);
        rental0.initialise(branch_array89);
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNotNull(arraylist_reservation10);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNotNull(arraylist_reservation23);
        org.junit.Assert.assertNotNull(branch_array24);
        org.junit.Assert.assertNotNull(arraylist_reservation27);
        org.junit.Assert.assertNull(arraylist_car29);
        org.junit.Assert.assertNotNull(arraylist_reservation31);
        org.junit.Assert.assertNull(arraylist_car33);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(arraylist_car56);
        org.junit.Assert.assertNull(arraylist_car61);
        org.junit.Assert.assertNotNull(arraylist_reservation72);
        org.junit.Assert.assertNull(arraylist_car78);
        org.junit.Assert.assertNotNull(branch_array89);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test353");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.cancelReservation("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation18 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation20 = rental0.showClientReservations("");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("hi!");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client28 = rental0.showClients("");
        rental0.dropoffCar("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation18);
        org.junit.Assert.assertNotNull(arraylist_reservation20);
        org.junit.Assert.assertNull(arraylist_client28);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test354");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.lang.String str7 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Client> arraylist_client11 = rental0.showClients("");
        java.util.ArrayList<rentalService.Client> arraylist_client13 = rental0.showClients("");
        rentalService.Rental rental14 = new rentalService.Rental();
        rental14.pickupCar("");
        rental14.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation20 = rental14.showClientReservations("hi!");
        rental14.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client24 = rental14.showClients("");
        java.lang.String str27 = rental14.registerClient("", "hi!");
        java.lang.String str30 = rental14.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation32 = rental14.showClientReservations("");
        rentalService.Rental rental33 = new rentalService.Rental();
        rental33.pickupCar("");
        rental33.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car39 = rental33.showCars("");
        rental33.cancelClientReservation("hi!");
        rental33.cancelReservation("");
        rental33.cancelReservation("hi!");
        rentalService.Rental rental46 = new rentalService.Rental();
        rental46.pickupCar("");
        rental46.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car52 = rental46.showCars("");
        rental46.cancelClientReservation("hi!");
        rental46.cancelReservation("");
        rentalService.Rental rental57 = new rentalService.Rental();
        java.lang.String str60 = rental57.registerClient("", "");
        rental57.cancelReservation("hi!");
        rental57.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car66 = rental57.showCars("");
        rentalService.Rental rental67 = new rentalService.Rental();
        rental67.pickupCar("");
        rental67.dropoffCar("");
        rental67.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation75 = rental67.showClientReservations("hi!");
        rental67.cancelReservation("hi!");
        rental67.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car81 = rental67.showCars("");
        rental67.dropoffCar("");
        rentalService.Rental rental84 = new rentalService.Rental();
        rental84.pickupCar("");
        rental84.dropoffCar("");
        rental84.pickupCar("");
        rentalService.Branch branch91 = null;
        rentalService.Branch[] branch_array92 = new rentalService.Branch[] { branch91 };
        rental84.initialise(branch_array92);
        rental67.initialise(branch_array92);
        rental57.initialise(branch_array92);
        rental46.initialise(branch_array92);
        rental33.initialise(branch_array92);
        rental14.initialise(branch_array92);
        rental0.initialise(branch_array92);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(arraylist_reservation9);
        org.junit.Assert.assertNull(arraylist_client11);
        org.junit.Assert.assertNull(arraylist_client13);
        org.junit.Assert.assertNotNull(arraylist_reservation20);
        org.junit.Assert.assertNull(arraylist_client24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(arraylist_reservation32);
        org.junit.Assert.assertNull(arraylist_car39);
        org.junit.Assert.assertNull(arraylist_car52);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNull(arraylist_car66);
        org.junit.Assert.assertNotNull(arraylist_reservation75);
        org.junit.Assert.assertNull(arraylist_car81);
        org.junit.Assert.assertNotNull(branch_array92);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test355");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.cancelClientReservation("");
        rental0.cancelClientReservation("hi!");
        java.lang.String str22 = rental0.registerClient("", "");
        rental0.dropoffCar("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test356");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str10 = rental0.makeReservation("", "", "");
        java.lang.String str14 = rental0.makeReservation("hi!", "", "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test357");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("");
        rental0.cancelReservation("hi!");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rentalService.Rental rental15 = new rentalService.Rental();
        rental15.pickupCar("");
        rental15.dropoffCar("");
        rental15.pickupCar("");
        java.lang.String str24 = rental15.registerClient("", "hi!");
        rental15.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car28 = rental15.showCars("");
        rentalService.Rental rental29 = new rentalService.Rental();
        rental29.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car33 = rental29.showCars("");
        rental29.dropoffCar("");
        rentalService.Rental rental36 = new rentalService.Rental();
        rental36.pickupCar("");
        rental36.dropoffCar("");
        rental36.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation44 = rental36.showClientReservations("hi!");
        rental36.cancelReservation("hi!");
        rental36.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car50 = rental36.showCars("");
        rental36.dropoffCar("");
        rentalService.Rental rental53 = new rentalService.Rental();
        rental53.pickupCar("");
        rental53.dropoffCar("");
        rental53.pickupCar("");
        rentalService.Branch branch60 = null;
        rentalService.Branch[] branch_array61 = new rentalService.Branch[] { branch60 };
        rental53.initialise(branch_array61);
        rental36.initialise(branch_array61);
        rental29.initialise(branch_array61);
        rental15.initialise(branch_array61);
        rental0.initialise(branch_array61);
        rental0.dropoffCar("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(arraylist_car28);
        org.junit.Assert.assertNull(arraylist_car33);
        org.junit.Assert.assertNotNull(arraylist_reservation44);
        org.junit.Assert.assertNull(arraylist_car50);
        org.junit.Assert.assertNotNull(branch_array61);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test358");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.lang.String str9 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        rentalService.Branch[] branch_array14 = null;
        rental0.initialise(branch_array14);
        rentalService.Rental rental16 = new rentalService.Rental();
        java.lang.String str19 = rental16.registerClient("", "");
        rental16.cancelReservation("hi!");
        rental16.pickupCar("");
        rental16.pickupCar("");
        rentalService.Rental rental26 = new rentalService.Rental();
        rental26.pickupCar("");
        rental26.dropoffCar("");
        rentalService.Rental rental31 = new rentalService.Rental();
        rental31.pickupCar("");
        rental31.dropoffCar("");
        rental31.pickupCar("");
        rentalService.Branch branch38 = null;
        rentalService.Branch[] branch_array39 = new rentalService.Branch[] { branch38 };
        rental31.initialise(branch_array39);
        rental26.initialise(branch_array39);
        rental16.initialise(branch_array39);
        rental0.initialise(branch_array39);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation45 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation47 = rental0.showClientReservations("hi!");
        try {
            java.lang.String str51 = rental0.makeReservation("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(branch_array39);
        org.junit.Assert.assertNotNull(arraylist_reservation45);
        org.junit.Assert.assertNotNull(arraylist_reservation47);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test359");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.lang.String str9 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car13 = rental0.showCars("");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation17 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation19 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation21 = rental0.showClientReservations("");
        rental0.cancelClientReservation("");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(arraylist_car13);
        org.junit.Assert.assertNotNull(arraylist_reservation17);
        org.junit.Assert.assertNotNull(arraylist_reservation19);
        org.junit.Assert.assertNotNull(arraylist_reservation21);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test360");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.pickupCar("");
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test361");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        java.lang.String str14 = rental0.makeReservation("", "", "");
        rentalService.Rental rental15 = new rentalService.Rental();
        rental15.pickupCar("");
        rental15.dropoffCar("");
        rental15.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation23 = rental15.showClientReservations("hi!");
        rentalService.Branch[] branch_array24 = new rentalService.Branch[] {};
        rental15.initialise(branch_array24);
        java.util.ArrayList<rentalService.Client> arraylist_client27 = rental15.showClients("hi!");
        rental15.dropoffCar("hi!");
        rental15.cancelReservation("hi!");
        rentalService.Rental rental32 = new rentalService.Rental();
        rental32.pickupCar("");
        rental32.dropoffCar("");
        rental32.pickupCar("");
        rentalService.Branch branch39 = null;
        rentalService.Branch[] branch_array40 = new rentalService.Branch[] { branch39 };
        rental32.initialise(branch_array40);
        rental15.initialise(branch_array40);
        rental0.initialise(branch_array40);
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(arraylist_reservation23);
        org.junit.Assert.assertNotNull(branch_array24);
        org.junit.Assert.assertNull(arraylist_client27);
        org.junit.Assert.assertNotNull(branch_array40);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test362");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("hi!");
        rental0.pickupCar("hi!");
        rentalService.Rental rental17 = new rentalService.Rental();
        rental17.pickupCar("");
        rental17.dropoffCar("");
        rental17.pickupCar("");
        rentalService.Branch branch24 = null;
        rentalService.Branch[] branch_array25 = new rentalService.Branch[] { branch24 };
        rental17.initialise(branch_array25);
        rental0.initialise(branch_array25);
        rental0.cancelReservation("");
        rental0.pickupCar("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array25);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test363");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str12 = rental0.makeReservation("", "", "");
        rentalService.Branch[] branch_array13 = null;
        rental0.initialise(branch_array13);
        java.util.ArrayList<rentalService.Client> arraylist_client16 = rental0.showClients("");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(arraylist_client16);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test364");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str12 = rental0.makeReservation("", "", "");
        rentalService.Branch[] branch_array13 = null;
        rental0.initialise(branch_array13);
        java.util.ArrayList<rentalService.Client> arraylist_client16 = rental0.showClients("");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("hi!");
        rental0.cancelReservation("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(arraylist_client16);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test365");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("");
        rentalService.Rental rental9 = new rentalService.Rental();
        java.lang.String str12 = rental9.registerClient("", "");
        rental9.cancelReservation("hi!");
        rental9.pickupCar("");
        rental9.pickupCar("");
        rentalService.Rental rental19 = new rentalService.Rental();
        rental19.pickupCar("");
        rental19.dropoffCar("");
        rentalService.Rental rental24 = new rentalService.Rental();
        rental24.pickupCar("");
        rental24.dropoffCar("");
        rental24.pickupCar("");
        rentalService.Branch branch31 = null;
        rentalService.Branch[] branch_array32 = new rentalService.Branch[] { branch31 };
        rental24.initialise(branch_array32);
        rental19.initialise(branch_array32);
        rental9.initialise(branch_array32);
        rental0.initialise(branch_array32);
        try {
            java.lang.String str39 = rental0.registerClient("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(branch_array32);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test366");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.cancelClientReservation("");
        rental0.dropoffCar("");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("");
        rental0.cancelReservation("");
        rental0.cancelReservation("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test367");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Client> arraylist_client12 = rental0.showClients("hi!");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation20 = rental0.showClientReservations("");
        rental0.cancelReservation("");
        rental0.cancelClientReservation("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNull(arraylist_client12);
        org.junit.Assert.assertNotNull(arraylist_reservation20);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test368");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.dropoffCar("");
        rentalService.Rental rental17 = new rentalService.Rental();
        rental17.pickupCar("");
        rental17.dropoffCar("");
        rental17.pickupCar("");
        rentalService.Branch branch24 = null;
        rentalService.Branch[] branch_array25 = new rentalService.Branch[] { branch24 };
        rental17.initialise(branch_array25);
        rental0.initialise(branch_array25);
        rentalService.Rental rental28 = new rentalService.Rental();
        rental28.pickupCar("");
        rental28.dropoffCar("");
        rental28.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation36 = rental28.showClientReservations("hi!");
        rentalService.Branch[] branch_array37 = new rentalService.Branch[] {};
        rental28.initialise(branch_array37);
        rental0.initialise(branch_array37);
        java.util.ArrayList<rentalService.Client> arraylist_client41 = rental0.showClients("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation43 = rental0.showClientReservations("");
        java.lang.String str46 = rental0.registerClient("hi!", "");
        java.lang.String str50 = rental0.makeReservation("", "hi!", "hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(branch_array25);
        org.junit.Assert.assertNotNull(arraylist_reservation36);
        org.junit.Assert.assertNotNull(branch_array37);
        org.junit.Assert.assertNull(arraylist_client41);
        org.junit.Assert.assertNotNull(arraylist_reservation43);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test369");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelClientReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation16 = rental0.showClientReservations("");
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNotNull(arraylist_reservation16);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test370");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car6 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        rental0.cancelReservation("hi!");
        rentalService.Rental rental13 = new rentalService.Rental();
        rental13.pickupCar("");
        rental13.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car19 = rental13.showCars("");
        rental13.cancelClientReservation("hi!");
        rental13.cancelReservation("");
        rentalService.Rental rental24 = new rentalService.Rental();
        java.lang.String str27 = rental24.registerClient("", "");
        rental24.cancelReservation("hi!");
        rental24.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car33 = rental24.showCars("");
        rentalService.Rental rental34 = new rentalService.Rental();
        rental34.pickupCar("");
        rental34.dropoffCar("");
        rental34.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation42 = rental34.showClientReservations("hi!");
        rental34.cancelReservation("hi!");
        rental34.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car48 = rental34.showCars("");
        rental34.dropoffCar("");
        rentalService.Rental rental51 = new rentalService.Rental();
        rental51.pickupCar("");
        rental51.dropoffCar("");
        rental51.pickupCar("");
        rentalService.Branch branch58 = null;
        rentalService.Branch[] branch_array59 = new rentalService.Branch[] { branch58 };
        rental51.initialise(branch_array59);
        rental34.initialise(branch_array59);
        rental24.initialise(branch_array59);
        rental13.initialise(branch_array59);
        rental0.initialise(branch_array59);
        java.lang.String str67 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation69 = rental0.showClientReservations("");
        org.junit.Assert.assertNull(arraylist_car6);
        org.junit.Assert.assertNull(arraylist_car19);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(arraylist_car33);
        org.junit.Assert.assertNotNull(arraylist_reservation42);
        org.junit.Assert.assertNull(arraylist_car48);
        org.junit.Assert.assertNotNull(branch_array59);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(arraylist_reservation69);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test371");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rentalService.Rental rental16 = new rentalService.Rental();
        java.lang.String str19 = rental16.registerClient("", "");
        rental16.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation23 = rental16.showClientReservations("hi!");
        java.lang.String str27 = rental16.makeReservation("hi!", "", "");
        rental16.cancelReservation("");
        rentalService.Rental rental30 = new rentalService.Rental();
        java.lang.String str33 = rental30.registerClient("", "");
        rental30.cancelReservation("hi!");
        rental30.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car39 = rental30.showCars("");
        rentalService.Rental rental40 = new rentalService.Rental();
        rental40.pickupCar("");
        rental40.dropoffCar("");
        rental40.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation48 = rental40.showClientReservations("hi!");
        rental40.cancelReservation("hi!");
        rental40.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car54 = rental40.showCars("");
        rental40.dropoffCar("");
        rentalService.Rental rental57 = new rentalService.Rental();
        rental57.pickupCar("");
        rental57.dropoffCar("");
        rental57.pickupCar("");
        rentalService.Branch branch64 = null;
        rentalService.Branch[] branch_array65 = new rentalService.Branch[] { branch64 };
        rental57.initialise(branch_array65);
        rental40.initialise(branch_array65);
        rental30.initialise(branch_array65);
        rental16.initialise(branch_array65);
        rental0.initialise(branch_array65);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation72 = rental0.showClientReservations("");
        java.lang.String str75 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("");
        rental0.cancelReservation("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(arraylist_reservation23);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(arraylist_car39);
        org.junit.Assert.assertNotNull(arraylist_reservation48);
        org.junit.Assert.assertNull(arraylist_car54);
        org.junit.Assert.assertNotNull(branch_array65);
        org.junit.Assert.assertNotNull(arraylist_reservation72);
        org.junit.Assert.assertNull(str75);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test372");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car6 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        rental0.dropoffCar("hi!");
        rentalService.Rental rental11 = new rentalService.Rental();
        rental11.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car15 = rental11.showCars("");
        rentalService.Branch[] branch_array16 = null;
        rental11.initialise(branch_array16);
        rental11.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client21 = rental11.showClients("");
        rentalService.Rental rental22 = new rentalService.Rental();
        rental22.pickupCar("");
        rental22.dropoffCar("");
        rental22.pickupCar("");
        rentalService.Branch branch29 = null;
        rentalService.Branch[] branch_array30 = new rentalService.Branch[] { branch29 };
        rental22.initialise(branch_array30);
        rental11.initialise(branch_array30);
        rental0.initialise(branch_array30);
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("hi!");
        java.lang.String str40 = rental0.registerClient("", "");
        org.junit.Assert.assertNull(arraylist_car6);
        org.junit.Assert.assertNull(arraylist_car15);
        org.junit.Assert.assertNull(arraylist_client21);
        org.junit.Assert.assertNotNull(branch_array30);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test373");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.dropoffCar("");
        rentalService.Rental rental17 = new rentalService.Rental();
        rental17.pickupCar("");
        rental17.dropoffCar("");
        rental17.pickupCar("");
        rentalService.Branch branch24 = null;
        rentalService.Branch[] branch_array25 = new rentalService.Branch[] { branch24 };
        rental17.initialise(branch_array25);
        rental0.initialise(branch_array25);
        rental0.cancelClientReservation("");
        rental0.cancelClientReservation("");
        java.util.ArrayList<rentalService.Client> arraylist_client33 = rental0.showClients("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation35 = rental0.showClientReservations("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(branch_array25);
        org.junit.Assert.assertNull(arraylist_client33);
        org.junit.Assert.assertNotNull(arraylist_reservation35);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test374");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car6 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation14 = rental0.showClientReservations("");
        rentalService.Rental rental15 = new rentalService.Rental();
        rental15.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car19 = rental15.showCars("");
        rental15.dropoffCar("");
        rentalService.Rental rental22 = new rentalService.Rental();
        rental22.pickupCar("");
        rental22.dropoffCar("");
        rental22.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation30 = rental22.showClientReservations("hi!");
        rental22.cancelReservation("hi!");
        rental22.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car36 = rental22.showCars("");
        rental22.dropoffCar("");
        rentalService.Rental rental39 = new rentalService.Rental();
        rental39.pickupCar("");
        rental39.dropoffCar("");
        rental39.pickupCar("");
        rentalService.Branch branch46 = null;
        rentalService.Branch[] branch_array47 = new rentalService.Branch[] { branch46 };
        rental39.initialise(branch_array47);
        rental22.initialise(branch_array47);
        rental15.initialise(branch_array47);
        rental0.initialise(branch_array47);
        rental0.cancelReservation("");
        org.junit.Assert.assertNull(arraylist_car6);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNotNull(arraylist_reservation14);
        org.junit.Assert.assertNull(arraylist_car19);
        org.junit.Assert.assertNotNull(arraylist_reservation30);
        org.junit.Assert.assertNull(arraylist_car36);
        org.junit.Assert.assertNotNull(branch_array47);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test375");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        rentalService.Branch branch7 = null;
        rentalService.Branch[] branch_array8 = new rentalService.Branch[] { branch7 };
        rental0.initialise(branch_array8);
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("hi!");
        java.lang.String str17 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Client> arraylist_client19 = rental0.showClients("");
        rental0.cancelClientReservation("hi!");
        org.junit.Assert.assertNotNull(branch_array8);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(arraylist_client19);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test376");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        java.lang.String str14 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation16 = rental0.showClientReservations("hi!");
        rental0.pickupCar("");
        rental0.cancelReservation("hi!");
        rental0.dropoffCar("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(arraylist_reservation16);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test377");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("");
        java.lang.String str14 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation16 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation18 = rental0.showClientReservations("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client22 = rental0.showClients("");
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(arraylist_client10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(arraylist_reservation16);
        org.junit.Assert.assertNotNull(arraylist_reservation18);
        org.junit.Assert.assertNull(arraylist_client22);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test378");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.pickupCar("");
        rental0.cancelReservation("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test379");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation5 = rental0.showClientReservations("");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Client> arraylist_client9 = rental0.showClients("");
        rental0.cancelClientReservation("");
        rental0.dropoffCar("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation5);
        org.junit.Assert.assertNull(arraylist_client9);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test380");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        java.lang.String str20 = rental0.makeReservation("", "", "");
        rental0.pickupCar("");
        rental0.cancelClientReservation("");
        java.util.ArrayList<rentalService.Client> arraylist_client26 = rental0.showClients("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(arraylist_client26);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test381");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation20 = rental0.showClientReservations("hi!");
        rentalService.Rental rental21 = new rentalService.Rental();
        rental21.pickupCar("");
        rental21.dropoffCar("");
        rental21.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation29 = rental21.showClientReservations("hi!");
        rental21.cancelReservation("hi!");
        rental21.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car35 = rental21.showCars("");
        rental21.pickupCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client39 = rental21.showClients("");
        rental21.dropoffCar("hi!");
        rental21.cancelClientReservation("hi!");
        rentalService.Rental rental44 = new rentalService.Rental();
        rental44.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car48 = rental44.showCars("");
        rental44.dropoffCar("hi!");
        rental44.dropoffCar("");
        rental44.dropoffCar("hi!");
        rentalService.Branch branch55 = null;
        rentalService.Branch[] branch_array56 = new rentalService.Branch[] { branch55 };
        rental44.initialise(branch_array56);
        rentalService.Rental rental58 = new rentalService.Rental();
        rental58.pickupCar("");
        rental58.dropoffCar("");
        rentalService.Rental rental63 = new rentalService.Rental();
        rental63.pickupCar("");
        rental63.dropoffCar("");
        rental63.pickupCar("");
        rentalService.Branch branch70 = null;
        rentalService.Branch[] branch_array71 = new rentalService.Branch[] { branch70 };
        rental63.initialise(branch_array71);
        rental58.initialise(branch_array71);
        rental44.initialise(branch_array71);
        rental21.initialise(branch_array71);
        rental0.initialise(branch_array71);
        java.lang.String str80 = rental0.makeReservation("", "", "");
        rental0.cancelClientReservation("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(arraylist_reservation20);
        org.junit.Assert.assertNotNull(arraylist_reservation29);
        org.junit.Assert.assertNull(arraylist_car35);
        org.junit.Assert.assertNull(arraylist_client39);
        org.junit.Assert.assertNull(arraylist_car48);
        org.junit.Assert.assertNotNull(branch_array56);
        org.junit.Assert.assertNotNull(branch_array71);
        org.junit.Assert.assertNull(str80);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test382");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        java.lang.String str20 = rental0.makeReservation("", "", "");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car24 = rental0.showCars("");
        rental0.cancelReservation("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(arraylist_car24);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test383");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.lang.String str9 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car13 = rental0.showCars("");
        rentalService.Rental rental14 = new rentalService.Rental();
        rental14.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car18 = rental14.showCars("");
        rental14.dropoffCar("");
        rentalService.Rental rental21 = new rentalService.Rental();
        rental21.pickupCar("");
        rental21.dropoffCar("");
        rental21.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation29 = rental21.showClientReservations("hi!");
        rental21.cancelReservation("hi!");
        rental21.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car35 = rental21.showCars("");
        rental21.dropoffCar("");
        rentalService.Rental rental38 = new rentalService.Rental();
        rental38.pickupCar("");
        rental38.dropoffCar("");
        rental38.pickupCar("");
        rentalService.Branch branch45 = null;
        rentalService.Branch[] branch_array46 = new rentalService.Branch[] { branch45 };
        rental38.initialise(branch_array46);
        rental21.initialise(branch_array46);
        rental14.initialise(branch_array46);
        rental0.initialise(branch_array46);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation52 = rental0.showClientReservations("hi!");
        try {
            java.lang.String str55 = rental0.registerClient("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(arraylist_car13);
        org.junit.Assert.assertNull(arraylist_car18);
        org.junit.Assert.assertNotNull(arraylist_reservation29);
        org.junit.Assert.assertNull(arraylist_car35);
        org.junit.Assert.assertNotNull(branch_array46);
        org.junit.Assert.assertNotNull(arraylist_reservation52);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test384");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Client> arraylist_client12 = rental0.showClients("hi!");
        rentalService.Rental rental13 = new rentalService.Rental();
        java.lang.String str16 = rental13.registerClient("", "");
        rental13.cancelReservation("hi!");
        rental13.pickupCar("");
        rental13.pickupCar("");
        rentalService.Rental rental23 = new rentalService.Rental();
        rental23.pickupCar("");
        rental23.dropoffCar("");
        rentalService.Rental rental28 = new rentalService.Rental();
        rental28.pickupCar("");
        rental28.dropoffCar("");
        rental28.pickupCar("");
        rentalService.Branch branch35 = null;
        rentalService.Branch[] branch_array36 = new rentalService.Branch[] { branch35 };
        rental28.initialise(branch_array36);
        rental23.initialise(branch_array36);
        rental13.initialise(branch_array36);
        rental0.initialise(branch_array36);
        rental0.cancelReservation("");
        rental0.cancelClientReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation46 = rental0.showClientReservations("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNull(arraylist_client12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(branch_array36);
        org.junit.Assert.assertNotNull(arraylist_reservation46);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test385");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car18 = rental0.showCars("");
        rentalService.Rental rental19 = new rentalService.Rental();
        rental19.pickupCar("");
        rental19.dropoffCar("");
        rental19.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation27 = rental19.showClientReservations("hi!");
        rental19.cancelReservation("hi!");
        rental19.cancelClientReservation("hi!");
        rental19.pickupCar("");
        rental19.pickupCar("");
        rentalService.Rental rental36 = new rentalService.Rental();
        java.lang.String str39 = rental36.registerClient("", "");
        rental36.cancelReservation("hi!");
        rental36.pickupCar("");
        rental36.pickupCar("");
        rental36.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation49 = rental36.showClientReservations("hi!");
        rental36.pickupCar("hi!");
        rentalService.Rental rental52 = new rentalService.Rental();
        rental52.pickupCar("");
        rental52.dropoffCar("");
        rentalService.Rental rental57 = new rentalService.Rental();
        rental57.pickupCar("");
        rental57.dropoffCar("");
        rental57.pickupCar("");
        rentalService.Branch branch64 = null;
        rentalService.Branch[] branch_array65 = new rentalService.Branch[] { branch64 };
        rental57.initialise(branch_array65);
        rental52.initialise(branch_array65);
        rental36.initialise(branch_array65);
        rental19.initialise(branch_array65);
        rental0.initialise(branch_array65);
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car18);
        org.junit.Assert.assertNotNull(arraylist_reservation27);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(arraylist_reservation49);
        org.junit.Assert.assertNotNull(branch_array65);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test386");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.cancelClientReservation("");
        rental0.dropoffCar("");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("");
        rental0.pickupCar("");
        java.lang.String str29 = rental0.registerClient("", "");
        rental0.dropoffCar("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test387");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.lang.String str9 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        rentalService.Branch[] branch_array14 = null;
        rental0.initialise(branch_array14);
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client19 = rental0.showClients("");
        rentalService.Rental rental20 = new rentalService.Rental();
        rental20.pickupCar("");
        rental20.dropoffCar("");
        rental20.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation28 = rental20.showClientReservations("hi!");
        rental20.cancelReservation("hi!");
        rental20.cancelClientReservation("hi!");
        rental20.pickupCar("");
        rental20.pickupCar("");
        java.lang.String str40 = rental20.makeReservation("", "", "");
        rental20.pickupCar("hi!");
        rentalService.Rental rental43 = new rentalService.Rental();
        java.lang.String str46 = rental43.registerClient("", "");
        rental43.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation50 = rental43.showClientReservations("hi!");
        rental43.cancelReservation("hi!");
        rentalService.Rental rental53 = new rentalService.Rental();
        rental53.pickupCar("");
        rental53.dropoffCar("");
        rental53.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation61 = rental53.showClientReservations("hi!");
        rental53.cancelReservation("hi!");
        rental53.cancelClientReservation("hi!");
        rental53.pickupCar("hi!");
        rental53.pickupCar("hi!");
        rentalService.Rental rental70 = new rentalService.Rental();
        rental70.pickupCar("");
        rental70.dropoffCar("");
        rental70.pickupCar("");
        rentalService.Branch branch77 = null;
        rentalService.Branch[] branch_array78 = new rentalService.Branch[] { branch77 };
        rental70.initialise(branch_array78);
        rental53.initialise(branch_array78);
        rental43.initialise(branch_array78);
        rental20.initialise(branch_array78);
        rental0.initialise(branch_array78);
        java.util.ArrayList<rentalService.Car> arraylist_car85 = rental0.showCars("");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(arraylist_client19);
        org.junit.Assert.assertNotNull(arraylist_reservation28);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(arraylist_reservation50);
        org.junit.Assert.assertNotNull(arraylist_reservation61);
        org.junit.Assert.assertNotNull(branch_array78);
        org.junit.Assert.assertNull(arraylist_car85);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test388");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("hi!");
        java.lang.String str12 = rental0.registerClient("", "");
        rentalService.Rental rental13 = new rentalService.Rental();
        rental13.pickupCar("");
        rental13.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation19 = rental13.showClientReservations("hi!");
        rental13.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client23 = rental13.showClients("");
        java.lang.String str26 = rental13.registerClient("", "hi!");
        java.lang.String str29 = rental13.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation31 = rental13.showClientReservations("");
        rentalService.Rental rental32 = new rentalService.Rental();
        rental32.pickupCar("");
        rental32.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car38 = rental32.showCars("");
        rental32.cancelClientReservation("hi!");
        rental32.cancelReservation("");
        rental32.cancelReservation("hi!");
        rentalService.Rental rental45 = new rentalService.Rental();
        rental45.pickupCar("");
        rental45.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car51 = rental45.showCars("");
        rental45.cancelClientReservation("hi!");
        rental45.cancelReservation("");
        rentalService.Rental rental56 = new rentalService.Rental();
        java.lang.String str59 = rental56.registerClient("", "");
        rental56.cancelReservation("hi!");
        rental56.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car65 = rental56.showCars("");
        rentalService.Rental rental66 = new rentalService.Rental();
        rental66.pickupCar("");
        rental66.dropoffCar("");
        rental66.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation74 = rental66.showClientReservations("hi!");
        rental66.cancelReservation("hi!");
        rental66.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car80 = rental66.showCars("");
        rental66.dropoffCar("");
        rentalService.Rental rental83 = new rentalService.Rental();
        rental83.pickupCar("");
        rental83.dropoffCar("");
        rental83.pickupCar("");
        rentalService.Branch branch90 = null;
        rentalService.Branch[] branch_array91 = new rentalService.Branch[] { branch90 };
        rental83.initialise(branch_array91);
        rental66.initialise(branch_array91);
        rental56.initialise(branch_array91);
        rental45.initialise(branch_array91);
        rental32.initialise(branch_array91);
        rental13.initialise(branch_array91);
        rental0.initialise(branch_array91);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNotNull(arraylist_reservation9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(arraylist_reservation19);
        org.junit.Assert.assertNull(arraylist_client23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(arraylist_reservation31);
        org.junit.Assert.assertNull(arraylist_car38);
        org.junit.Assert.assertNull(arraylist_car51);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(arraylist_car65);
        org.junit.Assert.assertNotNull(arraylist_reservation74);
        org.junit.Assert.assertNull(arraylist_car80);
        org.junit.Assert.assertNotNull(branch_array91);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test389");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("");
        rental0.cancelClientReservation("");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test390");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test391");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str12 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation14 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car16 = rental0.showCars("");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Client> arraylist_client20 = rental0.showClients("");
        java.util.ArrayList<rentalService.Client> arraylist_client22 = rental0.showClients("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(arraylist_reservation14);
        org.junit.Assert.assertNull(arraylist_car16);
        org.junit.Assert.assertNull(arraylist_client20);
        org.junit.Assert.assertNull(arraylist_client22);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test392");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        java.lang.String str18 = rental0.makeReservation("", "", "hi!");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car22 = rental0.showCars("hi!");
        java.lang.String str25 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Client> arraylist_client27 = rental0.showClients("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation29 = rental0.showClientReservations("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(arraylist_car22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(arraylist_client27);
        org.junit.Assert.assertNotNull(arraylist_reservation29);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test393");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.cancelReservation("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation18 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        rental0.cancelClientReservation("");
        rental0.cancelReservation("");
        rental0.dropoffCar("");
        rental0.dropoffCar("");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("hi!");
        rental0.cancelClientReservation("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation18);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test394");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation5 = rental0.showClientReservations("");
        rental0.cancelReservation("");
        rentalService.Rental rental8 = new rentalService.Rental();
        rental8.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental8.showCars("");
        rental8.dropoffCar("hi!");
        rental8.dropoffCar("");
        rental8.dropoffCar("hi!");
        rentalService.Branch branch19 = null;
        rentalService.Branch[] branch_array20 = new rentalService.Branch[] { branch19 };
        rental8.initialise(branch_array20);
        rental0.initialise(branch_array20);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation24 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car28 = rental0.showCars("");
        java.util.ArrayList<rentalService.Car> arraylist_car30 = rental0.showCars("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation5);
        org.junit.Assert.assertNull(arraylist_car12);
        org.junit.Assert.assertNotNull(branch_array20);
        org.junit.Assert.assertNotNull(arraylist_reservation24);
        org.junit.Assert.assertNull(arraylist_car28);
        org.junit.Assert.assertNull(arraylist_car30);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test395");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.pickupCar("hi!");
        rental0.cancelReservation("");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test396");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("hi!");
        java.lang.String str16 = rental0.makeReservation("", "", "");
        rentalService.Rental rental17 = new rentalService.Rental();
        rental17.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car21 = rental17.showCars("");
        rentalService.Branch[] branch_array22 = null;
        rental17.initialise(branch_array22);
        rental17.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client27 = rental17.showClients("");
        rental17.dropoffCar("hi!");
        rentalService.Rental rental30 = new rentalService.Rental();
        rental30.pickupCar("");
        rental30.dropoffCar("");
        rental30.pickupCar("");
        rentalService.Branch branch37 = null;
        rentalService.Branch[] branch_array38 = new rentalService.Branch[] { branch37 };
        rental30.initialise(branch_array38);
        rental30.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation43 = rental30.showClientReservations("hi!");
        rentalService.Rental rental44 = new rentalService.Rental();
        java.lang.String str47 = rental44.registerClient("", "");
        rental44.cancelReservation("hi!");
        rental44.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car53 = rental44.showCars("");
        rentalService.Rental rental54 = new rentalService.Rental();
        rental54.pickupCar("");
        rental54.dropoffCar("");
        rental54.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation62 = rental54.showClientReservations("hi!");
        rental54.cancelReservation("hi!");
        rental54.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car68 = rental54.showCars("");
        rental54.dropoffCar("");
        rentalService.Rental rental71 = new rentalService.Rental();
        rental71.pickupCar("");
        rental71.dropoffCar("");
        rental71.pickupCar("");
        rentalService.Branch branch78 = null;
        rentalService.Branch[] branch_array79 = new rentalService.Branch[] { branch78 };
        rental71.initialise(branch_array79);
        rental54.initialise(branch_array79);
        rental44.initialise(branch_array79);
        rental30.initialise(branch_array79);
        rental17.initialise(branch_array79);
        rental0.initialise(branch_array79);
        rental0.cancelClientReservation("");
        java.util.ArrayList<rentalService.Car> arraylist_car89 = rental0.showCars("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(arraylist_car21);
        org.junit.Assert.assertNull(arraylist_client27);
        org.junit.Assert.assertNotNull(branch_array38);
        org.junit.Assert.assertNotNull(arraylist_reservation43);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(arraylist_car53);
        org.junit.Assert.assertNotNull(arraylist_reservation62);
        org.junit.Assert.assertNull(arraylist_car68);
        org.junit.Assert.assertNotNull(branch_array79);
        org.junit.Assert.assertNull(arraylist_car89);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test397");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.lang.String str9 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        rentalService.Branch[] branch_array14 = null;
        rental0.initialise(branch_array14);
        rentalService.Rental rental16 = new rentalService.Rental();
        java.lang.String str19 = rental16.registerClient("", "");
        rental16.cancelReservation("hi!");
        rental16.pickupCar("");
        rental16.pickupCar("");
        rentalService.Rental rental26 = new rentalService.Rental();
        rental26.pickupCar("");
        rental26.dropoffCar("");
        rentalService.Rental rental31 = new rentalService.Rental();
        rental31.pickupCar("");
        rental31.dropoffCar("");
        rental31.pickupCar("");
        rentalService.Branch branch38 = null;
        rentalService.Branch[] branch_array39 = new rentalService.Branch[] { branch38 };
        rental31.initialise(branch_array39);
        rental26.initialise(branch_array39);
        rental16.initialise(branch_array39);
        rental0.initialise(branch_array39);
        rentalService.Rental rental44 = new rentalService.Rental();
        rental44.pickupCar("");
        rental44.dropoffCar("");
        rental44.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation52 = rental44.showClientReservations("hi!");
        rental44.cancelReservation("hi!");
        rental44.cancelClientReservation("hi!");
        rental44.pickupCar("");
        rental44.pickupCar("");
        rental44.pickupCar("hi!");
        rentalService.Rental rental63 = new rentalService.Rental();
        rental63.pickupCar("");
        rental63.dropoffCar("");
        rental63.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation71 = rental63.showClientReservations("hi!");
        rentalService.Branch[] branch_array72 = new rentalService.Branch[] {};
        rental63.initialise(branch_array72);
        rental44.initialise(branch_array72);
        rental0.initialise(branch_array72);
        rental0.pickupCar("");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str84 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(branch_array39);
        org.junit.Assert.assertNotNull(arraylist_reservation52);
        org.junit.Assert.assertNotNull(arraylist_reservation71);
        org.junit.Assert.assertNotNull(branch_array72);
        org.junit.Assert.assertNull(str84);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test398");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.lang.String str7 = rental0.makeReservation("hi!", "", "");
        rentalService.Rental rental8 = new rentalService.Rental();
        java.lang.String str11 = rental8.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental8.showClientReservations("");
        rental8.cancelReservation("");
        rentalService.Rental rental16 = new rentalService.Rental();
        rental16.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car20 = rental16.showCars("");
        rental16.dropoffCar("hi!");
        rental16.dropoffCar("");
        rental16.dropoffCar("hi!");
        rentalService.Branch branch27 = null;
        rentalService.Branch[] branch_array28 = new rentalService.Branch[] { branch27 };
        rental16.initialise(branch_array28);
        rental8.initialise(branch_array28);
        rental0.initialise(branch_array28);
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation35 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        try {
            java.util.ArrayList<rentalService.Car> arraylist_car39 = rental0.showCars("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
        org.junit.Assert.assertNull(arraylist_car20);
        org.junit.Assert.assertNotNull(branch_array28);
        org.junit.Assert.assertNotNull(arraylist_reservation35);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test399");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation14 = rental0.showClientReservations("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(arraylist_client10);
        org.junit.Assert.assertNull(arraylist_car12);
        org.junit.Assert.assertNotNull(arraylist_reservation14);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test400");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("");
        rentalService.Rental rental7 = new rentalService.Rental();
        rental7.pickupCar("");
        rental7.dropoffCar("");
        rental7.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation15 = rental7.showClientReservations("hi!");
        rental7.cancelReservation("hi!");
        rental7.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car21 = rental7.showCars("");
        rental7.dropoffCar("");
        rentalService.Rental rental24 = new rentalService.Rental();
        rental24.pickupCar("");
        rental24.dropoffCar("");
        rental24.pickupCar("");
        rentalService.Branch branch31 = null;
        rentalService.Branch[] branch_array32 = new rentalService.Branch[] { branch31 };
        rental24.initialise(branch_array32);
        rental7.initialise(branch_array32);
        rental0.initialise(branch_array32);
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation39 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation15);
        org.junit.Assert.assertNull(arraylist_car21);
        org.junit.Assert.assertNotNull(branch_array32);
        org.junit.Assert.assertNotNull(arraylist_reservation39);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test401");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation18 = rental0.showClientReservations("hi!");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client22 = rental0.showClients("");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation26 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car28 = rental0.showCars("");
        rental0.pickupCar("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNotNull(arraylist_reservation18);
        org.junit.Assert.assertNull(arraylist_client22);
        org.junit.Assert.assertNotNull(arraylist_reservation26);
        org.junit.Assert.assertNull(arraylist_car28);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test402");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        java.lang.String str11 = rental0.registerClient("", "hi!");
        rental0.cancelReservation("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test403");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        rental0.dropoffCar("hi!");
        rental0.pickupCar("hi!");
        rental0.pickupCar("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test404");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("");
        rental0.cancelClientReservation("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client19 = rental0.showClients("");
        java.lang.String str23 = rental0.makeReservation("", "", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
        org.junit.Assert.assertNull(arraylist_client19);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test405");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str12 = rental0.makeReservation("", "", "");
        rentalService.Branch[] branch_array13 = null;
        rental0.initialise(branch_array13);
        java.lang.String str17 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test406");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        java.lang.String str20 = rental0.makeReservation("", "", "");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client24 = rental0.showClients("");
        rental0.cancelReservation("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client32 = rental0.showClients("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(arraylist_client24);
        org.junit.Assert.assertNull(arraylist_client32);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test407");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        java.lang.String str10 = rental0.makeReservation("hi!", "", "");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rentalService.Rental rental15 = new rentalService.Rental();
        rental15.pickupCar("");
        rental15.dropoffCar("");
        rentalService.Rental rental20 = new rentalService.Rental();
        rental20.pickupCar("");
        rental20.dropoffCar("");
        rental20.pickupCar("");
        rentalService.Branch branch27 = null;
        rentalService.Branch[] branch_array28 = new rentalService.Branch[] { branch27 };
        rental20.initialise(branch_array28);
        rental15.initialise(branch_array28);
        rental15.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation34 = rental15.showClientReservations("hi!");
        rentalService.Rental rental35 = new rentalService.Rental();
        rental35.pickupCar("");
        rental35.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car41 = rental35.showCars("");
        rental35.cancelClientReservation("hi!");
        rental35.cancelReservation("");
        rentalService.Rental rental46 = new rentalService.Rental();
        java.lang.String str49 = rental46.registerClient("", "");
        rental46.cancelReservation("hi!");
        rental46.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car55 = rental46.showCars("");
        rentalService.Rental rental56 = new rentalService.Rental();
        rental56.pickupCar("");
        rental56.dropoffCar("");
        rental56.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation64 = rental56.showClientReservations("hi!");
        rental56.cancelReservation("hi!");
        rental56.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car70 = rental56.showCars("");
        rental56.dropoffCar("");
        rentalService.Rental rental73 = new rentalService.Rental();
        rental73.pickupCar("");
        rental73.dropoffCar("");
        rental73.pickupCar("");
        rentalService.Branch branch80 = null;
        rentalService.Branch[] branch_array81 = new rentalService.Branch[] { branch80 };
        rental73.initialise(branch_array81);
        rental56.initialise(branch_array81);
        rental46.initialise(branch_array81);
        rental35.initialise(branch_array81);
        rental15.initialise(branch_array81);
        rental0.initialise(branch_array81);
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(branch_array28);
        org.junit.Assert.assertNotNull(arraylist_reservation34);
        org.junit.Assert.assertNull(arraylist_car41);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(arraylist_car55);
        org.junit.Assert.assertNotNull(arraylist_reservation64);
        org.junit.Assert.assertNull(arraylist_car70);
        org.junit.Assert.assertNotNull(branch_array81);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test408");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rentalService.Rental rental10 = new rentalService.Rental();
        rental10.pickupCar("");
        rental10.dropoffCar("");
        rentalService.Rental rental15 = new rentalService.Rental();
        rental15.pickupCar("");
        rental15.dropoffCar("");
        rental15.pickupCar("");
        rentalService.Branch branch22 = null;
        rentalService.Branch[] branch_array23 = new rentalService.Branch[] { branch22 };
        rental15.initialise(branch_array23);
        rental10.initialise(branch_array23);
        rental0.initialise(branch_array23);
        rental0.cancelClientReservation("hi!");
        rental0.dropoffCar("");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation34 = rental0.showClientReservations("");
        rental0.dropoffCar("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(branch_array23);
        org.junit.Assert.assertNotNull(arraylist_reservation34);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test409");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car6 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        rental0.cancelReservation("hi!");
        rentalService.Rental rental13 = new rentalService.Rental();
        rental13.pickupCar("");
        rental13.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car19 = rental13.showCars("");
        rental13.cancelClientReservation("hi!");
        rental13.cancelReservation("");
        rentalService.Rental rental24 = new rentalService.Rental();
        java.lang.String str27 = rental24.registerClient("", "");
        rental24.cancelReservation("hi!");
        rental24.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car33 = rental24.showCars("");
        rentalService.Rental rental34 = new rentalService.Rental();
        rental34.pickupCar("");
        rental34.dropoffCar("");
        rental34.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation42 = rental34.showClientReservations("hi!");
        rental34.cancelReservation("hi!");
        rental34.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car48 = rental34.showCars("");
        rental34.dropoffCar("");
        rentalService.Rental rental51 = new rentalService.Rental();
        rental51.pickupCar("");
        rental51.dropoffCar("");
        rental51.pickupCar("");
        rentalService.Branch branch58 = null;
        rentalService.Branch[] branch_array59 = new rentalService.Branch[] { branch58 };
        rental51.initialise(branch_array59);
        rental34.initialise(branch_array59);
        rental24.initialise(branch_array59);
        rental13.initialise(branch_array59);
        rental0.initialise(branch_array59);
        java.util.ArrayList<rentalService.Client> arraylist_client66 = rental0.showClients("");
        rental0.dropoffCar("");
        rental0.pickupCar("hi!");
        org.junit.Assert.assertNull(arraylist_car6);
        org.junit.Assert.assertNull(arraylist_car19);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(arraylist_car33);
        org.junit.Assert.assertNotNull(arraylist_reservation42);
        org.junit.Assert.assertNull(arraylist_car48);
        org.junit.Assert.assertNotNull(branch_array59);
        org.junit.Assert.assertNull(arraylist_client66);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test410");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client18 = rental0.showClients("");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation24 = rental0.showClientReservations("");
        rentalService.Branch[] branch_array25 = null;
        rental0.initialise(branch_array25);
        rental0.cancelReservation("");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Client> arraylist_client32 = rental0.showClients("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(arraylist_client18);
        org.junit.Assert.assertNotNull(arraylist_reservation24);
        org.junit.Assert.assertNull(arraylist_client32);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test411");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("");
        rental0.cancelClientReservation("");
        rental0.pickupCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation21 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car23 = rental0.showCars("");
        rental0.cancelClientReservation("");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Client> arraylist_client29 = rental0.showClients("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
        org.junit.Assert.assertNotNull(arraylist_reservation21);
        org.junit.Assert.assertNull(arraylist_car23);
        org.junit.Assert.assertNull(arraylist_client29);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test412");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        java.lang.String str19 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str25 = rental0.makeReservation("hi!", "", "hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car29 = rental0.showCars("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client31 = rental0.showClients("");
        rental0.cancelReservation("hi!");
        java.lang.String str36 = rental0.registerClient("hi!", "hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(arraylist_car29);
        org.junit.Assert.assertNull(arraylist_client31);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test413");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rentalService.Rental rental10 = new rentalService.Rental();
        rental10.pickupCar("");
        rental10.dropoffCar("");
        rentalService.Rental rental15 = new rentalService.Rental();
        rental15.pickupCar("");
        rental15.dropoffCar("");
        rental15.pickupCar("");
        rentalService.Branch branch22 = null;
        rentalService.Branch[] branch_array23 = new rentalService.Branch[] { branch22 };
        rental15.initialise(branch_array23);
        rental10.initialise(branch_array23);
        rental0.initialise(branch_array23);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation28 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("");
        rental0.pickupCar("");
        rental0.pickupCar("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(branch_array23);
        org.junit.Assert.assertNotNull(arraylist_reservation28);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test414");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.lang.String str9 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car13 = rental0.showCars("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car17 = rental0.showCars("");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client21 = rental0.showClients("");
        rental0.pickupCar("");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(arraylist_car13);
        org.junit.Assert.assertNull(arraylist_car17);
        org.junit.Assert.assertNull(arraylist_client21);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test415");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car15 = rental0.showCars("");
        rentalService.Rental rental16 = new rentalService.Rental();
        java.lang.String str19 = rental16.registerClient("", "");
        rental16.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation23 = rental16.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation25 = rental16.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation27 = rental16.showClientReservations("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation29 = rental16.showClientReservations("hi!");
        rentalService.Rental rental30 = new rentalService.Rental();
        rental30.pickupCar("");
        rental30.dropoffCar("");
        rental30.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation38 = rental30.showClientReservations("hi!");
        rental30.cancelReservation("hi!");
        rental30.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car44 = rental30.showCars("");
        rental30.dropoffCar("");
        rentalService.Rental rental47 = new rentalService.Rental();
        rental47.pickupCar("");
        rental47.dropoffCar("");
        rental47.pickupCar("");
        rentalService.Branch branch54 = null;
        rentalService.Branch[] branch_array55 = new rentalService.Branch[] { branch54 };
        rental47.initialise(branch_array55);
        rental30.initialise(branch_array55);
        rental16.initialise(branch_array55);
        rental0.initialise(branch_array55);
        rental0.cancelReservation("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
        org.junit.Assert.assertNull(arraylist_car15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(arraylist_reservation23);
        org.junit.Assert.assertNotNull(arraylist_reservation25);
        org.junit.Assert.assertNotNull(arraylist_reservation27);
        org.junit.Assert.assertNotNull(arraylist_reservation29);
        org.junit.Assert.assertNotNull(arraylist_reservation38);
        org.junit.Assert.assertNull(arraylist_car44);
        org.junit.Assert.assertNotNull(branch_array55);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test416");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        rental0.cancelReservation("");
        rentalService.Rental rental14 = new rentalService.Rental();
        java.lang.String str17 = rental14.registerClient("", "");
        rental14.cancelReservation("hi!");
        rental14.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car23 = rental14.showCars("");
        rentalService.Rental rental24 = new rentalService.Rental();
        rental24.pickupCar("");
        rental24.dropoffCar("");
        rental24.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation32 = rental24.showClientReservations("hi!");
        rental24.cancelReservation("hi!");
        rental24.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car38 = rental24.showCars("");
        rental24.dropoffCar("");
        rentalService.Rental rental41 = new rentalService.Rental();
        rental41.pickupCar("");
        rental41.dropoffCar("");
        rental41.pickupCar("");
        rentalService.Branch branch48 = null;
        rentalService.Branch[] branch_array49 = new rentalService.Branch[] { branch48 };
        rental41.initialise(branch_array49);
        rental24.initialise(branch_array49);
        rental14.initialise(branch_array49);
        rental0.initialise(branch_array49);
        java.util.ArrayList<rentalService.Client> arraylist_client55 = rental0.showClients("");
        java.lang.String str58 = rental0.registerClient("", "");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(arraylist_car23);
        org.junit.Assert.assertNotNull(arraylist_reservation32);
        org.junit.Assert.assertNull(arraylist_car38);
        org.junit.Assert.assertNotNull(branch_array49);
        org.junit.Assert.assertNull(arraylist_client55);
        org.junit.Assert.assertNull(str58);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test417");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("hi!");
        rental0.dropoffCar("");
        java.lang.String str14 = rental0.makeReservation("", "", "");
        rental0.cancelClientReservation("");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client20 = rental0.showClients("");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Client> arraylist_client24 = rental0.showClients("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(arraylist_client20);
        org.junit.Assert.assertNull(arraylist_client24);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test418");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.lang.String str9 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car13 = rental0.showCars("");
        rentalService.Rental rental14 = new rentalService.Rental();
        rental14.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car18 = rental14.showCars("");
        rental14.dropoffCar("");
        rentalService.Rental rental21 = new rentalService.Rental();
        rental21.pickupCar("");
        rental21.dropoffCar("");
        rental21.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation29 = rental21.showClientReservations("hi!");
        rental21.cancelReservation("hi!");
        rental21.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car35 = rental21.showCars("");
        rental21.dropoffCar("");
        rentalService.Rental rental38 = new rentalService.Rental();
        rental38.pickupCar("");
        rental38.dropoffCar("");
        rental38.pickupCar("");
        rentalService.Branch branch45 = null;
        rentalService.Branch[] branch_array46 = new rentalService.Branch[] { branch45 };
        rental38.initialise(branch_array46);
        rental21.initialise(branch_array46);
        rental14.initialise(branch_array46);
        rental0.initialise(branch_array46);
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client54 = rental0.showClients("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation58 = rental0.showClientReservations("hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(arraylist_car13);
        org.junit.Assert.assertNull(arraylist_car18);
        org.junit.Assert.assertNotNull(arraylist_reservation29);
        org.junit.Assert.assertNull(arraylist_car35);
        org.junit.Assert.assertNotNull(branch_array46);
        org.junit.Assert.assertNull(arraylist_client54);
        org.junit.Assert.assertNotNull(arraylist_reservation58);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test419");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("hi!");
        rental0.pickupCar("hi!");
        rentalService.Rental rental16 = new rentalService.Rental();
        rental16.pickupCar("");
        rental16.dropoffCar("");
        rental16.pickupCar("");
        rentalService.Branch branch23 = null;
        rentalService.Branch[] branch_array24 = new rentalService.Branch[] { branch23 };
        rental16.initialise(branch_array24);
        rental16.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation29 = rental16.showClientReservations("hi!");
        rentalService.Rental rental30 = new rentalService.Rental();
        java.lang.String str33 = rental30.registerClient("", "");
        rental30.cancelReservation("hi!");
        rental30.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car39 = rental30.showCars("");
        rentalService.Rental rental40 = new rentalService.Rental();
        rental40.pickupCar("");
        rental40.dropoffCar("");
        rental40.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation48 = rental40.showClientReservations("hi!");
        rental40.cancelReservation("hi!");
        rental40.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car54 = rental40.showCars("");
        rental40.dropoffCar("");
        rentalService.Rental rental57 = new rentalService.Rental();
        rental57.pickupCar("");
        rental57.dropoffCar("");
        rental57.pickupCar("");
        rentalService.Branch branch64 = null;
        rentalService.Branch[] branch_array65 = new rentalService.Branch[] { branch64 };
        rental57.initialise(branch_array65);
        rental40.initialise(branch_array65);
        rental30.initialise(branch_array65);
        rental16.initialise(branch_array65);
        rental0.initialise(branch_array65);
        java.util.ArrayList<rentalService.Car> arraylist_car72 = rental0.showCars("");
        rental0.pickupCar("hi!");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation80 = rental0.showClientReservations("");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
        org.junit.Assert.assertNotNull(branch_array24);
        org.junit.Assert.assertNotNull(arraylist_reservation29);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(arraylist_car39);
        org.junit.Assert.assertNotNull(arraylist_reservation48);
        org.junit.Assert.assertNull(arraylist_car54);
        org.junit.Assert.assertNotNull(branch_array65);
        org.junit.Assert.assertNull(arraylist_car72);
        org.junit.Assert.assertNotNull(arraylist_reservation80);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test420");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation5 = rental0.showClientReservations("");
        rental0.cancelReservation("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("hi!");
        rentalService.Rental rental12 = new rentalService.Rental();
        rental12.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car16 = rental12.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation18 = rental12.showClientReservations("hi!");
        rental12.dropoffCar("");
        java.lang.String str24 = rental12.makeReservation("", "", "");
        rental12.pickupCar("");
        rentalService.Rental rental27 = new rentalService.Rental();
        rental27.pickupCar("");
        rental27.dropoffCar("");
        rental27.pickupCar("");
        java.lang.String str36 = rental27.registerClient("", "hi!");
        rental27.cancelClientReservation("hi!");
        rental27.cancelReservation("");
        rentalService.Branch[] branch_array41 = null;
        rental27.initialise(branch_array41);
        rentalService.Rental rental43 = new rentalService.Rental();
        java.lang.String str46 = rental43.registerClient("", "");
        rental43.cancelReservation("hi!");
        rental43.pickupCar("");
        rental43.pickupCar("");
        rentalService.Rental rental53 = new rentalService.Rental();
        rental53.pickupCar("");
        rental53.dropoffCar("");
        rentalService.Rental rental58 = new rentalService.Rental();
        rental58.pickupCar("");
        rental58.dropoffCar("");
        rental58.pickupCar("");
        rentalService.Branch branch65 = null;
        rentalService.Branch[] branch_array66 = new rentalService.Branch[] { branch65 };
        rental58.initialise(branch_array66);
        rental53.initialise(branch_array66);
        rental43.initialise(branch_array66);
        rental27.initialise(branch_array66);
        rental12.initialise(branch_array66);
        rental0.initialise(branch_array66);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation5);
        org.junit.Assert.assertNull(arraylist_car16);
        org.junit.Assert.assertNotNull(arraylist_reservation18);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(branch_array66);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test421");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental0.showCars("");
        rental0.pickupCar("");
        java.lang.String str17 = rental0.registerClient("", "");
        rentalService.Rental rental18 = new rentalService.Rental();
        rental18.pickupCar("");
        rental18.dropoffCar("");
        rental18.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation26 = rental18.showClientReservations("hi!");
        rental18.cancelReservation("hi!");
        rental18.cancelClientReservation("hi!");
        rental18.pickupCar("");
        rental18.pickupCar("");
        java.lang.String str38 = rental18.makeReservation("", "", "");
        rental18.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client42 = rental18.showClients("");
        rental18.cancelClientReservation("hi!");
        rentalService.Rental rental45 = new rentalService.Rental();
        java.lang.String str48 = rental45.registerClient("", "");
        java.lang.String str52 = rental45.makeReservation("hi!", "", "");
        rentalService.Rental rental53 = new rentalService.Rental();
        java.lang.String str56 = rental53.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation58 = rental53.showClientReservations("");
        rental53.cancelReservation("");
        rentalService.Rental rental61 = new rentalService.Rental();
        rental61.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car65 = rental61.showCars("");
        rental61.dropoffCar("hi!");
        rental61.dropoffCar("");
        rental61.dropoffCar("hi!");
        rentalService.Branch branch72 = null;
        rentalService.Branch[] branch_array73 = new rentalService.Branch[] { branch72 };
        rental61.initialise(branch_array73);
        rental53.initialise(branch_array73);
        rental45.initialise(branch_array73);
        rental18.initialise(branch_array73);
        rental0.initialise(branch_array73);
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(arraylist_reservation26);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(arraylist_client42);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(arraylist_reservation58);
        org.junit.Assert.assertNull(arraylist_car65);
        org.junit.Assert.assertNotNull(branch_array73);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test422");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("");
        rental0.dropoffCar("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNotNull(arraylist_reservation8);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test423");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car6 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation14 = rental0.showClientReservations("");
        rental0.pickupCar("");
        rental0.cancelReservation("hi!");
        org.junit.Assert.assertNull(arraylist_car6);
        org.junit.Assert.assertNotNull(arraylist_reservation14);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test424");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelClientReservation("");
        java.lang.String str17 = rental0.registerClient("", "");
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test425");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.lang.String str9 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        rentalService.Branch[] branch_array14 = null;
        rental0.initialise(branch_array14);
        rentalService.Rental rental16 = new rentalService.Rental();
        rental16.pickupCar("");
        rental16.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car22 = rental16.showCars("");
        rental16.cancelClientReservation("hi!");
        rental16.cancelReservation("");
        rentalService.Rental rental27 = new rentalService.Rental();
        rental27.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car31 = rental27.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation33 = rental27.showClientReservations("hi!");
        rental27.dropoffCar("");
        java.lang.String str39 = rental27.makeReservation("", "", "");
        rentalService.Branch[] branch_array40 = null;
        rental27.initialise(branch_array40);
        java.util.ArrayList<rentalService.Client> arraylist_client43 = rental27.showClients("");
        rentalService.Rental rental44 = new rentalService.Rental();
        rental44.pickupCar("");
        rental44.dropoffCar("");
        rental44.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation52 = rental44.showClientReservations("");
        rentalService.Rental rental53 = new rentalService.Rental();
        java.lang.String str56 = rental53.registerClient("", "");
        rental53.cancelReservation("hi!");
        rental53.pickupCar("");
        rental53.pickupCar("");
        rentalService.Rental rental63 = new rentalService.Rental();
        rental63.pickupCar("");
        rental63.dropoffCar("");
        rentalService.Rental rental68 = new rentalService.Rental();
        rental68.pickupCar("");
        rental68.dropoffCar("");
        rental68.pickupCar("");
        rentalService.Branch branch75 = null;
        rentalService.Branch[] branch_array76 = new rentalService.Branch[] { branch75 };
        rental68.initialise(branch_array76);
        rental63.initialise(branch_array76);
        rental53.initialise(branch_array76);
        rental44.initialise(branch_array76);
        rental27.initialise(branch_array76);
        rental16.initialise(branch_array76);
        rental0.initialise(branch_array76);
        rental0.cancelReservation("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation89 = rental0.showClientReservations("");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(arraylist_car22);
        org.junit.Assert.assertNull(arraylist_car31);
        org.junit.Assert.assertNotNull(arraylist_reservation33);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(arraylist_client43);
        org.junit.Assert.assertNotNull(arraylist_reservation52);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(branch_array76);
        org.junit.Assert.assertNotNull(arraylist_reservation89);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test426");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("");
        rentalService.Branch[] branch_array12 = null;
        rental0.initialise(branch_array12);
        java.lang.String str17 = rental0.makeReservation("hi!", "", "");
        rentalService.Rental rental18 = new rentalService.Rental();
        rental18.pickupCar("");
        rental18.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car24 = rental18.showCars("");
        rental18.cancelClientReservation("hi!");
        rental18.cancelReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation30 = rental18.showClientReservations("");
        rentalService.Rental rental31 = new rentalService.Rental();
        java.lang.String str34 = rental31.registerClient("", "");
        java.lang.String str38 = rental31.makeReservation("hi!", "", "");
        rentalService.Rental rental39 = new rentalService.Rental();
        java.lang.String str42 = rental39.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation44 = rental39.showClientReservations("");
        rental39.cancelReservation("");
        rentalService.Rental rental47 = new rentalService.Rental();
        rental47.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car51 = rental47.showCars("");
        rental47.dropoffCar("hi!");
        rental47.dropoffCar("");
        rental47.dropoffCar("hi!");
        rentalService.Branch branch58 = null;
        rentalService.Branch[] branch_array59 = new rentalService.Branch[] { branch58 };
        rental47.initialise(branch_array59);
        rental39.initialise(branch_array59);
        rental31.initialise(branch_array59);
        rentalService.Branch branch63 = null;
        rentalService.Branch[] branch_array64 = new rentalService.Branch[] { branch63 };
        rental31.initialise(branch_array64);
        rental18.initialise(branch_array64);
        rental0.initialise(branch_array64);
        try {
            java.lang.String str70 = rental0.registerClient("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(arraylist_car24);
        org.junit.Assert.assertNotNull(arraylist_reservation30);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(arraylist_reservation44);
        org.junit.Assert.assertNull(arraylist_car51);
        org.junit.Assert.assertNotNull(branch_array59);
        org.junit.Assert.assertNotNull(branch_array64);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test427");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car6 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        java.lang.String str13 = rental0.registerClient("", "hi!");
        java.lang.String str16 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Car> arraylist_car18 = rental0.showCars("");
        java.util.ArrayList<rentalService.Client> arraylist_client20 = rental0.showClients("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation22 = rental0.showClientReservations("hi!");
        rental0.cancelClientReservation("");
        java.util.ArrayList<rentalService.Car> arraylist_car26 = rental0.showCars("");
        org.junit.Assert.assertNull(arraylist_car6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(arraylist_car18);
        org.junit.Assert.assertNull(arraylist_client20);
        org.junit.Assert.assertNotNull(arraylist_reservation22);
        org.junit.Assert.assertNull(arraylist_car26);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test428");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("");
        rentalService.Rental rental11 = new rentalService.Rental();
        java.lang.String str14 = rental11.registerClient("", "");
        rental11.cancelReservation("hi!");
        rental11.pickupCar("");
        rental11.pickupCar("");
        rentalService.Rental rental21 = new rentalService.Rental();
        rental21.pickupCar("");
        rental21.dropoffCar("");
        rentalService.Rental rental26 = new rentalService.Rental();
        rental26.pickupCar("");
        rental26.dropoffCar("");
        rental26.pickupCar("");
        rentalService.Branch branch33 = null;
        rentalService.Branch[] branch_array34 = new rentalService.Branch[] { branch33 };
        rental26.initialise(branch_array34);
        rental21.initialise(branch_array34);
        rental11.initialise(branch_array34);
        rental11.cancelClientReservation("hi!");
        rental11.dropoffCar("");
        rentalService.Rental rental42 = new rentalService.Rental();
        rental42.pickupCar("");
        rental42.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car48 = rental42.showCars("");
        rental42.cancelClientReservation("hi!");
        rental42.dropoffCar("hi!");
        rentalService.Rental rental53 = new rentalService.Rental();
        rental53.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car57 = rental53.showCars("");
        rentalService.Branch[] branch_array58 = null;
        rental53.initialise(branch_array58);
        rental53.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client63 = rental53.showClients("");
        rentalService.Rental rental64 = new rentalService.Rental();
        rental64.pickupCar("");
        rental64.dropoffCar("");
        rental64.pickupCar("");
        rentalService.Branch branch71 = null;
        rentalService.Branch[] branch_array72 = new rentalService.Branch[] { branch71 };
        rental64.initialise(branch_array72);
        rental53.initialise(branch_array72);
        rental42.initialise(branch_array72);
        rental11.initialise(branch_array72);
        rental0.initialise(branch_array72);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation79 = rental0.showClientReservations("hi!");
        java.lang.String str82 = rental0.registerClient("", "");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(arraylist_client10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(branch_array34);
        org.junit.Assert.assertNull(arraylist_car48);
        org.junit.Assert.assertNull(arraylist_car57);
        org.junit.Assert.assertNull(arraylist_client63);
        org.junit.Assert.assertNotNull(branch_array72);
        org.junit.Assert.assertNotNull(arraylist_reservation79);
        org.junit.Assert.assertNull(str82);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test429");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rentalService.Rental rental10 = new rentalService.Rental();
        rental10.pickupCar("");
        rental10.dropoffCar("");
        rentalService.Rental rental15 = new rentalService.Rental();
        rental15.pickupCar("");
        rental15.dropoffCar("");
        rental15.pickupCar("");
        rentalService.Branch branch22 = null;
        rentalService.Branch[] branch_array23 = new rentalService.Branch[] { branch22 };
        rental15.initialise(branch_array23);
        rental10.initialise(branch_array23);
        rental0.initialise(branch_array23);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation28 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation30 = rental0.showClientReservations("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(branch_array23);
        org.junit.Assert.assertNotNull(arraylist_reservation28);
        org.junit.Assert.assertNotNull(arraylist_reservation30);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test430");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation20 = rental0.showClientReservations("hi!");
        rentalService.Rental rental21 = new rentalService.Rental();
        rental21.pickupCar("");
        rental21.dropoffCar("");
        rental21.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation29 = rental21.showClientReservations("hi!");
        rental21.cancelReservation("hi!");
        rental21.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car35 = rental21.showCars("");
        rental21.pickupCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client39 = rental21.showClients("");
        rental21.dropoffCar("hi!");
        rental21.cancelClientReservation("hi!");
        rentalService.Rental rental44 = new rentalService.Rental();
        rental44.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car48 = rental44.showCars("");
        rental44.dropoffCar("hi!");
        rental44.dropoffCar("");
        rental44.dropoffCar("hi!");
        rentalService.Branch branch55 = null;
        rentalService.Branch[] branch_array56 = new rentalService.Branch[] { branch55 };
        rental44.initialise(branch_array56);
        rentalService.Rental rental58 = new rentalService.Rental();
        rental58.pickupCar("");
        rental58.dropoffCar("");
        rentalService.Rental rental63 = new rentalService.Rental();
        rental63.pickupCar("");
        rental63.dropoffCar("");
        rental63.pickupCar("");
        rentalService.Branch branch70 = null;
        rentalService.Branch[] branch_array71 = new rentalService.Branch[] { branch70 };
        rental63.initialise(branch_array71);
        rental58.initialise(branch_array71);
        rental44.initialise(branch_array71);
        rental21.initialise(branch_array71);
        rental0.initialise(branch_array71);
        try {
            java.lang.String str79 = rental0.registerClient("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(arraylist_reservation20);
        org.junit.Assert.assertNotNull(arraylist_reservation29);
        org.junit.Assert.assertNull(arraylist_car35);
        org.junit.Assert.assertNull(arraylist_client39);
        org.junit.Assert.assertNull(arraylist_car48);
        org.junit.Assert.assertNotNull(branch_array56);
        org.junit.Assert.assertNotNull(branch_array71);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test431");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str12 = rental0.makeReservation("", "", "");
        rental0.cancelClientReservation("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test432");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str12 = rental0.makeReservation("", "", "");
        rentalService.Branch[] branch_array13 = null;
        rental0.initialise(branch_array13);
        java.util.ArrayList<rentalService.Client> arraylist_client16 = rental0.showClients("");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car20 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(arraylist_client16);
        org.junit.Assert.assertNull(arraylist_car20);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test433");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        rentalService.Branch branch11 = null;
        rentalService.Branch[] branch_array12 = new rentalService.Branch[] { branch11 };
        rental0.initialise(branch_array12);
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str20 = rental0.registerClient("", "");
        rental0.pickupCar("hi!");
        java.lang.String str26 = rental0.makeReservation("hi!", "", "");
        rentalService.Rental rental27 = new rentalService.Rental();
        rental27.pickupCar("");
        rental27.dropoffCar("");
        rental27.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation35 = rental27.showClientReservations("hi!");
        rental27.cancelReservation("hi!");
        rental27.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car41 = rental27.showCars("");
        rental27.dropoffCar("");
        rentalService.Rental rental44 = new rentalService.Rental();
        rental44.pickupCar("");
        rental44.dropoffCar("");
        rental44.pickupCar("");
        rentalService.Branch branch51 = null;
        rentalService.Branch[] branch_array52 = new rentalService.Branch[] { branch51 };
        rental44.initialise(branch_array52);
        rental27.initialise(branch_array52);
        rental0.initialise(branch_array52);
        rental0.dropoffCar("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(branch_array12);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(arraylist_reservation35);
        org.junit.Assert.assertNull(arraylist_car41);
        org.junit.Assert.assertNotNull(branch_array52);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test434");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.lang.String str9 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        rentalService.Rental rental14 = new rentalService.Rental();
        java.lang.String str17 = rental14.registerClient("", "");
        rental14.cancelReservation("hi!");
        rental14.pickupCar("");
        rental14.pickupCar("");
        rental14.dropoffCar("hi!");
        rental14.cancelReservation("hi!");
        rental14.cancelReservation("");
        rentalService.Rental rental30 = new rentalService.Rental();
        java.lang.String str33 = rental30.registerClient("", "");
        rental30.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation37 = rental30.showClientReservations("hi!");
        java.lang.String str41 = rental30.makeReservation("hi!", "", "");
        rental30.cancelReservation("");
        rentalService.Rental rental44 = new rentalService.Rental();
        java.lang.String str47 = rental44.registerClient("", "");
        rental44.cancelReservation("hi!");
        rental44.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car53 = rental44.showCars("");
        rentalService.Rental rental54 = new rentalService.Rental();
        rental54.pickupCar("");
        rental54.dropoffCar("");
        rental54.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation62 = rental54.showClientReservations("hi!");
        rental54.cancelReservation("hi!");
        rental54.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car68 = rental54.showCars("");
        rental54.dropoffCar("");
        rentalService.Rental rental71 = new rentalService.Rental();
        rental71.pickupCar("");
        rental71.dropoffCar("");
        rental71.pickupCar("");
        rentalService.Branch branch78 = null;
        rentalService.Branch[] branch_array79 = new rentalService.Branch[] { branch78 };
        rental71.initialise(branch_array79);
        rental54.initialise(branch_array79);
        rental44.initialise(branch_array79);
        rental30.initialise(branch_array79);
        rental14.initialise(branch_array79);
        rental0.initialise(branch_array79);
        rental0.pickupCar("");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation91 = rental0.showClientReservations("");
        try {
            java.lang.String str94 = rental0.registerClient("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(arraylist_reservation37);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(arraylist_car53);
        org.junit.Assert.assertNotNull(arraylist_reservation62);
        org.junit.Assert.assertNull(arraylist_car68);
        org.junit.Assert.assertNotNull(branch_array79);
        org.junit.Assert.assertNotNull(arraylist_reservation91);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test435");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        java.lang.String str19 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str25 = rental0.makeReservation("hi!", "", "hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car29 = rental0.showCars("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client31 = rental0.showClients("");
        java.util.ArrayList<rentalService.Client> arraylist_client33 = rental0.showClients("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation35 = rental0.showClientReservations("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(arraylist_car29);
        org.junit.Assert.assertNull(arraylist_client31);
        org.junit.Assert.assertNull(arraylist_client33);
        org.junit.Assert.assertNotNull(arraylist_reservation35);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test436");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rentalService.Rental rental10 = new rentalService.Rental();
        rental10.pickupCar("");
        rental10.dropoffCar("");
        rentalService.Rental rental15 = new rentalService.Rental();
        rental15.pickupCar("");
        rental15.dropoffCar("");
        rental15.pickupCar("");
        rentalService.Branch branch22 = null;
        rentalService.Branch[] branch_array23 = new rentalService.Branch[] { branch22 };
        rental15.initialise(branch_array23);
        rental10.initialise(branch_array23);
        rental0.initialise(branch_array23);
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation30 = rental0.showClientReservations("");
        rental0.cancelClientReservation("");
        rentalService.Rental rental33 = new rentalService.Rental();
        rental33.pickupCar("");
        rental33.dropoffCar("");
        rental33.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation41 = rental33.showClientReservations("hi!");
        rentalService.Branch[] branch_array42 = new rentalService.Branch[] {};
        rental33.initialise(branch_array42);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation45 = rental33.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car47 = rental33.showCars("");
        rental33.dropoffCar("hi!");
        java.lang.String str53 = rental33.makeReservation("", "", "hi!");
        rentalService.Rental rental54 = new rentalService.Rental();
        rental54.pickupCar("");
        rental54.dropoffCar("");
        rental54.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation62 = rental54.showClientReservations("hi!");
        rentalService.Branch[] branch_array63 = new rentalService.Branch[] {};
        rental54.initialise(branch_array63);
        java.util.ArrayList<rentalService.Client> arraylist_client66 = rental54.showClients("hi!");
        rental54.dropoffCar("hi!");
        rental54.cancelReservation("hi!");
        rentalService.Rental rental71 = new rentalService.Rental();
        rental71.pickupCar("");
        rental71.dropoffCar("");
        rental71.pickupCar("");
        rentalService.Branch branch78 = null;
        rentalService.Branch[] branch_array79 = new rentalService.Branch[] { branch78 };
        rental71.initialise(branch_array79);
        rental54.initialise(branch_array79);
        rental33.initialise(branch_array79);
        rental0.initialise(branch_array79);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(branch_array23);
        org.junit.Assert.assertNotNull(arraylist_reservation30);
        org.junit.Assert.assertNotNull(arraylist_reservation41);
        org.junit.Assert.assertNotNull(branch_array42);
        org.junit.Assert.assertNotNull(arraylist_reservation45);
        org.junit.Assert.assertNull(arraylist_car47);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(arraylist_reservation62);
        org.junit.Assert.assertNotNull(branch_array63);
        org.junit.Assert.assertNull(arraylist_client66);
        org.junit.Assert.assertNotNull(branch_array79);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test437");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.cancelReservation("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation18 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation20 = rental0.showClientReservations("");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        rentalService.Rental rental25 = new rentalService.Rental();
        rental25.pickupCar("");
        rental25.dropoffCar("");
        rental25.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation33 = rental25.showClientReservations("hi!");
        rental25.cancelReservation("hi!");
        rental25.cancelClientReservation("hi!");
        rental25.pickupCar("");
        rental25.pickupCar("");
        java.lang.String str45 = rental25.makeReservation("", "", "");
        rental25.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client49 = rental25.showClients("");
        rental25.cancelClientReservation("hi!");
        rentalService.Rental rental52 = new rentalService.Rental();
        java.lang.String str55 = rental52.registerClient("", "");
        java.lang.String str59 = rental52.makeReservation("hi!", "", "");
        rentalService.Rental rental60 = new rentalService.Rental();
        java.lang.String str63 = rental60.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation65 = rental60.showClientReservations("");
        rental60.cancelReservation("");
        rentalService.Rental rental68 = new rentalService.Rental();
        rental68.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car72 = rental68.showCars("");
        rental68.dropoffCar("hi!");
        rental68.dropoffCar("");
        rental68.dropoffCar("hi!");
        rentalService.Branch branch79 = null;
        rentalService.Branch[] branch_array80 = new rentalService.Branch[] { branch79 };
        rental68.initialise(branch_array80);
        rental60.initialise(branch_array80);
        rental52.initialise(branch_array80);
        rental25.initialise(branch_array80);
        rental0.initialise(branch_array80);
        rental0.pickupCar("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation18);
        org.junit.Assert.assertNotNull(arraylist_reservation20);
        org.junit.Assert.assertNotNull(arraylist_reservation33);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(arraylist_client49);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(arraylist_reservation65);
        org.junit.Assert.assertNull(arraylist_car72);
        org.junit.Assert.assertNotNull(branch_array80);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test438");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("");
        rental0.cancelReservation("hi!");
        rentalService.Rental rental16 = new rentalService.Rental();
        rental16.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car20 = rental16.showCars("");
        rental16.dropoffCar("");
        rentalService.Rental rental23 = new rentalService.Rental();
        rental23.pickupCar("");
        rental23.dropoffCar("");
        rental23.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation31 = rental23.showClientReservations("hi!");
        rental23.cancelReservation("hi!");
        rental23.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car37 = rental23.showCars("");
        rental23.dropoffCar("");
        rentalService.Rental rental40 = new rentalService.Rental();
        rental40.pickupCar("");
        rental40.dropoffCar("");
        rental40.pickupCar("");
        rentalService.Branch branch47 = null;
        rentalService.Branch[] branch_array48 = new rentalService.Branch[] { branch47 };
        rental40.initialise(branch_array48);
        rental23.initialise(branch_array48);
        rental16.initialise(branch_array48);
        rental0.initialise(branch_array48);
        rental0.dropoffCar("");
        rental0.cancelReservation("");
        rentalService.Branch[] branch_array57 = null;
        rental0.initialise(branch_array57);
        rental0.pickupCar("hi!");
        java.lang.String str64 = rental0.makeReservation("", "", "");
        try {
            java.lang.String str68 = rental0.makeReservation("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
        org.junit.Assert.assertNull(arraylist_car20);
        org.junit.Assert.assertNotNull(arraylist_reservation31);
        org.junit.Assert.assertNull(arraylist_car37);
        org.junit.Assert.assertNotNull(branch_array48);
        org.junit.Assert.assertNull(str64);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test439");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("hi!");
        java.lang.String str16 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Car> arraylist_car18 = rental0.showCars("");
        rental0.dropoffCar("");
        java.lang.String str24 = rental0.makeReservation("hi!", "", "");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(arraylist_car18);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test440");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation5 = rental0.showClientReservations("");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("hi!");
        java.lang.String str12 = rental0.registerClient("", "");
        rental0.pickupCar("");
        rental0.dropoffCar("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation5);
        org.junit.Assert.assertNotNull(arraylist_reservation9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test441");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation10 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental0.showCars("");
        rental0.cancelReservation("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation10);
        org.junit.Assert.assertNull(arraylist_car12);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test442");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.dropoffCar("hi!");
        java.lang.String str14 = rental0.makeReservation("", "", "");
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test443");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation5 = rental0.showClientReservations("");
        rental0.cancelReservation("");
        rentalService.Rental rental8 = new rentalService.Rental();
        rental8.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental8.showCars("");
        rental8.dropoffCar("hi!");
        rental8.dropoffCar("");
        rental8.dropoffCar("hi!");
        rentalService.Branch branch19 = null;
        rentalService.Branch[] branch_array20 = new rentalService.Branch[] { branch19 };
        rental8.initialise(branch_array20);
        rental0.initialise(branch_array20);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation24 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.lang.String str29 = rental0.registerClient("", "hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client31 = rental0.showClients("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation5);
        org.junit.Assert.assertNull(arraylist_car12);
        org.junit.Assert.assertNotNull(branch_array20);
        org.junit.Assert.assertNotNull(arraylist_reservation24);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(arraylist_client31);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test444");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation14 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car16 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        java.lang.String str22 = rental0.makeReservation("hi!", "", "");
        rental0.cancelReservation("");
        rental0.cancelReservation("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNotNull(arraylist_reservation14);
        org.junit.Assert.assertNull(arraylist_car16);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test445");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental0.showCars("");
        rentalService.Rental rental13 = new rentalService.Rental();
        java.lang.String str16 = rental13.registerClient("", "");
        rental13.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation20 = rental13.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation22 = rental13.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car24 = rental13.showCars("");
        rentalService.Rental rental25 = new rentalService.Rental();
        rental25.pickupCar("");
        rental25.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation31 = rental25.showClientReservations("hi!");
        rental25.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client35 = rental25.showClients("");
        rentalService.Rental rental36 = new rentalService.Rental();
        rental36.pickupCar("");
        rental36.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car42 = rental36.showCars("");
        rental36.cancelClientReservation("hi!");
        rental36.cancelReservation("");
        rentalService.Rental rental47 = new rentalService.Rental();
        java.lang.String str50 = rental47.registerClient("", "");
        rental47.cancelReservation("hi!");
        rental47.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car56 = rental47.showCars("");
        rentalService.Rental rental57 = new rentalService.Rental();
        rental57.pickupCar("");
        rental57.dropoffCar("");
        rental57.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation65 = rental57.showClientReservations("hi!");
        rental57.cancelReservation("hi!");
        rental57.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car71 = rental57.showCars("");
        rental57.dropoffCar("");
        rentalService.Rental rental74 = new rentalService.Rental();
        rental74.pickupCar("");
        rental74.dropoffCar("");
        rental74.pickupCar("");
        rentalService.Branch branch81 = null;
        rentalService.Branch[] branch_array82 = new rentalService.Branch[] { branch81 };
        rental74.initialise(branch_array82);
        rental57.initialise(branch_array82);
        rental47.initialise(branch_array82);
        rental36.initialise(branch_array82);
        rental25.initialise(branch_array82);
        rental13.initialise(branch_array82);
        rental0.initialise(branch_array82);
        java.util.ArrayList<rentalService.Car> arraylist_car91 = rental0.showCars("");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client95 = rental0.showClients("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(arraylist_reservation20);
        org.junit.Assert.assertNotNull(arraylist_reservation22);
        org.junit.Assert.assertNull(arraylist_car24);
        org.junit.Assert.assertNotNull(arraylist_reservation31);
        org.junit.Assert.assertNull(arraylist_client35);
        org.junit.Assert.assertNull(arraylist_car42);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(arraylist_car56);
        org.junit.Assert.assertNotNull(arraylist_reservation65);
        org.junit.Assert.assertNull(arraylist_car71);
        org.junit.Assert.assertNotNull(branch_array82);
        org.junit.Assert.assertNull(arraylist_car91);
        org.junit.Assert.assertNull(arraylist_client95);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test446");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        java.lang.String str13 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("");
        java.util.ArrayList<rentalService.Client> arraylist_client17 = rental0.showClients("");
        rentalService.Rental rental18 = new rentalService.Rental();
        java.lang.String str21 = rental18.registerClient("", "");
        rental18.cancelReservation("hi!");
        rental18.pickupCar("");
        rental18.pickupCar("");
        rentalService.Rental rental28 = new rentalService.Rental();
        rental28.pickupCar("");
        rental28.dropoffCar("");
        rentalService.Rental rental33 = new rentalService.Rental();
        rental33.pickupCar("");
        rental33.dropoffCar("");
        rental33.pickupCar("");
        rentalService.Branch branch40 = null;
        rentalService.Branch[] branch_array41 = new rentalService.Branch[] { branch40 };
        rental33.initialise(branch_array41);
        rental28.initialise(branch_array41);
        rental18.initialise(branch_array41);
        rental0.initialise(branch_array41);
        java.util.ArrayList<rentalService.Client> arraylist_client47 = rental0.showClients("");
        java.util.ArrayList<rentalService.Client> arraylist_client49 = rental0.showClients("");
        rental0.pickupCar("");
        rental0.pickupCar("");
        java.lang.String str56 = rental0.registerClient("", "hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(arraylist_client17);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(branch_array41);
        org.junit.Assert.assertNull(arraylist_client47);
        org.junit.Assert.assertNull(arraylist_client49);
        org.junit.Assert.assertNull(str56);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test447");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rentalService.Rental rental5 = new rentalService.Rental();
        rental5.pickupCar("");
        rental5.dropoffCar("");
        rental5.pickupCar("");
        rentalService.Branch branch12 = null;
        rentalService.Branch[] branch_array13 = new rentalService.Branch[] { branch12 };
        rental5.initialise(branch_array13);
        rental0.initialise(branch_array13);
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation19 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation21 = rental0.showClientReservations("hi!");
        org.junit.Assert.assertNotNull(branch_array13);
        org.junit.Assert.assertNotNull(arraylist_reservation19);
        org.junit.Assert.assertNotNull(arraylist_reservation21);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test448");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.cancelReservation("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation18 = rental0.showClientReservations("hi!");
        rental0.cancelClientReservation("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation18);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test449");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str22 = rental0.makeReservation("", "", "");
        java.lang.String str25 = rental0.registerClient("", "");
        rental0.cancelReservation("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation31 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(arraylist_reservation31);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test450");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation20 = rental0.showClientReservations("");
        rental0.dropoffCar("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(arraylist_reservation20);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test451");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation15 = rental0.showClientReservations("hi!");
        rentalService.Rental rental16 = new rentalService.Rental();
        rental16.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car20 = rental16.showCars("");
        rental16.dropoffCar("hi!");
        rental16.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client26 = rental16.showClients("");
        rentalService.Rental rental27 = new rentalService.Rental();
        rental27.pickupCar("");
        rental27.dropoffCar("");
        rental27.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation35 = rental27.showClientReservations("hi!");
        rental27.cancelReservation("hi!");
        rental27.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car41 = rental27.showCars("");
        rental27.dropoffCar("");
        rentalService.Rental rental44 = new rentalService.Rental();
        rental44.pickupCar("");
        rental44.dropoffCar("");
        rental44.pickupCar("");
        rentalService.Branch branch51 = null;
        rentalService.Branch[] branch_array52 = new rentalService.Branch[] { branch51 };
        rental44.initialise(branch_array52);
        rental27.initialise(branch_array52);
        rentalService.Rental rental55 = new rentalService.Rental();
        rental55.pickupCar("");
        rental55.dropoffCar("");
        rental55.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation63 = rental55.showClientReservations("hi!");
        rentalService.Branch[] branch_array64 = new rentalService.Branch[] {};
        rental55.initialise(branch_array64);
        rental27.initialise(branch_array64);
        rental16.initialise(branch_array64);
        rental0.initialise(branch_array64);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation15);
        org.junit.Assert.assertNull(arraylist_car20);
        org.junit.Assert.assertNull(arraylist_client26);
        org.junit.Assert.assertNotNull(arraylist_reservation35);
        org.junit.Assert.assertNull(arraylist_car41);
        org.junit.Assert.assertNotNull(branch_array52);
        org.junit.Assert.assertNotNull(arraylist_reservation63);
        org.junit.Assert.assertNotNull(branch_array64);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test452");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation10 = rental0.showClientReservations("");
        rental0.cancelClientReservation("hi!");
        rentalService.Rental rental13 = new rentalService.Rental();
        java.lang.String str16 = rental13.registerClient("", "");
        rental13.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation20 = rental13.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation22 = rental13.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car24 = rental13.showCars("");
        rentalService.Rental rental25 = new rentalService.Rental();
        rental25.pickupCar("");
        rental25.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation31 = rental25.showClientReservations("hi!");
        rental25.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client35 = rental25.showClients("");
        rentalService.Rental rental36 = new rentalService.Rental();
        rental36.pickupCar("");
        rental36.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car42 = rental36.showCars("");
        rental36.cancelClientReservation("hi!");
        rental36.cancelReservation("");
        rentalService.Rental rental47 = new rentalService.Rental();
        java.lang.String str50 = rental47.registerClient("", "");
        rental47.cancelReservation("hi!");
        rental47.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car56 = rental47.showCars("");
        rentalService.Rental rental57 = new rentalService.Rental();
        rental57.pickupCar("");
        rental57.dropoffCar("");
        rental57.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation65 = rental57.showClientReservations("hi!");
        rental57.cancelReservation("hi!");
        rental57.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car71 = rental57.showCars("");
        rental57.dropoffCar("");
        rentalService.Rental rental74 = new rentalService.Rental();
        rental74.pickupCar("");
        rental74.dropoffCar("");
        rental74.pickupCar("");
        rentalService.Branch branch81 = null;
        rentalService.Branch[] branch_array82 = new rentalService.Branch[] { branch81 };
        rental74.initialise(branch_array82);
        rental57.initialise(branch_array82);
        rental47.initialise(branch_array82);
        rental36.initialise(branch_array82);
        rental25.initialise(branch_array82);
        rental13.initialise(branch_array82);
        rental0.initialise(branch_array82);
        rental0.cancelReservation("hi!");
        try {
            java.util.ArrayList<rentalService.Client> arraylist_client93 = rental0.showClients("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNotNull(arraylist_reservation10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(arraylist_reservation20);
        org.junit.Assert.assertNotNull(arraylist_reservation22);
        org.junit.Assert.assertNull(arraylist_car24);
        org.junit.Assert.assertNotNull(arraylist_reservation31);
        org.junit.Assert.assertNull(arraylist_client35);
        org.junit.Assert.assertNull(arraylist_car42);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(arraylist_car56);
        org.junit.Assert.assertNotNull(arraylist_reservation65);
        org.junit.Assert.assertNull(arraylist_car71);
        org.junit.Assert.assertNotNull(branch_array82);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test453");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        rental0.cancelReservation("");
        rentalService.Rental rental14 = new rentalService.Rental();
        java.lang.String str17 = rental14.registerClient("", "");
        rental14.cancelReservation("hi!");
        rental14.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car23 = rental14.showCars("");
        rentalService.Rental rental24 = new rentalService.Rental();
        rental24.pickupCar("");
        rental24.dropoffCar("");
        rental24.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation32 = rental24.showClientReservations("hi!");
        rental24.cancelReservation("hi!");
        rental24.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car38 = rental24.showCars("");
        rental24.dropoffCar("");
        rentalService.Rental rental41 = new rentalService.Rental();
        rental41.pickupCar("");
        rental41.dropoffCar("");
        rental41.pickupCar("");
        rentalService.Branch branch48 = null;
        rentalService.Branch[] branch_array49 = new rentalService.Branch[] { branch48 };
        rental41.initialise(branch_array49);
        rental24.initialise(branch_array49);
        rental14.initialise(branch_array49);
        rental0.initialise(branch_array49);
        java.util.ArrayList<rentalService.Client> arraylist_client55 = rental0.showClients("");
        java.lang.String str58 = rental0.registerClient("", "");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car66 = rental0.showCars("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(arraylist_car23);
        org.junit.Assert.assertNotNull(arraylist_reservation32);
        org.junit.Assert.assertNull(arraylist_car38);
        org.junit.Assert.assertNotNull(branch_array49);
        org.junit.Assert.assertNull(arraylist_client55);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(arraylist_car66);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test454");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        java.lang.String str17 = rental0.makeReservation("", "", "");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client25 = rental0.showClients("");
        java.lang.String str28 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation30 = rental0.showClientReservations("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(arraylist_client25);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(arraylist_reservation30);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test455");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        rental0.cancelClientReservation("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation17 = rental0.showClientReservations("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(arraylist_reservation17);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test456");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation16 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car18 = rental0.showCars("hi!");
        java.lang.String str21 = rental0.registerClient("hi!", "");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation25 = rental0.showClientReservations("");
        java.lang.String str29 = rental0.makeReservation("hi!", "", "");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(arraylist_reservation16);
        org.junit.Assert.assertNull(arraylist_car18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(arraylist_reservation25);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test457");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        java.lang.String str19 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str25 = rental0.makeReservation("hi!", "", "hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car29 = rental0.showCars("hi!");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(arraylist_car29);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test458");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.lang.String str6 = rental0.registerClient("", "");
        rental0.pickupCar("");
        rental0.dropoffCar("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test459");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.lang.String str11 = rental0.registerClient("", "hi!");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client15 = rental0.showClients("");
        rental0.dropoffCar("");
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(arraylist_client15);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test460");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.dropoffCar("");
        rentalService.Rental rental17 = new rentalService.Rental();
        rental17.pickupCar("");
        rental17.dropoffCar("");
        rental17.pickupCar("");
        rentalService.Branch branch24 = null;
        rentalService.Branch[] branch_array25 = new rentalService.Branch[] { branch24 };
        rental17.initialise(branch_array25);
        rental0.initialise(branch_array25);
        rental0.cancelClientReservation("");
        rental0.cancelClientReservation("");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client35 = rental0.showClients("");
        rental0.dropoffCar("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(branch_array25);
        org.junit.Assert.assertNull(arraylist_client35);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test461");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        rentalService.Branch branch7 = null;
        rentalService.Branch[] branch_array8 = new rentalService.Branch[] { branch7 };
        rental0.initialise(branch_array8);
        try {
            java.lang.String str12 = rental0.registerClient("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(branch_array8);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test462");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Client> arraylist_client12 = rental0.showClients("hi!");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation20 = rental0.showClientReservations("");
        rental0.pickupCar("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation26 = rental0.showClientReservations("");
        rental0.cancelReservation("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNull(arraylist_client12);
        org.junit.Assert.assertNotNull(arraylist_reservation20);
        org.junit.Assert.assertNotNull(arraylist_reservation26);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test463");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str12 = rental0.makeReservation("", "", "");
        rental0.pickupCar("");
        rental0.pickupCar("hi!");
        rentalService.Rental rental17 = new rentalService.Rental();
        rental17.pickupCar("");
        rental17.dropoffCar("");
        rental17.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation25 = rental17.showClientReservations("hi!");
        rental17.cancelReservation("hi!");
        rental17.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car31 = rental17.showCars("");
        rental17.dropoffCar("");
        rentalService.Rental rental34 = new rentalService.Rental();
        rental34.pickupCar("");
        rental34.dropoffCar("");
        rental34.pickupCar("");
        rentalService.Branch branch41 = null;
        rentalService.Branch[] branch_array42 = new rentalService.Branch[] { branch41 };
        rental34.initialise(branch_array42);
        rental17.initialise(branch_array42);
        rental0.initialise(branch_array42);
        rental0.dropoffCar("");
        try {
            java.lang.String str51 = rental0.makeReservation("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(arraylist_reservation25);
        org.junit.Assert.assertNull(arraylist_car31);
        org.junit.Assert.assertNotNull(branch_array42);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test464");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental0.showCars("");
        rental0.dropoffCar("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(arraylist_client10);
        org.junit.Assert.assertNull(arraylist_car12);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test465");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("");
        rental0.cancelReservation("hi!");
        java.lang.String str14 = rental0.makeReservation("hi!", "", "");
        rental0.dropoffCar("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test466");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation5 = rental0.showClientReservations("");
        rental0.cancelReservation("");
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.cancelClientReservation("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation5);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test467");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.pickupCar("hi!");
        rentalService.Rental rental17 = new rentalService.Rental();
        java.lang.String str20 = rental17.registerClient("", "");
        rental17.cancelReservation("hi!");
        rental17.pickupCar("");
        rental17.pickupCar("");
        rental17.dropoffCar("hi!");
        rental17.cancelReservation("hi!");
        rental17.cancelReservation("");
        rentalService.Rental rental33 = new rentalService.Rental();
        java.lang.String str36 = rental33.registerClient("", "");
        rental33.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation40 = rental33.showClientReservations("hi!");
        java.lang.String str44 = rental33.makeReservation("hi!", "", "");
        rental33.cancelReservation("");
        rentalService.Rental rental47 = new rentalService.Rental();
        java.lang.String str50 = rental47.registerClient("", "");
        rental47.cancelReservation("hi!");
        rental47.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car56 = rental47.showCars("");
        rentalService.Rental rental57 = new rentalService.Rental();
        rental57.pickupCar("");
        rental57.dropoffCar("");
        rental57.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation65 = rental57.showClientReservations("hi!");
        rental57.cancelReservation("hi!");
        rental57.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car71 = rental57.showCars("");
        rental57.dropoffCar("");
        rentalService.Rental rental74 = new rentalService.Rental();
        rental74.pickupCar("");
        rental74.dropoffCar("");
        rental74.pickupCar("");
        rentalService.Branch branch81 = null;
        rentalService.Branch[] branch_array82 = new rentalService.Branch[] { branch81 };
        rental74.initialise(branch_array82);
        rental57.initialise(branch_array82);
        rental47.initialise(branch_array82);
        rental33.initialise(branch_array82);
        rental17.initialise(branch_array82);
        rental0.initialise(branch_array82);
        rental0.pickupCar("hi!");
        try {
            java.util.ArrayList<rentalService.Car> arraylist_car92 = rental0.showCars("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(arraylist_reservation40);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(arraylist_car56);
        org.junit.Assert.assertNotNull(arraylist_reservation65);
        org.junit.Assert.assertNull(arraylist_car71);
        org.junit.Assert.assertNotNull(branch_array82);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test468");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client14 = rental0.showClients("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(arraylist_client14);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test469");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rentalService.Branch[] branch_array5 = null;
        rental0.initialise(branch_array5);
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client12 = rental0.showClients("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation16 = rental0.showClientReservations("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(arraylist_client12);
        org.junit.Assert.assertNotNull(arraylist_reservation16);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test470");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation10 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNotNull(arraylist_reservation10);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test471");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car6 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        rentalService.Rental rental11 = new rentalService.Rental();
        java.lang.String str14 = rental11.registerClient("", "");
        rental11.cancelReservation("hi!");
        rental11.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car20 = rental11.showCars("");
        rentalService.Rental rental21 = new rentalService.Rental();
        rental21.pickupCar("");
        rental21.dropoffCar("");
        rental21.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation29 = rental21.showClientReservations("hi!");
        rental21.cancelReservation("hi!");
        rental21.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car35 = rental21.showCars("");
        rental21.dropoffCar("");
        rentalService.Rental rental38 = new rentalService.Rental();
        rental38.pickupCar("");
        rental38.dropoffCar("");
        rental38.pickupCar("");
        rentalService.Branch branch45 = null;
        rentalService.Branch[] branch_array46 = new rentalService.Branch[] { branch45 };
        rental38.initialise(branch_array46);
        rental21.initialise(branch_array46);
        rental11.initialise(branch_array46);
        rental0.initialise(branch_array46);
        rental0.pickupCar("");
        rental0.cancelClientReservation("hi!");
        java.lang.String str58 = rental0.makeReservation("", "", "");
        org.junit.Assert.assertNull(arraylist_car6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(arraylist_car20);
        org.junit.Assert.assertNotNull(arraylist_reservation29);
        org.junit.Assert.assertNull(arraylist_car35);
        org.junit.Assert.assertNotNull(branch_array46);
        org.junit.Assert.assertNull(str58);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test472");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Client> arraylist_client12 = rental0.showClients("hi!");
        rentalService.Rental rental13 = new rentalService.Rental();
        java.lang.String str16 = rental13.registerClient("", "");
        rental13.cancelReservation("hi!");
        rental13.pickupCar("");
        rental13.pickupCar("");
        rentalService.Rental rental23 = new rentalService.Rental();
        rental23.pickupCar("");
        rental23.dropoffCar("");
        rentalService.Rental rental28 = new rentalService.Rental();
        rental28.pickupCar("");
        rental28.dropoffCar("");
        rental28.pickupCar("");
        rentalService.Branch branch35 = null;
        rentalService.Branch[] branch_array36 = new rentalService.Branch[] { branch35 };
        rental28.initialise(branch_array36);
        rental23.initialise(branch_array36);
        rental13.initialise(branch_array36);
        rental0.initialise(branch_array36);
        java.util.ArrayList<rentalService.Client> arraylist_client42 = rental0.showClients("");
        java.lang.String str45 = rental0.registerClient("", "hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation49 = rental0.showClientReservations("");
        rentalService.Rental rental50 = new rentalService.Rental();
        rental50.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car54 = rental50.showCars("");
        rental50.dropoffCar("hi!");
        rental50.dropoffCar("");
        rental50.dropoffCar("hi!");
        rentalService.Branch branch61 = null;
        rentalService.Branch[] branch_array62 = new rentalService.Branch[] { branch61 };
        rental50.initialise(branch_array62);
        rentalService.Rental rental64 = new rentalService.Rental();
        rental64.pickupCar("");
        rental64.dropoffCar("");
        rentalService.Rental rental69 = new rentalService.Rental();
        rental69.pickupCar("");
        rental69.dropoffCar("");
        rental69.pickupCar("");
        rentalService.Branch branch76 = null;
        rentalService.Branch[] branch_array77 = new rentalService.Branch[] { branch76 };
        rental69.initialise(branch_array77);
        rental64.initialise(branch_array77);
        rental50.initialise(branch_array77);
        rental0.initialise(branch_array77);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation83 = rental0.showClientReservations("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNull(arraylist_client12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(branch_array36);
        org.junit.Assert.assertNull(arraylist_client42);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(arraylist_reservation49);
        org.junit.Assert.assertNull(arraylist_car54);
        org.junit.Assert.assertNotNull(branch_array62);
        org.junit.Assert.assertNotNull(branch_array77);
        org.junit.Assert.assertNotNull(arraylist_reservation83);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test473");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rentalService.Rental rental10 = new rentalService.Rental();
        rental10.pickupCar("");
        rental10.dropoffCar("");
        rentalService.Rental rental15 = new rentalService.Rental();
        rental15.pickupCar("");
        rental15.dropoffCar("");
        rental15.pickupCar("");
        rentalService.Branch branch22 = null;
        rentalService.Branch[] branch_array23 = new rentalService.Branch[] { branch22 };
        rental15.initialise(branch_array23);
        rental10.initialise(branch_array23);
        rental0.initialise(branch_array23);
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(branch_array23);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test474");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation10 = rental0.showClientReservations("");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("");
        rentalService.Rental rental15 = new rentalService.Rental();
        rental15.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car19 = rental15.showCars("");
        rental15.dropoffCar("hi!");
        rental15.dropoffCar("");
        rental15.cancelReservation("hi!");
        java.lang.String str28 = rental15.registerClient("", "hi!");
        rental15.cancelClientReservation("");
        java.util.ArrayList<rentalService.Client> arraylist_client32 = rental15.showClients("");
        rentalService.Rental rental33 = new rentalService.Rental();
        java.lang.String str36 = rental33.registerClient("", "");
        rental33.cancelReservation("hi!");
        rental33.pickupCar("");
        rental33.pickupCar("");
        rentalService.Rental rental43 = new rentalService.Rental();
        rental43.pickupCar("");
        rental43.dropoffCar("");
        rentalService.Rental rental48 = new rentalService.Rental();
        rental48.pickupCar("");
        rental48.dropoffCar("");
        rental48.pickupCar("");
        rentalService.Branch branch55 = null;
        rentalService.Branch[] branch_array56 = new rentalService.Branch[] { branch55 };
        rental48.initialise(branch_array56);
        rental43.initialise(branch_array56);
        rental33.initialise(branch_array56);
        rental15.initialise(branch_array56);
        rental0.initialise(branch_array56);
        rental0.dropoffCar("");
        rental0.pickupCar("hi!");
        rental0.dropoffCar("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNotNull(arraylist_reservation10);
        org.junit.Assert.assertNull(arraylist_car19);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(arraylist_client32);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(branch_array56);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test475");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str11 = rental0.registerClient("", "hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car13 = rental0.showCars("");
        rental0.cancelClientReservation("");
        java.util.ArrayList<rentalService.Client> arraylist_client17 = rental0.showClients("");
        java.util.ArrayList<rentalService.Client> arraylist_client19 = rental0.showClients("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(arraylist_car13);
        org.junit.Assert.assertNull(arraylist_client17);
        org.junit.Assert.assertNull(arraylist_client19);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test476");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("");
        rentalService.Rental rental9 = new rentalService.Rental();
        java.lang.String str12 = rental9.registerClient("", "");
        rental9.cancelReservation("hi!");
        rental9.pickupCar("");
        rental9.pickupCar("");
        rentalService.Rental rental19 = new rentalService.Rental();
        rental19.pickupCar("");
        rental19.dropoffCar("");
        rentalService.Rental rental24 = new rentalService.Rental();
        rental24.pickupCar("");
        rental24.dropoffCar("");
        rental24.pickupCar("");
        rentalService.Branch branch31 = null;
        rentalService.Branch[] branch_array32 = new rentalService.Branch[] { branch31 };
        rental24.initialise(branch_array32);
        rental19.initialise(branch_array32);
        rental9.initialise(branch_array32);
        rental0.initialise(branch_array32);
        java.lang.String str40 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation42 = rental0.showClientReservations("");
        java.lang.String str45 = rental0.registerClient("", "");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(branch_array32);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(arraylist_reservation42);
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test477");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("");
        rentalService.Rental rental11 = new rentalService.Rental();
        rental11.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car15 = rental11.showCars("");
        rentalService.Branch[] branch_array16 = null;
        rental11.initialise(branch_array16);
        rental11.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client21 = rental11.showClients("");
        rentalService.Rental rental22 = new rentalService.Rental();
        rental22.pickupCar("");
        rental22.dropoffCar("");
        rental22.pickupCar("");
        rentalService.Branch branch29 = null;
        rentalService.Branch[] branch_array30 = new rentalService.Branch[] { branch29 };
        rental22.initialise(branch_array30);
        rental11.initialise(branch_array30);
        rental0.initialise(branch_array30);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation35 = rental0.showClientReservations("");
        rentalService.Rental rental36 = new rentalService.Rental();
        rental36.pickupCar("");
        rental36.dropoffCar("");
        rental36.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation44 = rental36.showClientReservations("hi!");
        rental36.cancelReservation("hi!");
        rental36.cancelClientReservation("hi!");
        rental36.pickupCar("");
        rental36.pickupCar("");
        rental36.pickupCar("hi!");
        rentalService.Rental rental55 = new rentalService.Rental();
        rental55.pickupCar("");
        rental55.dropoffCar("");
        rental55.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation63 = rental55.showClientReservations("hi!");
        rentalService.Branch[] branch_array64 = new rentalService.Branch[] {};
        rental55.initialise(branch_array64);
        rental36.initialise(branch_array64);
        rental0.initialise(branch_array64);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(arraylist_client10);
        org.junit.Assert.assertNull(arraylist_car15);
        org.junit.Assert.assertNull(arraylist_client21);
        org.junit.Assert.assertNotNull(branch_array30);
        org.junit.Assert.assertNotNull(arraylist_reservation35);
        org.junit.Assert.assertNotNull(arraylist_reservation44);
        org.junit.Assert.assertNotNull(arraylist_reservation63);
        org.junit.Assert.assertNotNull(branch_array64);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test478");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation10 = rental0.showClientReservations("");
        rental0.cancelClientReservation("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNotNull(arraylist_reservation10);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test479");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str12 = rental0.makeReservation("", "", "");
        rentalService.Branch[] branch_array13 = null;
        rental0.initialise(branch_array13);
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation18 = rental0.showClientReservations("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(arraylist_reservation18);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test480");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.lang.String str7 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("");
        java.lang.String str12 = rental0.registerClient("", "");
        rental0.cancelClientReservation("hi!");
        rentalService.Rental rental15 = new rentalService.Rental();
        java.lang.String str18 = rental15.registerClient("", "");
        rental15.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation22 = rental15.showClientReservations("hi!");
        java.lang.String str26 = rental15.makeReservation("hi!", "", "");
        rental15.cancelReservation("");
        java.lang.String str32 = rental15.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Client> arraylist_client34 = rental15.showClients("");
        rental15.pickupCar("");
        rentalService.Rental rental37 = new rentalService.Rental();
        rental37.pickupCar("");
        rental37.dropoffCar("");
        rental37.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation45 = rental37.showClientReservations("hi!");
        rental37.cancelReservation("hi!");
        rental37.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car51 = rental37.showCars("");
        rental37.dropoffCar("");
        rentalService.Rental rental54 = new rentalService.Rental();
        rental54.pickupCar("");
        rental54.dropoffCar("");
        rental54.pickupCar("");
        rentalService.Branch branch61 = null;
        rentalService.Branch[] branch_array62 = new rentalService.Branch[] { branch61 };
        rental54.initialise(branch_array62);
        rental37.initialise(branch_array62);
        rental15.initialise(branch_array62);
        rental0.initialise(branch_array62);
        try {
            java.lang.String str70 = rental0.makeReservation("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(arraylist_reservation9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(arraylist_reservation22);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(arraylist_client34);
        org.junit.Assert.assertNotNull(arraylist_reservation45);
        org.junit.Assert.assertNull(arraylist_car51);
        org.junit.Assert.assertNotNull(branch_array62);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test481");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car6 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental0.showCars("");
        rentalService.Rental rental13 = new rentalService.Rental();
        rental13.pickupCar("");
        rental13.dropoffCar("");
        rental13.pickupCar("");
        rentalService.Branch branch20 = null;
        rentalService.Branch[] branch_array21 = new rentalService.Branch[] { branch20 };
        rental13.initialise(branch_array21);
        rental13.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation26 = rental13.showClientReservations("hi!");
        rentalService.Rental rental27 = new rentalService.Rental();
        java.lang.String str30 = rental27.registerClient("", "");
        rental27.cancelReservation("hi!");
        rental27.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car36 = rental27.showCars("");
        rentalService.Rental rental37 = new rentalService.Rental();
        rental37.pickupCar("");
        rental37.dropoffCar("");
        rental37.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation45 = rental37.showClientReservations("hi!");
        rental37.cancelReservation("hi!");
        rental37.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car51 = rental37.showCars("");
        rental37.dropoffCar("");
        rentalService.Rental rental54 = new rentalService.Rental();
        rental54.pickupCar("");
        rental54.dropoffCar("");
        rental54.pickupCar("");
        rentalService.Branch branch61 = null;
        rentalService.Branch[] branch_array62 = new rentalService.Branch[] { branch61 };
        rental54.initialise(branch_array62);
        rental37.initialise(branch_array62);
        rental27.initialise(branch_array62);
        rental13.initialise(branch_array62);
        rental0.initialise(branch_array62);
        rental0.cancelReservation("hi!");
        rental0.pickupCar("hi!");
        rental0.dropoffCar("");
        try {
            java.util.ArrayList<rentalService.Car> arraylist_car75 = rental0.showCars("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(arraylist_car6);
        org.junit.Assert.assertNull(arraylist_car12);
        org.junit.Assert.assertNotNull(branch_array21);
        org.junit.Assert.assertNotNull(arraylist_reservation26);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(arraylist_car36);
        org.junit.Assert.assertNotNull(arraylist_reservation45);
        org.junit.Assert.assertNull(arraylist_car51);
        org.junit.Assert.assertNotNull(branch_array62);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test482");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.lang.String str9 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car13 = rental0.showCars("");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation17 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation19 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation21 = rental0.showClientReservations("");
        rentalService.Rental rental22 = new rentalService.Rental();
        java.lang.String str25 = rental22.registerClient("", "");
        rental22.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation29 = rental22.showClientReservations("hi!");
        rental22.dropoffCar("hi!");
        rental22.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation35 = rental22.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car37 = rental22.showCars("");
        rentalService.Rental rental38 = new rentalService.Rental();
        java.lang.String str41 = rental38.registerClient("", "");
        rental38.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation45 = rental38.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation47 = rental38.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation49 = rental38.showClientReservations("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation51 = rental38.showClientReservations("hi!");
        rentalService.Rental rental52 = new rentalService.Rental();
        rental52.pickupCar("");
        rental52.dropoffCar("");
        rental52.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation60 = rental52.showClientReservations("hi!");
        rental52.cancelReservation("hi!");
        rental52.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car66 = rental52.showCars("");
        rental52.dropoffCar("");
        rentalService.Rental rental69 = new rentalService.Rental();
        rental69.pickupCar("");
        rental69.dropoffCar("");
        rental69.pickupCar("");
        rentalService.Branch branch76 = null;
        rentalService.Branch[] branch_array77 = new rentalService.Branch[] { branch76 };
        rental69.initialise(branch_array77);
        rental52.initialise(branch_array77);
        rental38.initialise(branch_array77);
        rental22.initialise(branch_array77);
        rental0.initialise(branch_array77);
        rental0.cancelClientReservation("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation88 = rental0.showClientReservations("");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(arraylist_car13);
        org.junit.Assert.assertNotNull(arraylist_reservation17);
        org.junit.Assert.assertNotNull(arraylist_reservation19);
        org.junit.Assert.assertNotNull(arraylist_reservation21);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(arraylist_reservation29);
        org.junit.Assert.assertNotNull(arraylist_reservation35);
        org.junit.Assert.assertNull(arraylist_car37);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(arraylist_reservation45);
        org.junit.Assert.assertNotNull(arraylist_reservation47);
        org.junit.Assert.assertNotNull(arraylist_reservation49);
        org.junit.Assert.assertNotNull(arraylist_reservation51);
        org.junit.Assert.assertNotNull(arraylist_reservation60);
        org.junit.Assert.assertNull(arraylist_car66);
        org.junit.Assert.assertNotNull(branch_array77);
        org.junit.Assert.assertNotNull(arraylist_reservation88);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test483");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        java.lang.String str18 = rental0.makeReservation("", "", "hi!");
        rentalService.Rental rental19 = new rentalService.Rental();
        rental19.pickupCar("");
        rental19.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car25 = rental19.showCars("");
        rental19.cancelClientReservation("hi!");
        rental19.cancelReservation("");
        java.util.ArrayList<rentalService.Car> arraylist_car31 = rental19.showCars("");
        rentalService.Rental rental32 = new rentalService.Rental();
        rental32.pickupCar("");
        rental32.dropoffCar("");
        rental32.pickupCar("");
        rentalService.Branch branch39 = null;
        rentalService.Branch[] branch_array40 = new rentalService.Branch[] { branch39 };
        rental32.initialise(branch_array40);
        rental32.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation45 = rental32.showClientReservations("hi!");
        rentalService.Rental rental46 = new rentalService.Rental();
        java.lang.String str49 = rental46.registerClient("", "");
        rental46.cancelReservation("hi!");
        rental46.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car55 = rental46.showCars("");
        rentalService.Rental rental56 = new rentalService.Rental();
        rental56.pickupCar("");
        rental56.dropoffCar("");
        rental56.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation64 = rental56.showClientReservations("hi!");
        rental56.cancelReservation("hi!");
        rental56.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car70 = rental56.showCars("");
        rental56.dropoffCar("");
        rentalService.Rental rental73 = new rentalService.Rental();
        rental73.pickupCar("");
        rental73.dropoffCar("");
        rental73.pickupCar("");
        rentalService.Branch branch80 = null;
        rentalService.Branch[] branch_array81 = new rentalService.Branch[] { branch80 };
        rental73.initialise(branch_array81);
        rental56.initialise(branch_array81);
        rental46.initialise(branch_array81);
        rental32.initialise(branch_array81);
        rental19.initialise(branch_array81);
        rental0.initialise(branch_array81);
        try {
            java.lang.String str90 = rental0.registerClient("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(arraylist_car25);
        org.junit.Assert.assertNull(arraylist_car31);
        org.junit.Assert.assertNotNull(branch_array40);
        org.junit.Assert.assertNotNull(arraylist_reservation45);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(arraylist_car55);
        org.junit.Assert.assertNotNull(arraylist_reservation64);
        org.junit.Assert.assertNull(arraylist_car70);
        org.junit.Assert.assertNotNull(branch_array81);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test484");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client20 = rental0.showClients("hi!");
        rental0.cancelClientReservation("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(arraylist_client20);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test485");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.lang.String str9 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car13 = rental0.showCars("");
        rentalService.Rental rental14 = new rentalService.Rental();
        rental14.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car18 = rental14.showCars("");
        rental14.dropoffCar("");
        rentalService.Rental rental21 = new rentalService.Rental();
        rental21.pickupCar("");
        rental21.dropoffCar("");
        rental21.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation29 = rental21.showClientReservations("hi!");
        rental21.cancelReservation("hi!");
        rental21.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car35 = rental21.showCars("");
        rental21.dropoffCar("");
        rentalService.Rental rental38 = new rentalService.Rental();
        rental38.pickupCar("");
        rental38.dropoffCar("");
        rental38.pickupCar("");
        rentalService.Branch branch45 = null;
        rentalService.Branch[] branch_array46 = new rentalService.Branch[] { branch45 };
        rental38.initialise(branch_array46);
        rental21.initialise(branch_array46);
        rental14.initialise(branch_array46);
        rental0.initialise(branch_array46);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation52 = rental0.showClientReservations("");
        rental0.dropoffCar("hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(arraylist_car13);
        org.junit.Assert.assertNull(arraylist_car18);
        org.junit.Assert.assertNotNull(arraylist_reservation29);
        org.junit.Assert.assertNull(arraylist_car35);
        org.junit.Assert.assertNotNull(branch_array46);
        org.junit.Assert.assertNotNull(arraylist_reservation52);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test486");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.pickupCar("hi!");
        rentalService.Rental rental19 = new rentalService.Rental();
        rental19.pickupCar("");
        rental19.dropoffCar("");
        rental19.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation27 = rental19.showClientReservations("hi!");
        rentalService.Branch[] branch_array28 = new rentalService.Branch[] {};
        rental19.initialise(branch_array28);
        rental0.initialise(branch_array28);
        java.util.ArrayList<rentalService.Car> arraylist_car32 = rental0.showCars("");
        rental0.dropoffCar("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(arraylist_reservation27);
        org.junit.Assert.assertNotNull(branch_array28);
        org.junit.Assert.assertNull(arraylist_car32);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test487");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation10 = rental0.showClientReservations("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client16 = rental0.showClients("");
        rental0.cancelReservation("");
        java.lang.String str21 = rental0.registerClient("", "");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNotNull(arraylist_reservation10);
        org.junit.Assert.assertNull(arraylist_client16);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test488");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation14 = rental0.showClientReservations("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(arraylist_reservation14);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test489");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str12 = rental0.makeReservation("", "", "");
        rentalService.Branch[] branch_array13 = null;
        rental0.initialise(branch_array13);
        java.util.ArrayList<rentalService.Client> arraylist_client16 = rental0.showClients("");
        rental0.pickupCar("hi!");
        rental0.pickupCar("");
        try {
            java.lang.String str23 = rental0.registerClient("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(arraylist_client16);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test490");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental0.showCars("");
        java.util.ArrayList<rentalService.Client> arraylist_client14 = rental0.showClients("");
        rentalService.Rental rental15 = new rentalService.Rental();
        rental15.pickupCar("");
        rental15.dropoffCar("");
        rental15.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation23 = rental15.showClientReservations("hi!");
        rental15.cancelReservation("hi!");
        rental15.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car29 = rental15.showCars("");
        rental15.dropoffCar("");
        rentalService.Rental rental32 = new rentalService.Rental();
        rental32.pickupCar("");
        rental32.dropoffCar("");
        rental32.pickupCar("");
        rentalService.Branch branch39 = null;
        rentalService.Branch[] branch_array40 = new rentalService.Branch[] { branch39 };
        rental32.initialise(branch_array40);
        rental15.initialise(branch_array40);
        rentalService.Rental rental43 = new rentalService.Rental();
        rental43.pickupCar("");
        rental43.dropoffCar("");
        rental43.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation51 = rental43.showClientReservations("hi!");
        rentalService.Branch[] branch_array52 = new rentalService.Branch[] {};
        rental43.initialise(branch_array52);
        rental15.initialise(branch_array52);
        java.util.ArrayList<rentalService.Client> arraylist_client56 = rental15.showClients("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car58 = rental15.showCars("");
        rental15.dropoffCar("");
        rentalService.Rental rental61 = new rentalService.Rental();
        rental61.pickupCar("");
        rental61.dropoffCar("");
        rental61.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation69 = rental61.showClientReservations("hi!");
        rentalService.Branch[] branch_array70 = new rentalService.Branch[] {};
        rental61.initialise(branch_array70);
        java.util.ArrayList<rentalService.Client> arraylist_client73 = rental61.showClients("hi!");
        rental61.dropoffCar("hi!");
        rental61.cancelReservation("hi!");
        rentalService.Rental rental78 = new rentalService.Rental();
        rental78.pickupCar("");
        rental78.dropoffCar("");
        rental78.pickupCar("");
        rentalService.Branch branch85 = null;
        rentalService.Branch[] branch_array86 = new rentalService.Branch[] { branch85 };
        rental78.initialise(branch_array86);
        rental61.initialise(branch_array86);
        rental15.initialise(branch_array86);
        rental0.initialise(branch_array86);
        try {
            java.lang.String str93 = rental0.registerClient("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car12);
        org.junit.Assert.assertNull(arraylist_client14);
        org.junit.Assert.assertNotNull(arraylist_reservation23);
        org.junit.Assert.assertNull(arraylist_car29);
        org.junit.Assert.assertNotNull(branch_array40);
        org.junit.Assert.assertNotNull(arraylist_reservation51);
        org.junit.Assert.assertNotNull(branch_array52);
        org.junit.Assert.assertNull(arraylist_client56);
        org.junit.Assert.assertNull(arraylist_car58);
        org.junit.Assert.assertNotNull(arraylist_reservation69);
        org.junit.Assert.assertNotNull(branch_array70);
        org.junit.Assert.assertNull(arraylist_client73);
        org.junit.Assert.assertNotNull(branch_array86);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test491");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.pickupCar("hi!");
        rental0.cancelClientReservation("");
        java.util.ArrayList<rentalService.Car> arraylist_car20 = rental0.showCars("");
        java.util.ArrayList<rentalService.Client> arraylist_client22 = rental0.showClients("");
        rentalService.Rental rental23 = new rentalService.Rental();
        rental23.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car27 = rental23.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation29 = rental23.showClientReservations("hi!");
        rental23.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation33 = rental23.showClientReservations("hi!");
        rentalService.Rental rental34 = new rentalService.Rental();
        rental34.pickupCar("");
        rental34.dropoffCar("");
        rental34.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation42 = rental34.showClientReservations("hi!");
        rental34.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation46 = rental34.showClientReservations("hi!");
        rental34.dropoffCar("hi!");
        rentalService.Rental rental49 = new rentalService.Rental();
        java.lang.String str52 = rental49.registerClient("", "");
        rental49.cancelReservation("hi!");
        rental49.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car58 = rental49.showCars("");
        rentalService.Rental rental59 = new rentalService.Rental();
        rental59.pickupCar("");
        rental59.dropoffCar("");
        rental59.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation67 = rental59.showClientReservations("hi!");
        rental59.cancelReservation("hi!");
        rental59.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car73 = rental59.showCars("");
        rental59.dropoffCar("");
        rentalService.Rental rental76 = new rentalService.Rental();
        rental76.pickupCar("");
        rental76.dropoffCar("");
        rental76.pickupCar("");
        rentalService.Branch branch83 = null;
        rentalService.Branch[] branch_array84 = new rentalService.Branch[] { branch83 };
        rental76.initialise(branch_array84);
        rental59.initialise(branch_array84);
        rental49.initialise(branch_array84);
        rental34.initialise(branch_array84);
        rental23.initialise(branch_array84);
        rental0.initialise(branch_array84);
        rental0.pickupCar("");
        try {
            java.util.ArrayList<rentalService.Car> arraylist_car94 = rental0.showCars("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(arraylist_car20);
        org.junit.Assert.assertNull(arraylist_client22);
        org.junit.Assert.assertNull(arraylist_car27);
        org.junit.Assert.assertNotNull(arraylist_reservation29);
        org.junit.Assert.assertNotNull(arraylist_reservation33);
        org.junit.Assert.assertNotNull(arraylist_reservation42);
        org.junit.Assert.assertNotNull(arraylist_reservation46);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(arraylist_car58);
        org.junit.Assert.assertNotNull(arraylist_reservation67);
        org.junit.Assert.assertNull(arraylist_car73);
        org.junit.Assert.assertNotNull(branch_array84);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test492");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rentalService.Branch[] branch_array5 = null;
        rental0.initialise(branch_array5);
        java.util.ArrayList<rentalService.Car> arraylist_car8 = rental0.showCars("");
        java.lang.String str12 = rental0.makeReservation("hi!", "", "");
        rental0.pickupCar("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(arraylist_car8);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test493");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation18 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car22 = rental0.showCars("");
        java.util.ArrayList<rentalService.Car> arraylist_car24 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation26 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Client> arraylist_client28 = rental0.showClients("");
        java.util.ArrayList<rentalService.Car> arraylist_car30 = rental0.showCars("");
        rental0.dropoffCar("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(arraylist_reservation18);
        org.junit.Assert.assertNull(arraylist_car22);
        org.junit.Assert.assertNull(arraylist_car24);
        org.junit.Assert.assertNotNull(arraylist_reservation26);
        org.junit.Assert.assertNull(arraylist_client28);
        org.junit.Assert.assertNull(arraylist_car30);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test494");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        java.lang.String str18 = rental0.makeReservation("", "", "hi!");
        rentalService.Rental rental19 = new rentalService.Rental();
        rental19.pickupCar("");
        rental19.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car25 = rental19.showCars("");
        rental19.cancelClientReservation("hi!");
        rental19.cancelReservation("");
        java.util.ArrayList<rentalService.Car> arraylist_car31 = rental19.showCars("");
        rentalService.Rental rental32 = new rentalService.Rental();
        rental32.pickupCar("");
        rental32.dropoffCar("");
        rental32.pickupCar("");
        rentalService.Branch branch39 = null;
        rentalService.Branch[] branch_array40 = new rentalService.Branch[] { branch39 };
        rental32.initialise(branch_array40);
        rental32.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation45 = rental32.showClientReservations("hi!");
        rentalService.Rental rental46 = new rentalService.Rental();
        java.lang.String str49 = rental46.registerClient("", "");
        rental46.cancelReservation("hi!");
        rental46.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car55 = rental46.showCars("");
        rentalService.Rental rental56 = new rentalService.Rental();
        rental56.pickupCar("");
        rental56.dropoffCar("");
        rental56.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation64 = rental56.showClientReservations("hi!");
        rental56.cancelReservation("hi!");
        rental56.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car70 = rental56.showCars("");
        rental56.dropoffCar("");
        rentalService.Rental rental73 = new rentalService.Rental();
        rental73.pickupCar("");
        rental73.dropoffCar("");
        rental73.pickupCar("");
        rentalService.Branch branch80 = null;
        rentalService.Branch[] branch_array81 = new rentalService.Branch[] { branch80 };
        rental73.initialise(branch_array81);
        rental56.initialise(branch_array81);
        rental46.initialise(branch_array81);
        rental32.initialise(branch_array81);
        rental19.initialise(branch_array81);
        rental0.initialise(branch_array81);
        java.util.ArrayList<rentalService.Car> arraylist_car89 = rental0.showCars("");
        java.lang.String str93 = rental0.makeReservation("", "", "");
        rental0.cancelClientReservation("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(arraylist_car25);
        org.junit.Assert.assertNull(arraylist_car31);
        org.junit.Assert.assertNotNull(branch_array40);
        org.junit.Assert.assertNotNull(arraylist_reservation45);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(arraylist_car55);
        org.junit.Assert.assertNotNull(arraylist_reservation64);
        org.junit.Assert.assertNull(arraylist_car70);
        org.junit.Assert.assertNotNull(branch_array81);
        org.junit.Assert.assertNull(arraylist_car89);
        org.junit.Assert.assertNull(str93);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test495");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation14 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car16 = rental0.showCars("");
        rental0.pickupCar("");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car22 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelClientReservation("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNotNull(arraylist_reservation14);
        org.junit.Assert.assertNull(arraylist_car16);
        org.junit.Assert.assertNull(arraylist_car22);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test496");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        rentalService.Branch branch11 = null;
        rentalService.Branch[] branch_array12 = new rentalService.Branch[] { branch11 };
        rental0.initialise(branch_array12);
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation23 = rental0.showClientReservations("hi!");
        rental0.pickupCar("");
        java.lang.String str28 = rental0.registerClient("", "hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(branch_array12);
        org.junit.Assert.assertNotNull(arraylist_reservation23);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test497");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.dropoffCar("");
        rentalService.Rental rental17 = new rentalService.Rental();
        rental17.pickupCar("");
        rental17.dropoffCar("");
        rental17.pickupCar("");
        rentalService.Branch branch24 = null;
        rentalService.Branch[] branch_array25 = new rentalService.Branch[] { branch24 };
        rental17.initialise(branch_array25);
        rental0.initialise(branch_array25);
        rentalService.Rental rental28 = new rentalService.Rental();
        rental28.pickupCar("");
        rental28.dropoffCar("");
        rental28.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation36 = rental28.showClientReservations("hi!");
        rentalService.Branch[] branch_array37 = new rentalService.Branch[] {};
        rental28.initialise(branch_array37);
        rental0.initialise(branch_array37);
        java.util.ArrayList<rentalService.Client> arraylist_client41 = rental0.showClients("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation43 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Client> arraylist_client45 = rental0.showClients("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation47 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation49 = rental0.showClientReservations("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(branch_array25);
        org.junit.Assert.assertNotNull(arraylist_reservation36);
        org.junit.Assert.assertNotNull(branch_array37);
        org.junit.Assert.assertNull(arraylist_client41);
        org.junit.Assert.assertNotNull(arraylist_reservation43);
        org.junit.Assert.assertNull(arraylist_client45);
        org.junit.Assert.assertNotNull(arraylist_reservation47);
        org.junit.Assert.assertNotNull(arraylist_reservation49);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test498");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("");
        rental0.cancelReservation("hi!");
        rentalService.Rental rental16 = new rentalService.Rental();
        rental16.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car20 = rental16.showCars("");
        rental16.dropoffCar("");
        rentalService.Rental rental23 = new rentalService.Rental();
        rental23.pickupCar("");
        rental23.dropoffCar("");
        rental23.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation31 = rental23.showClientReservations("hi!");
        rental23.cancelReservation("hi!");
        rental23.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car37 = rental23.showCars("");
        rental23.dropoffCar("");
        rentalService.Rental rental40 = new rentalService.Rental();
        rental40.pickupCar("");
        rental40.dropoffCar("");
        rental40.pickupCar("");
        rentalService.Branch branch47 = null;
        rentalService.Branch[] branch_array48 = new rentalService.Branch[] { branch47 };
        rental40.initialise(branch_array48);
        rental23.initialise(branch_array48);
        rental16.initialise(branch_array48);
        rental0.initialise(branch_array48);
        rental0.dropoffCar("");
        rental0.cancelReservation("");
        rentalService.Branch[] branch_array57 = null;
        rental0.initialise(branch_array57);
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client62 = rental0.showClients("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
        org.junit.Assert.assertNull(arraylist_car20);
        org.junit.Assert.assertNotNull(arraylist_reservation31);
        org.junit.Assert.assertNull(arraylist_car37);
        org.junit.Assert.assertNotNull(branch_array48);
        org.junit.Assert.assertNull(arraylist_client62);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test499");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation20 = rental0.showClientReservations("");
        java.lang.String str23 = rental0.registerClient("hi!", "hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(arraylist_reservation20);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test500");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
    }
}

