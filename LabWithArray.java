import java.util.*;

public class LabWithArray {
  public static void main(String[] agr){
    String clearOut = (char) 27 + "[0m";
    String redOut = (char) 27 + "[4m";
    Scanner s = new Scanner(System.in);
    System.out.print("How many days' temperature? " + redOut);
    int days = s.nextInt();
    int[] temp = new int[days];
    double ave = 0;
    int counter = 0;
    for(int i = 0; i<days; i++){
      System.out.print(clearOut);
      System.out.printf("Day %d temperature: ", i+1);
      System.out.print(redOut);
      int d = s.nextInt();
      temp[i] = d;
      ave+= ((double) d)/days; //Factor out average. No sum var. needed
    }
    Arrays.sort(temp);
    //Loop throught the sorted array, counting all days above average
    for (double i: temp){
      if (i>= ave)
        counter ++;
    }
    System.out.printf("%sAverage temp: %f\n",clearOut,ave);
    System.out.println(counter +" days were above average.");
    System.out.println("Temperature: "+Arrays.toString(temp));
    System.out.printf("Highest: %.2f, Lowest: %.2f", (double) temp[0], (double) temp[temp.length-1]);
  }
}
