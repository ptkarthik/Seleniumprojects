package SeleniumConceptsLearn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				WebDriverManager.chromedriver().setup();
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://leafground.com/dashboard.xhtml");
				WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='layout-menu']/li[2]"))).click();
		
		//dragging an element around 
		driver.findElement(By.xpath("//ul[@class='layout-menu']/li[2]//ul/li[4]/a")).click();
		
		Actions a= new Actions(driver);
		
		
		a.dragAndDropBy(driver.findElement(By.xpath("//div[@id='form:conpnl_content']")),400,100).build().perform();
		
		//drag from and to location 
		
		WebElement from=driver.findElement(By.xpath("//div[@id='form:drag_content']"));
		WebElement to=driver.findElement(By.xpath("//div[@id='form:drop_content']"));
		
		a.dragAndDrop(from, to).build().perform();
		
		
		//draggable columns
		
		WebElement dragcolsource=driver.findElement(By.xpath("//div[@class='grid misc-demo']/div[1]//table[@role='grid'][1]//tr[@role='row'][1]/th[1]"));
		WebElement dragtarsource=driver.findElement(By.xpath("//div[@class='grid misc-demo']/div[1]//table[@role='grid'][1]//tr[@role='row'][1]/th[3]"));

	a.dragAndDrop(dragcolsource, dragtarsource).build().perform();
	
	
//resize the image
	WebElement h=driver.findElement(By.xpath("//div[@class='ui-wrapper']/div[1]"));
	a.dragAndDropBy(h, 100, 50).build().perform();
	}

}
