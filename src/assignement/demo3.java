package assignement;
import java.util.Iterator;
import java.util.Set;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class demo3 {
	public static WebDriver driver=null;
	@BeforeClass
	public static void beforetest() throws Exception
	{
		String url="http://popuptest.com/goodpopups.html";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Snehal_Mali\\eclipse\\chromedriver_win32\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	@Test
	public void test() throws Exception
	{
	  driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[1]")).click();
      Thread.sleep(10000);
      String parent = driver.getWindowHandle();
      Set<String> pops=driver.getWindowHandles();
       {
        Iterator<String> it =pops.iterator();
        while (it.hasNext()) 
        {
          String popupHandle=it.next().toString();
            if(!popupHandle.contains(parent))
            {
            driver.switchTo().window(popupHandle);
            System.out.println("Popu Up Title: "+ driver.switchTo().window(popupHandle).getTitle());
            driver.close();
            Thread.sleep(3000);
            }
            driver.switchTo().window(parent);
        }
        }
     driver.findElement(By.linkText("Good PopUp #2")).click();
     Set<String> windowhandles =driver.getWindowHandles();
     for (String handle : windowhandles)
     {
    	 driver.switchTo().window(handle);
    	 String url = driver.getCurrentUrl();
    	 System.out.println(url);
    	 if(url.equals("http://www.popuptest.com/popup2.html"))
    	 break;
     }
     String title=driver.getTitle();
     System.out.println("the title of page:"+title);
     Thread.sleep(3000);
           
           }
	@AfterClass
	 public static void aftertest() throws Exception
	 {
	
		//driver.quit();
	 }

}
