package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Utils.SelUtil;

public class Page {
	public Homepage homepage;
	public SelUtil sel = new SelUtil();
	
	public Page(WebDriver driver) {
		
		homepage = PageFactory.initElements(driver, Homepage.class);
		
	}
	
	public void openPage(WebDriver  driver, String url)
	{
		sel.openUrl(driver, url);
	}
}
