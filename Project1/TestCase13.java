package Project1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestCase13 {
	
			WebDriver driver;
			pom object;
		    
			
			@BeforeTest
			public void Beforetest() throws Exception{
				
				driver = new ChromeDriver();
				driver.get("https://automationexercise.com");
				driver.manage().window().maximize();
				
			}
			


			//13
			@Test(priority = 13)
			public void ProductQuantity() throws InterruptedException {
				object = new pom(driver);
				System.out.println(driver.getCurrentUrl());
				
				driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[1]/div[4]/div/div[2]/ul/li/a")).click();
				WebElement q = driver.findElement(By.name("quantity"));
				q.clear();
				q.sendKeys("4");
				driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")).click();
				Thread.sleep(2000);
				object.ViewCart();
				String exactquantity = driver.findElement(By.xpath("//*[@id=\"product-3\"]/td[4]/button")).getText();
				Assert.assertEquals( "4",exactquantity);
				Thread.sleep(2000);
			}
			
			@AfterTest
			public void Aftertest() {
				driver.quit();
				
			}
					
		
	}

