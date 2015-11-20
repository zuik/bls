public class Snowball{
  public static void main(String[] agr){
    System.out.println(Func(22));
  }
  public static int Func(int n){
    int count = 0;
    while (n > 1){
      if (n%2==0){
        n = n/2;
        count ++;
      } else {
        n = 3*n + 1;
        count ++;
      }
    }
    return n+1;
  }
}
