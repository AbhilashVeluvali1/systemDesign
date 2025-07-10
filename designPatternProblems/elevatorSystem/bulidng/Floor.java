package designPatternProblems.elevatorSystem.bulidng;

import designPatternProblems.elevatorSystem.display.Display;
import designPatternProblems.elevatorSystem.pannel.HallPanel;
import designPatternProblems.elevatorSystem.elevator.ElevatorSystem;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    private List<Display> displays;
    private List<HallPanel> hallPanels;
    private int floorNumber;
    private static final int MAX_FLOORS = 15;
    
    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
        this.displays = new ArrayList<>();
        this.hallPanels = new ArrayList<>();
    }
    
    public void initializeHallPanels(ElevatorSystem elevatorSystem) {
        HallPanel hallPanel = new HallPanel(floorNumber, elevatorSystem);
        hallPanels.add(hallPanel);
        
        Display display = new Display();
        displays.add(display);
    }
    
    public boolean isTopMostFloor() {
        return floorNumber == MAX_FLOORS;
    }
    
    public boolean isBottomMostFloor() {
        return floorNumber == 1;
    }
    
    public int getFloorNumber() {
        return floorNumber;
    }
    
    public List<Display> getDisplays() {
        return displays;
    }
    
    public List<HallPanel> getHallPanels() {
        return hallPanels;
    }
    
    public void addDisplay(Display display) {
        displays.add(display);
    }
    
    public void addHallPanel(HallPanel hallPanel) {
        hallPanels.add(hallPanel);
    }
}
