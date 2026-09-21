package ElevatorSystem;

public class Door {
    private DoorStatus status;
    public Door() {
        this.status = DoorStatus.CLOSED;
    }
    public DoorStatus getStatus() {
        return status;
    }
    public void setStatus(DoorStatus status) {
        this.status = status;
    }
}
