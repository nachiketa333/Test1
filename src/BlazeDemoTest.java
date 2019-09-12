import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlazeDemoTest {
	
	WebDriver driver;



	@Before

	public void setUp() throws Exception {

		System.setProperty("webdriver.chrome.driver", "/Users/Nachiketa/Desktop/chromedriver");

		WebDriver driver =  new ChromeDriver();

		

		driver.get("https://blazedemo.com" );



	}
	
	@After

	public void tearDown() throws Exception {

		Thread.sleep(5000);

	//	driver.close();

		}



	@Test

	public void testCase1() {

		List<WebElement> departureCitites = driver.findElements(

				By.);

		System.out.println("Number of cities: " + departureCitites.size());



		

		

	}

}
