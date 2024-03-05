package com.infogalaxy.linecomparisoncomputation;
import java.util.Scanner;

public class LineComparisonComputation {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int x1;
		int y1;
		int x2;
		int y2;
		double length;
		
		System.out.println("Enter X1 :");
		x1 = scanner.nextInt();
		System.out.println("Enter Y1 :");
		y1 = scanner.nextInt();
		System.out.println("Enter X2 :");
		x2 = scanner.nextInt();
		System.out.println("Enter Y2 :");
		y2 = scanner.nextInt();
		
		length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		System.out.println("The length of a line is: " +length);
		
	}
}