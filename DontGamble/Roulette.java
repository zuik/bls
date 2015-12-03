//Name: Duy Nguyen
//Roulette is a game, you spin until one person loses all the money
public class Roulette{
  private int pocket;
  public static int numOfGames=0;
  Gambler player;
  Gambler house;

  public Roulette(){
  }

  // Spin the roulette by
  //generating random number integer from 0-37 inclusive and
  //updating pocket and numOfGames.
  //Param: number of time to spin
  public void spin(Gambler player, Gambler house){
    pocket = (int) (Math.random()*38);
    ((pocket == 0 || pocket == 19)?player:house).winGame();
    ((pocket == 0 || pocket == 19)?house:player).loseGame();
  }
  public Gambler playMatch(Gambler player, Gambler house){
    while(player.balance > 0.0 && house.balance >= 0.0){
      spin(player, house);
    }
    return (player.balance==0.0)?house:player;
  }

  public static void printWelcome(){
    System.out.println("Welcome to BetOnGreen,");
    System.out.print("the game where you can bet on any color as long as ");
    System.out.print("it is green.\n");
  }


  //determine who wins the game
  //prints out name of winner.
  public static void winner(Gambler a, Gambler b){

  }
}
