package Project1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestCase18 {
	
			WebDriver driver;
			pom object;
		    
			
			@BeforeTest
			public void Beforetest() throws Exception{
				
				driver = new ChromeDriver();
				driver.get("https://automationexercise.com");
				driver.manage().window().maximize();
				
			}
			
			//18
			@Test(priority = 18)
			public void ViewCategoryProducts() throws InterruptedException {
				object = new pom(driver);
				System.out.println(driver.getCurrentUrl());
				
				driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[1]/div/h2")).isDisplayed();
				driver.findElement(By.xpath("//*[@id=\"accordian\"]/div[1]/div[1]/h4/a")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"Women\"]/div/ul/li[2]/a")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/h2")).isDisplayed();
				driver.findElement(By.xpath("//*[@id=\"accordian\"]/div[2]/div[1]/h4/a")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"Men\"]/div/ul/li[1]/a")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/h2")).isDisplayed();

			}
			
			@AfterTest
			public void Aftertest() {
				driver.quit();
				
			}
					
		
	}

