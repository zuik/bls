public class MiddleNumber{
  public static void main(String[] args){
    System.out.println(median(1,2,3));
  }
  public static int median(int a, int b, int c){
    if (a<b && a>c) return a;
    else return median(b,c,a);
  }
}
