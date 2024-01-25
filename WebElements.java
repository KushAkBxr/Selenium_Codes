package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElements {

	private static final String Syso = null;
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
				
	
	driver.get("https://www.facebook.com");
	driver.findElement(By.id("email")).sendKeys("standard_user");
	Thread.sleep(3000);
	driver.findElement(By.id("email")).clear();
	System.out.println(driver.findElement(By.id("email")).getAttribute("class"));
	System.out.println(driver.findElement(By.name("login")).getCssValue("line-height"));
	System.out.println(driver.findElement(By.name("login")).getSize());
	System.out.println(driver.findElement(By.name("login")).getLocation());
	System.out.println(driver.findElement(By.name("login")).getText());
	System.out.println(driver.findElement(By.name("login")).getTagName());
	System.out.println(driver.findElement(By.name("login")).isDisplayed());
	System.out.println(driver.findElement(By.name("login")).isEnabled());
	System.out.println(driver.findElement(By.name("login")).isSelected());
	
	
	
	
	//driver.close();
	
		

	}

}
