import room.Room;
import room.RoomBuilder;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Room[] rooms = initRooms();

        Room room = findRoomByRoomNumber(12, rooms);
        System.out.println(room);
        menu(rooms);


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

    public static void getAvailableRooms(Room[] rooms){
        List<Room> availableRooms = new ArrayList<>();
        availableRooms = Arrays.stream(rooms)
                .filter(room -> !room.isOccupied())
                .collect(Collectors.toList());
        availableRooms.forEach(System.out::println);
    }

    public static void occupyRoomByNumber(Room[] rooms){
        Scanner scanner = new Scanner(System.in);

        findRoomByRoomNumber(scanner.nextInt(), rooms);
        
    }

    public static void menu(Room[] rooms) {
        Scanner scanner = new Scanner(System.in);
        String[] options = new String[]{
                "1 - Show all rooms",
                "2 - Show available rooms",
                "3 - Occupy a room",
                "4 - Vacate a room",
                "5 - Exit"
        };
        int option = 0;
        while (option != options.length) {
            System.out.println();
            Arrays.stream(options).forEach(System.out::println);
            option = scanner.nextInt();

            switch (option) {
                case 1 -> Arrays.stream(rooms).forEach(System.out::println);
                case 2 -> getAvailableRooms(rooms);
                case 3 -> occupyRoomByNumber(rooms);
                case 4 -> System.out.println();
            }
        }
    }

}