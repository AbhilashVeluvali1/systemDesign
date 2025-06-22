package decoratorPattern;

public abstract class CondimentDecorator extends Beverage { //extension is to maintain same type for the wrapping process
    Beverage beverage; //beverage used by each decorator for wrapping purpose
    @Override
    public abstract String getDescription();
}
