package Project1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestCase3 {
	
			WebDriver driver;
			pom object;
		    
			
			@BeforeTest
			public void Beforetest() throws Exception{
				
				driver = new ChromeDriver();
				driver.get("https://automationexercise.com");
				driver.manage().window().maximize();
				
			}
			
			//3
			@Test(priority = 3)
			public void login_incorrect() throws InterruptedException {
				object = new pom(driver);
				object.logsignbtn();
				driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/h2")).getText();
				object.login("sgandge@gmail.com","1235465sjk4");
				System.out.println(driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/p")).getText());
				Thread.sleep(2000);	
				
			}
			
			@AfterTest
			public void Aftertest() {
				driver.quit();
				
			}
					
		
	}

