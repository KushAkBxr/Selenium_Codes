package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintAllLinks {
	
	
	public static String browser = "firefox";
	public static WebDriver driver;
		public static void main(String[] args)  {
			// TODO Auto-generated method stub

			if (browser.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", "C:\\browserspath\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else if(browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\browserspath\\chromedriver.exe");
				driver = new ChromeDriver();
			}
		
		else if(browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\browserspath\\chromedriver.exe");
			driver = new ChromeDriver();
		}
				
	
	driver.get("https://www.sugarcrm.com/au/?utm_source=sugarcrm.com&utm_medium=referral");
	List <WebElement> alltags = driver.findElements(By.tagName("a"));
	System.out.println("Total tags are: "+alltags.size());
	
	for (int i=0;i<alltags.size();i++)
	{
		System.out.println("Links on page are "+alltags.get(i).getAttribute("href"));
		System.out.println("Links on page are "+alltags.get(i).getText());
	}
	
	
	}
	

}

