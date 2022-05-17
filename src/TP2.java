import java.util.InputMismatchException;
import java.util.Scanner;

public class TP2 {

    public static void presentation() {
        String nom = null;
        String prenom = null;
        Integer age = null;

        Scanner scanner = new Scanner(System.in);

        while (nom == null) {
            try {

                System.out.println("Quel est votre nom?");
                nom = scanner.nextLine();
                if (nom.matches("^[0-9]*$")) {
                    nom = null;
                }
            } catch (InputMismatchException e) {
                System.out.println("Veuillez réessayez");
                scanner.nextLine();
            }
        }

        while (prenom == null) {
            try {

                System.out.println("Quel est votre prénom?");
                prenom = scanner.nextLine();
                if (prenom.matches("^[0-9]*$")) {
                    prenom = null;
                }
            } catch (InputMismatchException e) {
                System.out.println("Veuillez réessayez");
                scanner.nextLine();
            }
        }

        while (age == null) {
            try {

                System.out.println("Quel est votre âge?");
                age = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Vous n'avez pas saisi un nombre entier");
                scanner.nextLine();
            }
        }

        System.out.println(String.format("Vous vous appelez %s %s, et vous avez %d ans", prenom, nom, age));



    }
}
