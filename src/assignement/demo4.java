package assignement;

import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo4 {
	public static WebDriver driver=null;
	@BeforeClass
	public static void beforetest() throws Exception
	{
		String url="http://www.google.com/webhp?complete=1&hl=en";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Snehal_Mali\\eclipse\\chromedriver_win32\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(url);
	}
	
	@Test
	
	public void test() throws Exception
	
	{
		WebElement query = driver.findElement(By.name("q"));

		query.sendKeys("Selenium");

		// Sleep until the div we want is visible or 5 seconds is over

		long end = System.currentTimeMillis() + 5000;

		while (System.currentTimeMillis() < end) {

		WebElement resultsDiv = driver.findElement(By.className("aajZCb"));

		if (resultsDiv.isDisplayed())
		{

		break;

		}

		}

		List<WebElement> allSuggestions = driver.findElements(By.xpath("/html/body/div/div[3]/form/div[2]/div/div[2]/div[2]/ul"));

		for (WebElement suggestion : allSuggestions) {

		System.out.println(suggestion.getText());
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/form/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div")).click();
         
		}

		}
		 	
    @AfterClass
	 public static void aftertest() throws Exception
	 {
    	driver.quit();
	 }
}
