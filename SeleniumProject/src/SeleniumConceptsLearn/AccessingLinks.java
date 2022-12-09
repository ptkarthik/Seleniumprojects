package SeleniumConceptsLearn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AccessingLinks {

	public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://phptravels.net");
	driver.manage().window().maximize();
	try
	{


	List<WebElement> h=driver.findElements(By.xpath("//a[@href]"));
	
	for(WebElement h1:h)
	{
		String k=h1.getText();
		System.out.println(k );
	}
	
	
	}
	
	catch(StaleElementReferenceException e)
	{
		
	}
	
driver.findElement(By.linkText("Hotels")).click();
driver.navigate().refresh();
driver.findElement(By.partialLinkText("Hot")).click();


driver.navigate().to("https://ahrefs.com/broken-link-checksd");
String titleofthepage=driver.getTitle();
System.out.println(titleofthepage);
if(titleofthepage.contains("404"))
{
	System.out.println("Page is broken");
	
}

else
{
	System.out.println("Page is broken");
}
//driver.quit();
}}
