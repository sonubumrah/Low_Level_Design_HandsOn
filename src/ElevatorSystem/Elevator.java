package ElevatorSystem;

public class Elevator {
    private Display display;
    private Button innerButton;
    private Door door;
    private LiftDirection direction;
    private int ElevatorId;

    public Elevator(Display display, Button innerButton, Door door, LiftDirection direction, int ElevatorId) {
        this.display = display;
        this.innerButton = innerButton;
        this.door = door;
        this.direction = direction;
        this.ElevatorId = ElevatorId;
    }
    public Display getDisplay() {
        return display;
    }
    public Button getInnerButton() {
        return innerButton;
    }
    public Door getDoor() {
        return door;
    }
    public LiftDirection getDirection() {
        return direction;
    }
    public int getElevatorId() {
        return ElevatorId;
    }

}
