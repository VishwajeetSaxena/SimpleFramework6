package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelUtil {

	
	public void type(WebElement test, String text) {
		test.sendKeys(text);
	}
	
	public void openUrl(WebDriver driver, String url)
	{
		driver.get(url);
	}

	
}
