package agh.po.animals;

public class Dog extends Animal {
    public Dog() {
        this.name = "Dog";
        this.legs = 4;
    }

    @Override
    public String getDescription() {
        return name + " ma " + legs + " nog";
    }
}
