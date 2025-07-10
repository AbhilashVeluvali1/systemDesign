package designPatternProblems.elevatorSystem.pannel;

import designPatternProblems.elevatorSystem.button.HallButton;
import designPatternProblems.elevatorSystem.button.Direction;
import designPatternProblems.elevatorSystem.elevator.ElevatorSystem;

public class HallPanel {
    private HallButton upButton;
    private HallButton downButton;
    private int floorNumber;
    private ElevatorSystem elevatorSystem;
    
    public HallPanel(int floorNumber, ElevatorSystem elevatorSystem) {
        this.floorNumber = floorNumber;
        this.elevatorSystem = elevatorSystem;
        this.upButton = new HallButton(floorNumber, Direction.UP);
        this.downButton = new HallButton(floorNumber, Direction.DOWN);
    }
    
    public void pressUpButton() {
        upButton.press();
        elevatorSystem.requestElevator(floorNumber, Direction.UP);
    }
    
    public void pressDownButton() {
        downButton.press();
        elevatorSystem.requestElevator(floorNumber, Direction.DOWN);
    }
    
    public void resetButtons() {
        upButton.reset();
        downButton.reset();
    }
    
    public HallButton getUpButton() {
        return upButton;
    }
    
    public HallButton getDownButton() {
        return downButton;
    }
    
    public int getFloorNumber() {
        return floorNumber;
    }
}
