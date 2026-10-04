package BookMyShow.enums.Entity;

import ParkingLot.enums.Payment_Status;

import java.time.LocalDateTime;

public class Ticket {
    private int ticketId;
    private String seatNumber;
    private LocalDateTime showTime;
    private String movieName;
    private String theatreName;
    private double price;
    private Payment_Status paymentStatus;

    public Ticket(int ticketId, String seatNumber, LocalDateTime showTime, String movieName, String theatreName, double price, Payment_Status paymentStatus) {
        this.ticketId = ticketId;
        this.seatNumber = seatNumber;
        this.showTime = showTime;
        this.movieName = movieName;
        this.theatreName = theatreName;
        this.price = price;
        this.paymentStatus = paymentStatus;
    }
    public int getTicketId() {
        return ticketId;
    }
    public String getSeatNumber() {
        return seatNumber;
    }
    public LocalDateTime getShowTime() {
        return showTime;
    }
    public String getMovieName() {
        return movieName;
    }
    public String getTheatreName() {
        return theatreName;
    }
    public double getPrice() {
        return price;
    }
    public Payment_Status getPaymentStatus() {
        return paymentStatus;
    }
    public void setPaymentStatus(Payment_Status paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }
    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }
    public void setShowTime(LocalDateTime showTime) {
        this.showTime = showTime;
    }
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }
    public void setPrice(double price) {
        this.price = price;
    }


}
