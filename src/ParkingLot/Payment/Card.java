package ParkingLot.Payment;

public class Card implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Card");
    }
}
