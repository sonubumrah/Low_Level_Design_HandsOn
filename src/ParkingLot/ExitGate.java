package ParkingLot;

import ParkingLot.Dispatcher.Dispatcher;
import ParkingLot.Dispatcher.ExitTimeDispatcher;
import ParkingLot.Entity.Bill;
import ParkingLot.Entity.Ticket;
import ParkingLot.Parking.ParkingfController;

public class ExitGate {
    private ExitTimeDispatcher dispatcher;

    public ExitGate() {
        this.dispatcher = ExitTimeDispatcher.getInstance(new ParkingfController());
    }


    public Bill submitRequest(Ticket ticket) {
        return dispatcher.processRequest(ticket);
    }
}
