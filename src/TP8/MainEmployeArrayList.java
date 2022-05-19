package TP8;

import java.util.ArrayList;
import java.util.Scanner;

public class MainEmployeArrayList {
	public static void main(String[] args) {
		
		var input = new Scanner(System.in);
		
		System.out.println("Combien d'employés voulez-vous enregistrer?");
		var nombreEmployes = input.nextInt();
		
		var employes = new ArrayList<Employe>();


//		employes[0] = new Employe(1, "Christian", "Lisangola");
		
		for (int i = 0; i < nombreEmployes; i++) {
			System.out.println("Taille du tableau : " + employes.size());
			
			System.out.println("Quel est son Id?");
			int id = input.nextInt();
			input.nextLine();
			System.out.println("Quel est le prénom?");
			String prenom = input.nextLine();
			System.out.println("Quel est le nom?");
			String nom = input.nextLine();
			
			employes.add(new Employe(id, prenom, nom));

//			Employe employe = new Employe(id, prenom, nom);
//			employes[i] = employe;
		
		}

//		System.out.println(Arrays.toString(employes));
		
		for (int i = 0; i < employes.size(); i++) {
			System.out.println("Employé[" + i + "] : " + employes.get(i));
		}
		
		System.out.println("Souhaitez-vous ajouter un autre employé?");
		String response = input.nextLine();
		
		if (response.equals("oui")) {
			employes.add(new Employe(5, "Zozor", "Zazar"));
		} else {
			System.out.println("Bye bye");
		}
		System.out.println("Taille du tableau à la fin : " + employes.size());
		employes.get(3);
	}
}

