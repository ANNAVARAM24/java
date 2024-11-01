package com.java.program1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		//1. reverse of the string without using the inbuilt functions and iterate the string.
		//2. iteratate each and every character in given string and print separately and print all same characters in the sequence order.
		//3. count all non repeating characters in the user input string and print count.
		//4. palindrome of the string .
		//5. separate all vowels and constants as two different strings from the given user input and reverse the vowel and append it to constants.
		System.out.println("Enter a string:  ");
		Scanner palin=new Scanner(System.in);
		String str= palin.next();
		String palin1="";
		for(int i=str.length();i>=0;i--) {
			palin1+=str.charAt(i);
			//System.out.println(str);
			
		}
		if(palin1==str) {
			System.out.println("Given String is a Palindrome");
		}
		else {
			System.out.println("Given String is not a Plindrome");
		}
		
	}

}
