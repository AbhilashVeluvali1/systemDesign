package factoryPattern.abstractFactoryPattern.ingredientFactory;

import factoryPattern.abstractFactoryPattern.ingredients.*;

public class NYPizzaIngredients implements IngredientsFactory {
    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Dough createDough()  {
        return new ThinCrustDough();
    }
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garilc(), new Mushroom(), new Onion(), new RedPepper()};
    }
    public Clams createClams() {
        return new FreshClams();
    }
}
