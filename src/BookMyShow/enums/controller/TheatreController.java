package BookMyShow.enums.controller;

import BookMyShow.enums.Entity.Theatre;
import BookMyShow.enums.enums.City;

import java.util.List;
import java.util.Map;

public class TheatreController {
    private Map<City, List<Theatre>> cityToTheatres;

    public TheatreController(Map<City, List<Theatre>> cityToTheatres) {
        this.cityToTheatres = cityToTheatres;
    }
    public List<Theatre> getTheatresByCity(City city) {
        if(!cityToTheatres.containsKey(city)) {
            throw new IllegalArgumentException("No theatres found for the given city: " + city);
        }
        return cityToTheatres.get(city);
    }
}
