package ParkingLot.Priceing;

public class HourlyBasis implements PriceingStrategy {
    private static final double HOURLY_RATE = 10.0;

    @Override
    public double calculatePrice(int hours) {
        return hours * HOURLY_RATE;
    }
}
