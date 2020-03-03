

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgPriority 
{
	/*
	 * Notes
	 * When we have to priorities some thing then we use priority()
	 * priority() can accept final value variable,0,+ve integer and -ve integer 
	 * */
	@Test//(priority = 2)
	public void test_A()
	{
		Reporter.log("Delete User", true);
	}
	
	@Test//(priority = 1)
	public void test_B()
	{
		Reporter.log("Edit User", true);
	}
	
	//final int a=0;
	@Test//(priority = a )
	public void test_C()
	{
		Reporter.log("Create User", true);
	}
}
