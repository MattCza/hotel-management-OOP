import management.Booking;
import management.Hotel;
import people.Employee;
import people.Guest;
import room.Director;
import room.Room;
import room.RoomBuilder;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        init();
        menu();


    }

    private static void init() {
        RoomBuilder roomBuilder = new RoomBuilder();
        Director director = new Director();
        director.defaultSingleRoom(roomBuilder);

        // Price 200; capacity 1; floor 1; isSmokingAllowed false; hasBalcony false;
        Room singleRoom11 = roomBuilder.buildSingleRoom();

        Room singleRoom12 = singleRoom11.clone();
        singleRoom12.setRoomNumber(12);


        Room singleRoom13 = singleRoom11.clone();
        singleRoom13.setRoomNumber(13);
        singleRoom13.setCapacity(2);
        singleRoom13.setBasePrice(380);

        Room singleRoom14 = singleRoom13.clone();
        singleRoom14.setRoomNumber(14);

        Room singleRoom15 = singleRoom13.clone();
        singleRoom15.setRoomNumber(15);
        singleRoom15.setHasBalcony(true);
        singleRoom15.setSmokingAllowed(true);
        singleRoom15.setBasePrice(420);

        //  price 360; capacity 2; floor 1; isSmokingAllowed false; hasBalcony false;
        director.defaultDoubleRoom(roomBuilder);
        Room doubleRoom21 = roomBuilder.buildDubleRoom();

        Room doubleRoom22 = doubleRoom21.clone();
        doubleRoom22.setRoomNumber(22);

        Room doubleRoom23 = doubleRoom21.clone();
        doubleRoom23.setRoomNumber(23);
        doubleRoom23.setCapacity(3);
        doubleRoom23.setHasBalcony(true);
        doubleRoom23.setBasePrice(420);

        Room[] rooms = new Room[]{singleRoom11, singleRoom12, singleRoom13, singleRoom14, singleRoom15, doubleRoom21, doubleRoom22, doubleRoom23};
        new Hotel(rooms);

        Guest guest1 = new Guest("AVB6029735", "Ryan", "616163248");
        Guest guest2 = new Guest("ACA5125731", "Kelly", "161636842");
        Guest guest3 = new Guest("BJP1125731", "Jim", "523526527");
        Guest guest4 = new Guest("CDB5125731", "Michael", "707242343");

        Employee employee1 = new Employee("John", "Wick");
        Employee employee2 = new Employee("Mark", "Spencer");
        Employee employee3 = new Employee("Barbra", "Streisand");


        Booking booking1 = new Booking(guest1,
                doubleRoom21,
                Hotel.calculatePayment(doubleRoom21, false),
                LocalDate.parse("2023-03-20"),
                LocalDate.parse("2023-03-22"));

        Booking booking2 = new Booking(guest2,
                doubleRoom21,
                Hotel.calculatePayment(doubleRoom21, false),
                LocalDate.parse("2023-03-27"),
                LocalDate.parse("2023-03-29"));

        Booking booking3 = new Booking(guest3,
                singleRoom11,
                Hotel.calculatePayment(singleRoom11, true),
                LocalDate.parse("2023-03-01"),
                LocalDate.parse("2023-03-02"));

        Booking booking4 = new Booking(guest4,
                singleRoom12,
                Hotel.calculatePayment(singleRoom11, true),
                LocalDate.parse("2023-03-01"),
                LocalDate.parse("2023-03-02"));


        booking1.printBookingInformation();
    }

    private static void menu() {

        int option = -1;
        List<Room> availableRooms = Hotel.getAvailableRooms();

        System.out.println("Welcome to Hotel Management Console! ");
        System.out.println("-------------------------------------");

        while (option != 9) {

            Scanner scanner = new Scanner(System.in);

            printOptions();

            try {
                option = scanner.nextInt();

            } catch (InputMismatchException ex) {
                System.out.println("Pleas provide an Integer value from 1 to " + );
            } catch (Exception e){
                System.out.println("Unexpected error - Please try again.");
                scanner.next();
            }

            System.out.println();
            switch (option) {
                case 1 -> availableRooms.forEach(System.out::println);
                case 2 -> occupyRoom();
                case 3 -> vacateRoom();
            }
        }

    }

    public static void printOptions(){
        String[] options = {"1. - Show available rooms",
                "2. - Occupy a room",
                "3. - Vacate a room",
                "9. - Exit"};
        for (String option : options) {
            System.out.println(option);
        }
    }


    private static void vacateRoom() {

    }

    private static void occupyRoom() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What room number you want to occupy: ");
        int number = scanner.nextInt();
        Optional<Room> room = Hotel.getRoomByRoomNumber(number);
        room.ifPresent(Room::occupy);
    }


}