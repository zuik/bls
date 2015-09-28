public class Practice
{
  public static void main (String[] args)
  {
    printMultiples(1,100);
  }
  public static void printMultiples(int x, int y)
  {
    for (int i=1; i <= 100; i++)
  {
      if (i%4==0) {
        System.out.print("yes");
      } else{
        System.out.print(i +" ");
      }
    }
  }
}
