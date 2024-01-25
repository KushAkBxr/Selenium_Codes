package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox {

 
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
					
		
		driver.get("https://www.easemytrip.com/");
		driver.findElement(By.xpath("//*[@id=\"divFamilyFare\"]/ul/li[3]/label/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"divFamilyFare\"]/ul/li[3]/label/span")).click();
		
		System.out.println(driver.findElements(By.className("checkmark_df")).size());
		
		driver.close();

	}

}
