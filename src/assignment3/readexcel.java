package assignment3;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
public class readexcel {
public static WebDriver driver=null;
	@Test
	public  void beforetest() throws Exception
	{
		File src=new File("C:\\Users\\Snehal_Mali\\readexcelrep.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh1= wb.getSheetAt(0);
		System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());
		System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());
		System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());
		System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
		System.out.println(sh1.getRow(2).getCell(0).getStringCellValue());
		System.out.println(sh1.getRow(2).getCell(1).getStringCellValue());
		System.out.println(sh1.getRow(3).getCell(0).getStringCellValue());
		System.out.println(sh1.getRow(3).getCell(1).getStringCellValue());
        wb.close();
	}
	}

