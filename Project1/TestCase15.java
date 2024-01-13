package Project1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestCase15 {
	
			WebDriver driver;
			pom object;
		    
			
			@BeforeTest
			public void Beforetest() throws Exception{
				
				driver = new ChromeDriver();
				driver.get("https://automationexercise.com");
				driver.manage().window().maximize();
				
			}
			
			//15
			@Test(priority = 15)
			public void RegisterBeforeCheckout() throws InterruptedException {
				object = new pom(driver);
				System.out.println(driver.getCurrentUrl());
				object.logsignbtn();
				object.signup("sih", "sih@gmail.com");
				object.registeruser();
				driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b")).getText();
				driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();
				driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a")).getText();
				
				Actions ac= new Actions(driver);
				WebElement hover = driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[1]/div[2]/div/div[1]"));
				ac.moveToElement(hover).perform();
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/a")).click();
				Thread.sleep(4000);
				object.ViewCart();
				System.out.println(driver.getCurrentUrl());
				object.Proceedtocheckout();
				
				Thread.sleep(2000);
				driver.findElement(By.id("address_delivery")).isDisplayed();
				driver.findElement(By.id("cart_info")).isDisplayed();
				driver.findElement(By.xpath("//*[@id=\"ordermsg\"]/textarea")).sendKeys("This is a test");
				driver.findElement(By.xpath("//*[@id=\"cart_items\"]/div/div[7]/a")).click();
				object.PaymentDetails();
				driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/p")).isDisplayed();
				object.deleteacc();
				driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b")).isDisplayed();
				driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();

				
				Thread.sleep(2000);
			}
			
			@AfterTest
			public void Aftertest() {
				driver.quit();
				
			}
					
		
	}

