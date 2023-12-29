package testngdiscussion;

import org.testng.annotations.Test;

public class InvocationCountKeyword {

	@Test(invocationCount = 3)
	public void testCase1()
	{
		System.out.println("Testcase 1 is executing");
	}
	
	@Test
	public void testCase2()
	{
		System.out.println("Testcase 2 is executing");
	}
}
