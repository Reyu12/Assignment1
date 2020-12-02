package assignement;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class demo2 {
    public static WebDriver driver=null;
	@BeforeClass
	public static void beforetest() throws Exception
	{	String url="https://jqueryui.com/droppable/";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Snehal_Mali\\eclipse\\chromedriver_win32\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Thread.sleep(3000);}
	@Test
	public void test() throws Exception
	{   WebElement fromele = driver.findElement(By.xpath("/html/body/div[1]"));
		System.out.println(fromele);
        WebElement toele = driver.findElement(By.xpath("/html/body/div[2]"));
        System.out.println(toele);
        Actions action=new Actions(driver);
        Thread.sleep(3000);
        action.dragAndDrop(fromele, toele).build().perform();
        String afterDragging = driver.findElement(By.xpath("/html/body/div[2]")).getText();
        Thread.sleep(3000);
       if(afterDragging.equals("Dropped!"))
			System.out.println("Drag successful.");}
     @AfterClass
	 public static void aftertest() throws Exception
	 {//driver.close();
	  //driver.quit(); 
    	 }
}
