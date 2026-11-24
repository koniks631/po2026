package agh.po.symulator;

public class Samochód {
    private Silnik silnik;
    private SkrzyniaBiegów skrzynia;
    private Pozycja aktualnaPozycja;
    private boolean stan;
    private String nrRejest;
    private String model;
    private int predkoscMax;

    public void wlacz() {
        this.silnik.uruchom();
        this.stan = true;
    }

    public void wylacz() {
        this.silnik.zatrzymaj();
        this.stan = false;
    }

    public void jedzDo(Pozycja cel) {

    }

    public double getWaga() {
        return silnik.getWaga() + skrzynia.getWaga();
    }
}