package ParkingLot;

import ElevatorSystem.Building;
import ParkingLot.Dispatcher.EntryTimeDispatcher;
import ParkingLot.Dispatcher.ExitTimeDispatcher;

public class Demo {

    public static void main(String[] args) {
        // Create entry and exit gates
        //EntryGateTimeDispatcher exitTimeDispatcher = ExitTimeDispatcher.getInstance();
        EntryTimeDispatcher entryTimeDispatcher = EntryTimeDispatcher.getInstance();
        EntryGate entryGate = new EntryGate(entryTimeDispatcher);
        ExitGate exitGate = new ExitGate();
        //Building building = new Building(5, "Parking Building", 5, entryGate, exitGate);
        ParkingBuilding parkingBuilding = new ParkingBuilding("Parking Building", 5, entryGate, exitGate);
        parkingBuilding.getEntryGate().submitRequest("KA-01-AB-1234", "FOUR_WHEELER", "ENTRY");
        parkingBuilding.getExitGate().submitRequest(parkingBuilding.getEntryGate().submitRequest("KA-01-AB-1234", "FOUR_WHEELER", "ENTRY"));


        // Simulate vehicle entry
        entryGate.submitRequest("KA-01-AB-1234", "FOUR_WHEELER", "ENTRY");
        entryGate.submitRequest("KA-01-AB-5678", "TWO_WHEELER", "ENTRY");

        // Simulate vehicle exit
        //exitGate.submitRequest("KA-01-AB-1234", "FOUR_WHEELER", "EXIT");
    }
}
