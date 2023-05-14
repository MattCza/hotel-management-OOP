package room;

public class DoubleRoom extends Room {
    protected DoubleRoom(int roomNumber, double basePrice, int capacity, int floor, boolean isOccupied, boolean isSmokingAllowed, boolean hasBalcony) {
        super(roomNumber, basePrice, capacity, floor, isOccupied, isSmokingAllowed, hasBalcony);
    }
}
