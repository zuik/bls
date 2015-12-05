//Name: Duy Nguyen
public class Roulette{
	private int pocket;
	public static int numOfGames=0;

	public Roulette(){

	}

	// Spin the roulette by
	//generating random number integer from 0-37 inclusive and
	//updating pocket and numOfGames.
	public int spin(){
		return (int) (Math.random()*38);
	}
	//Play a match until one loses all his money. Return the winner
	public Gambler playMatch(Gambler player, Gambler house){
		while(player.isSolvent() && house.isSolvent()){
			pocket = spin();
			if (pocket == 0 || pocket == 19){
				player.winGame();
				house.loseGame();
			} else {
				house.winGame();
				player.loseGame();
			}
		}
		return winner(player, house);
	}
	public static void printWelcome(){
		System.out.println("Welcome to BetOnGreen,");
		System.out.print("the game where you can bet on any color as long as ");
		System.out.print("it is green.");
	}


	//determine who wins the game
	//prints out name of winner.
	public static Gambler winner(Gambler player, Gambler house){
		if(player.isSolvent()){
			player.reset(50);
			house.reset(50);
			return player;
		} else {
			player.reset(50);
			house.reset(50);
			return house;
		}
	}
}
