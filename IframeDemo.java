package ui;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IframeDemo {

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
				
	
	       driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
	       driver.switchTo().frame(0);
	       //driver.switchTo().frame("iframeResult");
	       driver.findElement(By.xpath("/html/body/button")).click();
	       String alertText =  driver.switchTo().alert().getText();
	       System.out.println(alertText);
            Thread.sleep(2000);
	      
	       driver.switchTo().alert().accept();
	      // driver.switchTo().alert().dismiss();
	       driver.switchTo().parentFrame();
	       System.out.println(driver.getTitle());
	       
	       
	       // This alert method is used whenever the alert ask for enter something.
	       //Alert alertonPage = driver.switchTo().alert();
	       //alertonPage.sendKeys("Amit Kumar");
	       //alertonPage.accept();
	       
	       driver.close();

	}

}
