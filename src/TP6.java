import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TP6 {

//    private static final HashMap<Integer, String> MONTHSLIST = new HashMap<Integer, String>(){{
//        put(1,"Janvier");
//        put(2,"Février");
//        put(3,"Mars");
//        put(4,"Avril");
//        put(5,"Mai");
//        put(6,"Juin");
//        put(7,"Juillet");
//        put(8,"Aout");
//        put(9,"Septembre");
//        put(10,"Octobre");
//        put(11,"Novembre");
//        put(12,"Décembre");
//    }};

    public static void months(){
    Scanner scan = new Scanner(System.in);
    Integer number = null;
    
    var monthlist = new HashMap<>();
    String[] moisAnnee = {"Janvier","Février","Mars","Avril","Mai","Juin","Juillet","Aout","Septembre","Octobre","Novembre","Decembre"};
    for (int i = 0; i < moisAnnee.length; i++) {
        monthlist.put(i+1, moisAnnee[i]);
    }
    


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
    };
    
    // Alternative
//        while(true) {
//            try {
//                System.out.println("Entrez un numéro de mois: ");
//                number = scan.nextInt();
//                if (number >= 1 && number <= 12) {
//                    break;
//                }
//                System.out.println("Vous n'avez pas rentré de chiffre entre 1 et 12");
//            } catch (InputMismatchException e) {
//                System.out.println("Vous n'avez pas rentré de nombre entier");
//            }
//        }

        System.out.println("Vous avez demandé le mois de " + monthlist.get(number));

        scan.close();



    }
}
