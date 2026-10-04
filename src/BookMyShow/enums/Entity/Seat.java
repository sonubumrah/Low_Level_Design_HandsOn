package BookMyShow.enums.Entity;

import BookMyShow.enums.enums.SeatCategory;
import BookMyShow.enums.enums.SeatStatus;

public class Seat {
    private String seatNumber;
    private SeatStatus seatStatus;
    private double price;
    private SeatCategory seatCategory;
    private Theatre theatre;
    private Screen screen;
    public Seat(String seatNumber, SeatStatus seatStatus, double price, SeatCategory seatCategory, Theatre theatre, Screen screen) {
        this.seatNumber = seatNumber;
        this.seatStatus = seatStatus;
        this.price = price;
        this.seatCategory = seatCategory;
        this.theatre = theatre;
        this.screen = screen;
    }
    public String getSeatNumber() {
        return seatNumber;
    }
    public SeatStatus getSeatStatus() {
        return seatStatus;

    }
    public double getPrice() {
        return price;
    }
    public SeatCategory getSeatCategory() {
        return seatCategory;
    }
    public Theatre getTheatre() {
        return theatre;
    }
    public Screen getScreen() {
        return screen;
    }
    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }
    public void setSeatStatus(SeatStatus seatStatus) {
        this.seatStatus = seatStatus;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setSeatCategory(SeatCategory seatCategory) {
        this.seatCategory = seatCategory;
    }
    public void setTheatre(Theatre theatre) {
        this.theatre = theatre;
    }
    public void setScreen(Screen screen) {
        this.screen = screen;
    }

}
