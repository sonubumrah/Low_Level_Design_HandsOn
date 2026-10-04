package BookMyShow.enums.Entity;

import BookMyShow.enums.enums.PaymentMethod;

import java.util.List;

public class BookingRequest {
    private User user;
    private Movie movie;
    private Theatre theatre;
    private List<Seat> seats;
    private PaymentMethod paymentMethod;

    public BookingRequest(User user, Movie movie, Theatre theatre, List<Seat> seats, PaymentMethod paymentMethod) {
        this.user = user;
        this.movie = movie;
        this.theatre = theatre;
        this.seats = seats;
        this.paymentMethod = paymentMethod;
    }

    // Getters and setters
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Theatre getTheatre() {
        return theatre;
    }

    public void setTheatre(Theatre theatre) {
        this.theatre = theatre;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

}
