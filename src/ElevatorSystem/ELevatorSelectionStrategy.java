package ElevatorSystem;

import java.util.List;

public interface ELevatorSelectionStrategy {
    public ElevatorController selectElevator(List<ElevatorController> elevatorControllers, ExternalElevatorRequest request);
}
