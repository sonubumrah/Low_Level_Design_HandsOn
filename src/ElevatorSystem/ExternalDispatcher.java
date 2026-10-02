package ElevatorSystem;

public class ExternalDispatcher {
    private ElevatorSchedular elevatorSchedular;

    public ExternalDispatcher(ElevatorSchedular elevatorSchedular) {
        this.elevatorSchedular = elevatorSchedular;
    }
    public ElevatorController submitExternalRequest(ExternalElevatorRequest externalElevatorRequest) {
        return elevatorSchedular.assignElevator(externalElevatorRequest);
    }
}
