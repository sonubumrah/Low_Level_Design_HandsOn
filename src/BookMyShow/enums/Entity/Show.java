package BookMyShow.enums.Entity;

import java.time.LocalDateTime;

public class Show {
    private String showId;
    private LocalDateTime showTime;
    private Movie movie;
    private Screen screen;

    public Show(String showId, LocalDateTime showTime, Movie movie, Screen screen) {
        this.showId = showId;
        this.showTime = showTime;
        this.movie = movie;
        this.screen = screen;
    }

    public String getShowId() {
        return showId;
    }

    public LocalDateTime getShowTime() {
        return showTime;
    }

    public Movie getMovie() {
        return movie;
    }

    public Screen getScreen() {
        return screen;
    }
}
