import java.util.*;
public class StringProblem{
  public static void main(String[] args){
    System.out.println(catDog("catdogcatcatdogdogcatdog"));
  }

// Method returns the number of spaces in str.
  public static int countSpaces(String str){
    if(str.indexOf(" ")==-1){
      return 0;
    } else {
      return 1 + countSpaces(str.substring(str.indexOf(" ")+1));
    }
  }
//count the number of times b occurs in a.
  public static int countWords(String a, String b){
    if(a.indexOf(b)==-1){
      return 0;
    } else {
      return 1 + countWords(a.substring(a.indexOf(b)+1), b);
    }
  }
//return true if str has the same number of occurences of
// "cat" and "dog".
// Must Use countWords!!
  public static boolean catDog(String str){
    if (countWords(str,"cat")==countWords(str,"dog"))
      return true;
    return false;
  }
}
