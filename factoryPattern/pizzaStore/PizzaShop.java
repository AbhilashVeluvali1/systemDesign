package factoryPattern.pizzaStore;

public class PizzaShop {
    public static void main(String[] args) {
        PizzaStore nyStyle = new NYStylePizzaStore();
        Pizza cheesePizza = nyStyle.orderPizza("cheese");
        System.out.println(cheesePizza.getName());
        PizzaStore chicagoStyle = new ChicagoStylePizzaStore();
        cheesePizza =  chicagoStyle.orderPizza("cheese");
        System.out.println(cheesePizza.getName());
    }
}
