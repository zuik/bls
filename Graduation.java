public class Graduation{
  public static void main(String[] agr){
    int counter =0;
    for(int i=0; i<10; i++){
      System.out.println((i%2==0)? "" : i);
      counter += (i%2==0)? 1 : 0;
    }
    System.out.println(counter + "<");
  }
}
