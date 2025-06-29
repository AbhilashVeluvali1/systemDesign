package decoratorPattern.starBuzz;

public abstract class Beverage {
    String description = "Unknown Beverage";
    public enum Size  { TALL, GRANDE,VENTI};
    Size size = Size.TALL;
    public abstract double cost();
    public String getDescription() {
        return description;
    }
    public Size getSize() {
        return this.size;
    }
    public void setSize(Size size) {
        this.size = size;
    }
}
