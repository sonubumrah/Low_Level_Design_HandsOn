package ElevatorSystem;

public class InternalElevetorRequest {
    private final String elevatorId;
    private final int targetFloor;
    private final String idempotencyKey;
    private final long timestamp;
    public InternalElevetorRequest(String elevatorId, int targetFloor, String idempotencyKey, long timestamp) {
        this.elevatorId = elevatorId;
        this.targetFloor = targetFloor;
        this.idempotencyKey = idempotencyKey;
        this.timestamp = timestamp;
    }


}
