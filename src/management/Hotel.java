package management;

import room.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public static double calculatePayment(Room room, boolean duringAnEvent) {
        double basePrice = room.getBasePrice();
        int numberOfAvailableRooms = Hotel.getAvailableRooms().size();

        if (numberOfAvailableRooms <= 4) {
            basePrice *= 1.4;
        } else if (numberOfAvailableRooms <= 10) {
            basePrice *= 1.2;
        }

        if (duringAnEvent) {
            basePrice *= 1.4;
        }

        return basePrice;
    }


    public static Optional<Room> getRoomByRoomNumber(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber){
                return Optional.of(room);
            }
        }
        return Optional.empty();
    }
}
