package PageObjectModel1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class POMobjects {
	
	@Test
	public void opengoogle()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\433831\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		PageFactory.initElements(driver,NewTest.class);
		NewTest.inputBox.sendKeys("hi");
	}
}
