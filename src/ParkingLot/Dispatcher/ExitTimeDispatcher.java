package ParkingLot.Dispatcher;

import ParkingLot.Entity.Bill;
import ParkingLot.Entity.Ticket;
import ParkingLot.Parking.ParkingfController;

public class ExitTimeDispatcher {
    private static ExitTimeDispatcher instance;
    private ParkingfController parkingfController;
    private ExitTimeDispatcher(ParkingfController parkingfController) {
        this.parkingfController = parkingfController;
    }
    public static ExitTimeDispatcher getInstance(ParkingfController parkingfController) {
        if (instance == null) {
            instance = new ExitTimeDispatcher(parkingfController);
        }
        return instance;
    }
    public Bill processRequest(Ticket ticket) {
        // Implement the logic to handle exit time requests
        System.out.println("Processing exit time request for parking spot: " + ticket.getSpotId());
        return parkingfController.unparkTheVehicle(ticket);
        // Assuming a method to generate bill exists

    }
}
