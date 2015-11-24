public class Snowball{
  public static void main(String[] agr){
    System.out.println(search(1,100000,0));
  }
  public static int func(int n){
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
    return count+1;
  }
  public static int search(int a, int b, int m){
    int x = func(a);
    if (x>m)
      m = x;
    if (a==b)
      return m;
    else
      return search(a+1,b,m);
  }
}
