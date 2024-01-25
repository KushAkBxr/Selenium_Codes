package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestDropDown {

	public static String browser = "firefox";
	public static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
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
				
	
	//driver.get("https://www.easemytrip.com/");
	//driver.findElement(By.id("pff")).click();
	//driver.findElement(By.id("a_FromSector_show")).sendKeys("Patna");
	//Thread.sleep(2000);
	//driver.findElement(By.id("a_FromSector_show")).sendKeys(Keys.ARROW_DOWN);
	//Thread.sleep(1000);
	//driver.findElement(By.id("a_FromSector_show")).sendKeys(Keys.ENTER);
	//Thread.sleep(1000);
	
	//Second way to do the same code in a proper way by storing the value in a variable.
			
	driver.get("https://www.makemytrip.com/");
	driver.findElement(By.id("pff")).click();
	WebElement from = driver.findElement(By.id("a_FromSector_show"));
	//Thread.sleep(2000);
    from.sendKeys("Pat");
	//Thread.sleep(1000);
    from.sendKeys(Keys.ARROW_DOWN);
	//Thread.sleep(2000);
    from.sendKeys(Keys.ENTER);
	
	
	}

}
