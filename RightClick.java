package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\browserspath\\geckodriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.in/");
        //WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
        //driver.switchTo().frame(frame);
        
        WebElement rectangle = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
        
        
        Actions action = new Actions(driver);
        action.contextClick(rectangle).perform();
		

	}

}
