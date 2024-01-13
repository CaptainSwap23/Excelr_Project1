package Project1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestCase19 {
	
			WebDriver driver;
			pom object;
		    
			
			@BeforeTest
			public void Beforetest() throws Exception{
				
				driver = new ChromeDriver();
				driver.get("https://automationexercise.com");
				driver.manage().window().maximize();
				
			}
			

			//19
			@Test(priority = 19)
			public void ViewCartBrandProducts() throws InterruptedException {
				object = new pom(driver);
				System.out.println(driver.getCurrentUrl());
				object.Products();			
				Thread.sleep(2000); 
				//driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[1]/div/div[3]/h2/text()")).isDisplayed();
				driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div[1]/div[2]/div/ul/li[1]/a")).click();
				Thread.sleep(2000); 
				System.out.println(driver.getCurrentUrl());
				driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/h2")).isDisplayed();
				driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div[1]/div[2]/div/ul/li[4]/a")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div")).isDisplayed();


			}
			
			@AfterTest
			public void Aftertest() {
				driver.quit();
				
			}
					
		
	}


