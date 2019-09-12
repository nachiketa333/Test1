import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlazeDemoTest {
	
	WebDriver driver;



	@before

	public void setUp() throws Exception {

		System.setProperty("webdriver.chrome.driver", "/Users/Nachiketa/Desktop/chromedriver");

		WebDriver driver =  new ChromeDriver();

		

		driver.get("https://blazedemo.com" );



	}

}
