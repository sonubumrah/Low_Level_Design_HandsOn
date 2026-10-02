package ElevatorSystem;

import SnakeLadder.Dice;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        try {
            //ExternalButton externalButton = new ExternalButton(1, new ExternalDispatcher(new ElevatorSchedular(new NearestSelectionStrategy(), List.of())));

            Display display = new Display();

            Door door = new Door();
            Direction direction = Direction.IDLE;
            Elevator elevator1 = new Elevator(display, door, direction, 1, 0);
            ElevatorController elevatorController = new ElevatorController(elevator1);

            Elevator elevator2 = new Elevator(display,  door, direction, 2, 4   );
            ElevatorController elevatorController2 = new ElevatorController(elevator2);

            ELevatorSelectionStrategy elevatorSelectionStrategy = new NearestSelectionStrategy();
            ElevatorSchedular elevatorSchedular = new ElevatorSchedular(elevatorSelectionStrategy, List.of(elevatorController, elevatorController2));
            ExternalDispatcher externalDispatcher = new ExternalDispatcher(elevatorSchedular);
            ExternalButton externalButton = new ExternalButton(1, externalDispatcher);
            List<Floor> floors = List.of(new Floor(1, externalButton), new Floor(2, externalButton), new Floor(3, externalButton), new Floor(4, externalButton), new Floor(5, externalButton));
            InnerButton innerButton2 = new InnerButton(floors, elevatorController2);
            InnerButton innerButton1 = new InnerButton(floors, elevatorController);


            Building building = new Building(5, List.of(elevator1, elevator2), floors, externalDispatcher);
            Thread elevatorThread1 = new Thread(elevatorController);
            Thread elevatorThread2 = new Thread(elevatorController2);
            elevatorThread1.start();
            elevatorThread2.start();
            building.getFloors().get(4).pressUpButton();
            building.getFloors().get(0).pressUpButton();
            building.getFloors().get(2).pressDownButton();
            Thread.sleep(10000); // Wait for elevators to process requests
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
