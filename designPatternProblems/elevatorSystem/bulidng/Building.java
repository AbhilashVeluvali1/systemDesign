package designPatternProblems.elevatorSystem.bulidng;

import designPatternProblems.elevatorSystem.elevator.ElevatorCar;
import designPatternProblems.elevatorSystem.elevator.ElevatorSystem;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private List<Floor> floors;
    private List<ElevatorCar> elevators;
    private ElevatorSystem elevatorSystem;
    private static final int MAX_FLOORS = 15;
    
    public Building() {
        this.floors = new ArrayList<>();
        this.elevators = new ArrayList<>();
        initializeFloors();
        this.elevatorSystem = new ElevatorSystem(this);
        this.elevators = elevatorSystem.getElevators();
    }
    
    private void initializeFloors() {
        for (int i = 1; i <= MAX_FLOORS; i++) {
            Floor floor = new Floor(i);
            floors.add(floor);
        }
    }
    
    public void addFloor(Floor floor) {
        floors.add(floor);
    }
    
    public Floor getFloor(int floorNumber) {
        if (floorNumber >= 1 && floorNumber <= floors.size()) {
            return floors.get(floorNumber - 1);
        }
        return null;
    }
    
    public List<Floor> getFloors() {
        return floors;
    }
    
    public List<ElevatorCar> getElevators() {
        return elevators;
    }
    
    public ElevatorSystem getElevatorSystem() {
        return elevatorSystem;
    }
    
    public int getTotalFloors() {
        return floors.size();
    }
}
