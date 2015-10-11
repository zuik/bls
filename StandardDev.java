import java.util.*;
public class StandardDev{
  public static void main(String[] agr){
    ArrayList<Double> result = new ArrayList<Double>();
    for(String i: agr){
      result.add((double) Integer.parseInt(i));
    }
    System.out.println(
    //Todo: Print out the promps and stuff
    // Calculate the square root for the standard dev
  }
  public static double calculateAverage(ArrayList<Double> numberList){
    double n = 0.0;
    for(double i: numberList){
      n+=i;
    }
    return n/numberList.size();
  }
  public static ArrayList<Double> calculateDev(
                                        ArrayList<Double> numberList,
                                        double average){
    ArrayList<Double> result = new ArrayList<Double>();
    for(double i: numberList){
      result.add(i-average);
    }
    return result;
    }
    public static double calcVariance(ArrayList<Double> devList){
      double result = 0;
      for(double i: devList){
        result += i*i;
      }
      return result/devList.size();
    }
}
