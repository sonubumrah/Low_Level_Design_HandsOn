package ElevatorSystem;

import java.util.List;

public class ElevatorSchedular {
    private ELevatorSelectionStrategy elevatorSelectionStrategy;
    List<ElevatorController> elevatorControllers;
    public ElevatorSchedular(ELevatorSelectionStrategy eLevatorSelectionStrategy, List<ElevatorController> elevatorControllers) {
        this.elevatorSelectionStrategy = eLevatorSelectionStrategy;
        this.elevatorControllers = elevatorControllers;
    }
    public ELevatorSelectionStrategy getElevatorSelectionStrategy() {
        return elevatorSelectionStrategy;
    }
    public ElevatorController assignElevator(ExternalElevatorRequest externalElevatorRequest) {

        ElevatorController selectedElevator = elevatorSelectionStrategy.selectElevator(elevatorControllers, externalElevatorRequest);
        // Process the request with the selected elevator
        return selectedElevator;
    }
}
