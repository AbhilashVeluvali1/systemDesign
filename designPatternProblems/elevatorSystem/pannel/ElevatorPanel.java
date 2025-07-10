package designPatternProblems.elevatorSystem.pannel;

import designPatternProblems.elevatorSystem.button.ElevatorButton;
import designPatternProblems.elevatorSystem.elevator.ElevatorCar;

import java.util.ArrayList;
import java.util.List;

public class ElevatorPanel {
    private List<ElevatorButton> floorButtons;
    private ElevatorButton openButton;
    private ElevatorButton closeButton;
    private ElevatorCar elevatorCar;
    
    public ElevatorPanel() {
        this.floorButtons = new ArrayList<>();
        
        for (int i = 1; i <= 15; i++) {
            floorButtons.add(new ElevatorButton(i));
        }
        
        this.openButton = new ElevatorButton(-1);
        this.closeButton = new ElevatorButton(-2);
    }
    
    public void setElevatorCar(ElevatorCar elevatorCar) {
        this.elevatorCar = elevatorCar;
    }
    
    public void pressFloorButton(int floor) {
        if (floor >= 1 && floor <= 15) {
            floorButtons.get(floor - 1).press();
            if (elevatorCar != null) {
                elevatorCar.addDestination(floor);
            }
        }
    }
    
    public void pressOpenButton() {
        openButton.press();
        if (elevatorCar != null) {
            elevatorCar.openDoor();
        }
    }
    
    public void pressCloseButton() {
        closeButton.press();
        if (elevatorCar != null) {
            elevatorCar.closeDoor();
        }
    }
    
    public void resetFloorButton(int floor) {
        if (floor >= 1 && floor <= 15) {
            floorButtons.get(floor - 1).reset();
        }
    }
    
    public List<ElevatorButton> getFloorButtons() {
        return floorButtons;
    }
    
    public ElevatorButton getOpenButton() {
        return openButton;
    }
    
    public ElevatorButton getCloseButton() {
        return closeButton;
    }
}
