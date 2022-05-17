import java.util.InputMismatchException;
import java.util.Scanner;

public class TP3 {

    public static void permutation() {
        Scanner scan = new Scanner(System.in);
        Integer a = null;
        Integer b = null;
        Integer c = null;
        int temp;

        while (a == null ) {
            try {
                System.out.println("Entrez la première valeur");
                a = scan.nextInt();
            } catch (InputMismatchException e ) {
                System.out.println("Vous n'avez pas rentré de chiffre entier");
                 scan.nextLine();
            }
        }
        while (b == null ) {
            try {
                System.out.println("Entrez la deuxième valeur");
                b = scan.nextInt();
            } catch (InputMismatchException e ) {
                System.out.println("Vous n'avez pas rentré de chiffre entier");
                 scan.nextLine();
            }
        }while (c == null ) {
            try {
                System.out.println("Entrez la troisième valeur");
                c = scan.nextInt();
            } catch (InputMismatchException e ) {
                System.out.println("Vous n'avez pas rentré de chiffre entier");
                 scan.nextLine();
            }
        }

        System.out.println(String.format("Les valeurs entrées sont: a = %d, b = %d, c = %d", a, b, c));

        temp = a;
        a = c;
        c = b;
        b = temp;


        System.out.println(String.format("Les valeurs entrées sont: a = %d, b = %d, c = %d", a, b, c));


    }


}
