import java.util.Random;
/**
 * Game of guessing a secret number.
 * @author Nitith Chayakul
 */
public class GuessingGame {
	private int upperBound;
	private int secret;
	private String hint;
	private int counter;
	
	/**
	 * Initialize a new game.
	 * @param upperBound is the random upper limit.
	 */
	GuessingGame(int upperBound){
		this.upperBound = upperBound;
		
		secret = getRandomNumber(this.upperBound);
		counter = 0;
	}
	/**
	 * Set a upper bound
	 * @param upperBound is the maximum number that will be random
	 */
	private void setUpperBound(int upperBound){
		this.upperBound = upperBound;
	}
	/**
	 * Get a upper bound
	 * @return upper bound is the random upper limit.
	 */
	public int getUpperBound(){
		return upperBound;
	}
	/**
	 * Get a secret
	 * @return a secret number.
	 */
	private int getSecret(){
		return secret;
	}
	/**
	 * Create a random number between 1 and limit.
	 * @param limit is the upper limit for random number.
	 * @return a random number between 1 and limit .
	 */
	private int getRandomNumber(int limit){
		long seed = System.currentTimeMillis();
		Random rand = new Random(seed);
		return rand.nextInt(limit) +1;
	}
	/**
	 * Check the answer
	 * @param number is the number a user guess
	 * @return a boolean that tell us whether or not the answer is correct.
	 */
	public boolean guess(int number){
		counter += 1;
		if(number == secret){
			setHint("Correct. The secret is "+secret+".");
			return true;
		}else{
			if(number < secret){
				setHint("Sorry, your guess is too small.");
			}else if(number > secret){
				setHint("Sorry, your guess is too big.");
			}
			return false;
		}
	}
	/**
	 * Return a hint based on the most recent guess.
	 * @return hint based on most recent guess
	 */
	public String getHint(){
		return hint;
	}
	/**
	 * Set hint to a certain sentence
	 * @param hint is a sentence that you want to set as hint
	 */
	private void setHint(String hint){
		this.hint = hint;
	}
	/**
	 * Return how many guesses user used
	 * @return counter
	 */
	public int getCount(){
		return counter;
	}
}
