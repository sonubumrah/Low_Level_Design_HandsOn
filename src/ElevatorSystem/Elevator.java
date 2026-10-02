package ElevatorSystem;

public class Elevator {
    private Display display;
    //private InnerButton innerButton;
    private Door door;
    private Direction currentdirection;
    private int ElevatorId;
    private int currentFloor;

    public Elevator(Display display,  Door door, Direction direction, int ElevatorId, int currentFloor) {
        this.display = display;
        //this.innerButton = innerButton;
        this.door = door;
        this.currentdirection = direction;
        this.ElevatorId = ElevatorId;
        this.currentFloor = currentFloor;
    }
    public Display getDisplay() {
        return display;
    }
    //public InnerButton getInnerButton() {
    //    return innerButton;
    //}
    public Door getDoor() {
        return door;
    }
    public Direction getCurrentDirection() {
        return currentdirection;
    }
    public int getElevatorId() {
        return ElevatorId;
    }
    public int getCurrentFloor() {
        return currentFloor;
    }
    public void setCurrentDirection(Direction currentdirection) {
        this.currentdirection = currentdirection;
    }
    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }
    public void moveToFloor(int targetFloor) {

        System.out.println("Elevator " + ElevatorId + " moving from floor " + currentFloor + " to floor " + targetFloor);
        // Simulate the time taken to move between floors
        System.out.println("Elevator " + ElevatorId + " arrived at floor " + currentFloor);
    }


}
