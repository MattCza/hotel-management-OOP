import room.Room;
import room.RoomBuilder;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Room[] rooms = initRooms();
        Arrays.stream(rooms).forEach(System.out::println);

        Room room = findRoomByRoomNumber(12, rooms);
        System.out.println(room);


    }

    public static Room[] initRooms() {
        RoomBuilder roomBuilder = new RoomBuilder();

//        // BasePrice 200; capacity 2; floor 1; isSmokingAllowed false; hasBalcony false;
        Room singleBedRoom11 = roomBuilder.roomNumber(11)
                .basePrice(200)
                .capacity(2)
                .floor(1)
                .isOccupied(false)
                .isSmokingAllowed(false)
                .hasBalcony(false)
                .buildRoom();
        Room singleBedRoom12 = roomBuilder.roomNumber(12)
                .buildRoom();

        Room singleBedRoom13 = roomBuilder.roomNumber(13)
                .capacity(3)
                .basePrice(270)
                .buildRoom();

        Room singleBedRoom14 = roomBuilder.roomNumber(14)
                .isSmokingAllowed(true)
                .basePrice(330)
                .buildRoom();

        Room doubleBedRoom21 = roomBuilder.roomNumber(21)
                .basePrice(240)
                .capacity(2)
                .hasBalcony(true)
                .buildRoom();

        Room doubleBedRoom22 = roomBuilder.roomNumber(22)
                .buildRoom();

        return new Room[]{singleBedRoom11, singleBedRoom12, singleBedRoom13, singleBedRoom14, doubleBedRoom21, doubleBedRoom22};
    }

    public static Room findRoomByRoomNumber(int number, Room[] rooms) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == number) {
                return room;
            }
        }
        return null;
    }

    public static void menu() {

    }
}