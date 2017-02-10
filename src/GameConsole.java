import java.util.Scanner;

/**
 * The ui class of the game.
 * @author Nitith Chayakul
 *
 */
public class GameConsole {
	
	/**
	 * The play method plays a game using input from a user.
	 * @param game is a GuessingGame object
	 * @return The solution(the guessed secret)
	 */
	public int play(GuessingGame game) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Guessing Game");
		System.out.printf("I'm thinking of number between 1 to %d\n",game.getUpperBound());
		
		int ans = 0;
		boolean isCorrect=false;
		do {
			System.out.print("\nYour guess? ");
			ans = scan.nextInt();
			
			isCorrect = game.guess(ans);
			System.out.print( game.getHint() );
		} while (isCorrect==false);
		return ans;
	}
}
