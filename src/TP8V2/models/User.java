package TP8V2.models;

import java.util.UUID;

public class User {
	private String id;
	private String nom;
	private String prenom;
	private String email;
	private String password;
	
	public User(String nom, String prenom, String email, String password) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.id = UUID.randomUUID().toString();
	}
	
	
	public String getId() {
		return id;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("User{");
		sb.append("id='").append(id).append('\'');
		sb.append(", nom='").append(nom).append('\'');
		sb.append(", prenom='").append(prenom).append('\'');
		sb.append(", email='").append(email).append('\'');
		sb.append(", password='").append(password).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
