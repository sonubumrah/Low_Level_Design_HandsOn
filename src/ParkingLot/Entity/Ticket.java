package ParkingLot.Entity;

import ParkingLot.enums.Payment_Status;

import java.time.LocalDateTime;

public class Ticket {
    private String ticketId;
    private Payment_Status paymentStatus;
    private String vehicleNumber;
    private String spotId;
    private LocalDateTime entryTime;


    public Ticket(String ticketId,  Payment_Status paymentStatus, String vehicleNumber, String spotId, LocalDateTime entryTime) {
        this.ticketId = ticketId;

        this.paymentStatus = paymentStatus;
        this.vehicleNumber = vehicleNumber;
        this.spotId = spotId;
        this.entryTime = entryTime;

    }

    // Getters and setters
    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }



    public Payment_Status getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Payment_Status paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getSpotId() {
        return spotId;
    }

    public void setSpotId(String spotId) {
        this.spotId = spotId;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }
}
