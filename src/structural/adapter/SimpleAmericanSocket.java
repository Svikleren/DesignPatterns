package structural.adapter;

public class SimpleAmericanSocket implements AmericanSocket {
    @Override
    public void getPower() {
        System.out.println("get 100 volt");
    }
}
