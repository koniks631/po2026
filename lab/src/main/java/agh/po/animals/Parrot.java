package agh.po.animals;

public class Parrot extends Animal {
    public Parrot() {
        this.name = "Papuga";
        this.legs = 2;
    }

    @Override
    public String getDescription() {
        return name + " ma " + legs + " nogi";
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": kra!");
    }
}
