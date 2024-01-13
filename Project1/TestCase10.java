package Project1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestCase10 {
	
			WebDriver driver;
			pom object;
		    
			
			@BeforeTest
			public void Beforetest() throws Exception{
				
				driver = new ChromeDriver();
				driver.get("https://automationexercise.com");
				driver.manage().window().maximize();
				
			}
			
			//10
			@Test(priority = 10)
			public void SubscriptionHomePAge() throws InterruptedException {
				object = new pom(driver);
				System.out.println(driver.getCurrentUrl());

				WebElement email = driver.findElement(By.id("susbscribe_email"));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", email);
				
				driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/div/div[2]/div/h2")).getText();
				driver.findElement(By.id("susbscribe_email")).sendKeys("sgandge23@gmail.com");
				driver.findElement(By.id("subscribe")).click();
				System.out.println(driver.findElement(By.id("success-subscribe")).getText());

				Thread.sleep(2000);
			}
			
			@AfterTest
			public void Aftertest() {
				driver.quit();
				
			}
					
		
	}

