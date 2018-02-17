package Base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Pages.Page;
import Utils.LocalDriverManager;

public class Base {
	public WebDriver driver;
	public Page page;
	
	@BeforeSuite
	public void initDriver(){
		this.driver  =  LocalDriverManager.getDriver();
		
		page = new Page(this.driver);
	}

	
	
	@AfterSuite
	void quitDriver() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
}
