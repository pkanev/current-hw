//Write a program that enters a positive integer number num and 
//converts and prints it in hexadecimal form. You may use some built-in method
//from the standard Java libraries.

package decToHex;

import java.util.Scanner;

public class DecimalsToHexidecimals {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		String hex = Integer.toHexString(num);//standard library for conversion
		System.out.println(hex.toUpperCase());//in order to match the output of the homework
		input.close();
	}
}
