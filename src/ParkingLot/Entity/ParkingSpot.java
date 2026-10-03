package ParkingLot.Entity;

import ParkingLot.enums.ParkingSpotType;
import ParkingLot.enums.SpotStatus;

public class ParkingSpot {
    private String spotId;
    private ParkingSpotType spotType;
    private SpotStatus spotStatus;

    public ParkingSpot(String spotId, ParkingSpotType spotType, SpotStatus spotStatus) {
        this.spotId = spotId;
        this.spotType = spotType;
        this.spotStatus = spotStatus;
    }

    public String getSpotId() {
        return spotId;
    }

    public ParkingSpotType getSpotType() {
        return spotType;
    }

    public SpotStatus getSpotStatus() {
        return spotStatus;
    }
    public void setSpotStatus(SpotStatus spotStatus) {
        this.spotStatus = spotStatus;
    }
}
