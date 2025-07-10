package designPatternProblems.elevatorSystem.display;

import designPatternProblems.elevatorSystem.button.Direction;
import designPatternProblems.elevatorSystem.elevator.ElevatorState;

public class Display {
    private int currentFloor;
    private int capacity;
    private Direction direction;
    private ElevatorState elevatorState;

    public Display() {
        this.currentFloor = 1;
        this.capacity = 0;
        this.direction = null;
        this.elevatorState = null;
    }

    public void updateDisplay(int floor, ElevatorState state, int currentCapacity) {
        this.currentFloor = floor;
        this.elevatorState = state;
        this.capacity = currentCapacity;
        
        if (state == ElevatorState.UP) {
            this.direction = Direction.UP;
        } else if (state == ElevatorState.DOWN) {
            this.direction = Direction.DOWN;
        } else {
            this.direction = null;
        }
    }

    public void showElevatorDisplay() {
        System.out.println("Floor: " + currentFloor + 
                         " | Direction: " + (direction != null ? direction : "IDLE") + 
                         " | Capacity: " + capacity + "/8");
    }

    public void showHallDisplay() {
        System.out.println("Floor: " + currentFloor + 
                         " | Direction: " + (direction != null ? direction : "IDLE"));
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public Direction getDirection() {
        return direction;
    }

    public int getCapacity() {
        return capacity;
    }
}
