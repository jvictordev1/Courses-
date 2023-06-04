package animais;

public abstract class animals{
    protected String name;
    protected double weight;
    protected double height;
    protected String color;
    protected String mood;

    protected abstract void eat();
    protected abstract String sound();
    protected abstract void play();
    protected abstract void sleep();
}