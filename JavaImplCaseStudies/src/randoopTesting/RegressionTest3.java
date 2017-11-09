package randoopTesting;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test001");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.cancelReservation("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client18 = rental0.showClients("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(arraylist_client18);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test002");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str12 = rental0.makeReservation("", "", "");
        rentalService.Rental rental13 = new rentalService.Rental();
        java.lang.String str16 = rental13.registerClient("", "");
        rental13.cancelReservation("hi!");
        rental13.pickupCar("");
        rental13.pickupCar("");
        rental13.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation26 = rental13.showClientReservations("hi!");
        rental13.pickupCar("hi!");
        rentalService.Rental rental29 = new rentalService.Rental();
        rental29.pickupCar("");
        rental29.dropoffCar("");
        rentalService.Rental rental34 = new rentalService.Rental();
        rental34.pickupCar("");
        rental34.dropoffCar("");
        rental34.pickupCar("");
        rentalService.Branch branch41 = null;
        rentalService.Branch[] branch_array42 = new rentalService.Branch[] { branch41 };
        rental34.initialise(branch_array42);
        rental29.initialise(branch_array42);
        rental13.initialise(branch_array42);
        rental0.initialise(branch_array42);
        rental0.cancelClientReservation("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(arraylist_reservation26);
        org.junit.Assert.assertNotNull(branch_array42);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test003");
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
        try {
            java.lang.String str58 = rental0.makeReservation("", "hi!", "");
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
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test004");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        java.lang.String str15 = rental0.makeReservation("", "", "");
        rental0.pickupCar("");
        rental0.cancelReservation("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNotNull(arraylist_reservation9);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test005");
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
        try {
            java.lang.String str23 = rental0.makeReservation("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(branch_array13);
        org.junit.Assert.assertNotNull(arraylist_reservation19);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test006");
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
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation44 = rental0.showClientReservations("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNotNull(arraylist_reservation9);
        org.junit.Assert.assertNotNull(arraylist_reservation11);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
        org.junit.Assert.assertNotNull(arraylist_reservation22);
        org.junit.Assert.assertNull(arraylist_car28);
        org.junit.Assert.assertNotNull(branch_array39);
        org.junit.Assert.assertNotNull(arraylist_reservation44);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test007");
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
        java.lang.String str40 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        try {
            java.lang.String str45 = rental0.registerClient("hi!", "");
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
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test008");
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
        rental0.pickupCar("hi!");
        rental0.cancelReservation("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation27 = rental0.showClientReservations("");
        rental0.pickupCar("");
        rental0.cancelReservation("hi!");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car35 = rental0.showCars("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(arraylist_reservation27);
        org.junit.Assert.assertNull(arraylist_car35);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test009");
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
        rentalService.Rental rental42 = new rentalService.Rental();
        java.lang.String str45 = rental42.registerClient("", "");
        rental42.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation49 = rental42.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation51 = rental42.showClientReservations("hi!");
        java.lang.String str54 = rental42.registerClient("", "hi!");
        rentalService.Rental rental55 = new rentalService.Rental();
        java.lang.String str58 = rental55.registerClient("", "");
        rental55.cancelReservation("hi!");
        rental55.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car64 = rental55.showCars("");
        rentalService.Rental rental65 = new rentalService.Rental();
        rental65.pickupCar("");
        rental65.dropoffCar("");
        rental65.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation73 = rental65.showClientReservations("hi!");
        rental65.cancelReservation("hi!");
        rental65.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car79 = rental65.showCars("");
        rental65.dropoffCar("");
        rentalService.Rental rental82 = new rentalService.Rental();
        rental82.pickupCar("");
        rental82.dropoffCar("");
        rental82.pickupCar("");
        rentalService.Branch branch89 = null;
        rentalService.Branch[] branch_array90 = new rentalService.Branch[] { branch89 };
        rental82.initialise(branch_array90);
        rental65.initialise(branch_array90);
        rental55.initialise(branch_array90);
        rental42.initialise(branch_array90);
        rental0.initialise(branch_array90);
        java.util.ArrayList<rentalService.Car> arraylist_car97 = rental0.showCars("");
        rental0.pickupCar("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(branch_array25);
        org.junit.Assert.assertNotNull(arraylist_reservation36);
        org.junit.Assert.assertNotNull(branch_array37);
        org.junit.Assert.assertNull(arraylist_client41);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(arraylist_reservation49);
        org.junit.Assert.assertNotNull(arraylist_reservation51);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(arraylist_car64);
        org.junit.Assert.assertNotNull(arraylist_reservation73);
        org.junit.Assert.assertNull(arraylist_car79);
        org.junit.Assert.assertNotNull(branch_array90);
        org.junit.Assert.assertNull(arraylist_car97);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test010");
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
        rentalService.Rental rental29 = new rentalService.Rental();
        rental29.pickupCar("");
        rental29.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car35 = rental29.showCars("");
        rental29.cancelClientReservation("hi!");
        rental29.cancelReservation("");
        rental29.cancelReservation("hi!");
        rentalService.Rental rental42 = new rentalService.Rental();
        rental42.pickupCar("");
        rental42.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car48 = rental42.showCars("");
        rental42.cancelClientReservation("hi!");
        rental42.cancelReservation("");
        rentalService.Rental rental53 = new rentalService.Rental();
        java.lang.String str56 = rental53.registerClient("", "");
        rental53.cancelReservation("hi!");
        rental53.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car62 = rental53.showCars("");
        rentalService.Rental rental63 = new rentalService.Rental();
        rental63.pickupCar("");
        rental63.dropoffCar("");
        rental63.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation71 = rental63.showClientReservations("hi!");
        rental63.cancelReservation("hi!");
        rental63.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car77 = rental63.showCars("");
        rental63.dropoffCar("");
        rentalService.Rental rental80 = new rentalService.Rental();
        rental80.pickupCar("");
        rental80.dropoffCar("");
        rental80.pickupCar("");
        rentalService.Branch branch87 = null;
        rentalService.Branch[] branch_array88 = new rentalService.Branch[] { branch87 };
        rental80.initialise(branch_array88);
        rental63.initialise(branch_array88);
        rental53.initialise(branch_array88);
        rental42.initialise(branch_array88);
        rental29.initialise(branch_array88);
        rental0.initialise(branch_array88);
        rental0.pickupCar("");
        java.lang.String str99 = rental0.registerClient("", "");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(arraylist_client18);
        org.junit.Assert.assertNotNull(arraylist_reservation24);
        org.junit.Assert.assertNull(arraylist_car35);
        org.junit.Assert.assertNull(arraylist_car48);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(arraylist_car62);
        org.junit.Assert.assertNotNull(arraylist_reservation71);
        org.junit.Assert.assertNull(arraylist_car77);
        org.junit.Assert.assertNotNull(branch_array88);
        org.junit.Assert.assertNull(str99);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test011");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("");
        org.junit.Assert.assertNull(arraylist_car4);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test012");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car6 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        rental0.pickupCar("");
        java.lang.String str16 = rental0.makeReservation("", "", "");
        org.junit.Assert.assertNull(arraylist_car6);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test013");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation5 = rental0.showClientReservations("");
        rental0.cancelReservation("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car11 = rental0.showCars("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation5);
        org.junit.Assert.assertNull(arraylist_car11);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test014");
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
        rental0.cancelClientReservation("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(branch_array23);
        org.junit.Assert.assertNull(arraylist_client30);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test015");
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
        rental0.cancelReservation("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car24 = rental0.showCars("");
        java.util.ArrayList<rentalService.Car> arraylist_car26 = rental0.showCars("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(arraylist_car24);
        org.junit.Assert.assertNull(arraylist_car26);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test016");
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
        rental0.cancelClientReservation("");
        rental0.cancelClientReservation("hi!");
        try {
            java.util.ArrayList<rentalService.Car> arraylist_car60 = rental0.showCars("hi!");
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
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test017");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("");
        rental0.cancelReservation("hi!");
        java.lang.String str15 = rental0.registerClient("", "");
        rental0.dropoffCar("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(arraylist_client10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test018");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("hi!");
        rental0.dropoffCar("");
        java.lang.String str14 = rental0.makeReservation("", "", "");
        rental0.cancelClientReservation("");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car20 = rental0.showCars("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(arraylist_car20);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test019");
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
        java.util.ArrayList<rentalService.Client> arraylist_client29 = rental0.showClients("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation31 = rental0.showClientReservations("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation18);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(arraylist_client29);
        org.junit.Assert.assertNotNull(arraylist_reservation31);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test020");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car11 = rental0.showCars("");
        java.lang.String str15 = rental0.makeReservation("", "", "");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation21 = rental0.showClientReservations("");
        rental0.cancelClientReservation("");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNull(arraylist_car11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(arraylist_reservation21);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test021");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test022");
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
        rental0.cancelClientReservation("");
        java.util.ArrayList<rentalService.Client> arraylist_client58 = rental0.showClients("");
        org.junit.Assert.assertNull(arraylist_car6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(arraylist_car20);
        org.junit.Assert.assertNotNull(arraylist_reservation29);
        org.junit.Assert.assertNull(arraylist_car35);
        org.junit.Assert.assertNotNull(branch_array46);
        org.junit.Assert.assertNull(arraylist_client58);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test023");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        rental0.pickupCar("");
        rental0.cancelClientReservation("");
        rental0.cancelReservation("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test024");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation10 = rental0.showClientReservations("");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNotNull(arraylist_reservation10);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test025");
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
        java.util.ArrayList<rentalService.Client> arraylist_client33 = rental0.showClients("");
        java.util.ArrayList<rentalService.Client> arraylist_client35 = rental0.showClients("");
        java.util.ArrayList<rentalService.Client> arraylist_client37 = rental0.showClients("");
        java.util.ArrayList<rentalService.Car> arraylist_car39 = rental0.showCars("");
        java.lang.String str43 = rental0.makeReservation("hi!", "", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(arraylist_car31);
        org.junit.Assert.assertNull(arraylist_client33);
        org.junit.Assert.assertNull(arraylist_client35);
        org.junit.Assert.assertNull(arraylist_client37);
        org.junit.Assert.assertNull(arraylist_car39);
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test026");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str12 = rental0.makeReservation("", "", "");
        rentalService.Branch[] branch_array13 = null;
        rental0.initialise(branch_array13);
        rentalService.Branch[] branch_array15 = null;
        rental0.initialise(branch_array15);
        java.util.ArrayList<rentalService.Car> arraylist_car18 = rental0.showCars("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation22 = rental0.showClientReservations("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(arraylist_car18);
        org.junit.Assert.assertNotNull(arraylist_reservation22);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test027");
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
        rental0.cancelReservation("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car21);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(arraylist_client34);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(branch_array58);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test028");
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
        java.lang.String str30 = rental0.makeReservation("hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(arraylist_client24);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test029");
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
        rental0.cancelClientReservation("");
        java.lang.String str60 = rental0.makeReservation("hi!", "", "");
        org.junit.Assert.assertNull(arraylist_car6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(arraylist_car20);
        org.junit.Assert.assertNotNull(arraylist_reservation29);
        org.junit.Assert.assertNull(arraylist_car35);
        org.junit.Assert.assertNotNull(branch_array46);
        org.junit.Assert.assertNull(str60);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test030");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("");
        rental0.pickupCar("");
        rental0.cancelClientReservation("");
        rental0.pickupCar("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test031");
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
        rental0.cancelReservation("");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test032");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        rentalService.Branch branch7 = null;
        rentalService.Branch[] branch_array8 = new rentalService.Branch[] { branch7 };
        rental0.initialise(branch_array8);
        rental0.cancelClientReservation("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation15 = rental0.showClientReservations("");
        org.junit.Assert.assertNotNull(branch_array8);
        org.junit.Assert.assertNotNull(arraylist_reservation15);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test033");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.lang.String str8 = rental0.makeReservation("", "", "");
        java.lang.String str12 = rental0.makeReservation("hi!", "", "");
        rental0.pickupCar("hi!");
        rentalService.Rental rental15 = new rentalService.Rental();
        rental15.pickupCar("");
        rental15.dropoffCar("");
        rental15.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation23 = rental15.showClientReservations("hi!");
        rental15.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation27 = rental15.showClientReservations("hi!");
        rental15.dropoffCar("hi!");
        rental15.pickupCar("");
        rentalService.Rental rental32 = new rentalService.Rental();
        java.lang.String str35 = rental32.registerClient("", "");
        rental32.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation39 = rental32.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation41 = rental32.showClientReservations("hi!");
        java.lang.String str44 = rental32.registerClient("", "hi!");
        rentalService.Rental rental45 = new rentalService.Rental();
        java.lang.String str48 = rental45.registerClient("", "");
        rental45.cancelReservation("hi!");
        rental45.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car54 = rental45.showCars("");
        rentalService.Rental rental55 = new rentalService.Rental();
        rental55.pickupCar("");
        rental55.dropoffCar("");
        rental55.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation63 = rental55.showClientReservations("hi!");
        rental55.cancelReservation("hi!");
        rental55.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car69 = rental55.showCars("");
        rental55.dropoffCar("");
        rentalService.Rental rental72 = new rentalService.Rental();
        rental72.pickupCar("");
        rental72.dropoffCar("");
        rental72.pickupCar("");
        rentalService.Branch branch79 = null;
        rentalService.Branch[] branch_array80 = new rentalService.Branch[] { branch79 };
        rental72.initialise(branch_array80);
        rental55.initialise(branch_array80);
        rental45.initialise(branch_array80);
        rental32.initialise(branch_array80);
        rental15.initialise(branch_array80);
        rental0.initialise(branch_array80);
        rental0.pickupCar("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(arraylist_reservation23);
        org.junit.Assert.assertNotNull(arraylist_reservation27);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(arraylist_reservation39);
        org.junit.Assert.assertNotNull(arraylist_reservation41);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(arraylist_car54);
        org.junit.Assert.assertNotNull(arraylist_reservation63);
        org.junit.Assert.assertNull(arraylist_car69);
        org.junit.Assert.assertNotNull(branch_array80);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test034");
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
        rental0.dropoffCar("hi!");
        try {
            java.util.ArrayList<rentalService.Car> arraylist_car84 = rental0.showCars("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
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
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test035");
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
        java.util.ArrayList<rentalService.Car> arraylist_car55 = rental0.showCars("");
        rental0.cancelReservation("");
        try {
            java.lang.String str61 = rental0.makeReservation("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(branch_array8);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(arraylist_car23);
        org.junit.Assert.assertNotNull(arraylist_reservation32);
        org.junit.Assert.assertNull(arraylist_car38);
        org.junit.Assert.assertNotNull(branch_array49);
        org.junit.Assert.assertNull(arraylist_car55);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test036");
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
        rental0.dropoffCar("");
        rental0.cancelClientReservation("");
        try {
            java.util.ArrayList<rentalService.Client> arraylist_client46 = rental0.showClients("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(branch_array32);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test037");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Client> arraylist_client14 = rental0.showClients("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(arraylist_client14);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test038");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Client> arraylist_client12 = rental0.showClients("hi!");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Car> arraylist_car18 = rental0.showCars("hi!");
        rentalService.Rental rental19 = new rentalService.Rental();
        rental19.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car23 = rental19.showCars("");
        rental19.dropoffCar("hi!");
        rental19.dropoffCar("");
        rental19.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation31 = rental19.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation33 = rental19.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car35 = rental19.showCars("");
        rental19.pickupCar("");
        rental19.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car41 = rental19.showCars("");
        rentalService.Rental rental42 = new rentalService.Rental();
        java.lang.String str45 = rental42.registerClient("", "");
        rental42.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation49 = rental42.showClientReservations("hi!");
        java.lang.String str53 = rental42.makeReservation("hi!", "", "");
        rental42.cancelReservation("");
        java.lang.String str59 = rental42.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Client> arraylist_client61 = rental42.showClients("");
        rental42.cancelReservation("hi!");
        rentalService.Rental rental64 = new rentalService.Rental();
        java.lang.String str67 = rental64.registerClient("", "");
        rental64.cancelReservation("hi!");
        rental64.pickupCar("");
        rental64.pickupCar("");
        rentalService.Rental rental74 = new rentalService.Rental();
        rental74.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car78 = rental74.showCars("");
        rental74.dropoffCar("hi!");
        rental74.dropoffCar("");
        rental74.dropoffCar("hi!");
        rentalService.Branch branch85 = null;
        rentalService.Branch[] branch_array86 = new rentalService.Branch[] { branch85 };
        rental74.initialise(branch_array86);
        rental64.initialise(branch_array86);
        rental42.initialise(branch_array86);
        rental19.initialise(branch_array86);
        rental0.initialise(branch_array86);
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNull(arraylist_client12);
        org.junit.Assert.assertNull(arraylist_car18);
        org.junit.Assert.assertNull(arraylist_car23);
        org.junit.Assert.assertNotNull(arraylist_reservation31);
        org.junit.Assert.assertNotNull(arraylist_reservation33);
        org.junit.Assert.assertNull(arraylist_car35);
        org.junit.Assert.assertNull(arraylist_car41);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(arraylist_reservation49);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(arraylist_client61);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNull(arraylist_car78);
        org.junit.Assert.assertNotNull(branch_array86);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test039");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rentalService.Branch[] branch_array5 = null;
        rental0.initialise(branch_array5);
        rental0.pickupCar("");
        try {
            java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(arraylist_car4);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test040");
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
        rental0.pickupCar("");
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
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test041");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client15 = rental0.showClients("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(arraylist_client15);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test042");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        rentalService.Branch branch7 = null;
        rentalService.Branch[] branch_array8 = new rentalService.Branch[] { branch7 };
        rental0.initialise(branch_array8);
        rental0.cancelClientReservation("");
        java.lang.String str14 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        rentalService.Rental rental17 = new rentalService.Rental();
        rental17.pickupCar("");
        rental17.dropoffCar("");
        rental17.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation25 = rental17.showClientReservations("hi!");
        rental17.cancelReservation("hi!");
        rental17.cancelClientReservation("hi!");
        rental17.pickupCar("");
        rental17.pickupCar("");
        java.lang.String str37 = rental17.makeReservation("", "", "");
        rental17.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client41 = rental17.showClients("");
        rental17.cancelClientReservation("hi!");
        rentalService.Rental rental44 = new rentalService.Rental();
        java.lang.String str47 = rental44.registerClient("", "");
        java.lang.String str51 = rental44.makeReservation("hi!", "", "");
        rentalService.Rental rental52 = new rentalService.Rental();
        java.lang.String str55 = rental52.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation57 = rental52.showClientReservations("");
        rental52.cancelReservation("");
        rentalService.Rental rental60 = new rentalService.Rental();
        rental60.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car64 = rental60.showCars("");
        rental60.dropoffCar("hi!");
        rental60.dropoffCar("");
        rental60.dropoffCar("hi!");
        rentalService.Branch branch71 = null;
        rentalService.Branch[] branch_array72 = new rentalService.Branch[] { branch71 };
        rental60.initialise(branch_array72);
        rental52.initialise(branch_array72);
        rental44.initialise(branch_array72);
        rental17.initialise(branch_array72);
        rental0.initialise(branch_array72);
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        org.junit.Assert.assertNotNull(branch_array8);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(arraylist_reservation25);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(arraylist_client41);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(arraylist_reservation57);
        org.junit.Assert.assertNull(arraylist_car64);
        org.junit.Assert.assertNotNull(branch_array72);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test043");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        rentalService.Rental rental15 = new rentalService.Rental();
        rental15.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car19 = rental15.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation21 = rental15.showClientReservations("hi!");
        rental15.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation25 = rental15.showClientReservations("hi!");
        rentalService.Rental rental26 = new rentalService.Rental();
        rental26.pickupCar("");
        rental26.dropoffCar("");
        rental26.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation34 = rental26.showClientReservations("hi!");
        rental26.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation38 = rental26.showClientReservations("hi!");
        rental26.dropoffCar("hi!");
        rentalService.Rental rental41 = new rentalService.Rental();
        java.lang.String str44 = rental41.registerClient("", "");
        rental41.cancelReservation("hi!");
        rental41.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car50 = rental41.showCars("");
        rentalService.Rental rental51 = new rentalService.Rental();
        rental51.pickupCar("");
        rental51.dropoffCar("");
        rental51.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation59 = rental51.showClientReservations("hi!");
        rental51.cancelReservation("hi!");
        rental51.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car65 = rental51.showCars("");
        rental51.dropoffCar("");
        rentalService.Rental rental68 = new rentalService.Rental();
        rental68.pickupCar("");
        rental68.dropoffCar("");
        rental68.pickupCar("");
        rentalService.Branch branch75 = null;
        rentalService.Branch[] branch_array76 = new rentalService.Branch[] { branch75 };
        rental68.initialise(branch_array76);
        rental51.initialise(branch_array76);
        rental41.initialise(branch_array76);
        rental26.initialise(branch_array76);
        rental15.initialise(branch_array76);
        rental0.initialise(branch_array76);
        rental0.cancelClientReservation("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car19);
        org.junit.Assert.assertNotNull(arraylist_reservation21);
        org.junit.Assert.assertNotNull(arraylist_reservation25);
        org.junit.Assert.assertNotNull(arraylist_reservation34);
        org.junit.Assert.assertNotNull(arraylist_reservation38);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(arraylist_car50);
        org.junit.Assert.assertNotNull(arraylist_reservation59);
        org.junit.Assert.assertNull(arraylist_car65);
        org.junit.Assert.assertNotNull(branch_array76);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test044");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("hi!");
        rental0.dropoffCar("");
        rentalService.Rental rental11 = new rentalService.Rental();
        rental11.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car15 = rental11.showCars("");
        rental11.dropoffCar("");
        rentalService.Rental rental18 = new rentalService.Rental();
        rental18.pickupCar("");
        rental18.dropoffCar("");
        rental18.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation26 = rental18.showClientReservations("hi!");
        rental18.cancelReservation("hi!");
        rental18.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car32 = rental18.showCars("");
        rental18.dropoffCar("");
        rentalService.Rental rental35 = new rentalService.Rental();
        rental35.pickupCar("");
        rental35.dropoffCar("");
        rental35.pickupCar("");
        rentalService.Branch branch42 = null;
        rentalService.Branch[] branch_array43 = new rentalService.Branch[] { branch42 };
        rental35.initialise(branch_array43);
        rental18.initialise(branch_array43);
        rental11.initialise(branch_array43);
        rental0.initialise(branch_array43);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation49 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation51 = rental0.showClientReservations("");
        rental0.pickupCar("");
        rental0.cancelReservation("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(arraylist_car15);
        org.junit.Assert.assertNotNull(arraylist_reservation26);
        org.junit.Assert.assertNull(arraylist_car32);
        org.junit.Assert.assertNotNull(branch_array43);
        org.junit.Assert.assertNotNull(arraylist_reservation49);
        org.junit.Assert.assertNotNull(arraylist_reservation51);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test045");
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
        rental0.pickupCar("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(arraylist_reservation16);
        org.junit.Assert.assertNull(arraylist_car18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(arraylist_reservation25);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test046");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        rentalService.Branch branch7 = null;
        rentalService.Branch[] branch_array8 = new rentalService.Branch[] { branch7 };
        rental0.initialise(branch_array8);
        rental0.cancelClientReservation("");
        rental0.cancelClientReservation("hi!");
        java.lang.String str16 = rental0.registerClient("", "hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation18 = rental0.showClientReservations("");
        rental0.cancelReservation("hi!");
        java.lang.String str24 = rental0.makeReservation("", "", "");
        org.junit.Assert.assertNotNull(branch_array8);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(arraylist_reservation18);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test047");
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
        java.lang.String str29 = rental0.registerClient("", "hi!");
        java.lang.String str33 = rental0.makeReservation("", "", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(branch_array23);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test048");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation20 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation22 = rental0.showClientReservations("");
        rental0.cancelReservation("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation20);
        org.junit.Assert.assertNotNull(arraylist_reservation22);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test049");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rentalService.Rental rental10 = new rentalService.Rental();
        rental10.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental10.showCars("");
        rental10.dropoffCar("hi!");
        rental10.dropoffCar("");
        rental10.dropoffCar("hi!");
        rentalService.Branch branch21 = null;
        rentalService.Branch[] branch_array22 = new rentalService.Branch[] { branch21 };
        rental10.initialise(branch_array22);
        rental0.initialise(branch_array22);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation26 = rental0.showClientReservations("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(branch_array22);
        org.junit.Assert.assertNotNull(arraylist_reservation26);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test050");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation5 = rental0.showClientReservations("");
        rental0.cancelReservation("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelClientReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation5);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test051");
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
        rental0.dropoffCar("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNull(arraylist_client12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(branch_array36);
        org.junit.Assert.assertNull(arraylist_client42);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test052");
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
        rental0.dropoffCar("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNull(arraylist_client12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(branch_array36);
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test053");
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
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation53 = rental0.showClientReservations("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(arraylist_client17);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(branch_array41);
        org.junit.Assert.assertNull(arraylist_client47);
        org.junit.Assert.assertNull(arraylist_client49);
        org.junit.Assert.assertNotNull(arraylist_reservation53);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test054");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rentalService.Branch[] branch_array5 = null;
        rental0.initialise(branch_array5);
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("");
        rental0.cancelClientReservation("");
        rental0.pickupCar("hi!");
        try {
            java.lang.String str18 = rental0.makeReservation("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(arraylist_client10);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test055");
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
        rentalService.Rental rental42 = new rentalService.Rental();
        java.lang.String str45 = rental42.registerClient("", "");
        rental42.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation49 = rental42.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation51 = rental42.showClientReservations("hi!");
        java.lang.String str54 = rental42.registerClient("", "hi!");
        rentalService.Rental rental55 = new rentalService.Rental();
        java.lang.String str58 = rental55.registerClient("", "");
        rental55.cancelReservation("hi!");
        rental55.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car64 = rental55.showCars("");
        rentalService.Rental rental65 = new rentalService.Rental();
        rental65.pickupCar("");
        rental65.dropoffCar("");
        rental65.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation73 = rental65.showClientReservations("hi!");
        rental65.cancelReservation("hi!");
        rental65.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car79 = rental65.showCars("");
        rental65.dropoffCar("");
        rentalService.Rental rental82 = new rentalService.Rental();
        rental82.pickupCar("");
        rental82.dropoffCar("");
        rental82.pickupCar("");
        rentalService.Branch branch89 = null;
        rentalService.Branch[] branch_array90 = new rentalService.Branch[] { branch89 };
        rental82.initialise(branch_array90);
        rental65.initialise(branch_array90);
        rental55.initialise(branch_array90);
        rental42.initialise(branch_array90);
        rental0.initialise(branch_array90);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation97 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(branch_array25);
        org.junit.Assert.assertNotNull(arraylist_reservation36);
        org.junit.Assert.assertNotNull(branch_array37);
        org.junit.Assert.assertNull(arraylist_client41);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(arraylist_reservation49);
        org.junit.Assert.assertNotNull(arraylist_reservation51);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(arraylist_car64);
        org.junit.Assert.assertNotNull(arraylist_reservation73);
        org.junit.Assert.assertNull(arraylist_car79);
        org.junit.Assert.assertNotNull(branch_array90);
        org.junit.Assert.assertNotNull(arraylist_reservation97);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test056");
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
        rentalService.Rental rental20 = new rentalService.Rental();
        java.lang.String str23 = rental20.registerClient("", "");
        rental20.cancelReservation("hi!");
        rental20.pickupCar("");
        rental20.pickupCar("");
        rental20.dropoffCar("hi!");
        rental20.cancelReservation("hi!");
        rental20.pickupCar("");
        rentalService.Rental rental36 = new rentalService.Rental();
        rental36.pickupCar("");
        rental36.dropoffCar("");
        rental36.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation44 = rental36.showClientReservations("hi!");
        rental36.cancelReservation("hi!");
        rental36.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car50 = rental36.showCars("");
        rental36.pickupCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client54 = rental36.showClients("");
        rental36.dropoffCar("hi!");
        rental36.cancelClientReservation("hi!");
        rentalService.Rental rental59 = new rentalService.Rental();
        rental59.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car63 = rental59.showCars("");
        rental59.dropoffCar("hi!");
        rental59.dropoffCar("");
        rental59.dropoffCar("hi!");
        rentalService.Branch branch70 = null;
        rentalService.Branch[] branch_array71 = new rentalService.Branch[] { branch70 };
        rental59.initialise(branch_array71);
        rentalService.Rental rental73 = new rentalService.Rental();
        rental73.pickupCar("");
        rental73.dropoffCar("");
        rentalService.Rental rental78 = new rentalService.Rental();
        rental78.pickupCar("");
        rental78.dropoffCar("");
        rental78.pickupCar("");
        rentalService.Branch branch85 = null;
        rentalService.Branch[] branch_array86 = new rentalService.Branch[] { branch85 };
        rental78.initialise(branch_array86);
        rental73.initialise(branch_array86);
        rental59.initialise(branch_array86);
        rental36.initialise(branch_array86);
        rental20.initialise(branch_array86);
        rental0.initialise(branch_array86);
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(branch_array12);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(arraylist_reservation44);
        org.junit.Assert.assertNull(arraylist_car50);
        org.junit.Assert.assertNull(arraylist_client54);
        org.junit.Assert.assertNull(arraylist_car63);
        org.junit.Assert.assertNotNull(branch_array71);
        org.junit.Assert.assertNotNull(branch_array86);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test057");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.lang.String str7 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Client> arraylist_client11 = rental0.showClients("");
        java.util.ArrayList<rentalService.Client> arraylist_client13 = rental0.showClients("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car17 = rental0.showCars("");
        java.lang.String str20 = rental0.registerClient("", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(arraylist_reservation9);
        org.junit.Assert.assertNull(arraylist_client11);
        org.junit.Assert.assertNull(arraylist_client13);
        org.junit.Assert.assertNull(arraylist_car17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test058");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.lang.String str8 = rental0.makeReservation("", "", "");
        rentalService.Rental rental9 = new rentalService.Rental();
        java.lang.String str12 = rental9.registerClient("", "");
        rental9.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation16 = rental9.showClientReservations("hi!");
        java.lang.String str20 = rental9.makeReservation("hi!", "", "");
        rental9.cancelReservation("");
        rental9.dropoffCar("");
        rental9.dropoffCar("");
        rentalService.Rental rental27 = new rentalService.Rental();
        java.lang.String str30 = rental27.registerClient("", "");
        rental27.cancelReservation("hi!");
        rental27.pickupCar("");
        rental27.pickupCar("");
        rental27.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation40 = rental27.showClientReservations("hi!");
        rental27.pickupCar("hi!");
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
        rental27.initialise(branch_array56);
        rental9.initialise(branch_array56);
        rental0.initialise(branch_array56);
        try {
            java.util.ArrayList<rentalService.Car> arraylist_car63 = rental0.showCars("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(arraylist_reservation16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(arraylist_reservation40);
        org.junit.Assert.assertNotNull(branch_array56);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test059");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation5 = rental0.showClientReservations("");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation5);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test060");
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
        rental0.pickupCar("");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(arraylist_car13);
        org.junit.Assert.assertNull(arraylist_car17);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test061");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.cancelClientReservation("");
        java.lang.String str20 = rental0.makeReservation("hi!", "", "hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client22 = rental0.showClients("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(arraylist_client22);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test062");
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
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation20 = rental0.showClientReservations("");
        rental0.pickupCar("hi!");
        org.junit.Assert.assertNotNull(branch_array8);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(arraylist_reservation16);
        org.junit.Assert.assertNotNull(arraylist_reservation18);
        org.junit.Assert.assertNotNull(arraylist_reservation20);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test063");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        java.lang.String str14 = rental0.registerClient("", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test064");
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
        rental0.cancelClientReservation("");
        rental0.cancelReservation("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(arraylist_reservation31);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test065");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        rental0.cancelReservation("");
        java.lang.String str17 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Client> arraylist_client19 = rental0.showClients("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation23 = rental0.showClientReservations("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(arraylist_client19);
        org.junit.Assert.assertNotNull(arraylist_reservation23);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test066");
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
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array25);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test067");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client18 = rental0.showClients("");
        rental0.cancelReservation("");
        rental0.cancelReservation("");
        java.lang.String str26 = rental0.makeReservation("hi!", "", "");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_client18);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test068");
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
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation22 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation24 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation26 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(arraylist_reservation22);
        org.junit.Assert.assertNotNull(arraylist_reservation24);
        org.junit.Assert.assertNotNull(arraylist_reservation26);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test069");
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
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation56 = rental0.showClientReservations("");
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
        org.junit.Assert.assertNotNull(arraylist_reservation56);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test070");
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
        rental0.cancelReservation("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test071");
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
        rental0.pickupCar("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
        org.junit.Assert.assertNull(arraylist_car20);
        org.junit.Assert.assertNotNull(branch_array28);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test072");
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
        java.lang.String str27 = rental0.makeReservation("", "hi!", "");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test073");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("");
        org.junit.Assert.assertNull(arraylist_car4);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test074");
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
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(arraylist_client24);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test075");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car11 = rental0.showCars("");
        java.lang.String str15 = rental0.makeReservation("", "", "");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation19 = rental0.showClientReservations("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNull(arraylist_car11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(arraylist_reservation19);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test076");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental0.showCars("");
        java.util.ArrayList<rentalService.Client> arraylist_client14 = rental0.showClients("");
        rental0.cancelClientReservation("");
        rental0.cancelReservation("");
        rental0.dropoffCar("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(arraylist_client10);
        org.junit.Assert.assertNull(arraylist_car12);
        org.junit.Assert.assertNull(arraylist_client14);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test077");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car11 = rental0.showCars("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation15 = rental0.showClientReservations("");
        rental0.cancelClientReservation("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNull(arraylist_car11);
        org.junit.Assert.assertNotNull(arraylist_reservation15);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test078");
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
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation27 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("");
        java.lang.String str32 = rental0.registerClient("", "hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(arraylist_reservation27);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test079");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("hi!");
        java.lang.String str16 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Client> arraylist_client18 = rental0.showClients("");
        rental0.pickupCar("hi!");
        java.lang.String str23 = rental0.registerClient("", "hi!");
        rental0.cancelReservation("");
        rental0.cancelReservation("hi!");
        java.lang.String str30 = rental0.registerClient("", "hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(arraylist_client18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test080");
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
        java.lang.String str21 = rental0.registerClient("", "");
        java.lang.String str24 = rental0.registerClient("", "");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(arraylist_reservation18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test081");
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
        java.util.ArrayList<rentalService.Client> arraylist_client26 = rental0.showClients("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(arraylist_client26);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test082");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        rental0.pickupCar("");
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
        rental13.cancelClientReservation("hi!");
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
        rental13.initialise(branch_array65);
        rental0.initialise(branch_array65);
        try {
            java.util.ArrayList<rentalService.Client> arraylist_client72 = rental0.showClients("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(branch_array36);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(branch_array65);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test083");
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
        try {
            java.lang.String str85 = rental0.registerClient("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
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
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test084");
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
        java.lang.String str24 = rental0.makeReservation("hi!", "hi!", "");
        java.lang.String str28 = rental0.makeReservation("hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test085");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        rental0.pickupCar("");
        org.junit.Assert.assertNull(arraylist_car4);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test086");
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
        rental0.cancelClientReservation("hi!");
        rental0.dropoffCar("");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(branch_array39);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test087");
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
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation23 = rental0.showClientReservations("");
        org.junit.Assert.assertNotNull(branch_array13);
        org.junit.Assert.assertNotNull(arraylist_reservation23);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test088");
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
        rental0.pickupCar("hi!");
        rental0.cancelClientReservation("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(arraylist_car22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(arraylist_client27);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test089");
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
        java.util.ArrayList<rentalService.Client> arraylist_client49 = rental0.showClients("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(branch_array25);
        org.junit.Assert.assertNotNull(arraylist_reservation36);
        org.junit.Assert.assertNotNull(branch_array37);
        org.junit.Assert.assertNull(arraylist_client41);
        org.junit.Assert.assertNotNull(arraylist_reservation43);
        org.junit.Assert.assertNull(arraylist_client45);
        org.junit.Assert.assertNotNull(arraylist_reservation47);
        org.junit.Assert.assertNull(arraylist_client49);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test090");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("");
        rental0.cancelClientReservation("");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation19 = rental0.showClientReservations("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
        org.junit.Assert.assertNotNull(arraylist_reservation19);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test091");
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
        rental0.pickupCar("hi!");
        java.lang.String str70 = rental0.registerClient("", "");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car21);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(arraylist_client34);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(branch_array58);
        org.junit.Assert.assertNull(str70);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test092");
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
        java.lang.String str23 = rental0.registerClient("", "");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test093");
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
        java.lang.String str23 = rental0.registerClient("hi!", "hi!");
        rental0.dropoffCar("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(arraylist_reservation16);
        org.junit.Assert.assertNull(arraylist_car18);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test094");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental0.showCars("");
        java.util.ArrayList<rentalService.Client> arraylist_client14 = rental0.showClients("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation16 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car18 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation20 = rental0.showClientReservations("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(arraylist_client10);
        org.junit.Assert.assertNull(arraylist_car12);
        org.junit.Assert.assertNull(arraylist_client14);
        org.junit.Assert.assertNotNull(arraylist_reservation16);
        org.junit.Assert.assertNull(arraylist_car18);
        org.junit.Assert.assertNotNull(arraylist_reservation20);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test095");
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
        rental0.dropoffCar("hi!");
        rentalService.Rental rental24 = new rentalService.Rental();
        rental24.pickupCar("");
        rental24.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car30 = rental24.showCars("");
        rental24.cancelClientReservation("hi!");
        rental24.cancelReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation36 = rental24.showClientReservations("");
        rentalService.Rental rental37 = new rentalService.Rental();
        java.lang.String str40 = rental37.registerClient("", "");
        java.lang.String str44 = rental37.makeReservation("hi!", "", "");
        rentalService.Rental rental45 = new rentalService.Rental();
        java.lang.String str48 = rental45.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation50 = rental45.showClientReservations("");
        rental45.cancelReservation("");
        rentalService.Rental rental53 = new rentalService.Rental();
        rental53.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car57 = rental53.showCars("");
        rental53.dropoffCar("hi!");
        rental53.dropoffCar("");
        rental53.dropoffCar("hi!");
        rentalService.Branch branch64 = null;
        rentalService.Branch[] branch_array65 = new rentalService.Branch[] { branch64 };
        rental53.initialise(branch_array65);
        rental45.initialise(branch_array65);
        rental37.initialise(branch_array65);
        rentalService.Branch branch69 = null;
        rentalService.Branch[] branch_array70 = new rentalService.Branch[] { branch69 };
        rental37.initialise(branch_array70);
        rental24.initialise(branch_array70);
        rental0.initialise(branch_array70);
        rental0.pickupCar("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
        org.junit.Assert.assertNotNull(arraylist_reservation21);
        org.junit.Assert.assertNull(arraylist_car30);
        org.junit.Assert.assertNotNull(arraylist_reservation36);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(arraylist_reservation50);
        org.junit.Assert.assertNull(arraylist_car57);
        org.junit.Assert.assertNotNull(branch_array65);
        org.junit.Assert.assertNotNull(branch_array70);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test096");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rentalService.Branch[] branch_array5 = null;
        rental0.initialise(branch_array5);
        rental0.pickupCar("");
        java.lang.String str11 = rental0.registerClient("", "");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test097");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        rental0.cancelReservation("");
        java.lang.String str17 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation19 = rental0.showClientReservations("");
        rental0.pickupCar("");
        rental0.cancelReservation("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(arraylist_reservation19);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test098");
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
        java.util.ArrayList<rentalService.Client> arraylist_client22 = rental0.showClients("");
        java.lang.String str26 = rental0.makeReservation("hi!", "", "hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(arraylist_car20);
        org.junit.Assert.assertNull(arraylist_client22);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test099");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation17 = rental0.showClientReservations("hi!");
        rental0.cancelClientReservation("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNotNull(arraylist_reservation17);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test100");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("");
        rental0.cancelClientReservation("");
        rental0.pickupCar("");
        rental0.cancelReservation("");
        rental0.cancelClientReservation("hi!");
        rentalService.Rental rental22 = new rentalService.Rental();
        rental22.pickupCar("");
        rental22.dropoffCar("");
        rental22.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation30 = rental22.showClientReservations("hi!");
        rental22.cancelReservation("hi!");
        rental22.cancelClientReservation("hi!");
        rental22.pickupCar("hi!");
        rental22.pickupCar("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car40 = rental22.showCars("");
        java.util.ArrayList<rentalService.Client> arraylist_client42 = rental22.showClients("");
        rentalService.Rental rental43 = new rentalService.Rental();
        rental43.pickupCar("");
        rental43.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation49 = rental43.showClientReservations("hi!");
        rental43.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client53 = rental43.showClients("");
        rentalService.Rental rental54 = new rentalService.Rental();
        rental54.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car58 = rental54.showCars("");
        rentalService.Branch[] branch_array59 = null;
        rental54.initialise(branch_array59);
        rental54.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client64 = rental54.showClients("");
        rentalService.Rental rental65 = new rentalService.Rental();
        rental65.pickupCar("");
        rental65.dropoffCar("");
        rental65.pickupCar("");
        rentalService.Branch branch72 = null;
        rentalService.Branch[] branch_array73 = new rentalService.Branch[] { branch72 };
        rental65.initialise(branch_array73);
        rental54.initialise(branch_array73);
        rental43.initialise(branch_array73);
        rental22.initialise(branch_array73);
        rental0.initialise(branch_array73);
        java.lang.String str82 = rental0.makeReservation("", "", "");
        try {
            java.util.ArrayList<rentalService.Client> arraylist_client84 = rental0.showClients("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
        org.junit.Assert.assertNotNull(arraylist_reservation30);
        org.junit.Assert.assertNull(arraylist_car40);
        org.junit.Assert.assertNull(arraylist_client42);
        org.junit.Assert.assertNotNull(arraylist_reservation49);
        org.junit.Assert.assertNull(arraylist_client53);
        org.junit.Assert.assertNull(arraylist_car58);
        org.junit.Assert.assertNull(arraylist_client64);
        org.junit.Assert.assertNotNull(branch_array73);
        org.junit.Assert.assertNull(str82);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test101");
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
        java.lang.String str37 = rental0.makeReservation("", "", "hi!");
        rental0.dropoffCar("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(arraylist_car29);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test102");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("");
        java.lang.String str11 = rental0.registerClient("", "hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car13 = rental0.showCars("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(arraylist_car13);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test103");
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
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client64 = rental0.showClients("");
        try {
            java.util.ArrayList<rentalService.Client> arraylist_client66 = rental0.showClients("hi!");
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
        org.junit.Assert.assertNull(arraylist_client64);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test104");
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
        rental0.dropoffCar("hi!");
        rental0.pickupCar("");
        rentalService.Rental rental26 = new rentalService.Rental();
        java.lang.String str29 = rental26.registerClient("", "");
        rental26.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation33 = rental26.showClientReservations("hi!");
        java.lang.String str37 = rental26.makeReservation("hi!", "", "");
        rental26.cancelReservation("");
        java.lang.String str43 = rental26.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Client> arraylist_client45 = rental26.showClients("");
        rental26.pickupCar("");
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
        rental26.initialise(branch_array73);
        rental0.initialise(branch_array73);
        rental0.cancelReservation("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
        org.junit.Assert.assertNotNull(arraylist_reservation21);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(arraylist_reservation33);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(arraylist_client45);
        org.junit.Assert.assertNotNull(arraylist_reservation56);
        org.junit.Assert.assertNull(arraylist_car62);
        org.junit.Assert.assertNotNull(branch_array73);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test105");
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
        rental0.dropoffCar("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
        org.junit.Assert.assertNull(arraylist_car20);
        org.junit.Assert.assertNotNull(branch_array28);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test106");
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
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation22 = rental0.showClientReservations("");
        rentalService.Branch[] branch_array23 = new rentalService.Branch[] {};
        rental0.initialise(branch_array23);
        java.lang.String str28 = rental0.makeReservation("", "hi!", "hi!");
        java.lang.String str32 = rental0.makeReservation("hi!", "", "hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(arraylist_client18);
        org.junit.Assert.assertNotNull(arraylist_reservation22);
        org.junit.Assert.assertNotNull(branch_array23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test107");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        java.lang.String str14 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Car> arraylist_car16 = rental0.showCars("");
        rental0.cancelReservation("");
        rentalService.Rental rental19 = new rentalService.Rental();
        rental19.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car23 = rental19.showCars("");
        rentalService.Branch[] branch_array24 = null;
        rental19.initialise(branch_array24);
        rental19.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client29 = rental19.showClients("");
        rentalService.Rental rental30 = new rentalService.Rental();
        rental30.pickupCar("");
        rental30.dropoffCar("");
        rental30.pickupCar("");
        rentalService.Branch branch37 = null;
        rentalService.Branch[] branch_array38 = new rentalService.Branch[] { branch37 };
        rental30.initialise(branch_array38);
        rental19.initialise(branch_array38);
        rental0.initialise(branch_array38);
        rental0.cancelClientReservation("hi!");
        try {
            java.util.ArrayList<rentalService.Client> arraylist_client45 = rental0.showClients("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(arraylist_car16);
        org.junit.Assert.assertNull(arraylist_car23);
        org.junit.Assert.assertNull(arraylist_client29);
        org.junit.Assert.assertNotNull(branch_array38);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test108");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("hi!");
        java.lang.String str16 = rental0.makeReservation("", "", "");
        rental0.cancelReservation("");
        java.lang.String str21 = rental0.registerClient("", "hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test109");
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
        rental0.dropoffCar("hi!");
        try {
            java.util.ArrayList<rentalService.Car> arraylist_car95 = rental0.showCars("hi!");
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
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test110");
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
        java.lang.String str40 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
        org.junit.Assert.assertNull(arraylist_car20);
        org.junit.Assert.assertNotNull(branch_array28);
        org.junit.Assert.assertNotNull(arraylist_reservation35);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test111");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation10 = rental0.showClientReservations("hi!");
        rental0.pickupCar("hi!");
        java.lang.String str16 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Car> arraylist_car18 = rental0.showCars("");
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(arraylist_reservation10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(arraylist_car18);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test112");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental0.showCars("");
        java.util.ArrayList<rentalService.Client> arraylist_client14 = rental0.showClients("");
        rental0.cancelClientReservation("");
        rental0.cancelReservation("");
        rental0.cancelClientReservation("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(arraylist_client10);
        org.junit.Assert.assertNull(arraylist_car12);
        org.junit.Assert.assertNull(arraylist_client14);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test113");
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
        rental0.cancelReservation("");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(branch_array32);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test114");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation10 = rental0.showClientReservations("");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("");
        rental0.cancelClientReservation("hi!");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation20 = rental0.showClientReservations("");
        java.lang.String str23 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNotNull(arraylist_reservation10);
        org.junit.Assert.assertNotNull(arraylist_reservation20);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test115");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        rental0.pickupCar("hi!");
        java.lang.String str15 = rental0.registerClient("hi!", "");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation21 = rental0.showClientReservations("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(arraylist_reservation21);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test116");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("");
        rentalService.Rental rental17 = new rentalService.Rental();
        java.lang.String str20 = rental17.registerClient("", "");
        rental17.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation24 = rental17.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation26 = rental17.showClientReservations("hi!");
        java.lang.String str29 = rental17.registerClient("", "hi!");
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
        rental17.initialise(branch_array65);
        rental0.initialise(branch_array65);
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(arraylist_reservation24);
        org.junit.Assert.assertNotNull(arraylist_reservation26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(arraylist_car39);
        org.junit.Assert.assertNotNull(arraylist_reservation48);
        org.junit.Assert.assertNull(arraylist_car54);
        org.junit.Assert.assertNotNull(branch_array65);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test117");
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
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation22 = rental0.showClientReservations("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(arraylist_reservation22);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test118");
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
        rental0.cancelClientReservation("");
        java.lang.String str43 = rental0.makeReservation("", "", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
        org.junit.Assert.assertNull(arraylist_car20);
        org.junit.Assert.assertNotNull(branch_array28);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test119");
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
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation43 = rental0.showClientReservations("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation15);
        org.junit.Assert.assertNull(arraylist_car21);
        org.junit.Assert.assertNotNull(branch_array32);
        org.junit.Assert.assertNotNull(arraylist_reservation39);
        org.junit.Assert.assertNotNull(arraylist_reservation43);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test120");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation5 = rental0.showClientReservations("");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation5);
        org.junit.Assert.assertNotNull(arraylist_reservation9);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test121");
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
        java.lang.String str51 = rental0.registerClient("hi!", "hi!");
        java.lang.String str54 = rental0.registerClient("", "");
        rental0.dropoffCar("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(branch_array25);
        org.junit.Assert.assertNotNull(arraylist_reservation36);
        org.junit.Assert.assertNotNull(branch_array37);
        org.junit.Assert.assertNull(arraylist_client41);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str54);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test122");
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
        rental0.dropoffCar("");
        rental0.pickupCar("hi!");
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
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test123");
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
        rental0.dropoffCar("");
        rental0.cancelReservation("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(branch_array25);
        org.junit.Assert.assertNotNull(arraylist_reservation36);
        org.junit.Assert.assertNotNull(branch_array37);
        org.junit.Assert.assertNull(arraylist_client41);
        org.junit.Assert.assertNotNull(arraylist_reservation43);
        org.junit.Assert.assertNull(arraylist_client45);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test124");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation5 = rental0.showClientReservations("");
        rental0.cancelReservation("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str14 = rental0.registerClient("", "hi!");
        rental0.dropoffCar("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation5);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test125");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rentalService.Rental rental17 = new rentalService.Rental();
        java.lang.String str20 = rental17.registerClient("", "");
        rental17.cancelReservation("hi!");
        rental17.pickupCar("");
        rental17.pickupCar("");
        rental17.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation30 = rental17.showClientReservations("hi!");
        rental17.pickupCar("hi!");
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
        rental17.initialise(branch_array46);
        rental0.initialise(branch_array46);
        java.util.ArrayList<rentalService.Client> arraylist_client52 = rental0.showClients("");
        rental0.pickupCar("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(arraylist_reservation30);
        org.junit.Assert.assertNotNull(branch_array46);
        org.junit.Assert.assertNull(arraylist_client52);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test126");
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
        try {
            java.lang.String str84 = rental0.registerClient("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
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
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test127");
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
        java.util.ArrayList<rentalService.Client> arraylist_client54 = rental0.showClients("");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(arraylist_car13);
        org.junit.Assert.assertNull(arraylist_car18);
        org.junit.Assert.assertNotNull(arraylist_reservation29);
        org.junit.Assert.assertNull(arraylist_car35);
        org.junit.Assert.assertNotNull(branch_array46);
        org.junit.Assert.assertNotNull(arraylist_reservation52);
        org.junit.Assert.assertNull(arraylist_client54);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test128");
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
        rental0.pickupCar("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car22 = rental0.showCars("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNull(arraylist_client12);
        org.junit.Assert.assertNull(arraylist_car22);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test129");
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
        try {
            java.util.ArrayList<rentalService.Car> arraylist_car83 = rental0.showCars("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
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
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test130");
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
        rental0.dropoffCar("hi!");
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
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test131");
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
        java.lang.String str27 = rental0.registerClient("", "hi!");
        rental0.dropoffCar("");
        java.lang.String str32 = rental0.registerClient("", "hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(arraylist_client18);
        org.junit.Assert.assertNotNull(arraylist_reservation24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test132");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        rental0.cancelReservation("");
        java.lang.String str17 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Client> arraylist_client19 = rental0.showClients("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("");
        rental0.dropoffCar("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(arraylist_client19);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test133");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental0.showCars("");
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(arraylist_client10);
        org.junit.Assert.assertNull(arraylist_car12);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test134");
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
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation85 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(arraylist_reservation21);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(branch_array45);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(branch_array74);
        org.junit.Assert.assertNotNull(arraylist_reservation85);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test135");
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
        rental0.pickupCar("hi!");
        rental0.dropoffCar("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(arraylist_car29);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test136");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rentalService.Branch[] branch_array5 = null;
        rental0.initialise(branch_array5);
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("");
        rental0.cancelClientReservation("");
        rental0.pickupCar("hi!");
        rental0.cancelClientReservation("");
        try {
            java.util.ArrayList<rentalService.Client> arraylist_client18 = rental0.showClients("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(arraylist_client10);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test137");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation11 = rental0.showClientReservations("");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation7);
        org.junit.Assert.assertNotNull(arraylist_reservation9);
        org.junit.Assert.assertNotNull(arraylist_reservation11);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test138");
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
        rental0.cancelClientReservation("hi!");
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
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test139");
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
        java.util.ArrayList<rentalService.Car> arraylist_car55 = rental0.showCars("");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation18);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(arraylist_car40);
        org.junit.Assert.assertNotNull(branch_array48);
        org.junit.Assert.assertNotNull(arraylist_reservation53);
        org.junit.Assert.assertNull(arraylist_car55);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test140");
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
        rental0.dropoffCar("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(branch_array46);
        org.junit.Assert.assertNull(arraylist_car60);
        org.junit.Assert.assertNull(arraylist_car69);
        org.junit.Assert.assertNull(arraylist_client75);
        org.junit.Assert.assertNotNull(branch_array84);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test141");
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
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car24 = rental0.showCars("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(arraylist_reservation20);
        org.junit.Assert.assertNull(arraylist_car24);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test142");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.cancelClientReservation("");
        java.lang.String str20 = rental0.makeReservation("hi!", "", "hi!");
        rental0.cancelReservation("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test143");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation10 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        rental0.cancelClientReservation("");
        rentalService.Rental rental15 = new rentalService.Rental();
        java.lang.String str18 = rental15.registerClient("", "");
        rental15.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation22 = rental15.showClientReservations("hi!");
        rental15.dropoffCar("hi!");
        rental15.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation28 = rental15.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car30 = rental15.showCars("");
        rentalService.Rental rental31 = new rentalService.Rental();
        java.lang.String str34 = rental31.registerClient("", "");
        rental31.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation38 = rental31.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation40 = rental31.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation42 = rental31.showClientReservations("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation44 = rental31.showClientReservations("hi!");
        rentalService.Rental rental45 = new rentalService.Rental();
        rental45.pickupCar("");
        rental45.dropoffCar("");
        rental45.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation53 = rental45.showClientReservations("hi!");
        rental45.cancelReservation("hi!");
        rental45.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car59 = rental45.showCars("");
        rental45.dropoffCar("");
        rentalService.Rental rental62 = new rentalService.Rental();
        rental62.pickupCar("");
        rental62.dropoffCar("");
        rental62.pickupCar("");
        rentalService.Branch branch69 = null;
        rentalService.Branch[] branch_array70 = new rentalService.Branch[] { branch69 };
        rental62.initialise(branch_array70);
        rental45.initialise(branch_array70);
        rental31.initialise(branch_array70);
        rental15.initialise(branch_array70);
        rental0.initialise(branch_array70);
        java.lang.String str78 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Client> arraylist_client80 = rental0.showClients("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNotNull(arraylist_reservation10);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(arraylist_reservation22);
        org.junit.Assert.assertNotNull(arraylist_reservation28);
        org.junit.Assert.assertNull(arraylist_car30);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(arraylist_reservation38);
        org.junit.Assert.assertNotNull(arraylist_reservation40);
        org.junit.Assert.assertNotNull(arraylist_reservation42);
        org.junit.Assert.assertNotNull(arraylist_reservation44);
        org.junit.Assert.assertNotNull(arraylist_reservation53);
        org.junit.Assert.assertNull(arraylist_car59);
        org.junit.Assert.assertNotNull(branch_array70);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertNull(arraylist_client80);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test144");
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
        rentalService.Rental rental21 = new rentalService.Rental();
        rental21.pickupCar("");
        rental21.cancelReservation("hi!");
        rentalService.Rental rental26 = new rentalService.Rental();
        java.lang.String str29 = rental26.registerClient("", "");
        java.lang.String str33 = rental26.makeReservation("hi!", "", "");
        rentalService.Rental rental34 = new rentalService.Rental();
        java.lang.String str37 = rental34.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation39 = rental34.showClientReservations("");
        rental34.cancelReservation("");
        rentalService.Rental rental42 = new rentalService.Rental();
        rental42.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car46 = rental42.showCars("");
        rental42.dropoffCar("hi!");
        rental42.dropoffCar("");
        rental42.dropoffCar("hi!");
        rentalService.Branch branch53 = null;
        rentalService.Branch[] branch_array54 = new rentalService.Branch[] { branch53 };
        rental42.initialise(branch_array54);
        rental34.initialise(branch_array54);
        rental26.initialise(branch_array54);
        rental21.initialise(branch_array54);
        rental0.initialise(branch_array54);
        rental0.cancelReservation("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNull(arraylist_client12);
        org.junit.Assert.assertNotNull(arraylist_reservation20);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(arraylist_reservation39);
        org.junit.Assert.assertNull(arraylist_car46);
        org.junit.Assert.assertNotNull(branch_array54);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test145");
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
        rental0.cancelClientReservation("");
        rental0.pickupCar("");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(branch_array39);
        org.junit.Assert.assertNotNull(arraylist_reservation52);
        org.junit.Assert.assertNotNull(arraylist_reservation71);
        org.junit.Assert.assertNotNull(branch_array72);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test146");
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
        java.lang.String str24 = rental0.makeReservation("", "", "");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(arraylist_client16);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test147");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        java.lang.String str14 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Car> arraylist_car16 = rental0.showCars("");
        rental0.cancelReservation("");
        java.lang.String str21 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(arraylist_car16);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test148");
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
        rental0.cancelClientReservation("hi!");
        rentalService.Rental rental25 = new rentalService.Rental();
        rental25.pickupCar("");
        rental25.dropoffCar("");
        rental25.pickupCar("");
        rentalService.Branch branch32 = null;
        rentalService.Branch[] branch_array33 = new rentalService.Branch[] { branch32 };
        rental25.initialise(branch_array33);
        rental25.cancelReservation("hi!");
        rentalService.Rental rental37 = new rentalService.Rental();
        rental37.pickupCar("");
        rental37.dropoffCar("");
        rental37.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation45 = rental37.showClientReservations("hi!");
        rental37.cancelReservation("hi!");
        rental37.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car51 = rental37.showCars("");
        rental37.pickupCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client55 = rental37.showClients("");
        rental37.dropoffCar("hi!");
        rental37.cancelClientReservation("hi!");
        rentalService.Rental rental60 = new rentalService.Rental();
        rental60.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car64 = rental60.showCars("");
        rental60.dropoffCar("hi!");
        rental60.dropoffCar("");
        rental60.dropoffCar("hi!");
        rentalService.Branch branch71 = null;
        rentalService.Branch[] branch_array72 = new rentalService.Branch[] { branch71 };
        rental60.initialise(branch_array72);
        rentalService.Rental rental74 = new rentalService.Rental();
        rental74.pickupCar("");
        rental74.dropoffCar("");
        rentalService.Rental rental79 = new rentalService.Rental();
        rental79.pickupCar("");
        rental79.dropoffCar("");
        rental79.pickupCar("");
        rentalService.Branch branch86 = null;
        rentalService.Branch[] branch_array87 = new rentalService.Branch[] { branch86 };
        rental79.initialise(branch_array87);
        rental74.initialise(branch_array87);
        rental60.initialise(branch_array87);
        rental37.initialise(branch_array87);
        rental25.initialise(branch_array87);
        rental0.initialise(branch_array87);
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(branch_array33);
        org.junit.Assert.assertNotNull(arraylist_reservation45);
        org.junit.Assert.assertNull(arraylist_car51);
        org.junit.Assert.assertNull(arraylist_client55);
        org.junit.Assert.assertNull(arraylist_car64);
        org.junit.Assert.assertNotNull(branch_array72);
        org.junit.Assert.assertNotNull(branch_array87);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test149");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("hi!");
        rental0.dropoffCar("");
        org.junit.Assert.assertNotNull(arraylist_reservation6);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test150");
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
        rental0.cancelReservation("");
        rental0.dropoffCar("");
        rental0.cancelReservation("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test151");
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
        java.util.ArrayList<rentalService.Car> arraylist_car23 = rental0.showCars("");
        java.lang.String str27 = rental0.makeReservation("hi!", "hi!", "hi!");
        java.lang.String str30 = rental0.registerClient("hi!", "");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(arraylist_car23);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test152");
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
        rental0.cancelReservation("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation12);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(arraylist_car22);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test153");
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
        rentalService.Rental rental51 = new rentalService.Rental();
        rental51.pickupCar("");
        rental51.dropoffCar("");
        rental51.pickupCar("");
        rentalService.Branch branch58 = null;
        rentalService.Branch[] branch_array59 = new rentalService.Branch[] { branch58 };
        rental51.initialise(branch_array59);
        rental0.initialise(branch_array59);
        rental0.dropoffCar("");
        rental0.pickupCar("hi!");
        rental0.dropoffCar("");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(arraylist_car13);
        org.junit.Assert.assertNull(arraylist_car18);
        org.junit.Assert.assertNotNull(arraylist_reservation29);
        org.junit.Assert.assertNull(arraylist_car35);
        org.junit.Assert.assertNotNull(branch_array46);
        org.junit.Assert.assertNotNull(branch_array59);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test154");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car6 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation18 = rental0.showClientReservations("");
        rental0.pickupCar("");
        org.junit.Assert.assertNull(arraylist_car6);
        org.junit.Assert.assertNotNull(arraylist_reservation18);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test155");
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
        rental0.cancelClientReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation43 = rental0.showClientReservations("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNotNull(arraylist_reservation15);
        org.junit.Assert.assertNull(arraylist_car21);
        org.junit.Assert.assertNotNull(branch_array32);
        org.junit.Assert.assertNotNull(arraylist_reservation39);
        org.junit.Assert.assertNotNull(arraylist_reservation43);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test156");
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
        java.util.ArrayList<rentalService.Car> arraylist_car54 = rental0.showCars("");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(arraylist_car13);
        org.junit.Assert.assertNull(arraylist_car18);
        org.junit.Assert.assertNotNull(arraylist_reservation29);
        org.junit.Assert.assertNull(arraylist_car35);
        org.junit.Assert.assertNotNull(branch_array46);
        org.junit.Assert.assertNotNull(arraylist_reservation52);
        org.junit.Assert.assertNull(arraylist_car54);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test157");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car16 = rental0.showCars("");
        rental0.cancelClientReservation("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(arraylist_car16);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test158");
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
        rental0.dropoffCar("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(arraylist_reservation13);
        org.junit.Assert.assertNull(arraylist_client19);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test159");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str15 = rental0.registerClient("", "hi!");
        rental0.dropoffCar("");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car21 = rental0.showCars("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(arraylist_car21);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test160");
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
        rental0.cancelClientReservation("");
        rental0.cancelReservation("hi!");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNull(arraylist_client18);
        org.junit.Assert.assertNull(arraylist_car27);
        org.junit.Assert.assertNotNull(branch_array35);
        org.junit.Assert.assertNotNull(branch_array50);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test161");
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
        rental0.cancelClientReservation("");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNull(arraylist_car14);
        org.junit.Assert.assertNotNull(branch_array25);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test162");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rentalService.Branch[] branch_array9 = new rentalService.Branch[] {};
        rental0.initialise(branch_array9);
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation14 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Client> arraylist_client16 = rental0.showClients("");
        java.util.ArrayList<rentalService.Client> arraylist_client18 = rental0.showClients("");
        java.lang.String str22 = rental0.makeReservation("", "", "");
        org.junit.Assert.assertNotNull(arraylist_reservation8);
        org.junit.Assert.assertNotNull(branch_array9);
        org.junit.Assert.assertNotNull(arraylist_reservation14);
        org.junit.Assert.assertNull(arraylist_client16);
        org.junit.Assert.assertNull(arraylist_client18);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test163");
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
        java.lang.String str36 = rental0.registerClient("", "hi!");
        rental0.pickupCar("");
        rental0.cancelClientReservation("");
        org.junit.Assert.assertNotNull(arraylist_reservation6);
        org.junit.Assert.assertNull(arraylist_client10);
        org.junit.Assert.assertNull(arraylist_car15);
        org.junit.Assert.assertNull(arraylist_client21);
        org.junit.Assert.assertNotNull(branch_array30);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test164");
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
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation21 = rental15.showClientReservations("hi!");
        rental15.cancelReservation("hi!");
        java.lang.String str26 = rental15.registerClient("", "hi!");
        rental15.cancelClientReservation("");
        rentalService.Rental rental29 = new rentalService.Rental();
        rental29.pickupCar("");
        rental29.dropoffCar("");
        rental29.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation37 = rental29.showClientReservations("hi!");
        rental29.cancelReservation("hi!");
        rental29.cancelClientReservation("hi!");
        rental29.pickupCar("hi!");
        rental29.pickupCar("hi!");
        rentalService.Rental rental46 = new rentalService.Rental();
        rental46.pickupCar("");
        rental46.dropoffCar("");
        rental46.pickupCar("");
        rentalService.Branch branch53 = null;
        rentalService.Branch[] branch_array54 = new rentalService.Branch[] { branch53 };
        rental46.initialise(branch_array54);
        rental29.initialise(branch_array54);
        rental15.initialise(branch_array54);
        rental0.initialise(branch_array54);
        rental0.cancelClientReservation("");
        org.junit.Assert.assertNull(arraylist_car4);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(arraylist_reservation21);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(arraylist_reservation37);
        org.junit.Assert.assertNotNull(branch_array54);
    }
}

