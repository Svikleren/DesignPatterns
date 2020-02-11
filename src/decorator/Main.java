package decorator;

public class Main {
    public static void main(String[] args) {
        Pizza cheesePizza = new CheesePizza(new DoughPizza());
        Pizza pepperoniCheese = new PepperoniPizza(cheesePizza);
        Pizza meatPepperoniCheesePizza = new MeatPizza(pepperoniCheese);
        System.out.println(meatPepperoniCheesePizza.makePizza());
    }
}
