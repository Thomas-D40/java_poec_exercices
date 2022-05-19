package TP8V2;


import TP8V2.models.User;

import java.util.ArrayList;

public class Authentification {
	public static boolean authentification(ArrayList<User> users, String email, String password) {
		boolean isConnected = false;
		
		for (int i = 0; i < users.size(); i++) {
			if (email.equalsIgnoreCase(users.get(i).getEmail()) && password.equals(users.get(i).getPassword())) {
				String nom = users.get(i).getNom();
				String prenom = users.get(i).getPrenom();
				System.out.printf("Bienvenue %s %s",nom, prenom);
				isConnected = true;
				break;
			}
			
		}
		return isConnected;
	}
}
