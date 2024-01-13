package Project1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestCase12 {
	
			WebDriver driver;
			pom object;
		    
			
			@BeforeTest
			public void Beforetest() throws Exception{
				
				driver = new ChromeDriver();
				driver.get("https://automationexercise.com");
				driver.manage().window().maximize();
				
			}
			

			//12
			@Test(priority = 12)
			public void AddProduct() throws InterruptedException {
				object = new pom(driver);
				System.out.println(driver.getCurrentUrl());
				
				driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();
				Actions ac= new Actions(driver);
				WebElement hover1 = driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]"));
				ac.moveToElement(hover1).perform();
				driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/div/a")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button")).click();
				
				WebElement hover2 = driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[3]/div/div[1]"));
				ac.moveToElement(hover2).perform();
				driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[3]/div/div[1]/div[2]/div/a")).click();
				Thread.sleep(2000);
				object.ViewCart();				
				driver.findElement(By.id("product-1")).isDisplayed();
				driver.findElement(By.id("product-2")).isDisplayed();
				for(int j =1;j<=2;j++) {
					for(int i=3;i<=5;i++) {
				driver.findElement(By.xpath("//*[@id=\"product-"+j+"\"]/td["+i+"]")).isDisplayed();
					}
				}
				Thread.sleep(2000);
			}
			
			@AfterTest
			public void Aftertest() {
				driver.quit();
				
			}
					
		
	}

