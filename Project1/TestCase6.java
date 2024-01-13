package Project1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestCase6 {
	
			WebDriver driver;
			pom object;
		    
			
			@BeforeTest
			public void Beforetest() throws Exception{
				
				driver = new ChromeDriver();
				driver.get("https://automationexercise.com");
				driver.manage().window().maximize();
				
			}
			

			//6
			@Test(priority = 6)
			public void ContactUsform() throws InterruptedException {
				object = new pom(driver);
				driver.getCurrentUrl();
				driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[8]/a")).click();
				driver.findElement(By.xpath("//*[@id=\"contact-page\"]/div[2]/div[1]/div/h2")).getText();
				driver.findElement(By.name("name")).sendKeys("Swapnil");
				driver.findElement(By.name("email")).sendKeys("sgandge23@gmail.com");
				driver.findElement(By.name("subject")).sendKeys("Selenium");
				driver.findElement(By.name("message")).sendKeys("Hi i'm Swapnil Gandge");
				driver.findElement(By.name("upload_file")).sendKeys("C:\\Users\\hp\\Desktop\\new.jpg");
				driver.findElement(By.name("submit")).click();
				
				driver.switchTo().alert().accept();
				System.out.println(driver.findElement(By.xpath("//*[@id=\"contact-page\"]/div[2]/div[1]/div/div[2]")).getText());
				driver.findElement(By.xpath("//*[@id=\"form-section\"]/a")).click();
				System.out.println(driver.getCurrentUrl());			
				Thread.sleep(2000);
			}
			
			@AfterTest
			public void Aftertest() {
				driver.quit();
				
			}
					
		
	}

