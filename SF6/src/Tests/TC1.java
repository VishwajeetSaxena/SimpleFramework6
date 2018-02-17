package Tests;

import org.testng.annotations.Test;

import Base.Base;

public class TC1 extends Base {

	@Test
	public void method1()
	{	page.openPage(driver, "https:///www.google.com");
		page.homepage.test("hi");
		
	}
	
}
