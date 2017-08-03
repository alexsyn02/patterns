package ua.com.creational.prototype;

/**
 * Created by Alexandr on 04.08.2017.
 */
public class HumanFactory {
    Human human;

    public HumanFactory(Human human) {
        setPrototype(human);
    }

    public void setPrototype(Human human) {
        this.human = human;
    }

    Human makeCopy() {
        return (Human)human.copy();
    }
}
