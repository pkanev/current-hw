//Write a program to check whether a point is inside or outside of the figure below. 
//The point is given as a pair of floating-point numbers, separated by a space. 
//Your program should print "Inside" or "Outside".

package pointsIsideAFigure;

import java.util.Locale;
import java.util.Scanner;

public class PointsIsideAFigure {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();
		double y = input.nextDouble();
		input.close();
		boolean isInside = false;
		//check if the point is within each segment of the figure
		if((x >= 12.5) && (x <= 17.5) && (y >= 6) && (y <= 13.5)) {
			isInside = true;
		} else if ((x >= 17.5) && (x <= 20) && (y >= 6) && (y <= 8.5)) {
			isInside = true;
		} else if ((x >= 20) && (x <= 22.5) && (y >= 6) && (y <= 13.5)) {
			isInside = true;
		} else {
			isInside = false;
		}
		System.out.println(isInside == true ? "Inside" : "Outside");
		
	}
}
