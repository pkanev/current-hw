package smallestNumber;

import java.util.Scanner;

public class SmallestNumber {
	public static double smallCompare(double x, double y) {
		double smallest = x;
		if (x > y) {
			smallest = y;
		}
		return smallest;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double min = a;
		double b = input.nextDouble();
		min = smallCompare(min, b);
		double c = input.nextDouble();
		min = smallCompare(min, c);
				
		input.close();
		if (min == Math.round(min)) {
			//if min is an integer, then print the whole number only
		System.out.printf("%.0f",min);
		} else {
			//print with appropriate number of decimal places
			System.out.println(min);
		}
	}
}
