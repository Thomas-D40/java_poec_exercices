import java.util.Scanner;

public class TP7 {
	
	public static void connexionTest() {
		String email = "tom@test.com";
		String mdp = "azer";
		String emailProposed;
		String mdpProposed;
		int tryLeft = 5;
		
		Scanner scan = new Scanner(System.in);
		
		
		while(tryLeft > 0) {
			try {
				System.out.println("Veuillez entrer votre email :");
				emailProposed = scan.next();
				System.out.println("Veuillez entre votre mot de passe :");
				mdpProposed = scan.next();
				
				if (emailProposed.equals(email) && mdpProposed.equals(mdp)) {
					break;
				}
				
				tryLeft --;
				System.out.println("Identifiant incorrect");
				System.out.println("Tentative restante :" + tryLeft);
			} catch (Exception e) {
				System.out.println("Une erreur est survenue");
				scan.nextLine();
			}
		}
		
		if (tryLeft == 0) {
			System.out.println("Plus de tentatives disponibles");
			return;
		}
		
		System.out.println("Connexion réussie");
		
	}
}
