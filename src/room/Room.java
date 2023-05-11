package room;

public abstract class Room {
    private int capacity;
    private int floor;
    private int roomNumber;
    private boolean isOccupied;
    private boolean isSmokingAllowed;
    private boolean hasBalcony;

    protected Room(int capacity, int floor, int roomNumber, boolean isOccupied, boolean isSmokingAllowed, boolean hasBalcony) {
        this.capacity = capacity;
        this.floor = floor;
        this.roomNumber = roomNumber;
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
                "capacity=" + capacity +
                ", floor=" + floor +
                ", roomNumber=" + roomNumber +
                ", isOccupied=" + isOccupied +
                ", isSmokingAllowed=" + isSmokingAllowed +
                ", hasBalcony=" + hasBalcony +
                '}';
    }
}