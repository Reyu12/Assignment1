package assignement;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class demo5 {
	public static WebDriver driver=null;
	@BeforeClass
	public static void beforetest() throws Exception
	{String url="https://jqueryui.com/";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Snehal_Mali\\eclipse\\chromedriver_win32\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);}
	@Test
	public void test() throws Exception
	{JavascriptExecutor js = (JavascriptExecutor) driver;	
     js.executeScript("window.scrollBy(0,1000)");
     Thread.sleep(3000);
    }
    @AfterClass
	 public static void aftertest() throws Exception
	 {
    	//driver.quit();
	 }
}
