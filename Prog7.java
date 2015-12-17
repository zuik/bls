import java.util.*;
public class Prog7{
  public static void main(String[] agr){
    //int[] a={6, 2, 5, 3};
    //int[] b={1, 2};
    //int[] c={1};
    //shiftLeft(a);
    //shiftLeft(b);
    //shiftLeft(c);
    //System.out.println(Arrays.toString(a));
    //System.out.println(Arrays.toString(b));
    //System.out.println(Arrays.toString(c));
    //int[] c = {6, 2, 5, -4, 3};
    //shiftLeftAtI(c, 2);
    //System.out.println(Arrays.toString(c));
    //int[] a={-3, 0, 7, -19, 0, 2};
    //zeroFront(a);
    //System.out.println(Arrays.toString(a));
    //int[] a={-3, 10, 7, 10, 10, 2};
    //withoutTen(a);
    //System.out.println(Arrays.toString(a));
  }
  public static void shiftLeft(int[] a){
    int[] ret = new int[a.length];
    for(int i = 0; i < a.length-1; i++){
      ret[i] = a[i+1];
    }
    ret[a.length-1]=a[0];
    //System.out.println(Arrays.toString(ret));
    becauseWeHaveToMODIFYTheSameStuffOMG(a, ret);
  }
  public static void becauseWeHaveToMODIFYTheSameStuffOMG(int[] x, int[] y){
    for(int i = 0; i<x.length; i++){
      x[i]=y[i];
    }
  }
  public static void shiftLeftAtI(int[] a, int b){
    int[] ret = new int[a.length];
    for(int i = 0; i < b; i++){
      ret[i] = a[i];
    }
    for(int i = b; i < a.length-1; i++){
      ret[i] = a[i+1];
    }
    //ret[a.length-1]=a[0];
    //System.out.println(Arrays.toString(ret));
    becauseWeHaveToMODIFYTheSameStuffOMG(a, ret);
  }
  public static void withoutTen(int[] a){
    for(int i = 0; i<a.length; i++){
      if(a[i]==10){
        shiftLeftAtI(a, i);
        i--;
      }
    }

  }
  public static void zeroFront(int[] a){
    Arrays.sort(a);
    System.out.println(Arrays.binarySearch(a, 0));
    int d = Arrays.binarySearch(a, 0);
    for(int i=0; i<d; i++)
      shiftLeft(a);
  }
}
