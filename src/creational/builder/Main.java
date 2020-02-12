package creational.builder;

public class Main {

    public static void main(String[] args) {
        Person person = new PersonBuilderImpl()
                .setName("name")
                .setAge(20)
                .build();
        person.print();
    }
}
