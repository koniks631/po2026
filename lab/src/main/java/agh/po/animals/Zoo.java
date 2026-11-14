package agh.po.animals;

import java.util.ArrayList;
import java.util.Random;

public class Zoo {

    private ArrayList<Animal> list = new ArrayList<>();

    public void wypelnij() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int w = random.nextInt(3);
            switch (w) {
                case 0 -> list.add(new Parrot());
                case 1 -> list.add(new Dog());
                case 2 -> list.add(new Snake());
            }
        }
    }

    public int policz() {
        int liczbanog = 0;
        for (Animal animal : list) {
            liczbanog += animal.getLegs();
        }
        return liczbanog;
    }

    public void prezentuj() {
        for (Animal animal : list) {
            int legs = animal.getLegs();
            System.out.println(animal.getDescription());
            animal.makeSound();
        }
    }

    public static void main(String[] args){
        Zoo zoo1 = new Zoo();
        zoo1.wypelnij();
        zoo1.prezentuj();
        System.out.println("suma nog wszystkich zwierzat: " + zoo1.policz());
    }
}
