package assignement;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo8 {
	 
		public static WebDriver driver=null;
		static boolean c,c1,c2,c3,c4,c5,c6;
		static String sample,sample1;
		@BeforeClass
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
			if(c==true)
				System.out.println("Google logo is present");
			
			c1= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[1]/div/h1/span")).isDisplayed();
			
			if(c1==true)
				System.out.println("title is present");
			
			c2=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div[1]/div/div[1]/div/div[1]/input")).isDisplayed();
			  
			if(c2==true)
			System.out.println("Fname TextBox is Present");
			  
			//WebElement fname=
			  
			driver.findElement(By.xpath(".//*[@id='firstName']")).sendKeys("abc");
			//fname.sendKeys("james");  
			  
			c3=driver.findElement(By.xpath(".//*[@id='lastName']")).isDisplayed();
			   
			if(c3==true)
			System.out.println("Lname TextBox is Present");
			  
			driver.findElement(By.xpath(".//*[@id='lastName']")).sendKeys("pqr");
			    
			c4=driver.findElement(By.xpath(".//*[@id='username']")).isDisplayed();
			    
			if(c4==true)
			System.out.println("Username TextBox is Present");   
			
			driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("abc123pqr");
			sample=driver.findElement(By.xpath(".//*[@id='username']")).getAttribute("value");
			
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(Keys.ENTER);
			  
			if(sample.length()<6)
			
			{
			 System.out.println("username Should be greater than 6 Cahrs");
			}
			
			c5= driver.findElement(By.xpath(".//*[@Name='Passwd']")).isDisplayed();
			   
			if(c5==true)
			System.out.println("Create a Password Text is presnt"); 
			  
			driver.findElement(By.xpath(".//*[@Name='Passwd']")).sendKeys("vaageswari1219");
			  
			sample1=driver.findElement(By.xpath(".//*[@Name='Passwd']")).getAttribute("value");
			  
		}
		 
		
}