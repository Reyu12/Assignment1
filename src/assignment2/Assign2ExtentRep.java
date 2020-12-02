package assignment2;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class Assign2ExtentRep {
    static ExtentTest test;
	static ExtentReports report;
	@BeforeClass
	public static void startTest()
	{
	report = new ExtentReports("./ExtentReport//"+"ExtentReportResults.html");
	test = report.startTest("ExtentDemo");
	}
	@Test
	public void extentReportsDemo()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Snehal_Mali\\eclipse\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in");
	if(driver.getTitle().equals("Google"))
	test.log(LogStatus.PASS, "Navigated to the specified URL");
	else
	test.log(LogStatus.FAIL, "Test Failed");
	}
	@AfterClass
	public static void endTest()
	{
	report.endTest(test);
	report.flush();
	}}
