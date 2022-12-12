package SeleniumConceptsLearn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingtextBoxes {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/dashboard.xhtml");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='layout-menu']/li[3]"))).click();
		driver.findElement(By.xpath("//ul[@class='layout-menu']/li[3]//ul/li[1]/a")).click();
		
		//type my name
		driver.findElement(By.xpath("//input[@id='j_idt88:name']")).sendKeys("Karthik thangavel");
		
		// add country to the city 
		WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(30));
		String city = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='j_idt88:j_idt91']"))).getAttribute("value");
	System.out.println(city);
	
	driver.findElement(By.xpath("//input[@id='j_idt88:j_idt91']")).clear();
	
	driver.findElement(By.xpath("//input[@id='j_idt88:j_idt91']")).sendKeys(city+"   "+"The country is india");
	
	// find if the textbox is disabled 
	Boolean t=driver.findElement(By.xpath("//input[@id='j_idt88:j_idt93']")).isEnabled();
	if(t)
	{
		System.out.println("Textbox is enabled");
	}
	
	else
	{
		System.out.println("Disabled");
	}
	
	driver.findElement(By.xpath("//input[@id='j_idt88:j_idt99']")).sendKeys("pt.karthik1989@gmail.com");
	driver.findElement(By.xpath("//input[@id='j_idt88:j_idt99']")).sendKeys(Keys.TAB);
	
	
	//sending enter
	driver.findElement(By.xpath("//input[@id='j_idt106:thisform:age']")).sendKeys(Keys.ENTER);
	
	// finding x and y
	Point p=driver.findElement(By.xpath("//input[@id='j_idt106:thisform:age']")).getLocation();
	int xaxis=p.getX();
	System.out.println(xaxis);
	int yaxis=p.getY();
		System.out.println(yaxis);
	
}}
