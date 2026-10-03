package ParkingLot;

import ParkingLot.Dispatcher.Dispatcher;
import ParkingLot.Dispatcher.EntryTimeDispatcher;
import ParkingLot.Entity.Ticket;

public class EntryGate  {
    private EntryTimeDispatcher dispatcher;

    public EntryGate(EntryTimeDispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }


    public Ticket submitRequest(String vehicleNumber, String vehicleType, String action) {
        return dispatcher.processRequest(vehicleNumber, vehicleType);        // Return the generated ticket

    }
}
