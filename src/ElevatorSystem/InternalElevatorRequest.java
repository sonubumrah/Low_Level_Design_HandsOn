package ElevatorSystem;

import java.time.LocalDateTime;

public class InternalElevatorRequest {
    private final String elevatorId;
    private final int targetFloor;
    private final String idempotencyKey;
    private final LocalDateTime timestamp;
    public InternalElevatorRequest(String elevatorId, int targetFloor, String idempotencyKey, LocalDateTime timestamp) {
        this.elevatorId = elevatorId;
        this.targetFloor = targetFloor;
        this.idempotencyKey = idempotencyKey;
        this.timestamp = timestamp;
    }
    public String getElevatorId() {
        return elevatorId;
    }
    public int getTargetFloor() {
        return targetFloor;
    }
    public LocalDateTime getTimestamp() {
        return timestamp;
    }


}
