public class Prog6{
  public static void main(String[] agr){
    //System.out.println(only14(new int[]{1, 4, 1, 4}));
    //System.out.println(only14(new int[]{1, 4, 2, 4}));
    //System.out.println(only14(new int[]{1, 1}));
    //System.out.println(no14(new int[]{1, 2, 3}));
    //System.out.println(no14(new int[]{1, 2, 3, 4}));
    //System.out.println(no14(new int[]{2, 3, 4}));
    //System.out.println(isEverywhere(new int[]{1, 2, 1, 3}, 1));
    //System.out.println(isEverywhere(new int[]{1, 2, 1, 3}, 2));
    //System.out.println(isEverywhere(new int[]{1, 2, 1, 3, 4}, 1));
    System.out.println(tripleUp(new int[]{1, 4, 5, 6, 2}));
    System.out.println(tripleUp(new int[]{1, 2, 3}));
    System.out.println(tripleUp(new int[]{1, 2, 4}));
  }
  public static boolean only14(int[] a){
    //for (int i = 0; i<a.length; i++)
    //  if (a[i] != 1 && a[i] != 4)
    //    return (false);
    for (int i: a)
      if (i != 1 && i != 4)
        return false;
    return (true);
  }
  public static boolean no14(int[] a){
    boolean no1= true, no4 = true ;
    for (int i = 0; i<a.length; i++){
      if (a[i] == 1)
        no1 = false;
      if (a[i] == 4)
        no4 = false;
    }
    return (no1 || no4);
  }
  public static boolean isEverywhere(int[] a, int x){
    for(int i = 0; i<a.length-1; i++){
      if (a[i] != x && a[i+1] != x)
        return false;
    }
    return true;
  }
  public static boolean tripleUp(int[] a){
    for(int i=0; i < a.length-2; i++){
      if (_triplet(a[i], a[i+1], a[i+2]))
        return true;
    }
    return false;
  }
  public static boolean _triplet(int a, int b, int c){
    return (a==b-1) && (b==c-1);
  }

}
