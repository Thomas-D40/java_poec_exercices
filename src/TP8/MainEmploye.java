package TP8;

import java.util.Arrays;
import java.util.Scanner;

public class MainEmploye {
	public static void main(String[] args) {
		var input = new Scanner(System.in);
		
		System.out.println("Combien d'employés voulez-vous enregistrer?");
		var nombreEmployes = input.nextInt();
		
		Employe[] employes = new Employe[nombreEmployes];
//		employes[0] = new Employe(1, "Christian", "Lisangola");
		
		for (int i = 0; i < employes.length; i++) {
			
			System.out.println("Quel est son Id?");
			int id = input.nextInt();
			System.out.println("Quel est le prénom?");
			String prenom = input.next();
			System.out.println("Quel est le nom?");
			String nom = input.next();
			
			employes[i] = new Employe(id, prenom, nom);
			
//			Employe employe = new Employe(id, prenom, nom);
//			employes[i] = employe;
		
		}
		
		System.out.println();
		
//		String[] fruits=new String[3];
//		fruits[0]="pommes";
//		fruits[1]="bananes";
//		fruits[2]="oranges";
//
//		System.out.println(Arrays.toString(fruits));
	}
}
