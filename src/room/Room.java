package room;

public class Room {
    private int roomNumber;
    private double basePrice;
    private int capacity;
    private final int floor;
    private boolean isOccupied;
    private boolean isSmokingAllowed;
    private boolean hasBalcony;

    protected Room(int roomNumber, double basePrice, int capacity, int floor, boolean isOccupied, boolean isSmokingAllowed, boolean hasBalcony) {
        this.roomNumber = roomNumber;
        this.basePrice = basePrice;
        this.capacity = capacity;
        this.floor = floor;
        this.isOccupied = isOccupied;
        this.isSmokingAllowed = isSmokingAllowed;
        this.hasBalcony = hasBalcony;
    }

    public Room(Room room) {
        this.roomNumber = room.roomNumber;
        this.basePrice = room.basePrice;
        this.capacity = room.capacity;
        this.floor = room.floor;
        this.isOccupied = room.isOccupied;
        this.isSmokingAllowed = room.isSmokingAllowed;
        this.hasBalcony = room.hasBalcony;
    }

    @Override
    public Room clone() throws CloneNotSupportedException {
        super.clone();
        return new Room(this);
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getFloor() {
        return floor;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isSmokingAllowed() {
        return isSmokingAllowed;
    }

    public void setSmokingAllowed(boolean smokingAllowed) {
        isSmokingAllowed = smokingAllowed;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", basePrice=" + basePrice +
                ", capacity=" + capacity +
                ", floor=" + floor +
                ", isOccupied=" + isOccupied +
                ", isSmokingAllowed=" + isSmokingAllowed +
                ", hasBalcony=" + hasBalcony +
                '}';
    }
}