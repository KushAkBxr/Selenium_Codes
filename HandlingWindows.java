package ui;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\browserspath\\geckodriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.salesforce.com/in/?ir=1");
        driver.findElement(By.xpath("//*[@id=\"1675753708418_125\"]/div/article/div/div/pbc-button[1]/a")).click();
        Thread.sleep(2000);
        
        Set<String> windowhandles = driver.getWindowHandles();
        System.out.println(windowhandles);
        
       Iterator <String> iterator =  windowhandles.iterator();
       String parentwindow = iterator.next();
       System.out.println(parentwindow);
       
       String childwindow = iterator.next();
       System.out.println(childwindow);
       
        driver.switchTo().window(childwindow);
        driver.findElement(By.name("UserFirstName")).sendKeys("Amit");
        Thread.sleep(1000);
        driver.findElement(By.name("UserLastName")).sendKeys("Kumar");
        driver.findElement(By.name("UserEmail")).sendKeys("brewrdl@gmail.com");
        Thread.sleep(2000);
        
        driver.switchTo().window(parentwindow);
        
	}

}
