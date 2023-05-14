package room;

public class SingleRoom extends Room {

    SingleRoom(int roomNumber, double basePrice, int capacity, int floor, boolean isOccupied, boolean isSmokingAllowed, boolean hasBalcony) {
        super(roomNumber, basePrice, capacity, floor, isOccupied, isSmokingAllowed, hasBalcony);
    }

    private SingleRoom(Room room){
        super(room);
    }

    @Override
    public Room clone() {
        return new SingleRoom(this);
    }
}
