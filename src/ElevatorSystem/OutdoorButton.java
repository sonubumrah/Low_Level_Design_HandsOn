package ElevatorSystem;

public class OutdoorButton implements Button{
    private char buttonNumber;

    public OutdoorButton(char buttonNumber) {
        this.buttonNumber = buttonNumber;
    }
    public char getButtonNumber() {
        return buttonNumber;
    }
    public void setButtonNumber(char buttonNumber) {
        this.buttonNumber = buttonNumber;
    }


    @Override
    public void press() {
        System.out.println("Outdoor button " + buttonNumber + " pressed.");

    }
}
