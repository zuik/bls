public class MiddleNumber{
  public static void main(String[] args){
    System.out.println(median(1,2,3));
  }
  public static int median(int a, int b, int c){
    return (a<b & a>c)?a:median(b,c,a);
  }
}
