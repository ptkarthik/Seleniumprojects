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

public class HandlingradioButtons {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/dashboard.xhtml");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='layout-menu']/li[3]"))).click();
		driver.findElement(By.xpath("//ul[@class='layout-menu']/li[3]//ul/li[5]/a")).click();
		
		//selecting all of the radio buttons once
		List <WebElement> elements= driver.findElements(By.xpath("//table[@id='j_idt87:console1']/tbody/tr/td"));
		int n=elements.size();
		for(int i=1;i<=n;i++)
		{
			driver.findElement(By.xpath("//table[@id='j_idt87:console1']/tbody/tr/td["+i+"]/div[1]/div[2]")).click();
		}
		
		// check the default selected radio button 
		
	List<WebElement> l=	driver.findElements(By.xpath("//table[@id='j_idt87:console2']/tbody/tr/td/div/div[2]"));
	int i=1;
	for(WebElement k:l)
	{
		String mm= k.getAttribute("class");
		
		if(mm.equals("ui-radiobutton-box ui-widget ui-corner-all ui-state-default"))
		{
	i++;
	}
		else
		{
			String jj=driver.findElement(By.xpath("//table[@id='j_idt87:console2']/tbody/tr/td["+i+"]/label")).getText();
			System.out.println("the Default Browser is"+"    "+jj);	
		}

}}
}