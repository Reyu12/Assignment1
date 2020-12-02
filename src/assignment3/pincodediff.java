package assignment3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class pincodediff {
	public static WebDriver driver=null;
	@BeforeMethod
	public static void beforetest() throws Exception
	{
		String url="http://chennaiiq.com/chennai/pincode-by-name.php";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Snehal_Mali\\eclipse\\chromedriver_win32\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	@Test
	public void verifyAssertNotEquals()
    {
		WebElement Adambakkam = driver.findElement(By.xpath("//table[contains(@class,'TBox')]/tbody/tr[5]/td[3]"));
	    WebElement Aminijikarai = driver.findElement(By.xpath("//table[contains(@class,'TBox')]/tbody/tr[15]/td[3]"));
	    String Pincode1 = Adambakkam.getText();
		String Pincode2 = Aminijikarai.getText();
		System.out.println("Two Unique pincodes are :  " +Pincode1+Pincode2);
	    Assert.assertNotEquals(Pincode1, Pincode2);
        System.out.println("pincodes are different");	
	}
	 @AfterMethod
		public static void aftertest() throws Exception
		 {
	   driver.quit();
		 }
}
