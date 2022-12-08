package TestNGProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTestNGProject {
  @Test(priority=1,groups= {"google"})
  public void f() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\433831\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.quit();

	  
  }
  @Test(priority=0,groups= {"facebook"})
  public void gh() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\433831\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.quit();

	  
  }
}
