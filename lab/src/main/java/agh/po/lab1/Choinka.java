package agh.po.lab1;

public class Choinka {
    public static void main(String[] args) {
        int w = Integer.parseInt(args[0]);
        for(int i=1;i<=w+2; i++) {

            for(int j=i; j<=2*i-1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}