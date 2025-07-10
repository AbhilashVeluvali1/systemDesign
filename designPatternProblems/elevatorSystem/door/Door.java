package designPatternProblems.elevatorSystem.door;

public class Door {
    private DoorState doorState;
    
    public Door() {
        this.doorState = DoorState.CLOSED;
    }
    
    public void open() {
        this.doorState = DoorState.OPEN;
    }
    
    public void close() {
        this.doorState = DoorState.CLOSED;
    }
    
    public boolean isOpen() {
        return doorState == DoorState.OPEN;
    }
    
    public DoorState getDoorState() {
        return doorState;
    }
}
