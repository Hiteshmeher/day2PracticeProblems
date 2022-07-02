package day2PracticeProblems;

import java.util.Scanner;

public class Reverse_Integer_number {

	static int reverse = 0;
	static int remainder;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		while (num > 0) {
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		System.out.println("The reverse of a given number is " + reverse);
	}
}