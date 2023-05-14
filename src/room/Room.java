package room;

public abstract class Room {
    private int roomNumber;
    private double basePrice;
    private int capacity;
    private int floor;
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

    public boolean isOccupied() {
        return this.isOccupied;
    }

    public double getBasePrice() {
        return this.basePrice;
    }

    void occupy() {
        this.isOccupied = true;
    }

    void vacate() {
        this.isOccupied = false;
    }

    int getFloor() {
        return this.floor;
    }

    int getRoomNumber() {
        return this.roomNumber;
    }

    int getCapacity() {
        return this.capacity;
    }

    boolean getHasBalcony() {
        return this.hasBalcony;
    }

    boolean getIsSmokingAllowed() {
        return this.isSmokingAllowed;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", price=" + basePrice +
                ", capacity=" + capacity +
                ", floor=" + floor +
                ", isOccupied=" + isOccupied +
                ", isSmokingAllowed=" + isSmokingAllowed +
                ", hasBalcony=" + hasBalcony +
                '}';
    }
}