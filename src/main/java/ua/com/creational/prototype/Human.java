package ua.com.creational.prototype;

/**
 * Created by Alexandr on 04.08.2017.
 */
public class Human implements Copyable {
    String name;
    int age;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human [name=" + name + ", age=" + age + "]";
    }

    @Override
    public Object copy() {
        Human copy = new Human(age, name);
        return copy;
    }
}
