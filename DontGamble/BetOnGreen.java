//Name: Duy Nguyen
/* The Roulette wheel has 38 pockets numbered 0-37.
 * 0 and 19 Green.
 * 1-18 Red
 * 20-37 Black
 * Simulate one match between a player and the house.
 * Player will always bet $1 on Green.
 * Player wins $12 if ball lands on Green.
 * This 12 dollar came from the host, and host won $1 if we lost
 * Player loses $1 if ball lands on either Red or Black.
 * Both the house and the player starts out with $50.
 * Match ends when the player or the house lost all of his money.
 * You MUST USE BetOnGreen, Gambler, Roulette Java files.
 * You can add to the code but can not remove any code.
 *
 * MODIFY: Once the game works. Simulate 100 matches and count the number
 * of times the player wins.
 */


public class BetOnGreen{
  public static void main(String[] args){
    double total = 0;
    double win = 0;
    Gambler player=new Gambler("Mike",50,false);
    Gambler house=new Gambler("Foxwoods",50,true);
    Roulette g = new Roulette();
    int matchWin = 0;
    //print welcoming screen from Roulette class.
    Roulette.printWelcome();

    //play the match
    for(int i =0; i<100; i++){
      g.playMatch(player, house);
      System.out.println("Winner of match "+(i+1)+" is: " + g.playMatch(player, house));
      matchWin++;
      //System.out.println(" After match "+(i+1)+", player record is: Win - "+player.win +
      //" Lost - " + (player.tol-player.win));
      total += player.tol;
      win += player.win;
      //Reset the players profile
      player=new Gambler("Mike",50,false);
      house=new Gambler("Foxwoods",50,true);
    }
    System.out.println("So in the end, the player win "+String.valueOf(win/total*100.0).substring(0,4)+"% of " +total +" games. That's why you don't gamble!");
    System.out.println("Match wined: "+ matchWin)
    //prints out the name of the winner of the match
    //and the number of games. Must call winner method.


  }
}
