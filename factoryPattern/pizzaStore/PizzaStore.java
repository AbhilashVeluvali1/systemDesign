package factoryPattern.pizzaStore;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    //abstract factory method
    public abstract Pizza createPizza(String type);
}
