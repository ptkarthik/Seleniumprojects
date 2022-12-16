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

public class HandlingTables {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/dashboard.xhtml");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='layout-menu']/li[4]"))).click();
		driver.findElement(By.xpath("//ul[@class='layout-menu']/li[4]//ul/li[1]/a")).click();
		
		driver.findElement(By.xpath("//tbody[@id='form:j_idt89_data']")).isDisplayed();
		
		// getting the table content
		
		List<WebElement> header=driver.findElements(By.xpath("//div[@id='form:j_idt89']//div[2]//thead/tr/th/span[1]"));
	
	
		List<WebElement> row=	driver.findElements(By.xpath("//tbody[@id='form:j_idt89_data']/tr"));
		
		int rowsize=row.size();
List<WebElement> column=	driver.findElements(By.xpath("//tbody[@id='form:j_idt89_data']/tr[1]//td"));
		
		int columnsize=column.size();
	
		
		for(WebElement displayhader:header)
		{
			System.out.print("   "+displayhader.getText()+"  ");
		}
		
			for(int i=1;i<=rowsize;i++)
			{
				for (int j=1;j<=columnsize;j++)
				{
					String values=driver.findElement(By.xpath("//tbody[@id='form:j_idt89_data']/tr["+i+"]//td["+j+"]")).getText();
					System.out.print("   "+values+"  ");
					
				}
				System.out.println();
			}
			
			
			
		}
		
}
