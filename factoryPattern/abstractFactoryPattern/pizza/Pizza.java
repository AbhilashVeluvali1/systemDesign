package factoryPattern.abstractFactoryPattern.pizza;

import factoryPattern.abstractFactoryPattern.ingredients.*;

public abstract class Pizza {
    String name;
     Dough dough;
     Sauce sauce;
     Cheese cheese;
     Pepperoni pepperoni;
     Clams clams;
     Veggies veggies[];

     public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }
    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }
    public String getName() {
        return name;
    }



}
