package designPatternProblems.elevatorSystem.elevator;

import designPatternProblems.elevatorSystem.bulidng.Building;
import designPatternProblems.elevatorSystem.button.Direction;
import designPatternProblems.elevatorSystem.elevator.ElevatorCar;

import java.util.ArrayList;
import java.util.List;

public class ElevatorSystem {
    private Building building;
    private List<ElevatorCar> elevators;
    private static final int MAX_ELEVATORS = 3;
    
    public ElevatorSystem(Building building) {
        this.building = building;
        this.elevators = new ArrayList<>();
        initializeElevators();
    }
    
    private void initializeElevators() {
        for (int i = 1; i <= MAX_ELEVATORS; i++) {
            ElevatorCar elevator = new ElevatorCar(i);
            elevator.getElevatorPanel().setElevatorCar(elevator);
            elevators.add(elevator);
        }
    }
    
    public void requestElevator(int floor, Direction direction) {
        ElevatorCar bestElevator = findBestElevator(floor, direction);
        if (bestElevator != null) {
            bestElevator.addDestination(floor);
        }
    }
    
    private ElevatorCar findBestElevator(int floor, Direction direction) {
        ElevatorCar bestElevator = null;
        int minDistance = Integer.MAX_VALUE;
        
        for (ElevatorCar elevator : elevators) {
            if (!elevator.canTakePassenger()) {
                continue;
            }
            
            int distance = elevator.getDistanceToFloor(floor);
            
            if (elevator.getElevatorState() == ElevatorState.IDLE) {
                if (distance < minDistance) {
                    minDistance = distance;
                    bestElevator = elevator;
                }
            }
            else if (elevator.isMovingTowardsFloor(floor)) {
                if (distance < minDistance) {
                    minDistance = distance;
                    bestElevator = elevator;
                }
            }
        }
        
        if (bestElevator == null) {
            for (ElevatorCar elevator : elevators) {
                if (elevator.canTakePassenger()) {
                    int distance = elevator.getDistanceToFloor(floor);
                    if (distance < minDistance) {
                        minDistance = distance;
                        bestElevator = elevator;
                    }
                }
            }
        }
        
        return bestElevator;
    }
    
    public void processRequests() {
        for (ElevatorCar elevator : elevators) {
            if (elevator.hasDestination()) {
                elevator.move();
            }
        }
    }
    
    public void displayStatus() {
        System.out.println("=== Elevator System Status ===");
        for (ElevatorCar elevator : elevators) {
            System.out.print("Elevator " + elevator.getElevatorId() + ": ");
            elevator.getDisplay().showElevatorDisplay();
        }
        System.out.println();
    }
    
    public List<ElevatorCar> getElevators() {
        return elevators;
    }
    
    public Building getBuilding() {
        return building;
    }
}
