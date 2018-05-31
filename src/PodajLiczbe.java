import java.util.Scanner;

public class PodajLiczbe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = 0;

        do {
            System.out.println("Podaj liczbę");
            x = scan.nextInt();
            if (x < 100) {
                System.out.println("Podana liczba jest za mała.");
            } else if (x > 200) {
                System.out.println("Podana liczba jest za duża.");
            } else if(x % 3 != 0) {
                System.out.println("Podana liczba nie jest podzielna przez 3");
            } else{
                System.out.println("Twoja liczba jest OK!");
            }
        } while (x <= 100 || x >= 200 || x % 3 != 0);

    }
}