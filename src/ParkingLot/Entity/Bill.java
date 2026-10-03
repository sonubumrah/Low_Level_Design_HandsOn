package ParkingLot.Entity;

import java.time.LocalDateTime;

public class Bill {
    private String billId;
    private Ticket ticket;
    private double amount;
    private String paymentMethod;
    private String paymentStatus;
    private String vehicleNumber;
    private LocalDateTime exitTime;
    public Bill(String billId, Ticket ticket, double amount, String paymentMethod, String paymentStatus, String vehicleNumber, LocalDateTime exitTime) {
        this.billId = billId;
        this.ticket = ticket;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
        this.vehicleNumber = vehicleNumber;
        this.exitTime = exitTime;
    }
    public String getBillId() {
        return billId;
    }
    public void setBillId(String billId) {
        this.billId = billId;
    }
    public Ticket getTicket() {
        return ticket;
    }
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getPaymentMethod() {
        return paymentMethod;
    }
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public String getPaymentStatus() {
        return paymentStatus;
    }
    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
    public String getVehicleNumber() {
        return vehicleNumber;
    }
    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
    public LocalDateTime getExitTime() {
        return exitTime;
    }
}

