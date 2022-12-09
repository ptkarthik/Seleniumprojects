package SeleniumConceptsLearn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/dashboard.xhtml");
		
		Actions action = new Actions(driver);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='layout-menu']/li[2]"))).click();
		
		driver.findElement(By.xpath("//ul[@class='layout-menu']/li[2]//ul/li[1]/a")).click();
		
		String Alertvalue=driver.getTitle();
if(Alertvalue.equalsIgnoreCase("alert"))
{
	System.out.println("Alert Page is displayed");
}

else
{
	System.out.println("Alert Page is not displayed");
}
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='grid overlay-demo']//div[1]//div[@class='card'][1]/button/span[@class='ui-button-text ui-c']")).click();
driver.switchTo().alert().accept();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='grid overlay-demo']//div[1]//div[@class='card'][2]/button/span[@class='ui-button-text ui-c']")).click();
driver.switchTo().alert().accept();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='grid overlay-demo']//div[1]//div[@class='card'][3]/button/span[@class='ui-button-text ui-c']")).click();
driver.findElement(By.xpath("//span[contains(text(),'Dismiss')]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='grid overlay-demo']//div[2]//div[@class='card'][1]/button/span[@class='ui-button-text ui-c']")).click();
String alertText=driver.switchTo().alert().getText();
	System.out.println(alertText);
	driver.switchTo().alert().sendKeys("King");
	driver.switchTo().alert().accept();
	
	}

}
