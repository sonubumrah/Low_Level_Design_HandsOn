package BookMyShow.enums.Entity;

import java.util.List;

public class Screen {
    private String screenId;
    private String screenName;
    private List<Show> shows;
    private List<Seat> seats;
    private Theatre theatre;

    public Screen(String screenId, String screenName, Theatre theatre,List<Show> shows, List<Seat> seats) {
        this.screenId = screenId;
        this.screenName = screenName;
        this.theatre = theatre;
        this.shows = shows;
        this.seats = seats;
    }

    public String getScreenId() {
        return screenId;
    }

    public String getScreenName() {
        return screenName;
    }
    public Theatre getTheatre() {
        return theatre;
    }
    public List<Show> getShows() {
        return shows;
    }
    public List<Seat> getSeats() {
        return seats;
    }
}
