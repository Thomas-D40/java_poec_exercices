package TP8V2;

import java.util.regex.Pattern;

public class Validator {
	public static boolean isEmail(String email) {
		return Pattern.matches(".+@.+\\..+", email);
	}
	
	public static boolean isLength(String str, int min, int max){
		return (str.length() >= min || str.length()<= max);
	}
}
