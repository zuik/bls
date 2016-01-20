import java.util.*;
public class testStudent{
	public static void main(String[] agrs){
		Student a = new Student("Lee Lee", new int[]{10,5,10}, "Pass");
		System.out.println(a.getName());
		System.out.printf("%.3f%n", a.getTestAverage());
	}
}