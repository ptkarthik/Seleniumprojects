package SeleniumConceptsLearn;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowhandlingConcepts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/dashboard.xhtml");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='layout-menu']/li[2]"))).click();
		driver.findElement(By.xpath("//ul[@class='layout-menu']/li[2]//ul/li[3]/a")).click();
		Thread.sleep(3000);

		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='j_idt88:new']//span[contains(text(),'Open')]"))).click();
		Set<String> windows=driver.getWindowHandles();
		
		for (String h:windows)
		{
			driver.switchTo().window(h);


if(!h.equals(parentwindow))
{
	driver.close();
		}
	}
		driver.switchTo().window(parentwindow);
		WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='j_idt88:j_idt91']//span[contains(text(),'Open Multiple')]"))).click();
		Set<String> windows1=	driver.getWindowHandles();
		System.out.println(windows1.size());
		driver.quit();
		
}}
