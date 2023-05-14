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

        RoomBuilder roomBuilder = new RoomBuilder();
        Director director = new Director();
        director.defaultSingleRoom(roomBuilder);
        Room singleRoom1 = roomBuilder.buildSingleRoom();

        System.out.println(singleRoom1);

        Guest guest1 = new Guest("AVB6029735","Mark", "661163248" );

        Employee employee1 = new Employee("John","Wick");

        new Hotel(new Room[]{singleRoom1});

        Booking booking = new Booking();

        List<Room> rooms = Hotel.getAvailableRooms();
        System.out.println(rooms);
        System.out.println(booking.calculatePayment(rooms.get(0), true));




    }
}