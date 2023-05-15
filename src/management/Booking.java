package management;

import people.Guest;
import room.Room;
import java.time.LocalDate;

public class Booking {
    private Guest guest;
    private Room room;
    private double price;
    private LocalDate startDate;
    private LocalDate endDate;

    public Booking(Guest guest, Room room, double price, LocalDate startDate, LocalDate endDate) {
        this.guest = guest;
        this.room = room;
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void printBookingInformation(){
        System.out.println("Guest: " + guest.getName()
                + " with ID number of " + guest.getIdNumber()
                + ", rent a room of number: " + room.getRoomNumber()
                + ", starting from: " + startDate + " - " + endDate
                + ", for a price: " + price);
    }

}
