package SeleniumConceptsLearn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingButtons {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/dashboard.xhtml");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='layout-menu']/li[3]"))).click();
		driver.findElement(By.xpath("//ul[@class='layout-menu']/li[3]//ul/li[2]/a")).click();
		//click and validating the title
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']")).click();
		if(driver.getTitle().equals("Dashboard"))
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("Fail");
		}
		driver.navigate().back();
		// checking is button is enabled
		Boolean f=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']")).isEnabled();
		if(f)
		{
}
		else
			{System.out.println("button disabled");
			}
		//get the color of the button // which wil get the color of the font not back ground 
		String h=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96']")).getCssValue("color");
		
		System.out.println(h);
		
		String color=Color.fromString(h).asHex();
		System.out.println(color);
		
		//get the height and width of button 
		Dimension d=driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).getSize();
		int height=d.getHeight();
		System.out.println(height);
		int width=d.getWidth();
		System.out.println(width);
		
		/// hosue over and check if color changed for background in button
		String cc=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']")).getCssValue("background-color");
		
		String j=Color.fromString(cc).asHex();
		System.out.println(j);
		Actions a= new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']"))).build().perform();
		String cc2=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']")).getCssValue("background-color");
		String j1=Color.fromString(cc2).asHex();
		System.out.println(j1);
		if(j.equalsIgnoreCase(j1))
		{
			
		}
		
		else
		{
			System.out.println("fail");
		}
			}
}