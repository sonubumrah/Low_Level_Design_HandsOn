package ElevatorSystem;

import java.util.PriorityQueue;

public class ElevatorController implements Runnable  {
    private PriorityQueue<Integer> minHeap;
    private PriorityQueue<Integer> maxHeap;
    private Elevator elevator;
    private final Object monitor = new Object();
    public ElevatorController(Elevator elevator) {
        this.elevator = elevator;
        this.minHeap = new PriorityQueue<>();
        this.maxHeap = new PriorityQueue<>((a, b) -> b - a);
    }
    public void submitRequest(InternalDispatcher internalDispatcher){

    }
    public void enqueueRequest(int floor) {

    }
    public void controlElevator() {

    }





    @Override
    public void run() {
        controlElevator();

    }
}
