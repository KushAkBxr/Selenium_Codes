package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEventsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\browserspath\\geckodriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new FirefoxDriver();
        driver.get("https://extendsclass.com/text-compare.html");
        WebElement textarea = driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]//div[5]/pre/span"));
        //driver.switchTo().frame(frame);
        
        Actions action = new Actions(driver);
        Thread.sleep(2000);
         action.keyDown(textarea, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
         WebElement droparea = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]//div[5]/div[6]/pre"));
         Thread.sleep(2000);
         action.keyDown(droparea, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();

	}

}
