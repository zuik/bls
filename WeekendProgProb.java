import java.util.Scanner;

public class WeekendProgProb {
	public static void main(String[] ag) {
		//System.out.println(twoConsecutive(1,2,2));
		//System.out.println(twoConsecutive(1,2,12));
		//System.out.println(twoConsecutive(1,3,5));
		//fourHeads();
		//nHeads(2);
		//int howMuch = Integer.parseInt(ag[0]);
		//nHeads(howMuch);
		//System.out.print("asdfhashasfd ".contains("has"));
		//Scanner console = new Scanner(System. in );
		//printTwoDigit(50);
		//favoriteLetter(console, "a");
		//favoriteLetter(console, "z");
		//randomRects();
		//lucky(5);
		printChar("I love yogurt");
		//System.out.println(isVowel("a"));
		//System.out.println(isVowel("b"));
	}
	public static boolean twoConsecutive(int a, int b, int c) {
		return Math.abs(a - b) == 1 || Math.abs(a - c) == 1 || Math.abs(c - b) == 1;
	}
	public static String coinFlip() {
		if ((int)(2 * Math.random()) == 0) {
			return ("H ");
		} else {
			return ("T ");
		}
	}
	public static void fourHeads() {
		int count = 0;
		while (count < 4) {
			String dummy = coinFlip();
			System.out.print(dummy);
			if (dummy == "H ") count++;
			else count = 0;
		}
		System.out.println("\n Your sequence has had 4 heads");
	}
	public static void nHeads(int n) {
		int count = 0;
		while (count < n) {
			String dummy = coinFlip();
			//System.out.print(dummy);
			if (dummy == "H ") count++;
			else count = 0;
		}
		System.out.println("\n Your sequence has had " + n + " heads");
	}
	public static void printTwoDigit(int n) {
		boolean fourtyTwo = false;
		for (int i = 0; i < n; i++) {
			int num = (int)(90 * Math.random()) + 10;
			System.out.println("next = " + num);
			if (num == 42) {
				fourtyTwo = true;
			}
		}
		if (fourtyTwo) System.out.println("We saw a 42!");
		else System.out.println("No 42 was seen.");
	}
	public static void favoriteLetter(Scanner input, String x) {
		int ctr = 0;
		String holder;
		String clearOut = (char) 27 + "[0m";
		String redOut = (char) 27 + "[4m";
		System.out.println("Looking for: " + x);
		while (ctr < 2) {
			System.out.print(clearOut + "Type a word: " + redOut);
			holder = input.nextLine();
			System.out.println(clearOut + "Got:" + holder);
			if (holder.indexOf(x) == 0) ctr++;
			else ctr = 0;
			if (ctr == 2) System.out.println(clearOut + "Terminated at:" + holder + "/" + x);
		}
	}
	public static void lucky(int n){
		int counter = 4;
		int howMany = 0;
		while (counter>0){
			int rand = (int) (6*Math.random())+1;
			if (rand <= n){
				counter --;
				System.out.print((char) 27 + "[31m");
			} else
				counter =4;
			howMany++;
			System.out.print(rand+" ");
			System.out.print((char) 27 + "[0m");
		}
		System.out.println("\nFinished after "+ howMany + " rolls.");
	}
	public static void randomRects(){
		int prevArea = 0;
		int counter = 0;
		while(counter<4){
			int wid = (int) (10*Math.random())+1;
			int hei = (int) (10*Math.random())+1;
			int rectArea = wid*hei;
			System.out.println("w: "+ wid+" h: "+hei+" a: "+ rectArea);
			if (prevArea < rectArea){
				counter ++;
				//System.out.println(counter);
				prevArea = rectArea;
			} else
				counter = 0;
				prevArea = rectArea;
		}
	}
	public static void printChar(String x){
		int counter = 0;
		// Compare each character, one by one
		for(int i=0; i<x.length(); i++){
			if(isVowel(x.substring(i,i+1)))
				counter ++;
		}
		System.out.println(counter);
	}
	public static boolean isVowel(String y){
		return (y.equalsIgnoreCase("a") ||
			y.equalsIgnoreCase("e") ||
			y.equalsIgnoreCase("i") ||
			y.equalsIgnoreCase("o") ||
			y.equalsIgnoreCase("u") );
	}
	public static String replace(String og, String what, String withWhat){
    		while(og.indexOf(what)!=-1)
			og = og.substring(0, og.indexOf(what)) + withW + og.substring(og.indexOf(what)+what.length());
		return og;
	}
	/* Below is a complicated version of what should be simple
  public static void fourHeads(){
    String counter = "";
    int cc = 0;
    while(true){
      counter += coinFlip();
      //System.out.print("\n");
      if (counter.contains("H H H H")){
        System.out.println("Yours sequence has 4 heads");
        break;
      }else if (counter.contains("T T T T")){
        System.out.println("Yours sequence has 4 tails");
        break;
      }
    }
    System.out.print(counter);
  }
  public static void nHeads(int n){
    String counter = "";
    String compareHeads = "";
    String compareTails = "";
    for(int i = 0; i <n; i++){
      compareTails+="T ";
      compareHeads+="H ";
    }
    while(true){
      counter += coinFlip();
      //System.out.print("\n");
      if (counter.contains(compareHeads)){
        System.out.println("\nYours sequence has " + n + " heads");
        break;
      }else if (counter.contains(compareTails)){
        System.out.println("\nYours sequence has " + n +" tails");
        break;
      }
    }
    System.out.print(counter);
  }*/
}
