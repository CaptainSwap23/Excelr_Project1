package Project1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestCase26 {
	
			WebDriver driver;
			pom object;
		    
			
			@BeforeTest
			public void Beforetest() throws Exception{
				
				driver = new ChromeDriver();
				driver.get("https://automationexercise.com");
				driver.manage().window().maximize();
				
			}
			
			//26
			@Test(priority = 26)
			public void ScrollUpWithoutUsingArrow() throws InterruptedException {
				object = new pom(driver);
				System.out.println(driver.getCurrentUrl());
				
				WebElement bottom = driver.findElement(By.id("susbscribe_email"));
				WebElement top = driver.findElement(By.id("slider-carousel"));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", bottom);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/div/div[2]/div/h2")).isDisplayed();
				js.executeScript("arguments[0].scrollIntoView();", top);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"slider-carousel\"]/div/div[3]/div[1]/h2")).isDisplayed();

				Thread.sleep(2000);
			}
			
			@AfterTest
			public void Aftertest() {
				driver.quit();
				
			}
					
		
	}

