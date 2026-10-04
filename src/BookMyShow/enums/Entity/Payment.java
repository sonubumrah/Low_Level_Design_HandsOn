package BookMyShow.enums.Entity;

import BookMyShow.enums.enums.PaymentMethod;
import ParkingLot.enums.Payment_Status;

import java.util.UUID;

public class Payment {

    private UUID paymentId;
    private double amount;
    private Payment_Status paymentStatus;
    private PaymentMethod paymentMethod;
    public Payment(double amount, Payment_Status paymentStatus, PaymentMethod paymentMethod) {
        this.paymentId = UUID.randomUUID();
        this.amount = amount;
        this.paymentStatus = paymentStatus;
        this.paymentMethod = paymentMethod;
    }
    public UUID getPaymentId() {
        return paymentId;
    }
    public double getAmount() {
        return amount;
    }
    public Payment_Status getPaymentStatus() {
        return paymentStatus;
    }
    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }


}
