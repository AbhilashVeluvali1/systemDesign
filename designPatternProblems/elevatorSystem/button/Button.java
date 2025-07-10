package designPatternProblems.elevatorSystem.button;

public abstract class Button {
    protected boolean status;
    protected Direction direction;
    
    public Button() {
        this.status = false;
    }
    
    public abstract void press();
    public abstract boolean isPressed();
    
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public Direction getDirection() {
        return direction;
    }
}
