package ua.com.creational.prototype;

/**
 * Created by Alexandr on 04.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Human original = new Human(18, "Vasya");
        System.out.println(original);

        Human copy = (Human)original.copy();
        System.out.println(original);

        HumanFactory factory = new HumanFactory(copy);
        Human h1 = factory.makeCopy();
        System.out.println(h1);

        factory.setPrototype(new Human(30, "Valeria"));
        Human h2 = factory.makeCopy();
        System.out.println(h2);
    }
}
