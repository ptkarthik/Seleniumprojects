package TestNGProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class SecondTestNGProj {

	@Test
@Parameters("Data")
	  public void f(String f) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\433831\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.yahoo.com");
			driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@id='sbq-wrap']/input[1]")).sendKeys(f);
		String text=driver.findElement(By.xpath("//div[@id='sbq-wrap']/input[1]")).getText();
	
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='sbq-wrap']/div[1]/div[1]/div[1]/ul/li/span[contains(text(),'subbaraj')]")).click();

		  System.out.println("The Text is"+text);
			driver.quit();
	  }
}
