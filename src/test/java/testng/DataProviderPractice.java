package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//want to run multiple data ,we use dataProvider
public class DataProviderPractice {
	@Test(dataProvider="getData")
	public void dataProviderDemo(String name,int price)
	{
		System.out.println("phone="+name+" price="+price);
	}
@DataProvider
public Object[][] getData()
{
	Object[][] data=new Object[3][2];
	//1st set data
	data[0][0]="iphone";
	data[0][1]=25000;
	//2nd set data
	data[1][0]="samsung";
	data[1][1]=20000;
	//3rd set data
	data[2][0]="vivo";
	data[2][1]=18000;
	return data;
	
			}
}
