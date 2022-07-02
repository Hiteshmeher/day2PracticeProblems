package day2PracticeProblems;

import java.util.Scanner;

public class Arithmetic_Operators_Max_min {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for a,b and c");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int N1 = a + b * c;
		int N2 = a % b + c;
		int N3 = c + a / b;
		int N4 = a * b + c;

		if ((N1 >= N2) && (N1 >= N3) && (N1 >= N4)) {
			System.out.println("maximum N1 " + N1);
		} else if ((N2 >= N1) && (N2 >= N3) && (N2 >= N4)) {
			System.out.println(" maximum N2 " + N2);
		} else if ((N3 >= N1) && (N3 >= N2) && (N3 >= N4)) {
			System.out.println("maximum N3 " + N3);
		} else {
			System.out.println("maximum is N4 " + N4);
		}

		if ((N1 <= N2) && (N1 <= N3) && (N1 >= N4)) {
			System.out.println("minimum is N1 " + N1);
		} else if ((N2 >= N1) && (N2 >= N3) && (N2 >= N4)) {
			System.out.println(" minimum N2 " + N2);
		} else if ((N3 >= N1) && (N3 >= N2) && (N3 >= N4)) {
			System.out.println("minimum N3 " + N3);
		} else {
			System.out.println("minimum N4 " + N4);
		}
	}
}
