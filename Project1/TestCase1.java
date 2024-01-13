package Project1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestCase1 {
	
			WebDriver driver;
			pom object;
		    
			
			@BeforeTest
			public void Beforetest() throws Exception{
				
				driver = new ChromeDriver();
				driver.get("https://automationexercise.com");
				driver.manage().window().maximize();
				
			}
			
			//1
			@Test(priority = 1)
			public void RegisterUser() throws InterruptedException {
				object = new pom(driver);
				object.logsignbtn();						
				driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/h2")).getText();
				object.signup("Swapnil12", "sgandge1223@gmail.com");
				
				driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/h2/b")).getText();
				object.registeruser();
				Thread.sleep(2000);
				
				
				driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b")).getText();
				driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();
				driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a")).getText();
				driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")).click();
				driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b")).getText();
				driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();
	
				Thread.sleep(2000);		
				
			}
			
			
			@AfterTest
			public void Aftertest() {
				driver.quit();
				
			}
					
		
	}

