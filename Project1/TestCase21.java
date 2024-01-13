package Project1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestCase21 {
	
			WebDriver driver;
			pom object;
		    
			
			@BeforeTest
			public void Beforetest() throws Exception{
				
				driver = new ChromeDriver();
				driver.get("https://automationexercise.com");
				driver.manage().window().maximize();
				
			}
			
			//21
			@Test(priority = 21)
			public void AddReviewOnProduct() throws InterruptedException {
				object = new pom(driver);
				object.Products();			
				driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/h2")).isDisplayed();
				driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/ul/li/a")).click();
				driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[3]/div[1]/ul/li/a")).getText();
				
				driver.findElement(By.id("name")).sendKeys("Swapnil");
				driver.findElement(By.id("email")).sendKeys("sgandge23@gmail.com");
				driver.findElement(By.id("review")).sendKeys("Great Product with the given price.");
				driver.findElement(By.id("button-review")).click();
				
				driver.findElement(By.xpath("//*[@id=\"review-section\"]/div/div/span")).isDisplayed();

			}
			
			@AfterTest
			public void Aftertest() {
				driver.quit();
				
			}
					
		
	}

