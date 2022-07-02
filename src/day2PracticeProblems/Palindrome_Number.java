package day2PracticeProblems;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {

		int lastDigit, reverseNum = 0;
		System.out.println("Enter a number");

		Scanner sc = new Scanner(System.in);
		int inputNumber = sc.nextInt();
		int a = inputNumber;
		while (a > 0) {
			lastDigit = a % 10;
			a = a / 10;
			reverseNum = reverseNum * 10 + lastDigit;
		}
		System.out.println("The reverse number is " + reverseNum);

		if (a == reverseNum) {
			System.out.println("Number is palindrome ");
		} else {
			System.out.println("Number is not palindrome");
		}
	}
}