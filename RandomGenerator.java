import java.util.*;
public class RandomGenerator {
	public static void main(String[] args) {
		System.out.print("Count: "+randomEven(500));
	}

	// generate and print 10 integers from the range 0 to n inclusive
	// return the number of even integers on that list.
	public static int randomEven(int n) {
		int counter = 0;
		for(int i = 0; i < 10; i++){
			int x = (int) (n*Math.random());
			System.out.println(x);
			if (x%2==0){
				counter++;
			}
		}
		return counter;

	}
/*	// generate and print the results of m random coin tosses
	// print out the number of heads and the number of tails.
	// Sample output: coinToss(8)
	// H T H H T T H H
	// Number of Heads: 5
	// Number of Tails: 3
	public static void coinToss(int m) {
	return "";
	}

	//For this problem, we'll round an int value up to the next multiple of 10 
	//if its rightmost digit is 5 or more, so 15 rounds up to 20. 
	//Alternately, round down to the previous multiple of 10 if its rightmost digit 
	//is less than 5, so 12 rounds down to 10. 
	public static int round10(int n) {
	return "";
	}


	// return the sum of the rounded values of a,b, and c
	// You must use round10 above.
	public static int roundSum(int a, int b, int c) {
	return "";
	}*/
}
