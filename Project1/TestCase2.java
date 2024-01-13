package Project1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestCase2 {
	
			WebDriver driver;
			pom object;
		    
			
			@BeforeTest
			public void Beforetest() throws Exception{
				
				driver = new ChromeDriver();
				driver.get("https://automationexercise.com");
				driver.manage().window().maximize();
				
			}
			
		
			//2
			@Test(priority = 2)
			public void logincorrect() throws InterruptedException {
				object = new pom(driver);
				object.logsignbtn();
				driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/h2")).getText();
				object.login("amolprabhale137@gmail.com","123");
				driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a")).getText();
				object.deleteacc();
				System.out.println(driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b")).getText());
				Thread.sleep(2000);
				
			}
					
			@AfterTest
			public void Aftertest() {
				driver.quit();
				
			}
					
		
	}

