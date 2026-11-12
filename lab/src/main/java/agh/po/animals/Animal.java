package agh.po.animals;

public abstract class Animal {
    abstract String getDescription();

    protected String name;
    protected int legs;

    public int getLegs() {
        return legs;
    }

}
