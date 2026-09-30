package ElevatorSystem;

import java.util.List;

public interface ELevatorSelectionStrategy {
    public Elevator selectElevator(List<ElevatorController> elevatorControllers, ExternalElevatorRequest request);
}
