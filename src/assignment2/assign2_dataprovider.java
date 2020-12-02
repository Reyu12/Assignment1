package assignment2;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class assign2_dataprovider {
  @Test(dataProvider="credentials")
	public void test(String username,String password)
	{
		System.out.println(username);
		System.out.println(password);
	}
   @DataProvider(name="credentials")
	  public Object[][] getdata()
	  {
		 Object[][] data=new Object[3][2];
		 data[0][0] = "donehere";
		 data[0][1] = "don@123";
		 
		 data[1][0] = "donehere1";
		 data[1][1] = "don@123";
		 
		 data[2][0] = "donehere2";
		 data[2][1] = "don@123";
		return data;
	   }
   }
