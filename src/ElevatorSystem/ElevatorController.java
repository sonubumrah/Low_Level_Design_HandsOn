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
    public void submitRequest(InternalElevatorRequest internalElevatorRequest) {
        System.out.println("Request submitted for elevator: " + internalElevatorRequest.getElevatorId() + " to floor: " + internalElevatorRequest.getTargetFloor());
        enqueueRequest(internalElevatorRequest.getTargetFloor());


    }
    public void enqueueRequest(int floor) {
        if(floor==elevator.getCurrentFloor()){
            System.out.println("Elevator is already at the requested floor: " + floor);
            return;
        }
        else if (floor > elevator.getCurrentFloor()) {
            if(minHeap.contains(floor)){
                System.out.println("Request for floor: " + floor + " is already in the queue.");
                return;
            }
            minHeap.offer(floor);
        } else {
            if(maxHeap.contains(floor)){
                System.out.println("Request for floor: " + floor + " is already in the queue.");
                return;
            }
            maxHeap.offer(floor);
        }
        synchronized (monitor) {
            monitor.notify();
        }


    }
    public void controlElevator() {
        while(true){
            synchronized (monitor) {
                while (minHeap.isEmpty() && maxHeap.isEmpty()) {
                    try {
                        elevator.setCurrentDirection(Direction.IDLE);
                        monitor.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
            }
            if (!minHeap.isEmpty()) {
                elevator.setCurrentDirection(Direction.UP);
                while (!minHeap.isEmpty()) {
                    int nextFloor = minHeap.poll();
                    elevator.moveToFloor(nextFloor);
                }
            } else if (!maxHeap.isEmpty()) {
                elevator.setCurrentDirection(Direction.DOWN);
                while (!maxHeap.isEmpty()) {
                    int nextFloor = maxHeap.poll();
                    elevator.moveToFloor(nextFloor);
                }
            }
            elevator.setCurrentDirection(Direction.IDLE);
        }
    }
    public Elevator getElevator() {
        return elevator;
    }

    @Override
    public void run() {
        controlElevator();

    }
}
