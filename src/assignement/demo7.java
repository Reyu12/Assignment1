package assignement;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo7 {
	
	public static WebDriver driver=null;
	 
	@Test
	public  void Test() throws Exception
	{
		String homepage ="http://www.zlti.com";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Snehal_Mali\\eclipse\\chromedriver_win32\\chromedriver.exe" );
		driver=new ChromeDriver();
		String url = "";
	     HttpURLConnection huc = null;
	    int respCode = 200;
        
        driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get(homepage);
		
		
		driver.get(url);
	
        List<WebElement> links = driver.findElements(By.tagName("a"));
          
          Iterator<WebElement> it = links.iterator();
          
          while(it.hasNext()){
              
              url = it.next().getAttribute("href");
              
              System.out.println(url);
          
              if(url == null || url.isEmpty()){
  System.out.println("URL is either not configured for anchor tag or it is empty");
                  continue;
              }
              
              if(!url.startsWith(homepage)){
                  System.out.println("URL belongs to another domain, skipping it.");
                  continue;
              }
              
              try {
                  huc = (HttpURLConnection)(new URL(url).openConnection());
                  
                  huc.setRequestMethod("HEAD");
                  
                  huc.connect();
                  
                  respCode = huc.getResponseCode();
                  
                  if(respCode >= 400)
                  {
                      System.out.println(url+" is a broken link");
                  }
                  else
                  {
                      System.out.println(url+" is a valid link");
                  }
                      
              } catch (MalformedURLException e)
              {
                  // TODO Auto-generated catch block
                  e.printStackTrace();
              } catch (IOException e) {
                  // TODO Auto-generated catch block
                  e.printStackTrace();
              }
  	        
      }
        
       
        
        driver.quit();

    }
}