package SeleniumConceptsLearn;

import java.awt.AWTException;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IncreaseViewOfChillaChilla {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		JFrame j= new JFrame();
	String h1=	JOptionPane.showInputDialog(j,"Enter the view count");
		int i=0;
		Scanner s =new Scanner(h1);
		
		int h= s.nextInt();
		for(i=0;i<h;i++)
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://youtu.be/8XZaJJJbKYk");
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ytp-play-button ytp-button']"))).click();
			
	Robot r =new Robot();
	
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//div[@class='ytp-progress-bar-padding']")),200, 300);
		Thread.sleep(3000);
		driver.quit();
		
		
		}
		 JOptionPane.showMessageDialog(j,h1+"  "+"Views have been updated");  
		 
		int result= JOptionPane.showConfirmDialog(j, "Do you wish to continue?","Update View", JOptionPane.YES_NO_OPTION);
		
		if(result==JOptionPane.YES_OPTION)
		{
		 
		
	
		
	}

}}
