package assignement;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class demo7
{
public static WebDriver driver=null;
	@BeforeClass
	public static void beforetest() throws Exception
	{
		String url="https://jqueryui.com/";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Snehal_Mali\\eclipse\\chromedriver_win32\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Test
	public void test() throws Exception
	{
		    driver.manage().window().maximize();
		    driver.findElement(By.xpath("/html/body/div[2]/nav/form/label/span[2]/input"));
	        JavascriptExecutor js= (JavascriptExecutor) driver;
	        js.executeScript("document.getElementsByName('s')[0].value='Droppable'");
	        Thread.sleep(10000);
	  }
     @AfterClass
	 public static void aftertest() throws Exception
	 {
    	//driver.quit();
	 }
}
