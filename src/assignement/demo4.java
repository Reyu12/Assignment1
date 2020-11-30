package assignement;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo4 {
	
	@Test
	 public void scrollDown()
	         {
	          System.setProperty("webdriver.chrome.driver","C:\\Users\\Snehal_Mali\\eclipse\\chromedriver_win32\\chromedriver.exe");
	            WebDriver driver = new ChromeDriver();
	            driver.navigate().to("http://openclinic.sourceforge.net/openclinic/home/index.php");

	            //to perform Scroll on application using Selenium
	            JavascriptExecutor js = (JavascriptExecutor) driver;
	            js.executeScript("window.scrollBy(0,350)", "");

}
}