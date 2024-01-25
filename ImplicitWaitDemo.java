package ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ImplicitWaitDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\browserspath\\geckodriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new FirefoxDriver();
        driver.get("https://sellglobal.ebay.in/");
        
        //Implicitelywait function is used for whole element on the page. i.e- it is applicable for the whole page that is in process.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"menu-header-1\"]/li[5]/a"));
        
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
        Thread.sleep(2000);
        
      
        
        driver.findElement(By.xpath("//*[@id=\"menu-header-1\"]/li[5]/div/div/section/div/div/div/section/div/div[2]/div/div[5]/div/div/a/span/span")).click();
        
       

	

	
		
	}

	
		
	}


