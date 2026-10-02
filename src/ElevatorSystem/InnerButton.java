package ElevatorSystem;

import java.util.List;

public class InnerButton  {
    private List<Floor> floors;
    ElevatorController elevatorController;


    public InnerButton(List<Floor> floors, ElevatorController elevatorController) {
        this.elevatorController = elevatorController;
        this.floors = floors;
    }
    public Floor getFloorNumber(int floorNumber) {
        return floors.get(floorNumber);
    }


    public void press(int floorNumber) {
        System.out.println("Inner button for floor " + floorNumber + " pressed.");
        elevatorController.submitRequest(new InternalElevatorRequest("1",floorNumber, "idempotencyKey", java.time.LocalDateTime.now()));
    }
}
