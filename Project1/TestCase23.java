package Project1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestCase23 {
	
			WebDriver driver;
			pom object;
		    
			
			@BeforeTest
			public void Beforetest() throws Exception{
				
				driver = new ChromeDriver();
				driver.get("https://automationexercise.com");
				driver.manage().window().maximize();
				
			}
			
			//23
			@Test(priority = 23)
			public void VerifyAddressDetails() throws InterruptedException {
				object = new pom(driver);
				
				object.logsignbtn();
				object.signup("pratikk", "pratikk@gmail.com");
				object.registeruser();
				driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b")).getText();
				driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();
				driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a")).getText();
				
				Actions ac= new Actions(driver);
				WebElement hover = driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[1]/div[2]/div/div[1]"));
				ac.moveToElement(hover).perform();
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/a")).click();
				Thread.sleep(2000);
				object.ViewCart();
				driver.getCurrentUrl();
				
				object.Proceedtocheckout();
				
				System.out.println(driver.findElement(By.id("address_delivery")).getText());
				System.out.println(driver.findElement(By.id("address_invoice")).getText());
				
				object.deleteacc();
				driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b")).isDisplayed();
				driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();
				
			}
			
			@AfterTest
			public void Aftertest() {
				driver.quit();
				
			}
					
		
	}

