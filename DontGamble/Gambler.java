//Name: Duy Nguyen
public class Gambler{
	String name;
	private double balance;
	boolean isHouse;
	int numGameWon;
	int numGameLost;

	public Gambler(String name, double balance, boolean isHouse){
		this.name = name;
		this.balance = balance;
		this.isHouse = isHouse;
	}
	public String toString() {
		return this.name;
	}
	//current player wins the game
	//update their balance total
	public void winGame(){
		if (this.isHouse)
			this.balance += 1.0;
		else
			this.balance += 12.0;
		this.numGameWon+=1;
		//System.out.print("\n");
		//System.out.printf("\n%s won this game. His balance: %f. Win/lost: %d/%d",this,this.balance,this.numGameWon,this.numGameLost);
	}
	//current player loses the game
	//update their balance total
	public void loseGame(){
		if (this.isHouse)
			this.balance -= 12.0;
		else
			this.balance -= 1;
		this.numGameLost+=1;
		//System.out.print("\n");
		//System.out.printf("\n%s lost this game. His balance: %f. Win/lost: %d/%d",this,this.balance,this.numGameWon,this.numGameLost);
	}
	public boolean isSolvent(){
		return (this.balance >= 0);
	}
	public void reset(double balance){
		this.balance = balance;
	}
}
