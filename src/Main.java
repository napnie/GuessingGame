/**
 * 
 * @author Nitith Chayakul
 *
 */
public class Main {
	/** create object and start the game */
	public static void main(String [] args){
		GuessingGame game = new GuessingGame(12);
		GameConsole ui = new GameConsole();
		ui.play(game);
	}
}
