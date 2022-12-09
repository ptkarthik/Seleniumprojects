package SeleniumConceptsLearn;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextBoxes {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://phptravels.net");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//span[@id='select2-hotels_city-container']")))).click();
		
		driver.findElement((By.xpath("//input[@class='select2-search__field']"))).sendKeys("che");
Thread.sleep(5000);

List <WebElement> k=driver.findElements(By.xpath("//ul[@id='select2-hotels_city-results']/li"));
	Iterator<WebElement> l=k.iterator();
	while (l.hasNext())
	{
		String mm=l.next().getText();
	if(mm.contains("che")||mm.contains("Che"))
	{
		System.out.print(mm);
		System.out.println("  "+"the search results are correct");
		
	}
	else
	{
		System.out.print(mm);
		System.out.println("the rearch results brought similar data as well");
		
	}
	}
	
	// we can do it below way as well
	
		/*
		for(WebElement jj:k)
		{
			System.out.println(jj.getText());
		}*/
		
	}
}
