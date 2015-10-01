import java.util.Scanner;
public class AmIHeavyWithInput{
  public static void main(String[] args){
    Scanner consInput = new Scanner(System.in);
    System.out.println("Enter the first person height and weight, in that order, seperate by space");
    double height_1 = consInput.nextDouble();
    double weight_1 = consInput.nextDouble();

    System.out.println("First person's height is " + (double) height_1 +
                      " and weight is " + (double) weight_1 + ".");

    System.out.println("Enter the first person height and weight, in that order, seperate by space");
    double height_2 = consInput.nextDouble();
    double weight_2 = consInput.nextDouble();

    System.out.println("Second person's height is " + (double) height_2 +
                      " and weight is " + (double) weight_2 + ".");

    System.out.println("First person's BMI: " + calcBMI(height_1,weight_1) +
                      " and the judgement is " + legendText(calcBMI(height_1,weight_1)));
    System.out.println("First person's BMI: " + calcBMI(height_2,weight_2) +
                      " and the judgement is " + legendText(calcBMI(height_2,weight_2)));
  }
  public static double calcBMI(double height, double weight){
    return (weight/Math.pow(height,2))*703.0;
  }
  public static String legendText(double x){
    if (x<18.5) return "underweight";
    if (x>=18.5 && x<25.0) return "normal";
    if (x>=25.0 && x<30.0) return "overweight";
    return "obese";
}
}
