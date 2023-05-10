public class Director {
    public void defaultSingleRoom(RoomBuilder roomBuilder) {
        roomBuilder.capacity(2)
                .floor(1)
                .roomNumber(17)
                .isOccupied(false)
                .hasBalcony(false)
                .isSmokingAllowed(false);
    }
}
