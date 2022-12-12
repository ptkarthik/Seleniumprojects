package SeleniumConceptsLearn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AccessingLinks {

	public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://phptravels.net");
	driver.manage().window().maximize();
	
Thread.sleep(5000);
//storing the elements in list 
	List<WebElement> h=driver.findElements(By.xpath("//a[@href]"));
	
	//create an arraylist of string type 
	List<String> ar= new ArrayList<String>();
	
	//traversing the element in list to webelement h1
	for(WebElement h1:h)
	{
		//adding the string we get to arraylist
		ar.add(h1.getText());
	
	
	}
	
	//getting size of arrya
	int arsize=ar.size();
	System.out.println("the size of list ar is"+" "+arsize);
	System.out.println("*********Before Sorting*******");
	

//sorting the arraylist
	Collections.sort(ar);
	
	Iterator j=ar.iterator();
	while(j.hasNext())
	{
		System.out.println(j.next());
	}
	
	
	
	List<String> ar1= new ArrayList<String>();
	//ading the elements of arraylist 'ar' to 'ar1'
	ar1.addAll(ar);
	
	if(ar.equals(ar1))
	{
		System.out.println("same");
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
driver.quit();
}}
