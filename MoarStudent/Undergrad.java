/**
*The UnderGrad class has no new variables. It has a default 
*constructor and a constructor with three parameters: name, array of 
*integers and grade.
*It overrides the computeGrade() method. If the tests average is 
*>=70, grade is “Pass” and “Fail” otherwise.
*/
public class Undergrad extends Student{
	public Undergrad(){
		super();
	}
	public Undergrad(String name, int[] tests, String grade){
		super(name, tests, grade);
	}
	public void computeGrade(){
		if (this.getName()=="")
		//Use String.equals
			this.setGrade("");
		else if (this.getTestAverage() >= 70)
			this.setGrade("Pass");
		else
			this.setGrade("Fail");
	}
}