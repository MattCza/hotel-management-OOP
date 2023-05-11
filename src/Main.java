import people.Employee;
import people.Guest;
import room.Director;
import room.Room;
import room.RoomBuilder;

public class Main {
    public static void main(String[] args) {

        RoomBuilder roomBuilder = new RoomBuilder();
        Director director = new Director();
        director.defaultSingleRoom(roomBuilder);
        Room singleRoom1 = roomBuilder.buildSingleRoom();

        System.out.println(singleRoom1);

        Guest guest1 = new Guest("AVB6029735","Mark", "661163248" );

        Employee employee1 = new Employee("John","Wick");






    }
}