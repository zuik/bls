import java.util.*;
public class Question{
	private String question;
	boolean isMultipleChoice;
	private String correctAnswer;
	private ArrayList<String> choices=new ArrayList<String>();
	public static final String[] LETTERS = {
		"A.", "B.", "C.", "D.", "E."
	};

	public Question(
		String question, 
		boolean choice, 
		String correctAnswer){
		this.question = question;
		this.isMultipleChoice=choice;
		this.correctAnswer=correctAnswer;
	}
	public boolean addChoice(String choice){
		if (isMultipleChoice && this.choices.size()<=5){
			this.choices.add(choice);
			return true;
		}
		return false;
	}
	public boolean addChoice(int index, String choice){
		if (isMultipleChoice && this.choices.size()<=5){
			this.choices.add(index, choice);
			return true;
		}
		return false;
	}
	public String toString(){
		if (isMultipleChoice){
			String buildString = "";
			for(int i=0; i<this.choices.size(); i++){
				buildString += LETTERS[i] + " " + this.choices.get(i);
				buildString += "\n";
			}
			return this.question + "\n" + buildString;
		}
		return this.question + "\n";
	}
	public void printAnswer(){
		System.out.println(correctAnswer);
	}
	public static void main(String[] args){
		Question a = new Question("Hello?", true, "A");
		a.addChoice("New");
		a.addChoice("New 2");
		a.addChoice("New 2");
		a.addChoice("New 2");
		a.addChoice("New 2");
		System.out.println(a);
	}
}