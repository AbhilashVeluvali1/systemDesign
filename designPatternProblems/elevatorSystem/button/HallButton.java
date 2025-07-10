package designPatternProblems.elevatorSystem.button;

public class HallButton extends Button {
    private int sourceFloor;
    
    public HallButton(int sourceFloor, Direction direction) {
        super();
        this.sourceFloor = sourceFloor;
        this.direction = direction;
    }
    
    public int getSourceFloor() {
        return sourceFloor;
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
