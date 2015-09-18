public class AmIHeavy{
  public static void main(String[] args){
    int height_1 = 0, weight_1 = 0;
    int height_2 = 0, weight_2 = 0;
        try{
          height_1 = Integer.parseInt(args[0]);
          weight_1 = Integer.parseInt(args[1]);
          height_2 = Integer.parseInt(args[2]);
          weight_2 = Integer.parseInt(args[3]);
        } catch(NumberFormatException e){
          System.err.println("Argument" + args[0] + " must be an integer.");
          System.exit(1);
        }
      System.out.println("First person's height is " + (double) height_1 +
                        " and weight is " + (double) weight_2 + ".");
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
