package day2PracticeProblems;

import java.util.Scanner;

public class Read_a_number {

	public static void main(String[] args) {

		Scanner display = new Scanner(System.in);
		System.out.println("Enter number");
		int num = display.nextInt();
		
		if (num == 1) {
			System.out.println("its unit");
		} else if (num == 10) {
			System.out.println("Tens place");
		} else if (num == 100) {
			System.out.println("Hundreds place");
		} else if (num == 1000) {
			System.out.println("Thousands place");
		} else {
			System.out.println("Invalid entry");
		}
	}
}
