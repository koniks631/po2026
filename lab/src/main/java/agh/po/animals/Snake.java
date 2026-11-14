package agh.po.animals;

public class Snake extends Animal {
    public Snake() {
        this.name = "waz";
        this.legs = 0;
    }

    @Override
    public String getDescription() {
        return name + " ma " + legs + " nog";
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": SSSSSSSSSSSSSS");
    }
}
