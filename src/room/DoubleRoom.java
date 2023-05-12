package room;

public class DoubleRoom extends Room {
    protected DoubleRoom(int roomNumber, double price, int capacity, int floor, boolean isOccupied, boolean isSmokingAllowed, boolean hasBalcony) {
        super(roomNumber, price, capacity, floor, isOccupied, isSmokingAllowed, hasBalcony);
    }
}
