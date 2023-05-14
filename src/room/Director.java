package room;

public class Director {
    public void defaultSingleRoom(RoomBuilder roomBuilder) {
        roomBuilder.roomNumber(11)
                .basePrice(200)
                .capacity(1)
                .floor(1)
                .isOccupied(false)
                .isSmokingAllowed(false)
                .hasBalcony(false);
    }

    public void defaultDoubleRoom(RoomBuilder roomBuilder){
        roomBuilder.roomNumber(21)
                .basePrice(360)
                .capacity(2)
                .floor(2)
                .isOccupied(false)
                .isSmokingAllowed(false)
                .hasBalcony(false);
    }
}
