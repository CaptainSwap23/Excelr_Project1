package Project1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestCase22 {
	
			WebDriver driver;
			pom object;
		    
			
			@BeforeTest
			public void Beforetest() throws Exception{
				
				driver = new ChromeDriver();
				driver.get("https://automationexercise.com");
				driver.manage().window().maximize();
				
			}
			
			//22
			@Test(priority = 22)
			public void AddToCartFromRecommended() throws InterruptedException {
				object = new pom(driver);
				WebElement bottom = driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[2]/h2"));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", bottom);
				
				driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[2]/h2")).isDisplayed();
				driver.findElement(By.xpath("//*[@id=\"recommended-item-carousel\"]/div/div[2]/div[1]/div/div/div/a")).click();
				Thread.sleep(2000);
				object.ViewCart();
				driver.findElement(By.xpath("//*[@id=\"product-4\"]")).isDisplayed();

			}
			
			@AfterTest
			public void Aftertest() {
				driver.quit();
				
			}
					
		
	}

