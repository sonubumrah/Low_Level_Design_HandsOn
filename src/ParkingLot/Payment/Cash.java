package ParkingLot.Payment;

public class Cash implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Cash");
    }
}
