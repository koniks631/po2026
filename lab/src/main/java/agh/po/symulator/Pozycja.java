package agh.po.symulator;

public class Pozycja {
    private double x;
    private double y;

    public Pozycja(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void aktualizujPozycje(double deltaX, double deltaY){
        this.x += deltaX;
        this.y += deltaY;
    }

    public void przemiesc(double dt, double v, Pozycja cel){
        double dx = cel.getX() - this.getX();
        double dy = cel.getY() - this.getY();
        double odleglosc = Math.sqrt(dx*dx + dy*dy);
        double krok = v * dt;

        if(odleglosc<= krok){
            this.x = cel.getX();
            this.y = cel.getY();
        }
        else {
            this.x += krok * (dx/odleglosc);
            this.y += krok * (dy/odleglosc);
        }
    }

    public void ustawPozycje(double x, double y){
        this.x = x;
        this.y = y;
    }

    public String getPozycja(){
        return "(" + x +", " + y + ")";
    }

}
