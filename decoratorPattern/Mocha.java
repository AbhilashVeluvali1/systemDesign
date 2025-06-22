package decoratorPattern;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
