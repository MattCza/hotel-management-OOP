package management;

import people.Guest;
import room.Room;

import java.util.List;

public class Booking {
    private Hotel hotel;
    private Guest guest;
    private Room room;
    private double payment;

    public double calculatePayment(Room room, boolean duringAnEvent){
        double basePrice = room.getBasePrice();
        int numberOfAvailableRooms = hotel.getAvailableRooms().size();

        if (numberOfAvailableRooms <= 4) {
            basePrice *= 1.4;
        } else if (numberOfAvailableRooms <= 10) {
            basePrice *= 1.2;
        }

        if (duringAnEvent){
            basePrice *= 1.4;
        }

        return basePrice;
    }
}
