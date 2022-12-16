package SeleniumConceptsLearn;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownHanding {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/dashboard.xhtml");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='layout-menu']/li[3]"))).click();
		driver.findElement(By.xpath("//ul[@class='layout-menu']/li[3]//ul/li[3]/a")).click();
		
		WebElement selectbutton=driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		
		Select s=new Select(selectbutton);
		//getting the string of options available on select class
		List<WebElement> options=s.getOptions();
		
		for(WebElement h:options)
		{
			String j=h.getText();
			System.out.println(j);
		}
		//selecing by index
		s.selectByIndex(2);
		Thread.sleep(4000);
		
		//selecting by visible text
		s.selectByVisibleText("Cypress");
		
driver.findElement(By.xpath("//label[@id='j_idt87:country_label']")).click();
driver.findElement(By.xpath("//div[@class='ui-selectonemenu-items-wrapper']/ul/li[4]")).click();

//selecting the cities and check if the list is same 

List<String> IndiaCities=new ArrayList();
List<String> IndiaCitiesfromdropdown=new ArrayList();
IndiaCities.add("Select City");
IndiaCities.add("Bengaluru");
IndiaCities.add("Chennai");
IndiaCities.add("Delhi");

System.out.println("Before getting from drop down:"+   IndiaCities);
Thread.sleep(5000);
driver.findElement(By.xpath("//label[@id='j_idt87:city_label']")).click();
Thread.sleep(5000);
List<WebElement> citiesfromdropdown= driver.findElements(By.xpath("//ul[@id='j_idt87:city_items']/li"));

for (WebElement j:citiesfromdropdown)
{
	IndiaCitiesfromdropdown.add(j.getText());
}

System.out.println(IndiaCitiesfromdropdown);

if(IndiaCities.equals(IndiaCitiesfromdropdown))
{
	System.out.println("Pass");
}

else
{
	System.out.println("fail");
}

//typing the text and selecting the auto suggestions
WebDriverWait w3= new WebDriverWait(driver,Duration.ofSeconds(30));
w3.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='j_idt87:auto-complete']/ul/li/input"))).sendKeys("sel");
Thread.sleep(4000);
driver.findElement(By.xpath("//span[@id='j_idt87:auto-complete_panel']/ul/li/span[contains(text(),'Sel')]")).click();

	}

	
}
