package agh.po.symulator;

public class SkrzyniaBiegów extends Komponent {
    private int aktualnyBieg;
    private int iloscBiegow;
    private Sprzęgło sprzeglo;
    private double aktualnePrzelozenie;

    public SkrzyniaBiegów(String producent, String model,
                          double waga, double cena,
                          int iloscBiegow, Sprzęgło sprzeglo) {

        super(producent, model, waga, cena);
        this.iloscBiegow = iloscBiegow;
        this.aktualnyBieg = 0;
        this.sprzeglo = sprzeglo;
        this.aktualnePrzelozenie = 0.0;

    }

    public void zwiekszBieg(){
        if (aktualnyBieg < iloscBiegow && sprzeglo.czysprzeglo()){
            aktualnyBieg++;
            aktualnePrzelozenie = aktualnyBieg * 0.5;
        }
    }

    public void zmniejszBieg(){
        if (aktualnyBieg > 0 && sprzeglo.czysprzeglo()) {
            aktualnyBieg--;
            aktualnePrzelozenie = aktualnyBieg * 0.5;
        }
    }

    public void zerujBieg() {
        this.aktualnyBieg = 0;
    }

    public int getAktBieg() {
        return aktualnyBieg;
    }

    public Sprzęgło getSprzeglo() {
        return sprzeglo;
    }

    public double getAktualnePrzelozenie(){
        return aktualnePrzelozenie;
    }
}
