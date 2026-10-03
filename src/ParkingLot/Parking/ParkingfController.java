package ParkingLot.Parking;

import ParkingLot.Entity.Bill;
import ParkingLot.Entity.Ticket;

public class ParkingfController {
    private ParkingSpotManager parkingSpotManager;

    public ParkingfController() {
        this.parkingSpotManager = ParkingSpotManager.getInstance();
    }
    public Ticket parkTheVehicle(String vehicleNumber, String vehicleType) {
        Ticket ticket = parkingSpotManager.parkVehicle(vehicleNumber, vehicleType);
        return ticket;
        // Logic to park the vehicle
    }
    public Bill unparkTheVehicle(Ticket ticket) {
        String spotId = ticket.getSpotId();
        return parkingSpotManager.unparkVehicle(ticket);
        // Logic to unpark the vehicle
    }

}
