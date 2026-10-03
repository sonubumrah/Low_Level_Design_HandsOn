package ParkingLot.Dispatcher;

public interface Dispatcher {
    public void processRequest(String vehicleNumber, String vehicleType, String action);
}
