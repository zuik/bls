import java.util.Arrays;
public class Season{
  public static void main(String[] args){
    System.out.println(returnSeason(5,5, new int[]{12,1,2,3}, new String[]{"Winter","Spring","Summer","Autumn"}, 0, 0, 3));
  }
  public static String returnSeason(int month, int day, int[] monthArray, String[] seasons, int seasonCode, int start, int end){
    String[] season = {"Winter","Spring","Summer","Autumn"};
    int[] monthsArray = {12,1,2,3,4,5,6,7,8,9,10,11};
    if (month == monthArray[1] || month == monthArray[2] || month == monthArray[0] || month == monthArray[3]){
      if ((month == monthArray[0] && day >= 16) || (month == monthArray[3] && day <= 15)){
          return seasons[seasonCode];
        }
        return seasons[seasonCode];
    } else {
      int[] nextMonthArray = Arrays.copyOfRange(monthsArray, start +3, end+3);
      return returnSeason(month, day,nextMonthArray ,seasons, seasonCode+1, start+3, end+3);
    }
  }
}
