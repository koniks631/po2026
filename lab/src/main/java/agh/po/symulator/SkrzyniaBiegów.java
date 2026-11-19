package agh.po.symulator;

public class SkrzyniaBiegów extends Komponent {
    private int aktualnyBieg;
    private int iloscBiegow;
    private Sprzęgło sprzeglo;

    public SkrzyniaBiegów(String producent, String model,
                          double waga, double cena,
                          int iloscBiegow, Sprzęgło sprzeglo) {

        super(producent, model, waga, cena);
        this.iloscBiegow = iloscBiegow;
        this.aktualnyBieg = 0;
        this.sprzeglo = sprzeglo;

    }

    public void zwiekszBieg(){
        if (aktualnyBieg < iloscBiegow){
            aktualnyBieg++;
        }
    }

    public void zmniejszBieg(){
        if (aktualnyBieg > 0){
            aktualnyBieg--;
        }
    }
}
