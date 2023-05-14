import management.Booking;
import management.Hotel;
import people.Employee;
import people.Guest;
import room.Director;
import room.Room;
import room.RoomBuilder;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        init();




    }

    private static void init(){
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
        Room doubleRoom21 = roomBuilder.buildDubleRoom();

        System.out.println(singleRoom11);

        Guest guest1 = new Guest("AVB6029735","Mark", "661163248" );

        Employee employee1 = new Employee("John","Wick");

        new Hotel(new Room[]{singleRoom11});

        Booking booking = new Booking();

        List<Room> rooms = Hotel.getAvailableRooms();
        System.out.println(rooms);
        System.out.println(booking.calculatePayment(rooms.get(0), true));
    }
}