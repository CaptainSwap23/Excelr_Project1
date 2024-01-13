package Project1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestCase17 {
	
			WebDriver driver;
			pom object;
		    
			
			@BeforeTest
			public void Beforetest() throws Exception{
				
				driver = new ChromeDriver();
				driver.get("https://automationexercise.com");
				driver.manage().window().maximize();
				
			}
			//17
			@Test(priority = 17)
			public void RemoveProducts() throws InterruptedException {
				object = new pom(driver);
				System.out.println(driver.getCurrentUrl());
				
				
				Actions ac= new Actions(driver);
				WebElement hover = driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[1]/div[2]/div/div[1]"));
				ac.moveToElement(hover).perform();
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/a")).click();
				Thread.sleep(4000);
				object.ViewCart();
				System.out.println(driver.getCurrentUrl());
				
				WebElement product = driver.findElement(By.xpath("//*[@id=\"product-1\"]/td[6]/a"));
				product.click();

				if(product.isSelected()) {
					System.out.println("Unsuccess");
				}
				else {
					System.out.println("Success");
				}
				
				
				
				Thread.sleep(2000);
			}
			
			@AfterTest
			public void Aftertest() {
				driver.quit();
				
			}
					
		
	}

