package Project1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestCase20 {
	
			WebDriver driver;
			pom object;
		    
			
			@BeforeTest
			public void Beforetest() throws Exception{
				
				driver = new ChromeDriver();
				driver.get("https://automationexercise.com");
				driver.manage().window().maximize();
				
			}
			
			//20
			@Test(priority = 20)
			public void SearchProductAndVerify() throws InterruptedException {
				object = new pom(driver);
				object.Products();			
				driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/h2")).isDisplayed();
				driver.findElement(By.id("search_product")).sendKeys("jeans");
				driver.findElement(By.id("submit_search")).click();
				driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/h2")).isDisplayed();
				driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div")).isDisplayed();
				Thread.sleep(2000);
				Actions ac= new Actions(driver);
				WebElement hover1 = driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]"));
				ac.moveToElement(hover1).perform();
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/div/a")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button")).click();

				WebElement hover2 = driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[3]/div/div[1]"));
				ac.moveToElement(hover2).perform();
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[3]/div/div[1]/div[2]/div/a")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button")).click();
			
				WebElement hover3 = driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[4]/div/div[1]"));
				ac.moveToElement(hover3).perform();
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[4]/div/div[1]/div[2]/div/a")).click();
				Thread.sleep(2000);
				object.ViewCart();
				
				
				driver.findElement(By.id("product-33")).isDisplayed();
				driver.findElement(By.id("product-35")).isDisplayed();
				driver.findElement(By.id("product-37")).isDisplayed();

				object.logsignbtn();
				object.login("sgandge23@gmail.com", "cricket23");
				driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")).click();
				driver.findElement(By.id("product-33")).isDisplayed();
				driver.findElement(By.id("product-35")).isDisplayed();
				driver.findElement(By.id("product-37")).isDisplayed();
			}
			
			@AfterTest
			public void Aftertest() {
				driver.quit();
				
			}
					
		
	}

