public class RoomBuilder {
    private int capacity;
    private int floor;
    private int roomNumber;
    private boolean isOccupied;
    private boolean isSmokingAllowed;
    private boolean hasBalcony;

    public RoomBuilder capacity(int capacity){
        this.capacity = capacity;
        return this;
    }

    public RoomBuilder floor(int floor) {
        this.floor = floor;
        return this;
    }

    public RoomBuilder roomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
        return this;
    }

    public RoomBuilder isOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
        return this;
    }

    public RoomBuilder isSmokingAllowed(boolean isSmokingAllowed) {
        this.isSmokingAllowed = isSmokingAllowed;
        return this;
    }

    public RoomBuilder hasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
        return this;
    }

    public Room buildSingleRoom(){
        return new SingleRoom(capacity, floor, roomNumber, isOccupied, isSmokingAllowed, hasBalcony);
    }


}