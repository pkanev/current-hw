//Write a program to check whether a point is inside or outside the house below. 
//The point is given as a pair of floating-point numbers, separated by a space. 
//Your program should print "Inside" or "Outside".

package house;

import java.util.Locale;
import java.util.Scanner;

public class PointsInsideTheHouse {
	//this is used to see if the point is in the roof
	public static double position(double ax, double ay, double bx, double by, double cx, double cy){
		double sign = (bx-ax)*(cy-ay) - (by-ay)*(cx-ax);
		return sign;
	}
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();
		double y = input.nextDouble();
		input.close();
		boolean isInside = false;
		//1. Check if the point is within the area under the roof
		if((x >= 12.5) && (x <= 17.5) && (y >= 8.5) && (y <= 13.5)) {
			isInside = true;
		} else if ((x >= 20) && (x <= 22.5) && (y >= 8.5) && (y <= 13.5)) {
			isInside = true;
		} else if (x >= 12.5 && x <= 22.5 && y <= 8.5) {
			//2. Check if the point is inside the roof
			double isToLeftOfLeftRoof = position(12.5, 8.5, 17.5, 3.5, x, y);
			double isToRightOfRightRoof = position(22.5, 8.5, 17.5, 3.5, x, y);
			if(isToLeftOfLeftRoof >= 0 && isToRightOfRightRoof <= 0) {
				isInside = true;				
			}			
		} else {
			isInside = false;
		}
		//3. Print the result
		System.out.println(isInside == true ? "Inside" : "Outside");
	}
}
