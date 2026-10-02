package ElevatorSystem;

public class Floor {
    int floorNumber;
    private ExternalButton button;
    public Floor(int floorNumber, ExternalButton upButton) {
        this.floorNumber=floorNumber;
        this.button = upButton;
    }
    public int getFloorNumber() {
        return floorNumber;
    }
    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }
    public void pressUpButton() {
        button.press(Direction.UP);
    }
    public void pressDownButton() {
        button.press(Direction.DOWN);
    }
}
