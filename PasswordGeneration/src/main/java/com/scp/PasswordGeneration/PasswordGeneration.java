package com.scp.PasswordGeneration;

import java.util.concurrent.ThreadLocalRandom;

public class PasswordGeneration {
	enum Complexity {
		low, mid, high
	}

	public static void main(String[] args) {

		System.out.println("Random Password Generated\n ");
		System.out.print("\nLow Complexity Password : ");
		System.out.println(generateRandomPassword(6, 10, Complexity.low));
		System.out.print("\nMedium Complexity Password : ");
		System.out.println(generateRandomPassword(7, 12, Complexity.mid));
		System.out.print("\nHigh Complexity Password : ");
		System.out.print(generateRandomPassword(8, 15, Complexity.high));

	}

	public static char[] generateRandomPassword(int min, int max, Complexity complexity) {

		int passwordLength = ThreadLocalRandom.current().nextInt(min, max);

		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String symbols = "!@#$%^&*_=+-/.?<>";
		String values = "";
		
		switch (complexity) {
		case low:
			values = capitalLetters + smallLetters;
			break;
		case mid:
			values = capitalLetters + smallLetters + numbers;
			break;
		case high:
			values = capitalLetters + smallLetters + numbers + symbols;
			break;
		default:
			break;
		}

		char[] password = new char[passwordLength];
		if (values.length() > 0) {
			for (int i = 0; i < passwordLength; i++) {
				int x = ThreadLocalRandom.current().nextInt(values.length());
				password[i] = values.charAt(x);

			}
		}

		return password;
	}
}
