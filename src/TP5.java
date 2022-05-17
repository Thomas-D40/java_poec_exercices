import java.util.InputMismatchException;
import java.util.Scanner;

public class TP5 {
    public static void equation() {
        Scanner scan = new Scanner(System.in);
        Integer a = null;
        Integer b = null;
        Integer c = null;
        float delta;

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
        }
        while (c == null ) {
            try {
                System.out.println("Entrez la troisième valeur");
                c = scan.nextInt();
            } catch (InputMismatchException e ) {
                System.out.println("Vous n'avez pas rentré de chiffre entier");
                scan.nextLine();
            }
        }

        delta = b*b - 4 * a * c;
        if (delta < 0) {
            System.out.println(String.format("L'équation %dx²+%dx+%d n'a pas de solution réelle", a, b, c));
        }
        if (delta == 0) {
            System.out.println(String.format("L'équation %dx²+%dx+%d admet une solution: x0=%f", a, b, c, (float) -(b/2*a)));
        }
        if (delta > 0) {
            System.out.println(String.format("L'équation %dx²+%dx+%d admet deux solutions distinctes: x1=%f et x2=%f", a, b, c,
                    (float) (-b-Math.sqrt(delta)/2*a),
                    (float) (-b+Math.sqrt(delta)/2*a)));
        }

        scan.close();



    }
}
