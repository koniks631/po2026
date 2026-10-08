import java.util.Random;
public class Lotto {
    public static void main(String[] args) {
        Random rand = new Random();

        for(int i=1; i<=6; i++){
            int liczba = rand.nextInt(49) + 1;

            System.out.print("liczba: ");
            System.out.print(i);
            System.out.print(" ");
            System.out.println(liczba);

        }
}
}
