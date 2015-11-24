//Name: Duy Nguyen
public class Gambler{
  String name;
  double balance;
  boolean isHouse;
  int gameWon = 0;
  int win, tol;

  public Gambler(String name, double balance, boolean isHouse){
    this.name = name;
    this.balance = balance;
    this.isHouse = isHouse;
  }
  public String toString(){
    return this.name;
  }
  //current player wins the game
  //update their balance total
  public void winGame(){
    this.balance += 12.0;
    this.gameWon ++;
    tol ++;
    win ++;
    //System.out.println(this+" won. His current balance is: " + this.balance);
  }

  //current player loses the game
  //update their balance total
  public void loseGame(){
    this.balance -= 1.0;
    tol ++;
    //System.out.println(this+" lost. His current balance is: " + this.balance);
  }
}
