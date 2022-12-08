import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumConceptsinOne {
	public static void main(String args[]) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\433831\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.spicejet.com/");
		Thread.sleep(5000);
		Robot r =new Robot();
		//below to close the notifications alert
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/div[1]/div[2]/input")).sendKeys("Chennai");
		
		driver.close();
		WebDriver driver1 = new ChromeDriver();

		driver1.get("https://opensource-demo.orangehrmlive.com/");

		
		
	}
}
