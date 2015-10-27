public class WeekendProgProb{
  public static void main(String[] ag){
    //System.out.println(twoConsecutive(1,2,2));
    //System.out.println(twoConsecutive(1,2,12));
    //System.out.println(twoConsecutive(1,3,5));
    //fourHeads();
    //nHeads(2);
    //int howMuch = Integer.parseInt(ag[0]);
    //nHeads(howMuch);
    //System.out.print("asdfhashasfd ".contains("has"));
    printTwoDigit(50);
  }
  public static boolean twoConsecutive(int a, int b, int c){
    return Math.abs(a-b)==1 || Math.abs(a-c)==1 || Math.abs(c-b)==1;
  }
  public static String coinFlip(){
    if ((int) (2*Math.random()) == 0){
      return ("H ");
    } else{
      return("T ");
    }
  }
  public static void fourHeads(){
    int count = 0;
    while (count<4){
      String dummy = coinFlip();
      System.out.print(dummy);
      if(dummy =="H ")
        count++;
      else
        count = 0;
    }
    System.out.println("\n Your sequence has had 4 heads");
  }
  public static void nHeads(int n){
    int count = 0;
    while (count<n){
      String dummy = coinFlip();
      //System.out.print(dummy);
      if(dummy =="H ")
        count++;
      else
        count = 0;
    }
    System.out.println("\n Your sequence has had "+ n +" heads");
  }
  public static void printTwoDigit(int n){
    boolean fourtyTwo = false;
    for(int i=0; i<n; i++){
      int num = (int) (90*Math.random())+10;
      System.out.println("next = " + num);
      if(num==42){
        fourtyTwo=true;
      }
    }
    if (fourtyTwo)
      System.out.println("We saw a 42!");
    else
      System.out.println("No 42 was seen.");
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
