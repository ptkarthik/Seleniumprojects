package seleniumrough;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpage {
	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\433831\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://onecognizant.cognizant.com");
		Thread.sleep(60000);
		driver.findElement(By.xpath("//input[@id='oneC_searchAutoComplete']")).sendKeys("timesheet");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='oneC_searchbar']/div"));
		driver.quit();
		
		
		

	}

}
