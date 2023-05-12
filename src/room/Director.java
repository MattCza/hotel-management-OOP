package room;

public class Director {
    public void defaultSingleRoom(RoomBuilder roomBuilder) {
        roomBuilder.capacity(2)
                .floor(1)
                .roomNumber(17)
                .isOccupied(false)
                .hasBalcony(false)
                .isSmokingAllowed(false);
    }

    public void defaultDoubleRoom(RoomBuilder roomBuilder){
        roomBuilder.roomNumber(27)
                .price(100)
                .capacity(2)
                .floor(2)
                .roomNumber(27)
                .isSmokingAllowed(false)
                .hasBalcony(false)
                .isOccupied(false);
    }
}
