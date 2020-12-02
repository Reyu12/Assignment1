package assignment3;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class googlesignup {
	public static WebDriver driver=null;
	static boolean c,c1,c2,c3,c4,c5,c6,c7;
	static String sample,sample1,sample2,sample3;
	@BeforeMethod
	public static void beforetest() throws Exception
	{
		String url="https://accounts.google.com/signup";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Snehal_Mali\\eclipse\\chromedriver_win32\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	@Test
	public void test() throws Exception
	{
		driver.findElement(By.id("logo")).click();
		c=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/div")).isDisplayed();
		Assert.assertEquals(c, true);
	    System.out.println("Google logo is present");
		
		c1= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[1]/div/h1/span")).isDisplayed();
		Assert.assertEquals(c1, true);
		System.out.println("title is present");
		
	    c2=driver.findElement(By.xpath(".//*[@id='firstName']")).isDisplayed();
		Assert.assertEquals(c2, true);
        System.out.println("Fname TextBox is Present");
        driver.findElement(By.xpath(".//*[@id='firstName']")).sendKeys("snehal");
	
		c3=driver.findElement(By.xpath(".//*[@id='lastName']")).isDisplayed();
		Assert.assertEquals(c3, true);
		System.out.println("Lname TextBox is Present");
		driver.findElement(By.xpath(".//*[@id='lastName']")).sendKeys("M");
		    
		c4=driver.findElement(By.xpath(".//*[@id='username']")).isDisplayed();
		Assert.assertEquals(c4, true);
		System.out.println("Username TextBox is Present");   
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("snehalm414");
		sample=driver.findElement(By.xpath(".//*[@id='username']")).getAttribute("value");
	   if(sample.length()<6)
		 System.out.println("username Should be greater than 6 Cahrs");
		c5= driver.findElement(By.xpath(".//*[@Name='Passwd']")).isDisplayed();
		Assert.assertEquals(c5, true);
		System.out.println("Create a Password Text is presnt"); 
		driver.findElement(By.xpath(".//*[@Name='Passwd']")).sendKeys("vaageswari1219");
		sample1=driver.findElement(By.xpath(".//*[@Name='Passwd']")).getAttribute("value");
		
		c6 = driver.findElement(By.xpath(".//*[@Name='ConfirmPasswd']")).isDisplayed();
		Assert.assertEquals(c6, true);
		System.out.println("confirm a Password Text is presnt"); 
	    driver.findElement(By.xpath(".//*[@Name='ConfirmPasswd']")).sendKeys("vaageswari1219");
		sample2=driver.findElement(By.xpath(".//*[@Name='ConfirmPasswd']")).getAttribute("value");
		//driver.findElement(By.xpath(".//*[@Name='ConfirmPasswd']")).sendKeys(Keys.ENTER);
	    if(sample2.isEmpty() || sample1.isEmpty())
			System.out.println("You can't leave Password field empty ");
		if(sample1.equals(sample2))
			System.out.println("Passwords are matching"); 
		 else
			System.out.println("Passwords doesnt match");
		
		Thread.sleep(10000);
		 driver.findElement(By.xpath(".//*[@id='accountDetailsNext']")).click();
	}		 
    @AfterMethod
	public static void aftertest() throws Exception
	 {
   //	driver.quit();
	 }
}
	 
