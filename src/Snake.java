
public class Snake {
	private String name;
	private int length; // the length of the snake, in feet
	private String favoriteFood;
	
	/**
	 * Creates a new Snake object.
	 * @param name			the name of the snake
	 * @param length		length of the snake
	 * @param favoriteFood	what the snake likes to eat
	 */
	public Snake(String name, int length, String favoriteFood) {
		this.name = name;
		this.length = length;
		this.favoriteFood = favoriteFood;
	}

	
	//TC1 snake is healthy
	public class Healthty

{
	

}

	
	
	public boolean isHealthy() {
		return this.favoriteFood.equals("vegetables");
	}

	
	//TC2 Snake is Unhealthy 
	
	
	public boolean fitsInCage(int cageLength) {
		return this.length < cageLength;
	}
}