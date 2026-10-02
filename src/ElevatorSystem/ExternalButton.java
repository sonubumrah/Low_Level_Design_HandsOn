package ElevatorSystem;

public class ExternalButton {
    private int floorNumber;
    private ExternalDispatcher externalDispatcher;
    public ExternalButton(int floorNumber, ExternalDispatcher externalDispatcher) {
        this.floorNumber = floorNumber;
        this.externalDispatcher = externalDispatcher;
    }
    public void press(Direction direction) {
        ExternalElevatorRequest externalElevatorRequest=new ExternalElevatorRequest(floorNumber, floorNumber, direction, "idempotencyKey", System.currentTimeMillis());
        externalDispatcher.submitExternalRequest(externalElevatorRequest);
    }
}
