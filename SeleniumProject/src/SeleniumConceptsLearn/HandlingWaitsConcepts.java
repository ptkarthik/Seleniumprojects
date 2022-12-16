package SeleniumConceptsLearn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWaitsConcepts {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/dashboard.xhtml");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='layout-menu']/li[3]"))).click();
		driver.findElement(By.xpath("//ul[@class='layout-menu']/li[3]//ul/li[7]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='j_idt87:j_idt89']")).click();
		
		WebDriverWait h= new WebDriverWait(driver,Duration.ofSeconds(30));
	boolean t=	h.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='j_idt87:j_idt90']"))).isDisplayed();
	if(t)
	{
		System.out.println(t);
	}
	driver.findElement(By.xpath("//button[@id='j_idt87:j_idt92']")).click();
	WebDriverWait h1= new WebDriverWait(driver,Duration.ofSeconds(30));
	
	driver.findElement(By.xpath("//button[@id='j_idt87:j_idt89']")).click();
}}