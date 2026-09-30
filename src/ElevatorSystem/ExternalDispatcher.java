package ElevatorSystem;

public class ExternalDispatcher {
    private ElevatorSchedular elevatorSchedular;

    public ExternalDispatcher(ElevatorSchedular elevatorSchedular) {
        this.elevatorSchedular = elevatorSchedular;
    }
    public void submitExternalRequest(ExternalElevatorRequest externalElevatorRequest) {
       // Elevator selectedElevator = elevatorSchedular.getElevatorSelectionStrategy().selectElevator(elevatorSchedular.getElevatorControllers(), externalElevatorRequest);
        // Process the request with the selected elevator
    }
}
