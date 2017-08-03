package ua.com.creational.abstract_factory;

/**
 * Created by Alexandr on 03.08.2017.
 */
public class RuMouse implements Mouse{
    public void click() {
        System.out.println("Щелчок мышью");
    }

    public void dblclick() {
        System.out.println("Двойной щелчок мышью");
    }

    public void scroll(int direction) {
        if (direction > 0) {
            System.out.println("Скроллим вверх");
        } else if (direction > 0) {
            System.out.println("Скроллим вверх");
        } else {
            System.out.println("Не скроллим");
        }
    }
}
