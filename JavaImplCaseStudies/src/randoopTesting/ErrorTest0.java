package randoopTesting;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.util.ArrayList<rentalService.Car> arraylist_car2 = rental0.showCars("hi!");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.lang.String str8 = rental0.makeReservation("hi!", "", "hi!");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client14 = rental0.showClients("hi!");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str4 = rental0.makeReservation("", "hi!", "");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.lang.String str6 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        java.lang.String str10 = rental0.makeReservation("hi!", "hi!", "");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("");
        java.lang.String str12 = rental0.makeReservation("hi!", "", "hi!");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car6 = rental0.showCars("hi!");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Client> arraylist_client6 = rental0.showClients("hi!");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        java.lang.String str18 = rental0.makeReservation("", "hi!", "");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car16 = rental0.showCars("hi!");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Client> arraylist_client5 = rental0.showClients("hi!");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        java.lang.String str14 = rental0.makeReservation("hi!", "", "hi!");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car9 = rental0.showCars("hi!");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client6 = rental0.showClients("hi!");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client9 = rental0.showClients("hi!");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental0.showCars("hi!");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client16 = rental0.showClients("hi!");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str12 = rental0.makeReservation("hi!", "", "hi!");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        java.lang.String str20 = rental0.makeReservation("hi!", "", "hi!");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental0.showCars("hi!");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car6 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car10 = rental0.showCars("hi!");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        java.lang.String str17 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("");
        java.lang.String str23 = rental0.makeReservation("", "hi!", "hi!");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client12 = rental0.showClients("hi!");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        java.lang.String str14 = rental0.makeReservation("hi!", "hi!", "");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation5 = rental0.showClientReservations("");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("hi!");
        java.lang.String str13 = rental0.makeReservation("hi!", "", "hi!");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.lang.String str9 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car9 = rental0.showCars("");
        java.lang.String str13 = rental0.makeReservation("hi!", "", "hi!");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car9 = rental0.showCars("hi!");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Car> arraylist_car11 = rental0.showCars("hi!");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("hi!");
        java.lang.String str13 = rental0.makeReservation("", "", "hi!");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("hi!");
        java.lang.String str11 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        java.lang.String str17 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car10 = rental0.showCars("hi!");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client18 = rental0.showClients("hi!");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("hi!");
        java.lang.String str12 = rental0.registerClient("", "hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("hi!");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
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
        java.lang.String str21 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.lang.String str9 = rental0.registerClient("", "hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car11 = rental0.showCars("hi!");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
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
        java.lang.String str26 = rental0.makeReservation("", "", "hi!");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("hi!");
        rental0.pickupCar("");
        java.lang.String str19 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str11 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Client> arraylist_client13 = rental0.showClients("hi!");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        java.lang.String str13 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        java.lang.String str17 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("");
        java.util.ArrayList<rentalService.Client> arraylist_client21 = rental0.showClients("hi!");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client15 = rental0.showClients("hi!");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
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
        java.util.ArrayList<rentalService.Car> arraylist_car22 = rental0.showCars("hi!");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
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
        java.util.ArrayList<rentalService.Client> arraylist_client22 = rental0.showClients("hi!");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.lang.String str9 = rental0.registerClient("", "hi!");
        java.lang.String str13 = rental0.makeReservation("", "hi!", "");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.lang.String str7 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car11 = rental0.showCars("hi!");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client12 = rental0.showClients("hi!");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car6 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental0.showCars("");
        java.lang.String str15 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
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
        java.util.ArrayList<rentalService.Car> arraylist_car20 = rental0.showCars("hi!");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("hi!");
        rental0.pickupCar("hi!");
        java.lang.String str19 = rental0.makeReservation("", "hi!", "");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str4 = rental0.makeReservation("hi!", "", "hi!");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental0.showCars("");
        rental0.pickupCar("");
        java.lang.String str17 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("hi!");
        java.lang.String str12 = rental0.registerClient("", "hi!");
        java.lang.String str16 = rental0.makeReservation("", "hi!", "");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
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
        java.lang.String str22 = rental0.makeReservation("", "", "hi!");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car6 = rental0.showCars("hi!");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car11 = rental0.showCars("");
        java.lang.String str15 = rental0.makeReservation("", "", "");
        java.lang.String str19 = rental0.makeReservation("hi!", "hi!", "hi!");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("hi!");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car18 = rental0.showCars("hi!");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car11 = rental0.showCars("");
        java.lang.String str15 = rental0.makeReservation("", "", "");
        java.lang.String str18 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.lang.String str7 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("");
        java.lang.String str12 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.lang.String str9 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car13 = rental0.showCars("");
        java.util.ArrayList<rentalService.Car> arraylist_car15 = rental0.showCars("hi!");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation11 = rental0.showClientReservations("");
        java.lang.String str15 = rental0.makeReservation("hi!", "", "hi!");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("hi!");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client18 = rental0.showClients("hi!");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        java.lang.String str17 = rental0.registerClient("", "hi!");
        java.lang.String str21 = rental0.makeReservation("hi!", "", "hi!");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.dropoffCar("");
        java.lang.String str14 = rental0.makeReservation("", "hi!", "hi!");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("hi!");
        java.lang.String str16 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("");
        java.lang.String str20 = rental0.makeReservation("", "", "hi!");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
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
        java.util.ArrayList<rentalService.Car> arraylist_car22 = rental0.showCars("hi!");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.lang.String str6 = rental0.makeReservation("hi!", "hi!", "hi!");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str12 = rental0.makeReservation("", "", "");
        rental0.cancelReservation("hi!");
        java.lang.String str18 = rental0.makeReservation("hi!", "hi!", "");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("hi!");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.cancelReservation("hi!");
        java.lang.String str8 = rental0.makeReservation("hi!", "hi!", "hi!");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.lang.String str8 = rental0.registerClient("", "");
        java.lang.String str11 = rental0.registerClient("", "hi!");
        rental0.pickupCar("hi!");
        java.lang.String str17 = rental0.makeReservation("", "", "hi!");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        rental0.cancelReservation("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car17 = rental0.showCars("hi!");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("hi!");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        java.lang.String str10 = rental0.makeReservation("hi!", "hi!", "");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
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
        java.lang.String str21 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
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
        java.lang.String str22 = rental0.makeReservation("", "", "hi!");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car13 = rental0.showCars("hi!");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
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
        java.lang.String str25 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.lang.String str7 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Client> arraylist_client11 = rental0.showClients("");
        java.lang.String str15 = rental0.makeReservation("", "", "hi!");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        rental0.cancelReservation("");
        rental0.dropoffCar("");
        rental0.dropoffCar("");
        java.lang.String str20 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
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
        java.lang.String str24 = rental0.makeReservation("", "hi!", "hi!");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.lang.String str8 = rental0.registerClient("", "");
        java.lang.String str12 = rental0.makeReservation("", "hi!", "");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        rental0.cancelReservation("");
        java.lang.String str17 = rental0.makeReservation("hi!", "", "hi!");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        java.lang.String str13 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("");
        java.util.ArrayList<rentalService.Client> arraylist_client17 = rental0.showClients("");
        java.lang.String str21 = rental0.makeReservation("hi!", "hi!", "");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.lang.String str13 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
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
        java.lang.String str24 = rental0.makeReservation("", "", "hi!");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("hi!");
        java.lang.String str16 = rental0.makeReservation("hi!", "hi!", "hi!");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.lang.String str8 = rental0.registerClient("", "");
        java.lang.String str11 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
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
        java.lang.String str22 = rental0.makeReservation("hi!", "hi!", "");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car6 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("hi!");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.pickupCar("");
        rental0.pickupCar("hi!");
        java.lang.String str23 = rental0.makeReservation("", "hi!", "");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        java.lang.String str17 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("");
        java.lang.String str23 = rental0.makeReservation("hi!", "hi!", "");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation5 = rental0.showClientReservations("");
        java.lang.String str9 = rental0.makeReservation("", "hi!", "hi!");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("");
        rental0.cancelClientReservation("");
        rental0.pickupCar("");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Client> arraylist_client21 = rental0.showClients("hi!");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
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
        java.util.ArrayList<rentalService.Client> arraylist_client20 = rental0.showClients("hi!");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
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
        java.lang.String str24 = rental0.makeReservation("hi!", "hi!", "hi!");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("");
        rental0.cancelReservation("hi!");
        java.lang.String str14 = rental0.makeReservation("", "hi!", "");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
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
        java.lang.String str24 = rental0.makeReservation("hi!", "hi!", "");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
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
        java.lang.String str27 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str19 = rental0.makeReservation("", "hi!", "hi!");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
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
        rental0.dropoffCar("");
        java.lang.String str23 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        java.lang.String str20 = rental0.makeReservation("", "", "hi!");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("hi!");
        java.lang.String str12 = rental0.registerClient("", "hi!");
        java.lang.String str15 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
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
        java.lang.String str23 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("");
        java.lang.String str14 = rental0.makeReservation("", "", "");
        java.lang.String str17 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
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
        java.lang.String str28 = rental0.makeReservation("hi!", "", "hi!");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str10 = rental0.makeReservation("hi!", "", "hi!");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
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
        java.lang.String str22 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        java.lang.String str14 = rental0.makeReservation("", "", "");
        rental0.pickupCar("hi!");
        java.lang.String str19 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
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
        rental0.cancelClientReservation("hi!");
        java.lang.String str30 = rental0.makeReservation("hi!", "hi!", "hi!");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.lang.String str9 = rental0.registerClient("", "hi!");
        java.lang.String str12 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Client> arraylist_client14 = rental0.showClients("hi!");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
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
        java.util.ArrayList<rentalService.Client> arraylist_client21 = rental0.showClients("hi!");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str12 = rental0.makeReservation("", "", "");
        rental0.cancelReservation("hi!");
        java.lang.String str18 = rental0.makeReservation("", "", "hi!");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
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
        java.util.ArrayList<rentalService.Client> arraylist_client20 = rental0.showClients("hi!");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car6 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        rental0.dropoffCar("hi!");
        java.lang.String str14 = rental0.makeReservation("", "hi!", "");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car18 = rental0.showCars("hi!");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation5 = rental0.showClientReservations("");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str14 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation10 = rental0.showClientReservations("");
        rental0.cancelReservation("hi!");
        java.lang.String str16 = rental0.makeReservation("hi!", "", "hi!");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        rental0.cancelClientReservation("");
        rental0.pickupCar("hi!");
        java.lang.String str19 = rental0.makeReservation("", "hi!", "");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        rental0.dropoffCar("");
        rental0.cancelClientReservation("hi!");
        java.lang.String str22 = rental0.makeReservation("hi!", "", "hi!");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.lang.String str8 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental0.showCars("hi!");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
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
        java.lang.String str21 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.cancelClientReservation("");
        java.util.ArrayList<rentalService.Car> arraylist_car19 = rental0.showCars("hi!");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("hi!");
        java.lang.String str20 = rental0.makeReservation("hi!", "", "hi!");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
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
        java.util.ArrayList<rentalService.Client> arraylist_client25 = rental0.showClients("hi!");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
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
        rental0.cancelReservation("hi!");
        java.lang.String str24 = rental0.makeReservation("", "", "hi!");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
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
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation26 = rental0.showClientReservations("");
        java.lang.String str29 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.lang.String str9 = rental0.registerClient("", "hi!");
        java.lang.String str12 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("hi!");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        java.lang.String str17 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Car> arraylist_car19 = rental0.showCars("hi!");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
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
        java.util.ArrayList<rentalService.Car> arraylist_car24 = rental0.showCars("");
        java.lang.String str28 = rental0.makeReservation("hi!", "", "hi!");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("hi!");
        rental0.pickupCar("hi!");
        java.lang.String str19 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
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
        java.lang.String str22 = rental0.makeReservation("hi!", "", "hi!");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        rental0.cancelClientReservation("");
        java.lang.String str17 = rental0.makeReservation("hi!", "hi!", "");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
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
        java.lang.String str26 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.lang.String str7 = rental0.makeReservation("hi!", "", "");
        java.lang.String str10 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation11 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation15 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client17 = rental0.showClients("hi!");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        rental0.cancelClientReservation("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation17 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car19 = rental0.showCars("hi!");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.lang.String str9 = rental0.makeReservation("hi!", "hi!", "hi!");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        rental0.cancelReservation("");
        java.lang.String str17 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation19 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client21 = rental0.showClients("hi!");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car6 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        java.lang.String str13 = rental0.registerClient("", "hi!");
        java.lang.String str16 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation18 = rental0.showClientReservations("");
        java.lang.String str21 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.lang.String str6 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Car> arraylist_car8 = rental0.showCars("hi!");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car9 = rental0.showCars("");
        java.util.ArrayList<rentalService.Car> arraylist_car11 = rental0.showCars("hi!");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        rental0.pickupCar("");
        rental0.cancelClientReservation("");
        java.lang.String str15 = rental0.makeReservation("", "hi!", "");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str11 = rental0.registerClient("", "hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car13 = rental0.showCars("");
        java.lang.String str17 = rental0.makeReservation("", "", "hi!");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client8 = rental0.showClients("hi!");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
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
        java.lang.String str22 = rental0.makeReservation("", "hi!", "hi!");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental0.showCars("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("hi!");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental0.showCars("");
        java.util.ArrayList<rentalService.Client> arraylist_client14 = rental0.showClients("");
        java.util.ArrayList<rentalService.Client> arraylist_client16 = rental0.showClients("hi!");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Car> arraylist_car5 = rental0.showCars("hi!");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.cancelClientReservation("");
        java.lang.String str20 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car17 = rental0.showCars("hi!");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
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
        java.util.ArrayList<rentalService.Car> arraylist_car21 = rental0.showCars("hi!");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("");
        java.lang.String str18 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str12 = rental0.makeReservation("", "hi!", "");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
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
        java.util.ArrayList<rentalService.Car> arraylist_car24 = rental0.showCars("hi!");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str12 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation14 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car16 = rental0.showCars("");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Client> arraylist_client20 = rental0.showClients("hi!");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
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
        java.lang.String str24 = rental0.makeReservation("hi!", "hi!", "");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
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
        java.util.ArrayList<rentalService.Car> arraylist_car22 = rental0.showCars("hi!");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        rental0.cancelReservation("");
        rental0.dropoffCar("hi!");
        java.lang.String str18 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
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
        java.lang.String str26 = rental0.makeReservation("hi!", "hi!", "");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.lang.String str8 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client12 = rental0.showClients("");
        java.util.ArrayList<rentalService.Client> arraylist_client14 = rental0.showClients("hi!");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
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
        java.lang.String str26 = rental0.makeReservation("hi!", "hi!", "");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("hi!");
        rental0.pickupCar("hi!");
        java.lang.String str13 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
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
        java.util.ArrayList<rentalService.Client> arraylist_client29 = rental0.showClients("hi!");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
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
        java.lang.String str24 = rental0.makeReservation("hi!", "hi!", "");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
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
        java.util.ArrayList<rentalService.Client> arraylist_client20 = rental0.showClients("hi!");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car17 = rental0.showCars("hi!");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.lang.String str7 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Client> arraylist_client11 = rental0.showClients("");
        java.util.ArrayList<rentalService.Client> arraylist_client13 = rental0.showClients("");
        java.util.ArrayList<rentalService.Car> arraylist_car15 = rental0.showCars("hi!");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
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
        java.lang.String str23 = rental0.registerClient("", "hi!");
        java.lang.String str26 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("hi!");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("hi!");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client12 = rental0.showClients("");
        rental0.cancelClientReservation("");
        java.util.ArrayList<rentalService.Client> arraylist_client16 = rental0.showClients("hi!");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
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
        java.util.ArrayList<rentalService.Client> arraylist_client22 = rental0.showClients("hi!");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
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
        java.util.ArrayList<rentalService.Client> arraylist_client24 = rental0.showClients("hi!");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation10 = rental0.showClientReservations("hi!");
        rental0.pickupCar("hi!");
        java.lang.String str15 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("");
        java.lang.String str10 = rental0.makeReservation("", "hi!", "");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
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
        java.util.ArrayList<rentalService.Car> arraylist_car22 = rental0.showCars("hi!");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car7 = rental0.showCars("hi!");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
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
        java.lang.String str23 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.cancelReservation("");
        java.lang.String str13 = rental0.makeReservation("", "", "");
        java.lang.String str16 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car18 = rental0.showCars("");
        java.util.ArrayList<rentalService.Car> arraylist_car20 = rental0.showCars("hi!");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("");
        rental0.cancelClientReservation("");
        java.util.ArrayList<rentalService.Client> arraylist_client14 = rental0.showClients("hi!");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        java.lang.String str13 = rental0.makeReservation("hi!", "hi!", "hi!");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation14 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car16 = rental0.showCars("");
        java.util.ArrayList<rentalService.Client> arraylist_client18 = rental0.showClients("hi!");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation10 = rental0.showClientReservations("");
        java.lang.String str13 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str10 = rental0.makeReservation("", "", "");
        java.lang.String str14 = rental0.makeReservation("", "hi!", "hi!");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        rental0.cancelClientReservation("");
        rental0.pickupCar("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car19 = rental0.showCars("hi!");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.lang.String str7 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Client> arraylist_client11 = rental0.showClients("");
        java.util.ArrayList<rentalService.Client> arraylist_client13 = rental0.showClients("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation17 = rental0.showClientReservations("");
        java.lang.String str21 = rental0.makeReservation("", "", "hi!");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("");
        rental0.pickupCar("");
        java.lang.String str18 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        rental0.cancelClientReservation("");
        java.lang.String str17 = rental0.makeReservation("hi!", "hi!", "hi!");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        java.lang.String str14 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation11 = rental0.showClientReservations("");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client17 = rental0.showClients("hi!");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client12 = rental0.showClients("hi!");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str12 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation14 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car16 = rental0.showCars("");
        rental0.cancelClientReservation("");
        rental0.cancelReservation("");
        java.lang.String str23 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str12 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation14 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car16 = rental0.showCars("");
        rental0.cancelClientReservation("");
        java.lang.String str22 = rental0.makeReservation("hi!", "hi!", "");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
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
        java.util.ArrayList<rentalService.Car> arraylist_car20 = rental0.showCars("hi!");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation5 = rental0.showClientReservations("");
        rental0.cancelReservation("");
        java.lang.String str11 = rental0.makeReservation("hi!", "hi!", "hi!");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Client> arraylist_client8 = rental0.showClients("hi!");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        java.lang.String str16 = rental0.registerClient("", "");
        java.lang.String str20 = rental0.makeReservation("hi!", "hi!", "");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        java.lang.String str10 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental0.showCars("hi!");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car15 = rental0.showCars("");
        java.util.ArrayList<rentalService.Client> arraylist_client17 = rental0.showClients("hi!");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
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
        rental0.cancelClientReservation("hi!");
        java.lang.String str30 = rental0.makeReservation("hi!", "", "");
        java.lang.String str34 = rental0.makeReservation("hi!", "hi!", "");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation5 = rental0.showClientReservations("");
        rental0.cancelReservation("");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client11 = rental0.showClients("hi!");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        rental0.pickupCar("");
        java.lang.String str12 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car11 = rental0.showCars("");
        java.lang.String str15 = rental0.makeReservation("", "", "");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("hi!");
        java.lang.String str24 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str12 = rental0.makeReservation("", "", "hi!");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
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
        java.lang.String str23 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
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
        java.lang.String str29 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        java.lang.String str15 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Client> arraylist_client17 = rental0.showClients("hi!");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car13 = rental0.showCars("");
        java.lang.String str16 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
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
        java.lang.String str21 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car11 = rental0.showCars("");
        java.lang.String str15 = rental0.makeReservation("", "", "");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client19 = rental0.showClients("hi!");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
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
        java.lang.String str23 = rental0.makeReservation("", "hi!", "hi!");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.cancelClientReservation("");
        rental0.dropoffCar("hi!");
        java.lang.String str12 = rental0.makeReservation("", "hi!", "hi!");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str12 = rental0.makeReservation("", "", "");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client16 = rental0.showClients("hi!");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelClientReservation("");
        java.util.ArrayList<rentalService.Client> arraylist_client15 = rental0.showClients("hi!");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
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
        rental0.dropoffCar("hi!");
        java.lang.String str26 = rental0.makeReservation("", "", "hi!");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car6 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client16 = rental0.showClients("hi!");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
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
        java.lang.String str31 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
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
        java.util.ArrayList<rentalService.Car> arraylist_car22 = rental0.showCars("hi!");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
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
        java.lang.String str24 = rental0.makeReservation("", "hi!", "hi!");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation16 = rental0.showClientReservations("");
        java.lang.String str19 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        java.lang.String str17 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("");
        java.lang.String str23 = rental0.makeReservation("", "hi!", "");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation11 = rental0.showClientReservations("");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        java.lang.String str21 = rental0.makeReservation("", "hi!", "hi!");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str12 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation14 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car16 = rental0.showCars("");
        java.util.ArrayList<rentalService.Car> arraylist_car18 = rental0.showCars("hi!");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car11 = rental0.showCars("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car15 = rental0.showCars("hi!");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
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
        java.lang.String str23 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        java.lang.String str10 = rental0.registerClient("", "hi!");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Client> arraylist_client14 = rental0.showClients("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car18 = rental0.showCars("hi!");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation10 = rental0.showClientReservations("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client14 = rental0.showClients("hi!");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.lang.String str9 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client17 = rental0.showClients("hi!");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.pickupCar("hi!");
        rental0.cancelClientReservation("");
        rental0.pickupCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client16 = rental0.showClients("hi!");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("hi!");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.lang.String str9 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        rental0.cancelReservation("hi!");
        java.lang.String str19 = rental0.makeReservation("hi!", "", "hi!");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car17 = rental0.showCars("hi!");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str11 = rental0.registerClient("", "hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car13 = rental0.showCars("");
        java.lang.String str16 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
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
        java.util.ArrayList<rentalService.Car> arraylist_car25 = rental0.showCars("");
        java.util.ArrayList<rentalService.Client> arraylist_client27 = rental0.showClients("hi!");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        java.lang.String str18 = rental0.makeReservation("hi!", "hi!", "");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("");
        java.lang.String str17 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
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
        java.util.ArrayList<rentalService.Client> arraylist_client22 = rental0.showClients("hi!");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car8 = rental0.showCars("");
        java.lang.String str12 = rental0.makeReservation("", "hi!", "hi!");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("");
        rental0.cancelReservation("");
        java.lang.String str15 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
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
        java.util.ArrayList<rentalService.Car> arraylist_car29 = rental0.showCars("hi!");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car6 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        java.lang.String str14 = rental0.makeReservation("hi!", "hi!", "hi!");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.cancelClientReservation("");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car10 = rental0.showCars("hi!");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        rental0.cancelClientReservation("");
        java.lang.String str16 = rental0.makeReservation("", "hi!", "hi!");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.lang.String str6 = rental0.registerClient("", "");
        java.lang.String str10 = rental0.makeReservation("hi!", "hi!", "hi!");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation10 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental0.showCars("");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car16 = rental0.showCars("hi!");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.lang.String str9 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        java.lang.String str16 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Client> arraylist_client11 = rental0.showClients("");
        java.lang.String str15 = rental0.makeReservation("", "", "hi!");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        java.lang.String str17 = rental0.registerClient("", "hi!");
        java.lang.String str20 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
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
        java.lang.String str31 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("");
        rental0.cancelClientReservation("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client19 = rental0.showClients("");
        java.lang.String str23 = rental0.makeReservation("", "hi!", "");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.lang.String str9 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car13 = rental0.showCars("");
        rental0.pickupCar("hi!");
        java.lang.String str19 = rental0.makeReservation("hi!", "", "hi!");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
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
        java.lang.String str21 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        rental0.cancelReservation("");
        java.lang.String str17 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Client> arraylist_client19 = rental0.showClients("");
        java.lang.String str23 = rental0.makeReservation("hi!", "", "");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car27 = rental0.showCars("");
        java.lang.String str31 = rental0.makeReservation("", "", "hi!");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        rental0.cancelClientReservation("");
        rental0.pickupCar("hi!");
        java.lang.String str18 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
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
        java.lang.String str27 = rental0.makeReservation("", "", "hi!");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car11 = rental0.showCars("");
        java.lang.String str15 = rental0.makeReservation("", "", "");
        rental0.dropoffCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car21 = rental0.showCars("hi!");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation5 = rental0.showClientReservations("");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation11 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car13 = rental0.showCars("hi!");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
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
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client26 = rental0.showClients("hi!");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car11 = rental0.showCars("");
        java.lang.String str15 = rental0.makeReservation("", "", "");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car23 = rental0.showCars("hi!");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        java.lang.String str9 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str10 = rental0.registerClient("", "hi!");
        java.lang.String str13 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
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
        java.lang.String str33 = rental0.makeReservation("hi!", "hi!", "hi!");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
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
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation27 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car29 = rental0.showCars("");
        java.lang.String str33 = rental0.makeReservation("", "", "hi!");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
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
        java.lang.String str21 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Client> arraylist_client23 = rental0.showClients("hi!");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.lang.String str9 = rental0.makeReservation("hi!", "hi!", "");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.pickupCar("hi!");
        rental0.cancelClientReservation("");
        rental0.pickupCar("");
        rental0.pickupCar("");
        java.lang.String str18 = rental0.makeReservation("", "", "hi!");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        rental0.cancelReservation("");
        java.lang.String str17 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation19 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Client> arraylist_client21 = rental0.showClients("hi!");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
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
        java.lang.String str24 = rental0.makeReservation("", "hi!", "");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        rental0.cancelClientReservation("");
        rental0.pickupCar("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client19 = rental0.showClients("hi!");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
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
        java.lang.String str29 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
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
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client26 = rental0.showClients("");
        java.lang.String str29 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
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
        java.lang.String str23 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.lang.String str7 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("");
        java.lang.String str13 = rental0.makeReservation("", "hi!", "hi!");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental0.showCars("");
        java.util.ArrayList<rentalService.Client> arraylist_client14 = rental0.showClients("");
        java.util.ArrayList<rentalService.Client> arraylist_client16 = rental0.showClients("hi!");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation10 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        rental0.cancelClientReservation("");
        java.lang.String str18 = rental0.makeReservation("", "", "hi!");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car6 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        java.lang.String str13 = rental0.registerClient("", "hi!");
        java.lang.String str16 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        java.lang.String str14 = rental0.makeReservation("", "", "");
        java.lang.String str18 = rental0.makeReservation("hi!", "hi!", "hi!");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        rental0.cancelClientReservation("");
        java.util.ArrayList<rentalService.Client> arraylist_client15 = rental0.showClients("hi!");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        java.lang.String str23 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("");
        java.lang.String str11 = rental0.registerClient("", "hi!");
        java.lang.String str15 = rental0.makeReservation("hi!", "hi!", "hi!");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.lang.String str7 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Car> arraylist_car9 = rental0.showCars("hi!");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("");
        java.lang.String str17 = rental0.registerClient("", "hi!");
        java.lang.String str21 = rental0.makeReservation("hi!", "hi!", "hi!");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("hi!");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str12 = rental0.makeReservation("", "", "");
        rental0.cancelReservation("hi!");
        java.lang.String str18 = rental0.makeReservation("", "hi!", "hi!");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        rental0.cancelReservation("");
        rental0.dropoffCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.lang.String str23 = rental0.makeReservation("hi!", "hi!", "hi!");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
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
        java.util.ArrayList<rentalService.Car> arraylist_car22 = rental0.showCars("hi!");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
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
        java.lang.String str22 = rental0.makeReservation("hi!", "hi!", "");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.lang.String str6 = rental0.registerClient("", "");
        java.lang.String str10 = rental0.makeReservation("hi!", "", "hi!");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car15 = rental0.showCars("hi!");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.pickupCar("");
        rental0.pickupCar("hi!");
        java.lang.String str22 = rental0.registerClient("", "hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car24 = rental0.showCars("hi!");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.lang.String str7 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Client> arraylist_client11 = rental0.showClients("");
        java.util.ArrayList<rentalService.Client> arraylist_client13 = rental0.showClients("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car17 = rental0.showCars("");
        java.lang.String str21 = rental0.makeReservation("hi!", "hi!", "hi!");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("hi!");
        java.lang.String str16 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Client> arraylist_client18 = rental0.showClients("");
        java.util.ArrayList<rentalService.Car> arraylist_car20 = rental0.showCars("hi!");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str12 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("hi!");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client17 = rental0.showClients("hi!");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
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
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client26 = rental0.showClients("");
        java.util.ArrayList<rentalService.Client> arraylist_client28 = rental0.showClients("hi!");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation10 = rental0.showClientReservations("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client16 = rental0.showClients("hi!");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
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
        java.util.ArrayList<rentalService.Client> arraylist_client33 = rental0.showClients("hi!");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
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
        java.lang.String str26 = rental0.makeReservation("", "hi!", "hi!");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        rental0.cancelReservation("");
        java.lang.String str17 = rental0.makeReservation("", "", "");
        rental0.cancelReservation("");
        java.lang.String str22 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
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
        rental0.cancelReservation("");
        java.lang.String str24 = rental0.makeReservation("hi!", "", "hi!");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car16 = rental0.showCars("hi!");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
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
        java.lang.String str32 = rental0.makeReservation("hi!", "", "hi!");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("");
        java.util.ArrayList<rentalService.Client> arraylist_client12 = rental0.showClients("hi!");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
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
        java.lang.String str29 = rental0.makeReservation("", "", "hi!");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
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
        java.util.ArrayList<rentalService.Car> arraylist_car20 = rental0.showCars("hi!");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental0.showCars("hi!");
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
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
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation21 = rental0.showClientReservations("");
        java.lang.String str25 = rental0.makeReservation("", "hi!", "hi!");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation5 = rental0.showClientReservations("");
        rental0.cancelReservation("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str15 = rental0.makeReservation("", "", "hi!");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation5 = rental0.showClientReservations("");
        rental0.cancelReservation("");
        rental0.pickupCar("hi!");
        rental0.pickupCar("hi!");
        java.lang.String str14 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        rental0.cancelReservation("");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car21 = rental0.showCars("hi!");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        rental0.cancelClientReservation("");
        java.lang.String str17 = rental0.makeReservation("", "hi!", "hi!");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("");
        java.lang.String str14 = rental0.makeReservation("hi!", "", "hi!");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str16 = rental0.makeReservation("", "", "");
        java.lang.String str19 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation15 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Client> arraylist_client17 = rental0.showClients("hi!");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        rental0.cancelReservation("");
        java.lang.String str17 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation19 = rental0.showClientReservations("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car23 = rental0.showCars("hi!");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("hi!");
        rental0.dropoffCar("");
        java.lang.String str15 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.cancelClientReservation("");
        java.lang.String str20 = rental0.registerClient("", "hi!");
        java.lang.String str23 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
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
        java.util.ArrayList<rentalService.Car> arraylist_car24 = rental0.showCars("");
        java.lang.String str27 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
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
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client28 = rental0.showClients("hi!");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
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
        java.lang.String str28 = rental0.makeReservation("hi!", "hi!", "");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client14 = rental0.showClients("hi!");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car9 = rental0.showCars("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Client> arraylist_client17 = rental0.showClients("hi!");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str12 = rental0.makeReservation("", "", "");
        rental0.cancelReservation("hi!");
        java.lang.String str17 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
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
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.lang.String str28 = rental0.makeReservation("", "", "hi!");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
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
        java.lang.String str32 = rental0.makeReservation("", "hi!", "hi!");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        rental0.cancelReservation("");
        rental0.dropoffCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client19 = rental0.showClients("hi!");
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("");
        rental0.cancelClientReservation("");
        rental0.pickupCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car21 = rental0.showCars("hi!");
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car13 = rental0.showCars("");
        java.util.ArrayList<rentalService.Car> arraylist_car15 = rental0.showCars("hi!");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("");
        rental0.cancelClientReservation("hi!");
        java.lang.String str19 = rental0.makeReservation("hi!", "", "hi!");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
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
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation21 = rental0.showClientReservations("hi!");
        rental0.pickupCar("");
        java.lang.String str26 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
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
        java.lang.String str24 = rental0.makeReservation("hi!", "", "hi!");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
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
        java.lang.String str23 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car6 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        java.lang.String str13 = rental0.registerClient("", "hi!");
        java.lang.String str16 = rental0.registerClient("", "");
        rental0.cancelReservation("");
        java.lang.String str22 = rental0.makeReservation("", "hi!", "hi!");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client13 = rental0.showClients("");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client17 = rental0.showClients("");
        java.lang.String str20 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        java.lang.String str13 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("");
        java.lang.String str19 = rental0.makeReservation("hi!", "hi!", "hi!");
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client16 = rental0.showClients("hi!");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        java.lang.String str12 = rental0.makeReservation("hi!", "hi!", "hi!");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car16 = rental0.showCars("hi!");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("");
        rental0.cancelClientReservation("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client19 = rental0.showClients("");
        java.lang.String str22 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
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
        java.lang.String str24 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.cancelClientReservation("");
        java.lang.String str20 = rental0.registerClient("", "hi!");
        java.lang.String str24 = rental0.makeReservation("hi!", "", "hi!");
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car11 = rental0.showCars("");
        java.lang.String str15 = rental0.makeReservation("", "", "");
        rental0.cancelReservation("hi!");
        java.lang.String str20 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.lang.String str11 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        java.lang.String str20 = rental0.registerClient("", "hi!");
        java.lang.String str23 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
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
        java.lang.String str25 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        java.lang.String str20 = rental0.makeReservation("", "", "hi!");
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.lang.String str9 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car13 = rental0.showCars("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car17 = rental0.showCars("");
        java.util.ArrayList<rentalService.Client> arraylist_client19 = rental0.showClients("hi!");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        java.lang.String str14 = rental0.makeReservation("", "hi!", "hi!");
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
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
        rental0.cancelReservation("");
        java.lang.String str23 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("hi!");
        java.lang.String str14 = rental0.makeReservation("hi!", "", "hi!");
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("hi!");
        rental0.pickupCar("");
        java.lang.String str20 = rental0.makeReservation("", "hi!", "hi!");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client16 = rental0.showClients("hi!");
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
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
        java.util.ArrayList<rentalService.Car> arraylist_car21 = rental0.showCars("hi!");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        java.lang.String str16 = rental0.registerClient("", "");
        rental0.cancelReservation("");
        rental0.cancelReservation("hi!");
        java.lang.String str24 = rental0.makeReservation("", "", "hi!");
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
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
        java.util.ArrayList<rentalService.Client> arraylist_client25 = rental0.showClients("hi!");
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("hi!");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client18 = rental0.showClients("");
        java.util.ArrayList<rentalService.Client> arraylist_client20 = rental0.showClients("");
        java.lang.String str23 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental0.showCars("");
        java.util.ArrayList<rentalService.Client> arraylist_client14 = rental0.showClients("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation16 = rental0.showClientReservations("");
        java.lang.String str20 = rental0.makeReservation("", "hi!", "");
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation14 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client16 = rental0.showClients("");
        java.lang.String str20 = rental0.makeReservation("hi!", "", "hi!");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("hi!");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client18 = rental0.showClients("");
        java.util.ArrayList<rentalService.Client> arraylist_client20 = rental0.showClients("");
        java.lang.String str24 = rental0.makeReservation("hi!", "", "hi!");
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        rental0.pickupCar("");
        rental0.cancelClientReservation("");
        rental0.cancelReservation("");
        rental0.cancelClientReservation("hi!");
        java.lang.String str19 = rental0.makeReservation("", "", "hi!");
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.lang.String str7 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("");
        java.lang.String str12 = rental0.registerClient("", "");
        rental0.cancelClientReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.dropoffCar("");
        java.lang.String str22 = rental0.makeReservation("", "hi!", "");
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("");
        rental0.cancelClientReservation("");
        java.lang.String str14 = rental0.makeReservation("", "hi!", "");
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client12 = rental0.showClients("");
        rental0.cancelClientReservation("");
        java.util.ArrayList<rentalService.Car> arraylist_car16 = rental0.showCars("hi!");
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
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
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car26 = rental0.showCars("hi!");
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.lang.String str7 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("");
        java.lang.String str12 = rental0.registerClient("", "");
        rental0.cancelClientReservation("hi!");
        rental0.cancelClientReservation("");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client22 = rental0.showClients("hi!");
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
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
        java.lang.String str37 = rental0.makeReservation("", "hi!", "hi!");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car6 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        java.lang.String str13 = rental0.registerClient("", "hi!");
        java.lang.String str16 = rental0.registerClient("", "");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Car> arraylist_car20 = rental0.showCars("hi!");
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.lang.String str7 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("");
        java.lang.String str12 = rental0.registerClient("", "");
        rental0.cancelClientReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str20 = rental0.makeReservation("hi!", "hi!", "hi!");
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
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
        java.util.ArrayList<rentalService.Client> arraylist_client24 = rental0.showClients("hi!");
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        java.lang.String str10 = rental0.makeReservation("", "", "hi!");
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("");
        rental0.cancelReservation("");
        java.lang.String str13 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
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
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car24 = rental0.showCars("hi!");
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
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
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client22 = rental0.showClients("");
        java.lang.String str26 = rental0.makeReservation("", "", "hi!");
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
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
        java.lang.String str31 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation19 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client21 = rental0.showClients("hi!");
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
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
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client26 = rental0.showClients("hi!");
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
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
        java.lang.String str23 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
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
        java.lang.String str26 = rental0.makeReservation("hi!", "", "hi!");
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str12 = rental0.makeReservation("", "", "");
        rental0.cancelReservation("hi!");
        java.lang.String str17 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("hi!");
        java.lang.String str16 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Car> arraylist_car18 = rental0.showCars("");
        java.lang.String str22 = rental0.makeReservation("", "hi!", "");
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
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
        java.lang.String str27 = rental0.registerClient("", "hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car29 = rental0.showCars("hi!");
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car6 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("hi!");
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
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
        java.lang.String str25 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("");
        rental0.cancelClientReservation("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client19 = rental0.showClients("");
        java.lang.String str22 = rental0.registerClient("", "");
        rental0.cancelReservation("");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Car> arraylist_car28 = rental0.showCars("hi!");
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
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
        rental0.cancelClientReservation("");
        java.lang.String str26 = rental0.makeReservation("hi!", "hi!", "");
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car20 = rental0.showCars("hi!");
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
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
        rental0.cancelClientReservation("");
        java.lang.String str29 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.lang.String str10 = rental0.makeReservation("hi!", "hi!", "");
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
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
        rental0.dropoffCar("");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client24 = rental0.showClients("hi!");
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
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
        java.lang.String str24 = rental0.makeReservation("", "hi!", "");
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        rental0.cancelReservation("");
        rental0.dropoffCar("");
        rental0.cancelReservation("");
        java.lang.String str21 = rental0.makeReservation("", "hi!", "hi!");
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("hi!");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Client> arraylist_client14 = rental0.showClients("hi!");
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation11 = rental0.showClientReservations("");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client19 = rental0.showClients("hi!");
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.lang.String str7 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("");
        java.lang.String str12 = rental0.registerClient("", "");
        rental0.cancelClientReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str20 = rental0.makeReservation("hi!", "hi!", "");
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        java.lang.String str14 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation16 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car18 = rental0.showCars("hi!");
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("hi!");
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
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
        java.util.ArrayList<rentalService.Car> arraylist_car34 = rental0.showCars("hi!");
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("hi!");
        rental0.dropoffCar("");
        java.lang.String str14 = rental0.makeReservation("", "", "");
        rental0.cancelClientReservation("");
        java.lang.String str20 = rental0.makeReservation("", "", "");
        java.lang.String str23 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("");
        rental0.pickupCar("");
        java.lang.String str14 = rental0.makeReservation("", "", "hi!");
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("");
        java.lang.String str12 = rental0.makeReservation("", "hi!", "hi!");
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
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
        rental0.cancelClientReservation("");
        java.lang.String str26 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Car> arraylist_car28 = rental0.showCars("hi!");
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
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
        java.util.ArrayList<rentalService.Car> arraylist_car22 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car28 = rental0.showCars("");
        java.lang.String str31 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
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
        java.util.ArrayList<rentalService.Client> arraylist_client26 = rental0.showClients("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car30 = rental0.showCars("hi!");
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car11 = rental0.showCars("");
        java.util.ArrayList<rentalService.Car> arraylist_car13 = rental0.showCars("hi!");
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("hi!");
        java.lang.String str16 = rental0.makeReservation("", "", "");
        rental0.cancelReservation("");
        java.lang.String str22 = rental0.makeReservation("hi!", "hi!", "");
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
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
        java.lang.String str24 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation15 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Client> arraylist_client17 = rental0.showClients("hi!");
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation11 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("hi!");
        java.lang.String str17 = rental0.makeReservation("", "", "hi!");
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation10 = rental0.showClientReservations("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("hi!");
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str11 = rental0.registerClient("", "hi!");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client15 = rental0.showClients("hi!");
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car6 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("");
        java.lang.String str16 = rental0.makeReservation("", "hi!", "hi!");
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        java.lang.String str16 = rental0.makeReservation("", "", "");
        rental0.pickupCar("");
        java.lang.String str21 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental0.showCars("");
        java.util.ArrayList<rentalService.Client> arraylist_client14 = rental0.showClients("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation16 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation18 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car20 = rental0.showCars("hi!");
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test418");
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
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation25 = rental0.showClientReservations("");
        java.lang.String str29 = rental0.makeReservation("", "", "hi!");
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test419");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation15 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car19 = rental0.showCars("hi!");
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test420");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        rental0.cancelClientReservation("");
        rental0.pickupCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client19 = rental0.showClients("hi!");
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test421");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        java.lang.String str15 = rental0.makeReservation("", "", "");
        rental0.pickupCar("");
        java.lang.String str20 = rental0.registerClient("", "hi!");
        java.lang.String str23 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test422");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        java.lang.String str16 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation18 = rental0.showClientReservations("");
        java.lang.String str22 = rental0.makeReservation("", "hi!", "");
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test423");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation5 = rental0.showClientReservations("");
        rental0.cancelReservation("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        java.lang.String str16 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test424");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car15 = rental0.showCars("hi!");
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test425");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Client> arraylist_client14 = rental0.showClients("hi!");
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test426");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car15 = rental0.showCars("hi!");
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test427");
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
        java.lang.String str28 = rental0.makeReservation("", "", "hi!");
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test428");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        java.lang.String str10 = rental0.registerClient("", "hi!");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Client> arraylist_client14 = rental0.showClients("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client18 = rental0.showClients("hi!");
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test429");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car11 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car15 = rental0.showCars("hi!");
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test430");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.lang.String str9 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car17 = rental0.showCars("");
        java.lang.String str21 = rental0.makeReservation("", "", "hi!");
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test431");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str12 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation14 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car16 = rental0.showCars("");
        rental0.cancelClientReservation("");
        java.lang.String str22 = rental0.makeReservation("hi!", "", "hi!");
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test432");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car18 = rental0.showCars("hi!");
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test433");
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
        java.util.ArrayList<rentalService.Car> arraylist_car20 = rental0.showCars("hi!");
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test434");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        java.lang.String str10 = rental0.makeReservation("hi!", "", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation14 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation16 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car18 = rental0.showCars("hi!");
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test435");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental0.showCars("");
        java.util.ArrayList<rentalService.Client> arraylist_client14 = rental0.showClients("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation16 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation18 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client20 = rental0.showClients("hi!");
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test436");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("");
        java.lang.String str15 = rental0.registerClient("", "hi!");
        java.lang.String str19 = rental0.makeReservation("", "hi!", "");
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test437");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car6 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelClientReservation("");
        java.lang.String str20 = rental0.makeReservation("hi!", "", "hi!");
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test438");
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
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car25 = rental0.showCars("hi!");
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test439");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.pickupCar("hi!");
        java.lang.String str11 = rental0.registerClient("", "");
        java.lang.String str15 = rental0.makeReservation("hi!", "hi!", "hi!");
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test440");
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
        java.lang.String str21 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test441");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str12 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation14 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car16 = rental0.showCars("hi!");
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test442");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("");
        rental0.cancelClientReservation("");
        java.lang.String str20 = rental0.registerClient("", "hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client22 = rental0.showClients("");
        java.util.ArrayList<rentalService.Car> arraylist_car24 = rental0.showCars("hi!");
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test443");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation11 = rental0.showClientReservations("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation15 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Car> arraylist_car17 = rental0.showCars("hi!");
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test444");
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
        java.lang.String str30 = rental0.makeReservation("", "hi!", "");
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test445");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        java.lang.String str10 = rental0.registerClient("", "hi!");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Client> arraylist_client14 = rental0.showClients("");
        java.lang.String str17 = rental0.registerClient("", "");
        java.lang.String str21 = rental0.makeReservation("", "hi!", "hi!");
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test446");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car11 = rental0.showCars("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client15 = rental0.showClients("hi!");
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test447");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.lang.String str7 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Client> arraylist_client11 = rental0.showClients("");
        java.util.ArrayList<rentalService.Client> arraylist_client13 = rental0.showClients("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation15 = rental0.showClientReservations("");
        java.lang.String str19 = rental0.makeReservation("", "hi!", "hi!");
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test448");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        rental0.cancelReservation("");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client19 = rental0.showClients("");
        java.lang.String str23 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Client> arraylist_client25 = rental0.showClients("hi!");
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test449");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.lang.String str7 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Client> arraylist_client11 = rental0.showClients("");
        java.lang.String str14 = rental0.registerClient("", "");
        java.lang.String str17 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test450");
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
        java.util.ArrayList<rentalService.Client> arraylist_client22 = rental0.showClients("hi!");
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test451");
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
        java.util.ArrayList<rentalService.Car> arraylist_car24 = rental0.showCars("hi!");
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test452");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("");
        java.lang.String str20 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test453");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.lang.String str11 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test454");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car8 = rental0.showCars("");
        java.lang.String str12 = rental0.makeReservation("hi!", "", "hi!");
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test455");
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
        java.util.ArrayList<rentalService.Car> arraylist_car33 = rental0.showCars("hi!");
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test456");
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
        rental0.cancelReservation("hi!");
        java.lang.String str26 = rental0.makeReservation("hi!", "", "hi!");
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test457");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation5 = rental0.showClientReservations("");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("hi!");
        java.lang.String str12 = rental0.registerClient("", "");
        java.lang.String str16 = rental0.makeReservation("hi!", "hi!", "");
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test458");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Client> arraylist_client11 = rental0.showClients("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation15 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation17 = rental0.showClientReservations("hi!");
        java.lang.String str20 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test459");
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
        java.lang.String str27 = rental0.registerClient("", "hi!");
        java.lang.String str30 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test460");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        java.lang.String str14 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Car> arraylist_car16 = rental0.showCars("");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Client> arraylist_client20 = rental0.showClients("hi!");
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test461");
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
        java.lang.String str23 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test462");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        java.lang.String str14 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Car> arraylist_car16 = rental0.showCars("");
        rental0.cancelReservation("");
        java.lang.String str22 = rental0.makeReservation("", "", "hi!");
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test463");
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
        java.util.ArrayList<rentalService.Car> arraylist_car30 = rental0.showCars("hi!");
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test464");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation10 = rental0.showClientReservations("");
        rental0.dropoffCar("");
        rental0.cancelClientReservation("hi!");
        java.lang.String str17 = rental0.registerClient("", "");
        java.lang.String str20 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test465");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.lang.String str6 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Car> arraylist_car8 = rental0.showCars("");
        java.lang.String str12 = rental0.makeReservation("hi!", "hi!", "");
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test466");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        java.lang.String str15 = rental0.makeReservation("", "", "");
        java.util.ArrayList<rentalService.Car> arraylist_car17 = rental0.showCars("hi!");
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test467");
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
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation27 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car29 = rental0.showCars("");
        rental0.cancelReservation("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client35 = rental0.showClients("hi!");
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test468");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation15 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("hi!");
        java.lang.String str20 = rental0.registerClient("", "hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation22 = rental0.showClientReservations("");
        java.lang.String str26 = rental0.makeReservation("", "hi!", "hi!");
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test469");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation5 = rental0.showClientReservations("");
        rental0.cancelReservation("");
        rental0.cancelClientReservation("hi!");
        rental0.dropoffCar("");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Car> arraylist_car15 = rental0.showCars("hi!");
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test470");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client16 = rental0.showClients("");
        java.util.ArrayList<rentalService.Client> arraylist_client18 = rental0.showClients("hi!");
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test471");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car6 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        java.lang.String str13 = rental0.registerClient("", "hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client15 = rental0.showClients("hi!");
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test472");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        java.lang.String str21 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test473");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car9 = rental0.showCars("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client15 = rental0.showClients("hi!");
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test474");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.cancelClientReservation("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("hi!");
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test475");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.lang.String str7 = rental0.makeReservation("hi!", "", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Client> arraylist_client11 = rental0.showClients("");
        java.util.ArrayList<rentalService.Client> arraylist_client13 = rental0.showClients("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car17 = rental0.showCars("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client21 = rental0.showClients("hi!");
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test476");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.dropoffCar("");
        java.lang.String str5 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test477");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.lang.String str11 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("");
        java.lang.String str17 = rental0.makeReservation("", "", "hi!");
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test478");
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
        java.util.ArrayList<rentalService.Car> arraylist_car22 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("hi!");
        java.lang.String str31 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test479");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Client> arraylist_client11 = rental0.showClients("hi!");
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test480");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.lang.String str11 = rental0.registerClient("", "hi!");
        rental0.cancelClientReservation("");
        rental0.cancelClientReservation("hi!");
        java.lang.String str18 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test481");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental0.showCars("hi!");
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test482");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        rental0.dropoffCar("hi!");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client10 = rental0.showClients("");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental0.showCars("");
        java.util.ArrayList<rentalService.Client> arraylist_client14 = rental0.showClients("hi!");
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test483");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car6 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        java.lang.String str13 = rental0.registerClient("", "hi!");
        java.lang.String str16 = rental0.registerClient("", "");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car20 = rental0.showCars("");
        rental0.cancelReservation("");
        java.lang.String str26 = rental0.makeReservation("", "", "hi!");
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test484");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        rental0.pickupCar("");
        rental0.dropoffCar("hi!");
        rental0.cancelReservation("hi!");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car17 = rental0.showCars("hi!");
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test485");
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
        rental0.cancelReservation("");
        java.lang.String str23 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test486");
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
        rental0.cancelClientReservation("");
        rental0.cancelClientReservation("");
        java.util.ArrayList<rentalService.Car> arraylist_car28 = rental0.showCars("hi!");
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test487");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation9 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation11 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation13 = rental0.showClientReservations("hi!");
        java.lang.String str17 = rental0.makeReservation("", "hi!", "hi!");
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test488");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.pickupCar("");
        java.lang.String str7 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test489");
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
        java.lang.String str22 = rental0.makeReservation("hi!", "hi!", "");
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test490");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.dropoffCar("");
        java.lang.String str12 = rental0.makeReservation("", "", "");
        rental0.pickupCar("");
        rental0.pickupCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client18 = rental0.showClients("");
        java.lang.String str21 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test491");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Client> arraylist_client12 = rental0.showClients("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("hi!");
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test492");
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
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation22 = rental0.showClientReservations("");
        java.util.ArrayList<rentalService.Client> arraylist_client24 = rental0.showClients("hi!");
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test493");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car4 = rental0.showCars("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation10 = rental0.showClientReservations("hi!");
        java.util.ArrayList<rentalService.Car> arraylist_car12 = rental0.showCars("");
        java.util.ArrayList<rentalService.Car> arraylist_car14 = rental0.showCars("hi!");
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test494");
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
        java.util.ArrayList<rentalService.Car> arraylist_car24 = rental0.showCars("hi!");
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test495");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation6 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.dropoffCar("hi!");
        java.util.ArrayList<rentalService.Client> arraylist_client12 = rental0.showClients("");
        rental0.cancelClientReservation("");
        java.lang.String str17 = rental0.registerClient("", "hi!");
        java.lang.String str20 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test496");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        rental0.cancelReservation("hi!");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation7 = rental0.showClientReservations("hi!");
        java.lang.String str11 = rental0.makeReservation("hi!", "", "");
        rental0.cancelClientReservation("");
        rental0.pickupCar("");
        java.lang.String str18 = rental0.registerClient("hi!", "");
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test497");
        rentalService.Rental rental0 = new rentalService.Rental();
        java.lang.String str3 = rental0.registerClient("", "");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation5 = rental0.showClientReservations("");
        rental0.cancelReservation("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("hi!");
        java.lang.String str15 = rental0.makeReservation("hi!", "", "hi!");
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test498");
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
        java.lang.String str25 = rental0.registerClient("hi!", "hi!");
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test499");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        rental0.pickupCar("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation8 = rental0.showClientReservations("hi!");
        rental0.cancelReservation("hi!");
        rental0.cancelClientReservation("hi!");
        rental0.pickupCar("");
        rental0.cancelReservation("hi!");
        java.lang.String str20 = rental0.makeReservation("", "", "hi!");
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test500");
        rentalService.Rental rental0 = new rentalService.Rental();
        rental0.pickupCar("");
        rental0.dropoffCar("");
        java.util.ArrayList<rentalService.Car> arraylist_car6 = rental0.showCars("");
        rental0.cancelClientReservation("hi!");
        rental0.cancelReservation("");
        java.util.ArrayList<rentalService.Reservation> arraylist_reservation12 = rental0.showClientReservations("");
        java.lang.String str15 = rental0.registerClient("", "hi!");
        java.lang.String str18 = rental0.registerClient("hi!", "");
    }
}

