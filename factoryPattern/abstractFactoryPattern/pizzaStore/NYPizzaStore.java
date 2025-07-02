package factoryPattern.abstractFactoryPattern.pizzaStore;

import factoryPattern.abstractFactoryPattern.ingredientFactory.IngredientsFactory;
import factoryPattern.abstractFactoryPattern.ingredientFactory.NYPizzaIngredients;
import factoryPattern.abstractFactoryPattern.pizza.CheesePizza;
import factoryPattern.abstractFactoryPattern.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {
    IngredientsFactory ingredientsFactory = new NYPizzaIngredients();
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientsFactory);
        }
        return pizza;
    }

}
