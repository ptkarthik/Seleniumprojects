package WaitConceptsLearn;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ExplicitWaitlearn {
	
	public static void main(String args[])
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\433831\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		/*i didnt add any implicit wait so the exception threw like no such Element found so now, 
		i ill keep like once the driver is getting the url, it has wait for until the username is clickable or interactable*/
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='username']")));
		
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		   driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		   driver.findElement(By.xpath("//button[@type='submit']")).click();
		   WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
			
			wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='oxd-main-menu-item active']/span")));
		   String a= driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']/span")).getText();
		   System.out.println(a);
		   if(a.equals("Dashboard"))
		   {
			   System.out.println("Pass");
		   }
		   
		   else
		   {
			   System.out.println("Fail");
		   }
		   driver.quit();
	}
}
