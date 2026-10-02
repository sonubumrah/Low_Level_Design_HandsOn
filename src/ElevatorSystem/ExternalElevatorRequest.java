package ElevatorSystem;

public class ExternalElevatorRequest {
    private final int floor;
    private final Direction direction;   // UP or DOWN
    private final String idempotencyKey; // dedupe
    private final long timestamp;

    public ExternalElevatorRequest(int currentFloor, int floor, Direction direction, String idempotencyKey, long timestamp) {
        this.floor = floor;
        this.idempotencyKey = idempotencyKey;
        this.timestamp = timestamp;
        this.direction = direction;
    }
    public int getFloor() {
        return floor;
    }
    public Direction getDirection() {
        return direction;
    }
    public String getIdempotencyKey() {
        return idempotencyKey;
    }
    public long getTimestamp() {
        return timestamp;
    }

}
