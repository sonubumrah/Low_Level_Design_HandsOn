package BookMyShow.enums.Entity;

import BookMyShow.enums.enums.City;

public class Theatre {
    private String theatreName;
    private City city;


    public Theatre(String theatreName, City city) {
        this.theatreName = theatreName;
        this.city = city;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public City getCity() {
        return city;
    }
}
