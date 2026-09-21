package ElevatorSystem;

import java.util.List;

public class Building {
    private int numberOfFloors;
    private List<Elevator> elevators;
    private List<Floor> floors;

    public Building(int numberOfFloors, List<Elevator> elevators, List<Floor> floors) {
        this.numberOfFloors = numberOfFloors;
        this.elevators = elevators;
        this.floors = floors;
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
}
