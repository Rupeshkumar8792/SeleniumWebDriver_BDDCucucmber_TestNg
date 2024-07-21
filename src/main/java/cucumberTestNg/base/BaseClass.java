package cucumberTestNg.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumberTestNg.utility.Util;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	/*ThreadLocal is a class in Java that provides thread-local variables. In the context of Selenium automation, 
	 * ThreadLocal can be used to create isolated instances of WebDriver for each thread,
	 *  ensuring that test cases run independent of each other.*/
	public static ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();
	
	public static WebDriver driver = null;
	
	public final static int TIMEOUT = 40;
	
	
	public static void launchBrowser()
	{
		if (Util.readProperties("browser").equalsIgnoreCase("chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TIMEOUT));
			
			webDriver.set(driver);
		}
		
	}
	
	public static void openApplication(String url) 
	{
		webDriver.get().get(url);

	}
	
	public static void tearDown()
	{
		webDriver.get().close();
		webDriver.get().quit();
	}
	
}
