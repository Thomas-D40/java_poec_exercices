import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TP6 {

    private static final ArrayList<String> MONTHSLIST = new ArrayList<String>(){{
        add("Janvier");
        add("Février");
        add("Mars");
        add("Avril");
        add("Mai");
        add("Juin");
        add("Juillet");
        add("Aout");
        add("Septembre");
        add("Octobre");
        add("Novembre");
        add("Décembre");
    }};

    public static void months(){
    Scanner scan = new Scanner(System.in);
    Integer number = null;


    while (number == null) {
        try {
            System.out.println("Quel nombre de mois souhaitez-vous vérifier?");
            number = scan.nextInt();
            if (number < 1 || number > 12) {
                System.out.println("Merci de renseigner un nombre entre 1 et 12");
                number = null;
            }
        } catch (InputMismatchException e) {
            System.out.println("Vous n'avez pas rentré de chiffre");
            scan.nextLine();
        }
    }
    ;

        System.out.println("Vous avez demandé le mois de " + MONTHSLIST.get(number - 1));

        scan.close();



    }
}
