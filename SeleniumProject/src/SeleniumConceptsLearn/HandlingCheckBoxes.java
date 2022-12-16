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

public class HandlingCheckBoxes {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/dashboard.xhtml");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='layout-menu']/li[3]"))).click();
		driver.findElement(By.xpath("//ul[@class='layout-menu']/li[3]//ul/li[4]/a")).click();
		
		//basic checkbox
		String checkboxname=driver.findElement(By.xpath("//div[@id='j_idt87:j_idt89']/div[2]")).getAttribute("class");
		System.out.println(checkboxname);
		driver.findElement(By.xpath("//div[@id='j_idt87:j_idt89']/div[2]")).click();
		String checkboxname1=driver.findElement(By.xpath("//div[@id='j_idt87:j_idt89']/div[2]")).getAttribute("class");
		System.out.println(checkboxname1);
		
		
		//ajax checkbos
		driver.findElement(By.xpath("//div[@id='j_idt87:j_idt91']/div[2]")).click();
	
		
	
		// checking multiple boxes 
		List<WebElement> l=driver.findElements(By.xpath("//table[@id='j_idt87:basic']//tr/td/div/div[2]"));
		for(WebElement j:l)
		{
			j.click();
		}
		
		
		//toggle

		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		
		//disabled
		
		boolean t=driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']/div[2]/span")).isEnabled();
		
		System.out.println(t);
}
}