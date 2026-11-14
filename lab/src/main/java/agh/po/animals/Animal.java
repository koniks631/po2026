package agh.po.animals;

public abstract class Animal {
    public abstract String getDescription();

    protected String name;
    protected int legs;

    public int getLegs() {
        return legs;
    }

    public abstract void makeSound();

}
