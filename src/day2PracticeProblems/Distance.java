package day2PracticeProblems;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter value of x");
	        int x = scanner.nextInt();
	        System.out.println("Enter value of y ");
	        int y = scanner.nextInt();
	        double dis =  Math.pow((x * x + y * y), 0.5);
	        System.out.println("Euclidean distance is " +dis);
	    }
	}