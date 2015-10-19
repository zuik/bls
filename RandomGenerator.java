import java.util.*;
public class RandomGenerator {
	public static void main(String[] args) {
		for(int i=0; i <100; i++){
			System.out.println(round10(i));
		}
		//System.out.println(round10(5));
		//System.out.println(0%10);
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
	// generate and print the results of m random coin tosses
	// print out the number of heads and the number of tails.
	// Sample output: coinToss(8)
	// H T H H T T H H
	// Number of Heads: 5
	// Number of Tails: 3
	public static void coinToss(int m) {
		ArrayList<Integer> coinList = new ArrayList<Integer>();
		for (int i = 0; i<m; i++){
			int x = (int) (2*Math.random());
			coinList.add(x);
		}
		for (Integer i: coinList){
			if(i == 1){
				System.out.print("H ");
			} else {
				System.out.print("T ");
			}
		}
		int sum = sumList(coinList);
		System.out.println("\nNumber of heads: "+sum);
		System.out.println("Number of tails: "+ (coinList.size()-sum));
	}
	/**
	* A terrible way to generate an INTEGER sum of a
	* INTEGER ArrayList
	* @param inputList : take ArrayList to be summed
	* @return Integer sum of the list
	*/
	public static int sumList(ArrayList<Integer> inputList){
		int result = 0;
		for(Integer i: inputList){
			result += i;
		}
		return result;
	}
	//For this problem, we'll round an int value up to the next multiple of 10
	//if its rightmost digit is 5 or more, so 15 rounds up to 20.
	//Alternately, round down to the previous multiple of 10 if its rightmost digit
	//is less than 5, so 12 rounds down to 10.
	public static int round10(int n) {
		int holder = n;
		int countStep = 0;
		while(!(holder%10==0)){
			holder--;
			countStep++;
		}
		//System.out.println(countStep);
		if(countStep>=5)
			return holder+10;
		return holder;
	}


	// return the sum of the rounded values of a,b, and c
	// You must use round10 above.
	public static int roundSum(int a, int b, int c) {
		return round10(a)+round10(b)+round10(c);
	}
}
