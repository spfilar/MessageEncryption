package com.encryption;

public class RunEncryption {
	
	static Methods newEncryption = new Methods();
	static boolean exit = false;
	
	public static void main(String[] args) {
		
		while (!exit) {
			newEncryption.inputText();
			newEncryption.encrypt();
			newEncryption.decrypt();
		}
	}
}
