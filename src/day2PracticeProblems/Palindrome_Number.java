package day2PracticeProblems;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {

		int lastDigit, reverseNum = 0;
		System.out.println("Enter a number");

		Scanner sc = new Scanner(System.in);
		int inputNumber = sc.nextInt();
		int a = inputNumber;
		int temp = a;
		while (a > 0) {
			lastDigit = a % 10;
			reverseNum = reverseNum * 10 + lastDigit;
			a = a / 10;
		}
		System.out.println("The input number is " + temp);

		System.out.println("The reverse number is " + reverseNum);

		if (temp == reverseNum) {
			System.out.println("Number is palindrome ");
		} else {
			System.out.println("Number is not palindrome");
		}
	}
}
