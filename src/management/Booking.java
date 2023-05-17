package management;

import people.Guest;
import room.Room;

import java.time.LocalDate;

public class Booking {
    private Guest guest;
    private Room room;
    private LocalDate startingDate;
    private LocalDate endingDate;
    private double price;
    private boolean isCheckedOut;

    public Booking(Guest guest, Room room, LocalDate startingDate, LocalDate endingDate, double price, boolean isCheckedOut) {
        this.guest = guest;
        this.room = room;
        this.startingDate = startingDate;
        this.endingDate = endingDate;
        this.price = price;
        this.isCheckedOut = isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }
}
