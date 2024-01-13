package Project1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestCase4 {
	
			WebDriver driver;
			pom object;
		    
			
			@BeforeTest
			public void Beforetest() throws Exception{
				
				driver = new ChromeDriver();
				driver.get("https://automationexercise.com");
				driver.manage().window().maximize();
				
			}
			
			//4
			@Test(priority = 4)
			public void logoutUser() throws InterruptedException {
				object = new pom(driver);
				object.logsignbtn();
				driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/h2")).getText();
				object.login("sgandge2@gmail.com","1234");
				System.out.println(driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a")).getText());
				object.logout();	
				System.out.println(driver.getCurrentUrl());
			}
			
			@AfterTest
			public void Aftertest() {
				driver.quit();
				
			}
					
		
	}

