package PropertiesUnderstanding;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PropertiesUsage {

	public static void main(String args[]) throws IOException {
		WebDriver driver=null;
		FileInputStream fis= new FileInputStream("config.properties");
		Properties pr= new Properties();
		pr.load(fis);
		
		String browser=pr.getProperty("browser");
		String Driverloaction=pr.getProperty("DriverPath");
	
		if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver",Driverloaction);
			 driver = new ChromeDriver();
		
			
		
}driver.get("https://www.google.com");
driver.quit();}} 