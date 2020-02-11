package decorator;

public class MeatPizza implements Pizza {
    Pizza pizza;

    public MeatPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String makePizza() {
        return pizza.makePizza() + "meat";
    }
}
