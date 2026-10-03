package ParkingLot;

public class ParkingBuilding {

    private String buildingName;
    private int totalFloors;
    private EntryGate entryGate;
    private ExitGate exitGate;
    public ParkingBuilding(String buildingName, int totalFloors,EntryGate entryGate, ExitGate exitGate) {
        this.buildingName = buildingName;
        this.totalFloors = totalFloors;
        this.entryGate = entryGate;
        this.exitGate = exitGate;
    }
    public String getBuildingName() {
        return buildingName;
    }
    public int getTotalFloors() {
        return totalFloors;
    }
    public EntryGate getEntryGate() {
        return entryGate;
    }
    public ExitGate getExitGate() {
        return exitGate;
    }
}
