package decoratorPattern.starBuzz;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        if(getSize().equals(Size.TALL))
            return beverage.cost() + 0.10;
        else if(getSize().equals(Size.VENTI))
            return beverage.cost() + 0.20;
        else
            return beverage.cost() + 0.30;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

}
