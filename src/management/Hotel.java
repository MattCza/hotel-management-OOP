package management;

import room.Room;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private static Room[] rooms = new Room[20];

    public Hotel(Room[] rooms) {
        Hotel.rooms = rooms;
    }

    public static List<Room> getAvailableRooms() {
        List<Room> availableRooms = new ArrayList<>();

        for (Room room : rooms) {
            if (!room.isOccupied()) {
                availableRooms.add(room);
            }
        }

        return availableRooms;
    }
}
