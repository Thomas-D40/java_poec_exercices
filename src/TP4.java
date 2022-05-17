import java.util.InputMismatchException;
import java.util.Scanner;

public class TP4 {

    public static void typeOfNumber() {
        Scanner scan = new Scanner(System.in);
        Integer number = null;
        boolean isPositive = false;
        boolean isEven = false;

        while (number == null) {
            try {
                System.out.println("Entrez un nombre entier");
                number = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Vous n'avez pas mis un nombre entier");
                scan.nextLine();
            }
        }

        if (number >= 0 && number%2 == 0) {
            System.out.println(number + " est positif et pair");
        }
        if (number >= 0 && number%2 != 0) {
            System.out.println(number + " est positif et impair");
        }
        if (number < 0 && number%2 == 0) {
            System.out.println(number + " est négatif et pair");
        }
        if (number < 0 && number%2 != 0) {
            System.out.println(number + " est négatif et impair");
        }


    }
}
