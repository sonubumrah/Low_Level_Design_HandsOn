package ElevatorSystem;

import java.util.List;

public class NearestSelectionStrategy implements ELevatorSelectionStrategy {
    @Override
    public ElevatorController selectElevator(List<ElevatorController> elevatorControllers, ExternalElevatorRequest request) {


        ElevatorController nearestElevator = null;
        int minDistance = Integer.MAX_VALUE;

        for (ElevatorController elevatorController : elevatorControllers) {
            Elevator elevator=elevatorController.getElevator();
            boolean isSameDirectionAndRequestedFloorNotPassed = (elevator.getCurrentDirection() == request.getDirection()
                    && ((request.getDirection() == Direction.UP && elevator.getCurrentFloor() <= request.getFloor())
                    || (request.getDirection() == Direction.DOWN && elevator.getCurrentFloor() >= request.getFloor())));
            if(isSameDirectionAndRequestedFloorNotPassed){
                int distance = Math.abs(elevator.getCurrentFloor() - request.getFloor());
                if (distance < minDistance) {
                    minDistance = distance;
                    nearestElevator = elevatorController;
                }
            }
//
        }
        if(nearestElevator==null){
            for (ElevatorController elevatorController : elevatorControllers) {
                Elevator elevator=elevatorController.getElevator();
                if(elevator.getCurrentDirection()==Direction.IDLE){
                    nearestElevator=elevatorController;
                    break;
                }
            }

        }
        if(nearestElevator==null){
           nearestElevator=elevatorControllers.get(0);
        }
        return nearestElevator;
    }
}
