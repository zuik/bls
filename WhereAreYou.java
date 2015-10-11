import java.util.*;
public class WhereAreYou{
  public static void main(String[] agr){
    parseAddress("123 Adam St Dorchester MA 02122");
  }
  public static void parseAddress(String addr){
    ArrayList<String> addrReturn= new ArrayList<String>();
    for(int i=0; i<6; i++){
      if(addr.indexOf(" ")!= -1){
        addrReturn.add(addr.substring(0, addr.indexOf(" ")));
        addr = addr.substring(addr.indexOf(" ")+1);
      } else {
        addrReturn.add(addr);
      }
    }
    System.out.println("You are living at number: " + addrReturn.get(0));
    System.out.println("and on the street of: " + addrReturn.get(1) + " " + addrReturn.get(2));
    System.out.println("of the city/town: " + addrReturn.get(3));
    System.out.println("state: " + addrReturn.get(4));
    System.out.println("zip-code: " + addrReturn.get(5));
  }
}
