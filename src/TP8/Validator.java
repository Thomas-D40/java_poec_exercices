package TP8;

import java.util.regex.Pattern;

public class Validator {
	public static boolean isEmail(String email) {
		return Pattern.matches(".+@.+\\..+", email);
	}
}
