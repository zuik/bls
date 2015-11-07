public class Palindrome{
  public static void main(String[] agr){
    //System.out.println(isPalindromic("A man, a plan, a canal, Panama!"));
    //System.out.println(removeSpace("ha ha ha ha asdfhsadfas asdhf "));
    //System.out.println(reverseStr("A man, a plan, a canal, Panama!"));
    //System.out.println(removePuncRec("A man, a plan, a canal, Panama!",""));
    //isPalindrome("123456789");
  }
  public static String removeSpace(String x){
    return (x.indexOf(" ")==-1)?
        x:
        (x.substring(0, x.indexOf(" "))+removeSpace(x.substring(x.indexOf(" ")+1)));
  }
  public static String removePunc(String x){
    String result = "";
    for(int i=0; i<x.length(); i++){
      if ("abcdefghijklmnopqrstuvwxynz".indexOf(x.substring(i,i+1).toLowerCase())!= -1)
        result += x.substring(i,i+1).toLowerCase();
    }
    return result;
  }
  public static String removePuncRec(String x, String y){
    return (x.length()==0)?
      y:
      ("abcdefghijklmnopqrstuvwxynz".indexOf(x.substring(0,1).toLowerCase())!= -1)?
        removePuncRec(x.substring(1),y+x.substring(0,1).toLowerCase()):
        removePuncRec(x.substring(1),y);
  }
  public static String reverseStr(String x){
    return (x.length()==0)?
              "":
              x.substring(x.length()-1)+reverseStr(x.substring(0,x.length()-1));
  }
  public static boolean isPalindrome(String x){
    return removeSpace(removePunc(x)).equals(reverseStr(removeSpace(removePunc(x))));
  }
  public static boolean isPalindromic(String x){
    return (x.length()<2)?
              true:
              (x.substring(0,1).equals(x.substring(x.length()-1)))?
                isPalindromic(x.substring(1,x.length()-1)):
                false;
  }
}
