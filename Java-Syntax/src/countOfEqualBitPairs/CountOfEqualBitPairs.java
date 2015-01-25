//Write a program to count how many sequences of two equal bits ("00" or "11") 
//can be found in the binary representation of given integer number n (with overlapping).

package countOfEqualBitPairs;

import java.util.Scanner;

public class CountOfEqualBitPairs {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		//obtain the number of bits
		int length = Integer.toBinaryString(n).length();
		int count = 0;
		
		for (int index = 1; index < length; index++) { 
			int bit1 = n>>index & 1;
			int bit0 = n>>(index-1) & 1;
			//there is no need to start at 0 since the first possible pair is for index 1 and 0
			if (bit1 == bit0) {
				count ++;
			}
		}
		System.out.println(count);
	}
}
