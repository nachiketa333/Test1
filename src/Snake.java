import org.junit.Before;
import org.junit.Test;

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
	public class SnakeTest {

		

		Snake  snake;

		



		@Before

		public void setUp() throws Exception {

			

			

		//Creating the snakes	

			snake = new Snake("first" , 15, "grass");

			snake = new Snake("second", 20, "vegetables");

			}

	@Test

		public void isHealthy() {

		

		boolean snakeFood = snake.isHealthy();

		

		

			}

		

		



	}
	
	
	public boolean isHealthy() {
		return this.favoriteFood.equals("vegetables");
	}

	
	//TC2 Snake is Unhealthy 
	
	
	public boolean fitsInCage(int cageLength) {
		return this.length < cageLength;
	}
}