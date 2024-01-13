package Project1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestCase8 {
	
			WebDriver driver;
			pom object;
		    
			
			@BeforeTest
			public void Beforetest() throws Exception{
				
				driver = new ChromeDriver();
				driver.get("https://automationexercise.com");
				driver.manage().window().maximize();
				
			}
			
			//8
			@Test(priority = 8)
			public void AllProductDetails() throws InterruptedException {
				object = new pom(driver);
				System.out.println(driver.getCurrentUrl());
				driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();
				System.out.println(driver.getCurrentUrl());					
				driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/ul/li/a")).click();

				System.out.println(driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/h2")).getText());
				System.out.println(driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[1]")).getText());
				System.out.println(driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/span")).getText());
				System.out.println(driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[2]")).getText());
				System.out.println(driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[3]")).getText());
				System.out.println(driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[4]")).getText());

				Thread.sleep(2000);
			}
			
			@AfterTest
			public void Aftertest() {
				driver.quit();
				
			}
					
		
	}

