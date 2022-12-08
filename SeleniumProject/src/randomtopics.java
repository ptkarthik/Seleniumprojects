import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class randomtopics {
	public static void main(String args[])
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\433831\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	
	WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
	username.sendKeys("Admin");
	WebElement pwd=driver.findElement(By.xpath("//input[@name='password']"));
	pwd.sendKeys("admin123");
	
	driver.findElement(By.xpath("//button")).click();
	driver.findElement(By.xpath("//p[contains(text(),'Brown')]")).click();
	WebElement u1=driver.findElement(By.xpath("//ul[@class='oxd-dropdown-menu']/li[1]"));
	Actions a=new Actions(driver);
	
	a.moveToElement(u1);
}
}