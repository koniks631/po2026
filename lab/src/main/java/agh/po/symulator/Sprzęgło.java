package agh.po.symulator;

public class Sprzęgło extends Komponent {
    public boolean stanSprzęgła;

    public Sprzęgło(String producent, String model, double waga, double cena) {
        super(producent, model, waga, cena);
    }

    public void wcisnij() {
        this.stanSprzęgła = true;
    }

    public void odcisnij() {
        this.stanSprzęgła = false;
    }

    public boolean czysprzeglo(){
        return stanSprzęgła;
    }
}
