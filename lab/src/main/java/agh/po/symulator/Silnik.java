package agh.po.symulator;

public class Silnik extends Komponent {
    private int maxObroty;
    private int obroty;

    public Silnik(String producent, String model, double waga, double cena, int maxObroty) {
        super(producent, model, waga, cena);
        this.maxObroty = maxObroty;
        this.obroty = 0;
    }

    public void uruchom(){
        this.obroty = Math.min(800, maxObroty);
    }

    public void zatrzymaj(){
        this.obroty = 0;
    }
}
