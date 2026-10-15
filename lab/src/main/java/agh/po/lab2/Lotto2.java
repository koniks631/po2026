package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class Lotto2 {
    public static void main(String[] args) {

        ArrayList<Integer> liczbyoduzytkownika = new ArrayList<>();
        for(int j=0; j<=5; j++){
            int w = Integer.parseInt(args[j]);
            liczbyoduzytkownika.add(w);
        }
        System.out.println("listaU: " + liczbyoduzytkownika);

        Random rand = new Random();

        ArrayList<Integer> lista = new ArrayList<>();

        for(int i=1; i<=6; i++){

            int liczba = rand.nextInt(49) + 1;
            if( lista.contains(liczba)) {
                i--;
                continue;
            }

            lista.add(liczba);
        }
        System.out.println("listaR: " + lista);

        int lt = 0;
        for(int z=0; z<=5; z++){
            int u = liczbyoduzytkownika.get(z);
            if( lista.contains(u)) {
               lt++;
            }
        }

        System.out.println("liczba trafien: " + lt);

        int lt2=0;
        int liczbapowt = 0;
         long startTime = System.currentTimeMillis();

        while (lt2!=6) {
            liczbapowt++;

            ArrayList<Integer> lista2 = new ArrayList<>();

            for(int g=1; g<=6; g++){

                int liczba2 = rand.nextInt(49) + 1;
                if( lista2.contains(liczba2)) {
                    g--;
                    continue;
                }

                lista2.add(liczba2);
            }

            for(int h=0; h<=5; h++){
                int u = liczbyoduzytkownika.get(h);
                if( lista2.contains(u)) {
                    lt2++;
                }
            }

            if(lt2!=6){
                lt2=0;
            }

        }


        long endTime = System.currentTimeMillis();
        System.out.println("czas wylosowania 6/6: " +
                (endTime - startTime) + " ms") ;
        System.out.println("liczba powtorzen: " + liczbapowt);
        //   ArrayList<Integer> lista = new ArrayList<>();
     //   lista.add(7);
      //  boolean jest = lista.contains(7); // true
       // System.out.println(lista);

    }
}
