package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\browserspath\\geckodriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new FirefoxDriver();
        driver.get("https://jqueryui.com/resizable/");
        WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
        driver.switchTo().frame(frame);
        
        WebElement element = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
        
        
        Actions action = new Actions(driver);
        action.dragAndDropBy(element,300,100).perform();
	}

}
