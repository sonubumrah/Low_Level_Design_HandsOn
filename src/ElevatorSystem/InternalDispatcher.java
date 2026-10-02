package ElevatorSystem;

public class InternalDispatcher {
    private static InternalDispatcher instance;

    public static InternalDispatcher getInstance() {
        if (instance == null) {
            instance = new InternalDispatcher();
        }
        return instance;
    }

    public ElevatorController submitInternalRequest(InternalElevatorRequest internalElevatorRequest,ElevatorController elevatorController) {
       // ElevatorController elevatorController = internalElevatorRequest.getElevatorController();
        elevatorController.submitRequest(internalElevatorRequest);
        return elevatorController;
    }

}
