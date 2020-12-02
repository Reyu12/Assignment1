package assignment3;

import java.io.File;

import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;




public class takescreenshot {

	public static WebDriver driver=null;
	@BeforeClass
	public static void beforetest() throws Exception
	{
		String url="https://api.jquery.com/dblclick/";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Snehal_Mali\\eclipse\\chromedriver_win32\\chromedriver.exe" );
		driver=new ChromeDriver();
		
		
		driver.get(url);
	}
	
	@Test
	
	public void test() throws Exception
	
	{
		    //driver.manage().window().maximize();
		    TakesScreenshot ts = ((TakesScreenshot)driver);
		    File srcfile = ts.getScreenshotAs(OutputType.FILE);
		    FileHandler.copy(srcfile,new File("C:\\Users\\Snehal_Mali\\eclipse\\Image.jpg"));
		    
	        
    }

		
		 	
    @AfterClass
	 public static void aftertest() throws Exception
	 {
    	driver.quit();
	 
}
}

