//Write a program to calculate the count of bits 1 in the binary representation 
//of given integer number n.

package countBits1;

import java.util.Scanner;

public class CountOfBits1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();		
		input.close();
		int count = Integer.bitCount(n);
		System.out.println(count);
	}
}
