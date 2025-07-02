package factoryPattern.abstractFactoryPattern.ingredientFactory;
import factoryPattern.abstractFactoryPattern.ingredients.*;


public interface IngredientsFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Clams createClams();
    Veggies[] createVeggies();
}
