package ua.com.creational.abstract_factory;

/**
 * Created by Alexandr on 03.08.2017.
 */
public class RuKeyboard  implements Keyboard{
    public void print() {
        System.out.println("Печатаем строку");
    }

    public void println() {
        System.out.println("Печатаем строку с переводом");
    }
}
