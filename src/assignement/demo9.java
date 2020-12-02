package assignement;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class demo9 {
	public static WebDriver driver=null;
	@BeforeClass
	public static void beforetest() throws Exception
	{System.setProperty("webdriver.chrome.driver","C:\\Users\\Snehal_Mali\\eclipse\\chromedriver_win32\\chromedriver.exe" );
		driver=new ChromeDriver();}
	@Test
  public  void Test() 
	{
		File file = new File("C:\\Users\\Snehal_Mali\\eclipse-workspace\\assignement\\Config.properties");
	  FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();}
		Properties prop = new Properties();
	  try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();} 
		driver.get(prop.getProperty("URL"));
		driver.close();
		System.out.println("URL ::" + prop.getProperty("URL"));
    }
}