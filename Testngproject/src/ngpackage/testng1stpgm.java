package ngpackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testng1stpgm {

	@Test(priority=1,description="login application")
	public void login()
	{
		System.out.println("login to the application");
		Assert.assertEquals(12,13);
		
	}
	
	@Test(priority=2,description="itemselem")
	public void select()
	{
		System.out.println("select an item");
	}
	
	@Test(priority=3)
	public void checkout()
	{
		
		System.out.println("checkout");
	}
	
}