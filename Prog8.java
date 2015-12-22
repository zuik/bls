import java.util.*;
public class Prog8{
  public static void main(String[] agr){

    int[] a1 = {1, 2, 3, 4, 1, 2, 3, 4, 5};
    int[] a2 = {2, 3, 4};
    zeroOut(a1, a2);
    System.out.println(Arrays.toString(a1));
    System.out.println(Arrays.toString(a2));
    int[] a3 = {5, 5, 5, 18, 5, 42, 5, 5, 5, 5};
    int[] a4 = {5, 5};
    zeroOut(a3, a4);
    System.out.println(Arrays.toString(a3));
    System.out.println(Arrays.toString(a4));
    //int[] a = {17, 42, 3, 5, 5, 5, 8, 2, 4, 6, 1, 19};
    //System.out.println(longestSortedSequence(a));
    //int[] a1 = {1, 6, 2, 7, 3, 6, 4};
    //sweep(a1);
    //System.out.println(Arrays.toString(a1));
  }
  public static void zeroOut(int[] a, int[] b){
    boolean stuff = false;
    int index = 0;
    for(int j = 0; j<a.length-b.length; j++){
      //System.out.println(j);
      for(int i = j; i < b.length+j; i++){
        for (int k :b){
          if(a[i+index]!=k){
            stuff = true;
          }
          index ++;
        }
        index = 0;
        stuff = false;
        //System.out.println("\n");
        if(a[i]==b[i-j] && !stuff)
          a[i]=0;
      }
      //System.out.print("\n");
    }
  }
  public static int longestSortedSequence(int[] a){
    Arrays.sort(a);
    System.out.println(Arrays.toString(a));
    int[] count = new int[a.length];
    int index = 0;
    for(int i=1; i<a.length; i++){
      if(a[i] > a[i-1]){
        count[index]++;
      } else {
        index++;
      }
    }
    System.out.println(Arrays.toString(count));
    Arrays.sort(count);
    return count[count.length-1];
  }
  public static boolean sweep(int[] a){
    int temp = 0;
    boolean changed = false;
    for(int i = 1; i<a.length; i++){
      if(a[i]<a[i-1]){
        temp = a[i-1];
        a[i-1] = a[i];
        a[i] = temp;
        System.out.println(i);
        changed= true;
      }
    }
    return changed;
  }
}
