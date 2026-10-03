package ParkingLot.Dispatcher;

import ParkingLot.Entity.Ticket;
import ParkingLot.Parking.ParkingfController;

public class EntryTimeDispatcher  {
    private static EntryTimeDispatcher instance;
    private ParkingfController parkingfController;

    private EntryTimeDispatcher(ParkingfController parkingfController) {
        this.parkingfController = parkingfController;
        this.parkingfController = new ParkingfController();
    }

    public static EntryTimeDispatcher getInstance() {
        if (instance == null) {
            instance = new EntryTimeDispatcher();
        }
        return instance;
    }


    public Ticket processRequest(String vehicleNumber, String vehicleType) {
        Ticket ticket = parkingfController.parkTheVehicle(vehicleNumber, vehicleType);
        return ticket;
    }
}
