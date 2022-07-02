package day2PracticeProblems;

import java.util.Scanner;

public class Vowel_Consonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a character");
		char n = sc.next().charAt(0);

		switch (n) {
		case 'a':
			System.out.println("its a vowel");
			break;
		case 'e':
			System.out.println("its a vowel");
			break;
		case 'i':
			System.out.println("its a vowel");
			break;
		case 'o':
			System.out.println("its a vowel");
			break;
		case 'u':
			System.out.println("its a vowel");
			break;
		default:
			System.out.println("its a consonant");
		}
	}
}