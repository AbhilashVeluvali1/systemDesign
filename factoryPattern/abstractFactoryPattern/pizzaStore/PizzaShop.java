package factoryPattern.abstractFactoryPattern.pizzaStore;
import factoryPattern.abstractFactoryPattern.pizza.Pizza;

public class PizzaShop {
    public static void main(String[] args) {
       PizzaStore pizzaStore = new NYPizzaStore();
       Pizza pizza = pizzaStore.orderPizza("cheese");
    }
}
