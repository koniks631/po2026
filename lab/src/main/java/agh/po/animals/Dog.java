package agh.po.animals;

public class Dog extends Animal {
    public Dog() {
        this.name = "Pies";
        this.legs = 4;
    }

    @Override
    public String getDescription() {
        return name + " ma " + legs + " nogi";
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": hau !");
    }
}
