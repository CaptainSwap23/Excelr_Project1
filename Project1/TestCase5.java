package Project1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestCase5 {
	
			WebDriver driver;
			pom object;
		    
			
			@BeforeTest
			public void Beforetest() throws Exception{
				
				driver = new ChromeDriver();
				driver.get("https://automationexercise.com");
				driver.manage().window().maximize();
				
			}
			

			//5
			@Test(priority = 5)
			public void RegisterUserExistingmail() throws InterruptedException {
				object = new pom(driver);
				object.logsignbtn();
				driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/h2")).getText();
				object.signup("Swapnil2","sgandge2@gmail.com");
				System.out.println(driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/p")).getText());
				Thread.sleep(2000);
			}
			
			@AfterTest
			public void Aftertest() {
				driver.quit();
				
			}
					
		
	}

