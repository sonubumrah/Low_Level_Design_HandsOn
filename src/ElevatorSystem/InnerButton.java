package ElevatorSystem;

public class InnerButton implements Button {
    private char buttonNumber;

    public InnerButton(char buttonNumber) {
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
        System.out.println("Inner button " + buttonNumber + " pressed.");
    }
}
