import java.util.*;
public class Test{
	private ArrayList<Question> questions;
	private int[] points;
	private int mcPoints = 0;
	private int shortPoints = 0;
	public Test(ArrayList<Question> questions){
		this.questions = questions;
		points = new int[questions.size()];
	}
	public int totalPoints(){
		return Arrays.stream(this.points).sum();
	}
	public void printTest(){
		for(int i=0; i<this.questions.size(); i++)
			System.out.println(i + ". " + this.questions.get(i));
	}
	public void printAnswers(){
		for(int i=0; i<this.questions.size(); i++){
			System.out.print(i+". ");
			this.questions.get(i).printAnswer();
		}	
	}
	public void setPoints(int mcPoints, int shortPoints){
		for(int i=0; i<this.questions.size(); i++){
			if(this.questions.get(i).isMultipleChoice)
				points[i]=mcPoints;
			else
				points[i]=shortPoints;
		}
		this.mcPoints=mcPoints;
		this.shortPoints=shortPoints;
	}
	public boolean addChoice(int questionNumber, String choice){
		if(this.questions.get(questionNumber).isMultipleChoice)
			return this.questions.get(questionNumber).addChoice(choice);
		return false;
	}
	public void scrambleTest(){
		Collections.shuffle(this.questions);
		this.setPoints(this.mcPoints, this.shortPoints);
	}
	public static void main(String[] args){
	//	System.out.println(Arrays.stream(new int[]{1,2,3}).sum());
	}
	
}