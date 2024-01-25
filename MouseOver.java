package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\browserspath\\geckodriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new FirefoxDriver();
        driver.get("https://sellglobal.ebay.in/");
        WebElement element = driver.findElement(By.xpath("//*[@id=\"menu-header-1\"]/li[5]/a"));
        
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
        
        

	}

}
