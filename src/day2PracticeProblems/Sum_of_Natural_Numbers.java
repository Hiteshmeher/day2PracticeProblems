package day2PracticeProblems;

import java.util.Scanner;

public class Sum_of_Natural_Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter the numbers");
		int n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			System.out.print(i + "+");
			sum = sum + i;
			i++;
		}
		System.out.println("=" + " The sum  of natural number is " + " " + sum);
	}
}
