package designPatternProblems.elevatorSystem.button;

public class ElevatorButton extends Button {
    private int destinationFloor;
    
    public ElevatorButton(int destinationFloor) {
        super();
        this.destinationFloor = destinationFloor;
    }
    
    public int getDestinationFloor() {
        return destinationFloor;
    }

    @Override
    public void press() {
        this.status = true;
    }

    @Override
    public boolean isPressed() {
        return status;
    }
    
    public void reset() {
        this.status = false;
    }
}
