import java.util.*;
/**
*The Student class has a private string name, private integer array
*tests, and private string grade. It also has a public final static
*integer NUM_TESTS=3. It has two constructors: 1) A default
*constructor that initializes name and grade to the empty string and
*create a new array for tests of length NUM_TESTS=3. 2) A 
*constructor with three parameters for name, array of integers and grade.*
*
*Student has getName(), getGrade(), setGrade(String 
*newGrade), getTestAverage() and computeGrade() 
*PUBLIC methods. The getTestAverage() returns the average of 
*the tests. The computeGrade() method set grade to “” if name=
*“” and to “Pass” if test average is >=65 and “fail” otherwise.
* @author Duy Nguyen
* @version 1.0
* @since 2016-01-07
*/
public class Student {
	private String name, grade;
	private int[] tests;
	public final static int NUM_TESTS=3;
	public Student(){
		this.name = "";
		this.grade = "";
		this.tests = new int[NUM_TESTS];
	}
	public Student(String name, int[] tests, String grade){
		this.name = name;
		this.tests = tests;
		this.grade = grade;
	}
	public String getName(){
		return this.name;
	}
	public String getGrade(){
		return this.grade;
	}
	public void setGrade(String newGrade){
		this.grade = newGrade;
	}
	public double getTestAverage(){
		//Integer x = this.tests.stream().sum();
		return Arrays.stream(this.tests).sum()/((double) NUM_TESTS);
	}
	public void computeGrade(){
		if (this.name=="")
			this.grade="";
		else if (this.getTestAverage() >= 65)
			this.grade="Pass";
		else
			this.grade="Fail";
	}
}