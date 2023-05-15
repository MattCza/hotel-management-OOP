package management;

import people.Guest;
import room.Room;
import java.time.LocalDate;

public class Booking {
    private Guest guest;
    private Room room;
    private double payment;
    private LocalDate startDate;
    private LocalDate endDate;

    public Booking(Guest guest, Room room, double payment, LocalDate startDate, LocalDate endDate) {
        this.guest = guest;
        this.room = room;
        this.payment = payment;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Booking - guest: " + guest.getName()
                + " with ID number of " + guest.getIdNumber()
                + ", rent a room of number: " + room.getRoomNumber()
                + ", starting from: " + startDate + " - " + endDate;
    }
}
