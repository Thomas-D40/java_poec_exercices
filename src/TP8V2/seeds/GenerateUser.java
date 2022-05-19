package TP8V2.seeds;

import TP8V2.models.User;

import java.util.ArrayList;

public class GenerateUser {
	public static ArrayList<User> generateTab() {
		var users = new ArrayList<User>();
		
		users.add(new User("DARRACQ","Tom", "Tom@test.com", "azerazer"));
		users.add(new User("SOUBIRAN","Pierre", "Pierre@test.com", "azerazer"));
		users.add(new User("LOPP","Janeka", "Janeka@test.com", "azerazer"));
		users.add(new User("ABOUZAID","Samah", "Samah@test.com", "azerazer"));
		users.add(new User("LISANGOLA","Christian", "christian@test.com", "azerazer"));
		
		return users;
	}
}
