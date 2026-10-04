package BookMyShow.enums.Entity;

public class Movie {
    private String movieName;
    private String movieId;

    public Movie(String movieName, String movieId) {
        this.movieName = movieName;
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getMovieId() {
        return movieId;
    }

}
