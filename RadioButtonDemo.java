package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonDemo {

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
				
	
	       driver.get("https://www.singaporeair.com/en_UK/in/home#/book/bookflight");
	       
	       
	       WebElement radio2 = driver.findElement(By.id("bookFlights"));
	       Thread.sleep(2000);
	       WebElement radio1 = driver.findElement(By.id("redeemFlights"));
	       
	       radio1.click();
	       System.out.println(radio1.isSelected());
	       System.out.println(radio2.isSelected());

	}

}
