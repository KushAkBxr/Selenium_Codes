package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown  {

	
	public static String browser = "firefox";
	public static WebDriver driver;
		public static void main(String[] args) throws InterruptedException  {
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
				
	
	driver.get("https://etrain.info/in");
	WebElement ddown = driver.findElement(By.id("tbsfi5"));
	Select select = new Select(ddown);
		WebElement firstoption = select.getFirstSelectedOption();
		System.out.println(firstoption.getText());
	
	select.selectByValue("SS");
	Thread.sleep(2000);
	
	select.selectByVisibleText("Foreign Tourist");
	Thread.sleep(2000);
	
	select.selectByIndex(5);
	Thread.sleep(2000);
	
	driver.close();
			
			//driver.get("https://vue-multiselect.js.org/");
			//WebElement ddown = driver.findElement(By.className("multiselect__placeholder"));
			//Select select = new Select(ddown);
			//select.selectByIndex(1);
			
			
	

	}

}
