package room;

public abstract class Room {
    private int roomNumber;
    private double price;
    private int capacity;
    private int floor;
    private boolean isOccupied;
    private boolean isSmokingAllowed;
    private boolean hasBalcony;

    protected Room(int roomNumber, double price, int capacity, int floor,  boolean isOccupied, boolean isSmokingAllowed, boolean hasBalcony) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.capacity = capacity;
        this.floor = floor;
        this.isOccupied = isOccupied;
        this.isSmokingAllowed = isSmokingAllowed;
        this.hasBalcony = hasBalcony;
    }

    boolean isOccupied() {
        return this.isOccupied;
    }

    
    void occupy(){
        this.isOccupied = true;
    }

    void vacate(){
        this.isOccupied = false;
    }

    int getFloor(){
        return this.floor;
    }

    int getRoomNumber(){
        return this.roomNumber;
    }

    int getCapacity(){
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
                ", price=" + price +
                ", capacity=" + capacity +
                ", floor=" + floor +
                ", isOccupied=" + isOccupied +
                ", isSmokingAllowed=" + isSmokingAllowed +
                ", hasBalcony=" + hasBalcony +
                '}';
    }
}