package agh.po.symulator;

public class Samochód {
    private Silnik silnik;
    private SkrzyniaBiegów skrzynia;
    private Pozycja aktualnaPozycja;
    private boolean stan;
    private String nrRejest;
    private String model;
    private int predkoscMax;

    public Samochód(Silnik silnik, SkrzyniaBiegów skrzynia, Pozycja aktualnaPozycja, String nrRejest, String model, int predkoscMax){
        this.silnik = silnik;
        this.skrzynia = skrzynia;
        this.aktualnaPozycja = aktualnaPozycja;
        this.nrRejest = nrRejest;
        this.model = model;
        this.predkoscMax = predkoscMax;
        this.stan = false;
    }

    public void wlacz() {
        this.silnik.uruchom();
        this.stan = true;
    }

    public void wylacz() {
        this.silnik.zatrzymaj();
        this.stan = false;
    }

    public void jedzDo(Pozycja cel) {
        double dt = 1.0;
        this.aktualnaPozycja.przemiesc(dt, getAktPredkosc(), cel);
    }

    public double getAktPredkosc(){
        if(!stan || skrzynia.getAktBieg() == 0){
            return 0.0;
        }
        double stala = 0.02;
        double v = stala*silnik.getObroty()* skrzynia.getAktualnePrzelozenie();
        return Math.min(v, predkoscMax);
    }

    public double getWaga() {
        return silnik.getWaga() + skrzynia.getWaga();
    }

    public static void main(String[] args) {
        Sprzęgło sprzęgło = new Sprzęgło("sachs", "a", 8.5, 600.0);
        SkrzyniaBiegów skrzynia =  new SkrzyniaBiegów("ZF", "manual", 45.0, 3500.0, 6, sprzęgło);
        Silnik silnik = new Silnik("vag", "tdi", 160.0, 8000.0, 5000);
        Pozycja start = new Pozycja(0, 0);
        Samochód auto = new Samochód(silnik, skrzynia, start, "kr 13456", "audi", 220);

        auto.wlacz();
        System.out.println("po wlaczeniu - obroty: " + auto.silnik.getObroty());

        sprzęgło.wcisnij();
        skrzynia.zwiekszBieg();
        skrzynia.zwiekszBieg();
        sprzęgło.odcisnij();
        silnik.zwiekszObroty();
        silnik.zwiekszObroty();

        silnik.zwiekszObroty();


        System.out.println("jazda - bieg: " + skrzynia.getAktBieg()
            + ", Obroty: " + auto.silnik.getObroty() + ", Sprzegło wcisniete: " + sprzęgło.czysprzeglo());

        auto.jedzDo(new Pozycja(100, 100));
        System.out.println("Aktualna pozycja po pojechaniu: " + auto.aktualnaPozycja.getPozycja());

        auto.wylacz();
        System.out.println("po wylaczeniu - obroty: " + auto.silnik.getObroty());

    }
}