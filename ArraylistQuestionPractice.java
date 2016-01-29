import java.util.*;
public class ArraylistQuestionPractice{
  public static void main(String[] args){
    System.out.println("Hello, enter the word: ");
    ArrayList<String> a = new ArrayList<String>();
    Scanner s = new Scanner(System.in);
    for(int i=0; i<10; i++){
      a.add(s.nextLine());
    }
    System.out.println(a);
  }
}
