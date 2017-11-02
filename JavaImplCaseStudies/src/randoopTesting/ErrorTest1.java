package randoopTesting;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test01");
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
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client28 = rental0.showClients("hi!");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test02");
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
        java.util.ArrayList<rentalService.Client> arraylist_client23 = rental0.showClients("hi!");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test03");
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
        java.lang.String str28 = rental0.makeReservation("", "hi!", "");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test04");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        java.lang.String str19 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test05");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str18 = rental0.registerClient("", "");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client24 = rental0.showClients("hi!");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test06");
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
        java.lang.String str23 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test07");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.lang.String str8 = rental0.registerClient("", "");
        java.lang.String str11 = rental0.registerClient("", "hi!");
        rental0.cancelReservation("");
        java.lang.String str16 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test08");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental0.showCars("");
        java.util.ArrayList<rentalService.Client> arraylist_client14 = rental0.showClients("");
        java.util.ArrayList<rentalService.Car> arraylist_car16 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client20 = rental0.showClients("hi!");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test09");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str10 = rental0.registerClient("", "hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client12 = rental0.showClients("hi!");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test10");
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
        java.util.ArrayList<rentalService.Client> arraylist_client27 = rental0.showClients("hi!");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test11");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car22 = rental0.showCars("hi!");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test12");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str9 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test13");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        java.lang.String str16 = rental0.registerClient("", "");
        rental0.cancelReservation("");
        java.lang.String str22 = rental0.makeReservation("", "hi!", "");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test14");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car6 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation14 = rental0.showClientReservations("");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("hi!");
        java.lang.String str22 = rental0.makeReservation("hi!", "hi!", "");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test15");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        java.lang.String str16 = rental0.registerClient("", "");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation20 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str26 = rental0.makeReservation("", "", "hi!");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test16");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.lang.String str9 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client21 = rental0.showClients("hi!");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test17");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car11 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("");
        java.lang.String str17 = rental0.makeReservation("", "", "hi!");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test18");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str12 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation14 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car16 = rental0.showCars("");
        rental0.cancelReservation("");
        rental0.pickupCar("hi!");
        java.lang.String str24 = rental0.makeReservation("", "", "hi!");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test19");
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
        java.util.ArrayList<rentalService.Car> arraylist_car24 = rental0.showCars("hi!");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test20");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Car> arraylist_car17 = rental0.showCars("hi!");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test21");
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
        java.lang.String str27 = rental0.makeReservation("", "hi!", "");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test22");
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
        java.lang.String str28 = rental0.registerClient("", "hi!");
        java.lang.String str32 = rental0.makeReservation("", "", "hi!");
    }
}

