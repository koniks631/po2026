package agh.po.animals;

public class Snake extends Animal {
    public Snake() {
        this.name = "Snake";
        this.legs = 4;
    }

    @Override
    public String getDescription() {
        return name + " ma " + legs + " nog";
    }
}
