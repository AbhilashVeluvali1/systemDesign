package designPatternProblems.elevatorSystem.elevator;

import designPatternProblems.elevatorSystem.display.Display;
import designPatternProblems.elevatorSystem.door.Door;
import designPatternProblems.elevatorSystem.door.DoorState;
import designPatternProblems.elevatorSystem.pannel.ElevatorPanel;

public class ElevatorCar {
    private int elevatorId;
    private int currentFloor;
    private Door door;
    private Display display;
    private ElevatorPanel elevatorPanel;
    private ElevatorState elevatorState;
    private int currentCapacity;
    private int maxCapacity = 8;
    private int maxWeight = 680;
    private int currentWeight;
    private boolean[] destinationFloors;
    private int minFloor = 1;
    private int maxFloor = 15;

    public ElevatorCar(int elevatorId) {
        this.elevatorId = elevatorId;
        this.currentFloor = 1;
        this.door = new Door();
        this.display = new Display();
        this.elevatorPanel = new ElevatorPanel();
        this.elevatorState = ElevatorState.IDLE;
        this.currentCapacity = 0;
        this.currentWeight = 0;
        this.destinationFloors = new boolean[16];
    }
    
    public ElevatorPanel getElevatorPanel() {
        return elevatorPanel;
    }
    
    public Display getDisplay() {
        return display;
    }
    
    public Door getDoor() {
        return door;
    }

    public void openDoor() {
        if (elevatorState == ElevatorState.IDLE) {
            door.open();
            display.updateDisplay(currentFloor, null, currentCapacity);
        }
    }

    public void closeDoor() {
        door.close();
    }

    public void move() {
        if (door.isOpen()) {
            return;
        }
        
        if (elevatorState == ElevatorState.UP) {
            if (currentFloor < maxFloor) {
                currentFloor++;
                display.updateDisplay(currentFloor, elevatorState, currentCapacity);
            }
        } else if (elevatorState == ElevatorState.DOWN) {
            if (currentFloor > minFloor) {
                currentFloor--;
                display.updateDisplay(currentFloor, elevatorState, currentCapacity);
            }
        }
        
        if (destinationFloors[currentFloor]) {
            stop();
        }
    }

    public void stop() {
        elevatorState = ElevatorState.IDLE;
        destinationFloors[currentFloor] = false;
        openDoor();
    }

    public void addDestination(int floor) {
        if (floor >= minFloor && floor <= maxFloor) {
            destinationFloors[floor] = true;
            
            if (floor > currentFloor) {
                elevatorState = ElevatorState.UP;
            } else if (floor < currentFloor) {
                elevatorState = ElevatorState.DOWN;
            }
        }
    }

    public boolean canTakePassenger() {
        return currentCapacity < maxCapacity;
    }

    public boolean canTakeWeight(int weight) {
        return currentWeight + weight <= maxWeight;
    }

    public void addPassenger(int weight) {
        if (canTakePassenger() && canTakeWeight(weight)) {
            currentCapacity++;
            currentWeight += weight;
            display.updateDisplay(currentFloor, elevatorState, currentCapacity);
        }
    }

    public void removePassenger(int weight) {
        if (currentCapacity > 0) {
            currentCapacity--;
            currentWeight -= weight;
            display.updateDisplay(currentFloor, elevatorState, currentCapacity);
        }
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public ElevatorState getElevatorState() {
        return elevatorState;
    }

    public int getElevatorId() {
        return elevatorId;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public boolean hasDestination() {
        for (boolean dest : destinationFloors) {
            if (dest) return true;
        }
        return false;
    }

    public int getDistanceToFloor(int floor) {
        return Math.abs(currentFloor - floor);
    }

    public boolean isMovingTowardsFloor(int floor) {
        if (elevatorState == ElevatorState.UP && floor > currentFloor) {
            return true;
        } else if (elevatorState == ElevatorState.DOWN && floor < currentFloor) {
            return true;
        }
        return false;
    }
}
