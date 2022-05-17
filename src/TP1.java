import java.util.InputMismatchException;
import java.util.Scanner;

public class TP1 {



    public static void calculate() {
        Scanner scanner = new Scanner(System.in);

        float diametre = 0;


        while (diametre == 0) {
            try {
                System.out.println("Quelle est le diametre de votre surface?");
                diametre = scanner.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Vous n'avez pas rentré de chiffre");
                scanner.nextLine();
            }
        }
        ;

        float rayon = diametre / 2;
        float surface = (float) (rayon * rayon * Math.PI);

        System.out.println("Surface : " + surface);
        System.out.println("Rayon : " + rayon);
        scanner.close();
    }



}
