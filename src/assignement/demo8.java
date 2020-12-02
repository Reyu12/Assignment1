package assignement;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class demo8 {
	public static WebDriver driver;
	String url="";
	String url1="";
	@BeforeClass
	public void beforetest() throws InterruptedException 
	{System.setProperty("webdriver.chrome.driver","C:\\Users\\Snehal_Mali\\eclipse\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		url= "http://www.zlti.com";
		driver.get(url);
		List<WebElement> links = driver.findElements(By.tagName("a"));	
	    System.out.println("Total links are "+links.size());	
	    for(int i=0; i<links.size(); i++) {
		WebElement element = links.get(i);
		url1=element.getAttribute("href");}}
		@Test
        public void test () throws IOException 
		{URL link = new URL(url1);
			HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
			httpConn.setConnectTimeout(2000);
		    httpConn.connect();
		    if(httpConn.getResponseCode()== 200) 
					System.out.println(url1+" - "+httpConn.getResponseMessage());
			if(httpConn.getResponseCode()== 404) 
					System.out.println(url1+" - "+httpConn.getResponseMessage());
		}
}