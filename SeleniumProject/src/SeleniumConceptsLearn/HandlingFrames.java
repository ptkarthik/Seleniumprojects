package SeleniumConceptsLearn;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingFrames {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/dashboard.xhtml");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='layout-menu']/li[2]"))).click();
		driver.findElement(By.xpath("//ul[@class='layout-menu']/li[2]//ul/li[2]/a")).click();
		List<WebElement> frames	=driver.findElements(By.tagName("iframe"));
		
		//Swithching to frame 1
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='default.xhtml']")));
		
		driver.findElement(By.xpath("//button[@id='Click'][@onclick='change()'][@style='color:#ffffff;background: linear-gradient(240deg, #ff7295 0%, #fe875d 100%);border: 0 none;width:15%;height:40%']")).click();
		
	//count of frame
		
		System.out.println("the count of Frame are "+"  "+frames.size());
		//getting back to original frame 
		driver.switchTo().defaultContent();
		//getting over to Frame 2, first get to outer frame of nested frame, then have to go to nested frame 
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='page.xhtml']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='framebutton.xhtml']")));
		
		//clicking the element
		driver.findElement(By.xpath("//button[@id='Click'][@onclick='change()'][@style='background: linear-gradient(240deg, #4b7ecf 0%, #8e70ee 100%); color:#ffffff;border: 0 none;width:15%;height:40%']")).click();
		
		//nested frame 
}
}