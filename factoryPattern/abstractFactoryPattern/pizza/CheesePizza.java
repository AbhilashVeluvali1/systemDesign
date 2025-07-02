package factoryPattern.abstractFactoryPattern.pizza;

import factoryPattern.abstractFactoryPattern.ingredientFactory.IngredientsFactory;

public class CheesePizza extends Pizza {

    IngredientsFactory ingredientsFactory;

    public CheesePizza(IngredientsFactory ingredientsFactory) {
        this.ingredientsFactory = ingredientsFactory;
    }
    public void prepare() {
        System.out.println("Preparing "+ name);
        dough = ingredientsFactory.createDough();
        sauce = ingredientsFactory.createSauce();
        cheese = ingredientsFactory.createCheese();
    }
}
