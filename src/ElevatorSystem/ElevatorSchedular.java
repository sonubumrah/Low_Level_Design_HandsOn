package ElevatorSystem;

public class ElevatorSchedular {
    private ELevatorSelectionStrategy elevatorSelectionStrategy;
    public ElevatorSchedular(ELevatorSelectionStrategy eLevatorSelectionStrategy) {
        this.elevatorSelectionStrategy = eLevatorSelectionStrategy;
    }
    public ELevatorSelectionStrategy getElevatorSelectionStrategy() {
        return elevatorSelectionStrategy;
    }
}
