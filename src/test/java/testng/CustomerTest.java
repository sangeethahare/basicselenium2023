package testng;

import org.testng.annotations.Test;

public class CustomerTest {
	@Test(priority=0)//default priority value =0
	public void createCustomer()
	{
		System.out.println("customer is created");
	}
	@Test(priority=1)
	public void modifyCustomer()
	{
		System.out.println("customer modified");
	}
	@Test(priority=2)
	public void deleteCustomer()
	{
		System.out.println("customer deleted");
	}
	

}
