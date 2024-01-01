package testngdiscussion;

import org.testng.annotations.Test;

public class GroupingOfTestCase2 {
	
	@Test(groups = {"sanity"})
	public void titleValidation()
	{
		System.out.println("Title testcase");
	}
	
	@Test(groups = {"functional"})
	public void urlValidation()
	{
		System.out.println("url validation test case");
	}
	
	

}
