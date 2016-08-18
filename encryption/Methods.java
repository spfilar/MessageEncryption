package com.encryption;

import java.util.*;

public class Methods {

	Scanner sc = new Scanner(System.in);
	String userInput = null;
	String decryptionOutput = null;
	char character = 0;
	int output = 0;
	ArrayList<Integer> encryptedText = new ArrayList<>();

	public Methods() {
	}
	
	public void encrypt() {
		
		System.out.println("\nEncrypted text:");
		
		for (int i = 0; i < userInput.length(); i++) {
			character = userInput.charAt(i);
			int ascii = (int) character;
			encryptedText.add(ascii);
			System.out.print(ascii + " ");
		}
		System.out.println("");
	}
	
	public void decrypt() {
		System.out.println("\nDecrypted text:");
		
		for (int i = 0; i < encryptedText.size(); i++) {
			output = encryptedText.get(i);
			decryptionOutput = Character.toString((char) output);
			System.out.print(decryptionOutput);
		}
		encryptedText.clear();
		System.out.println("\n");
		
	}
	
	public void inputText() {
		
		System.out.println("Please enter your message to be encrypted:");
		userInput = sc.nextLine();
	}
}
