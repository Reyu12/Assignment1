package assignement;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo6 {

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
		   System.out.println(driver.manage().window().getSize());
	        //Create object of Dimensions class
	        Dimension d = new Dimension(480,620);
	        //Resize the current window to the given dimension
	        driver.manage().window().setSize(d);
	        System.out.println(driver.manage().window().getSize());
	        
	        driver.findElement(By.xpath("/html/body/div[2]/nav/form/label/span[2]/input"));
	        JavascriptExecutor js= (JavascriptExecutor) driver;
	  
	        js.executeScript("document.getElementsByName('s')[0].value='Droppable'");
	        Thread.sleep(3000);
	        
    }

		
		 	
    @AfterClass
	 public static void aftertest() throws Exception
	 {
    	driver.quit();
	 
}
}
