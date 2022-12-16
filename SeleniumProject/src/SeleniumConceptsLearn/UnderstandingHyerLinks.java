package SeleniumConceptsLearn;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UnderstandingHyerLinks {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/dashboard.xhtml");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='layout-menu']/li[3]"))).click();
		driver.findElement(By.xpath("//ul[@class='layout-menu']/li[3]//ul/li[6]/a")).click();
		//finding the url of hyperlink
		String url=driver.findElement(By.xpath("//a[contains(text(),'Find the URL without clicking me.')]")).getAttribute("href");
		System.out.println(url);
		
		//find broken link
		driver.findElement(By.xpath("//a[contains(text(),'Broken?')]")).click();
	String title=	driver.getTitle();
	if(title.contains("404"))
	{
		System.out.println("Page is broken");
		driver.navigate().back();
	}
	
	else
	{
		driver.navigate().back();
	}
	
	//count of the links in this page 
	
	List <WebElement>g=driver.findElements(By.tagName("a"));
	
	System.out.print(g.size());
for(WebElement g1:g)
{
	System.out.println(g1.getText());
}
		
		
	
	
}
	
}
