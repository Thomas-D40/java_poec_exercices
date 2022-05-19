package TP8V2;

import TP8V2.seeds.GenerateUser;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		String email = null;
		String password = null;
		var users = GenerateUser.generateTab();
		int tryLeft = 3;
		
		
		
		var scan = new Scanner(System.in);
		
		while (email == null && password == null && tryLeft > 0) {
			
			while (email == null) {
				try {
					System.out.println("Quel est votre mail?");
					email = scan.nextLine();
					if (!Validator.isEmail(email)) {
						System.out.println("Ce que vous avez entré n'est pas un email");
						email = null;
					}
				} catch (Exception e) {
					System.out.println("Une erreur est survenue");
				}
			}
			
			while (password == null) {
				try {
					System.out.println("Quel est votre mot de passe?");
					password = scan.nextLine();
					if (!Validator.isLength(password,8,20)) {
						System.out.println("Le mot de passe doit avoir entre 8 et 20 caractères");
						password = null;
					}
				} catch (Exception e) {
					System.out.println("Une erreur est survenue");
				}
			}
			
			
			boolean isConnected = Authentification.authentification(users, email, password);
			
			if (!isConnected) {
				System.out.println("Email et/ou mot de passe incorrect");
				email = null;
				password = null;
				tryLeft --;
				System.out.println("Essais restants : " + tryLeft );
			}
		}
		
		if (tryLeft == 0) {
			System.out.println("Nombre de tentatives maximales atteintes");
		}
			
	}
	
	
}
