package ElevatorSystem;

import java.util.List;

public class Building {
    private int numberOfFloors;
    private List<Elevator> elevators;
    private List<Floor> floors;
    private ExternalDispatcher externalDispatcher;
    public Building(int numberOfFloors, List<Elevator> elevators, List<Floor> floors, ExternalDispatcher externalDispatcher) {
        this.numberOfFloors = numberOfFloors;
        this.elevators = elevators;
        this.floors = floors;
        this.externalDispatcher = externalDispatcher;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public List<Elevator> getElevators() {
        return elevators;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public ExternalDispatcher getExternalDispatcher() {
        return externalDispatcher;
    }
}
