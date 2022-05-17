import java.util.InputMismatchException;
import java.util.Scanner;

public class TP4 {

    public static void typeOfNumber() {
        Scanner scan = new Scanner(System.in);
        Integer number = null;

        while (number == null) {
            try {
                System.out.println("Entrez un nombre entier");
                number = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Vous n'avez pas mis un nombre entier");
                scan.nextLine();
            }
        }
        
        boolean isEven = number%2 == 0;

        if (number >= 0) {
            System.out.printf(number + " est positif et %s", (isEven?"pair":"impair"));
        }
        if (number < 0) {
            System.out.printf(number + " est négatif et %s", (isEven?"pair":"impair"));
        }


    }
}
