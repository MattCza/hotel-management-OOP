import management.Booking;
import management.Hotel;
import people.Employee;
import people.Guest;
import room.Director;
import room.Room;
import room.RoomBuilder;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        init();


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

        Guest guest1 = new Guest("AVB6029735", "Mark", "661163248");

        Employee employee1 = new Employee("John", "Wick");
        Employee employee2 = new Employee("Mark", "Spencer");
        Employee employee3 = new Employee("Barbra", "Streisand");

        Room[] rooms = new Room[]{singleRoom11, singleRoom12, singleRoom13, singleRoom14, singleRoom15, doubleRoom21, doubleRoom22, doubleRoom23};

        new Hotel(rooms);

        Booking booking = new Booking();

        List<Room> availableRooms = Hotel.getAvailableRooms();
        
        availableRooms.forEach(System.out::println);

        System.out.println(booking.calculatePayment(availableRooms.get(0), true));
    }
}