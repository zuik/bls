/**
*The GradStudent has an additional private integer variable gradID.
*It has a default constructor that called super() and set gradID to 
*0. It also has a constructor with three parameters: name, array of 
*integers and grade. 
*GradStudent has a getID() method and overrides
*computeGrade(). It computes the grade in the same way as the
*Student class but set grade to “Pass with distinction” if the test 
*average is >=90.
*/
public class GradStudent extends Student{
	private int gradID = 0;
	public GradStudent(){
		super();
	}
	public GradStudent(String name, int[] tests, String grade, int id){
		super(name, tests, grade);
		gradID=id; //Must set gradID, can't left to default
	} 
	public int getID(){
		return this.gradID;
	}
	public void computeGrade(){
		super.computeGrade();
		if(this.getTestAverage()>=90)
			this.setGrade("Pass with distinction");
	}
}