package ParkingLot.Parking;

import ParkingLot.Entity.Bill;
import ParkingLot.Entity.ParkingSpot;
import ParkingLot.Entity.Ticket;
import ParkingLot.enums.Payment_Status;
import ParkingLot.enums.SpotStatus;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpotManager {
    private static ParkingSpotManager instance = null;
    private List<ParkingSpot> parkingSpots;

    private ParkingSpotManager(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public static ParkingSpotManager getInstance() {
        if (instance == null) {
            instance = new ParkingSpotManager(new ArrayList<>());
        }
        return instance;
    }
    public void addParkingSpot(String spotId, String spotType, String spotStatus) {
        // Logic to add a parking spot
    }
    public void removeParkingSpot(String spotId) {
        // Logic to remove a parking spot
    }
    public void updateParkingSpot(String spotId, String newSpotType) {
        // Logic to update a parking spot
    }
    public void getParkingSpot(String spotId) {
        // Logic to get a parking spot
    }
    public void listAllParkingSpots() {
        // Logic to list all parking spots
    }
    public List<ParkingSpot> findAvailableSpots(String spotType) {
        List<ParkingSpot> availableSpots = new ArrayList<>();
        for (ParkingSpot spot : parkingSpots) {
            if (spot.getSpotType().equals(spotType) && spot.getSpotStatus().equals(SpotStatus.AVAILABLE)) {
                availableSpots.add(spot);
                // Assuming we have a method to check if the spot is available
                // if (isSpotAvailable(spot.getSpotId())) {
                //     availableSpots.add(spot);
                // }
            }
        }
        // Logic to find available parking spots of a specific type
        return availableSpots;
    }
    public void reserveSpot(String spotId) {
        for (ParkingSpot spot : parkingSpots) {
            if (spot.getSpotId().equals(spotId)) {
                // Logic to reserve a parking spot
                spot.setSpotStatus(SpotStatus.RESERVED);
            }
        }
    }
    public void releaseSpot(String spotId) {
        // Logic to release a reserved parking spot
    }
    public Ticket parkVehicle(String vehicleNumber, String vehicleType) {
        List<ParkingSpot> availableSpots = findAvailableSpots(vehicleType);
        if (availableSpots.isEmpty()) {
            throw new RuntimeException("No available spots for the given vehicle type.");
        }
        ParkingSpot spot = availableSpots.get(0);
        reserveSpot(spot.getSpotId());
        return new Ticket("id", Payment_Status.PENDING, vehicleNumber, spot.getSpotId(), java.time.LocalDateTime.now());
        // Logic to park a vehicle in a specific spot
    }
    public Bill unparkVehicle(Ticket ticket) {
        String spotId = ticket.getSpotId();
        for (ParkingSpot spot : parkingSpots) {
            if (spot.getSpotId().equals(spotId)) {
                // Logic to unpark a vehicle from a specific spot
                spot.setSpotStatus(SpotStatus.AVAILABLE);
                return new Bill("billId", ticket, 100.0, "CASH", "PAID", ticket.getVehicleNumber(), java.time.LocalDateTime.now());
            }
        }
        throw new RuntimeException("Vehicle not found in the parking lot.");
        // Logic to unpark a vehicle from a specific spot
    }
}
