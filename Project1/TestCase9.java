package Project1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestCase9 {
	
			WebDriver driver;
			pom object;
		    
			
			@BeforeTest
			public void Beforetest() throws Exception{
				
				driver = new ChromeDriver();
				driver.get("https://automationexercise.com");
				driver.manage().window().maximize();
				
			}
			
			//9
			@Test(priority = 9)
			public void SearchProduct() throws InterruptedException {
				object = new pom(driver);
				System.out.println(driver.getCurrentUrl());
				driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();
				System.out.println(driver.getCurrentUrl());		
				driver.findElement(By.id("search_product")).sendKeys("Shirt");
				driver.findElement(By.id("submit_search")).click();
				System.out.println(driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/h2")).getText());
						
				Thread.sleep(2000);
			}
			
			@AfterTest
			public void Aftertest() {
				driver.quit();
				
			}
					
		
	}

