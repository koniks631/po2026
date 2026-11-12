package agh.po.animals;

import java.util.ArrayList;
import java.util.Random;

public class Zoo {

    public int countlegs() {
        int a = 0;
        for (Animal animal : list) {
            a += animal.getLegs();
        }
        return a;
    }

    public static void main(String[] args){
        ArrayList<Animal> list = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int c = random.nextInt(3);
            switch (c) {
                case 0 -> list.add(new Parrot());
                case 1 -> list.add(new Dog());
                case 2 -> list.add(new Snake());
            }
        }


    }
}
