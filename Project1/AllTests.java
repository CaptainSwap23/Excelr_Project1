package Project1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

public class AllTests {
	
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
			
			//7
			@Test(priority = 7)
			public void TestCasePage() throws InterruptedException {
				object = new pom(driver);
				System.out.println(driver.getCurrentUrl());
				driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")).click();
				System.out.println(driver.getCurrentUrl());			
				Thread.sleep(2000);
			}
			
			//8
			@Test(priority = 8)
			public void AllProductDetails() throws InterruptedException {
				object = new pom(driver);
				System.out.println(driver.getCurrentUrl());
				driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();
				System.out.println(driver.getCurrentUrl());					
				driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/ul/li/a")).click();

				System.out.println(driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/h2")).getText());
				System.out.println(driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[1]")).getText());
				System.out.println(driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/span")).getText());
				System.out.println(driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[2]")).getText());
				System.out.println(driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[3]")).getText());
				System.out.println(driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[4]")).getText());

				Thread.sleep(2000);
			}
			
			
			//9
			@Test(priority = 9)
			public void SearchProduct() throws InterruptedException {
				object = new pom(driver);
				System.out.println(driver.getCurrentUrl());
				driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();
				System.out.println(driver.getCurrentUrl());		
				driver.findElement(By.id("search_product")).sendKeys("Shirt");
				driver.findElement(By.id("submit_search")).click();
				System.out.println(driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/h2")).getText());
						
				Thread.sleep(2000);
			}
			
			
			//10
			@Test(priority = 10)
			public void SubscriptionHomePAge() throws InterruptedException {
				object = new pom(driver);
				System.out.println(driver.getCurrentUrl());

				WebElement email = driver.findElement(By.id("susbscribe_email"));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", email);
				
				driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/div/div[2]/div/h2")).getText();
				driver.findElement(By.id("susbscribe_email")).sendKeys("sgandge23@gmail.com");
				driver.findElement(By.id("subscribe")).click();
				System.out.println(driver.findElement(By.id("success-subscribe")).getText());

				Thread.sleep(2000);
			}
			
			
			//11
			@Test(priority = 11)
			public void SubscriptionCartPage() throws InterruptedException {
				object = new pom(driver);
				System.out.println(driver.getCurrentUrl());
				driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")).click();
				
				WebElement email = driver.findElement(By.id("susbscribe_email"));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", email);
				
				driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/div/div[2]/div/h2")).getText();
				email.sendKeys("sgandge23@gmail.com");
				driver.findElement(By.id("subscribe")).click();
				System.out.println(driver.findElement(By.id("success-subscribe")).getText());
				

				Thread.sleep(2000);
			}
			
			//12
			@Test(priority = 12)
			public void AddProduct() throws InterruptedException {
				object = new pom(driver);
				System.out.println(driver.getCurrentUrl());
				
				driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();
				Actions ac= new Actions(driver);
				WebElement hover1 = driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]"));
				ac.moveToElement(hover1).perform();
				driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/div/a")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button")).click();
				
				WebElement hover2 = driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[3]/div/div[1]"));
				ac.moveToElement(hover2).perform();
				driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[3]/div/div[1]/div[2]/div/a")).click();
				Thread.sleep(2000);
				object.ViewCart();				
				driver.findElement(By.id("product-1")).isDisplayed();
				driver.findElement(By.id("product-2")).isDisplayed();
				for(int j =1;j<=2;j++) {
					for(int i=3;i<=5;i++) {
				driver.findElement(By.xpath("//*[@id=\"product-"+j+"\"]/td["+i+"]")).isDisplayed();
					}
				}
				Thread.sleep(2000);
			}
			
			

			//13
			@Test(priority = 13)
			public void ProductQuantity() throws InterruptedException {
				object = new pom(driver);
				System.out.println(driver.getCurrentUrl());
				
				driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[1]/div[4]/div/div[2]/ul/li/a")).click();
				WebElement q = driver.findElement(By.name("quantity"));
				q.clear();
				q.sendKeys("4");
				driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")).click();
				Thread.sleep(2000);
				object.ViewCart();
				String exactquantity = driver.findElement(By.xpath("//*[@id=\"product-3\"]/td[4]/button")).getText();
				Assert.assertEquals( "4",exactquantity);
				Thread.sleep(2000);
			}
			
			

			//14
			@Test(priority = 14)
			public void RegisterWhileCheckout() throws InterruptedException {
				object = new pom(driver);
				System.out.println(driver.getCurrentUrl());
				
				Actions ac= new Actions(driver);
				WebElement hover = driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[1]/div[2]/div/div[1]"));
				ac.moveToElement(hover).perform();
				driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/a")).click();
				Thread.sleep(4000);
				object.ViewCart();
				System.out.println(driver.getCurrentUrl());
				object.Proceedtocheckout();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"checkoutModal\"]/div/div/div[2]/p[2]/a/u")).click();
				object.signup("a", "ary@gmail.com");
				object.registeruser();
				driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b")).getText();
				driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();
				driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a")).getText();
				driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")).click();
				object.Proceedtocheckout();
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
			
			//16
			@Test(priority = 16)
			public void LoginBeforeCheckout() throws InterruptedException {
				object = new pom(driver);
				System.out.println(driver.getCurrentUrl());
				object.logsignbtn();
				object.login("pranavkrb22@gmail.com", "123456789");
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
			
			
			//18
			@Test(priority = 18)
			public void ViewCategoryProducts() throws InterruptedException {
				object = new pom(driver);
				System.out.println(driver.getCurrentUrl());
				
				driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[1]/div/h2")).isDisplayed();
				driver.findElement(By.xpath("//*[@id=\"accordian\"]/div[1]/div[1]/h4/a")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"Women\"]/div/ul/li[2]/a")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/h2")).isDisplayed();
				driver.findElement(By.xpath("//*[@id=\"accordian\"]/div[2]/div[1]/h4/a")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"Men\"]/div/ul/li[1]/a")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/h2")).isDisplayed();

			}
			
			//19
			@Test(priority = 19)
			public void ViewCartBrandProducts() throws InterruptedException {
				object = new pom(driver);
				System.out.println(driver.getCurrentUrl());
				object.Products();			
				Thread.sleep(2000); 
				driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div[1]/div[2]")).isDisplayed();
				driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div[1]/div[2]/div/ul/li[1]/a")).click();
				Thread.sleep(2000); 
				System.out.println(driver.getCurrentUrl());
				driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/h2")).isDisplayed();
				driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div[1]/div[2]/div/ul/li[4]/a")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div")).isDisplayed();


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
			
			
			//21
			@Test(priority = 21)
			public void AddReviewOnProduct() throws InterruptedException {
				object = new pom(driver);
				object.Products();			
				driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/h2")).isDisplayed();
				driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/ul/li/a")).click();
				driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[3]/div[1]/ul/li/a")).getText();
				
				driver.findElement(By.id("name")).sendKeys("Swapnil");
				driver.findElement(By.id("email")).sendKeys("sgandge23@gmail.com");
				driver.findElement(By.id("review")).sendKeys("Great Product with the given price.");
				driver.findElement(By.id("button-review")).click();
				
				driver.findElement(By.xpath("//*[@id=\"review-section\"]/div/div/span")).isDisplayed();

			}
			
			//22
			@Test(priority = 22)
			public void AddToCartFromRecommended() throws InterruptedException {
				object = new pom(driver);
				WebElement bottom = driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[2]/h2"));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", bottom);
				
				driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[2]/h2")).isDisplayed();
				driver.findElement(By.xpath("//*[@id=\"recommended-item-carousel\"]/div/div[2]/div[1]/div/div/div/a")).click();
				Thread.sleep(2000);
				object.ViewCart();
				driver.findElement(By.xpath("//*[@id=\"product-4\"]")).isDisplayed();

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
			
			
			//24
			@Test(priority = 24)
			public void DownloadInvoice() throws InterruptedException {
				object = new pom(driver);
				System.out.println(driver.getCurrentUrl());
				
				Actions ac= new Actions(driver);
				WebElement hover = driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[1]/div[2]/div/div[1]"));
				ac.moveToElement(hover).perform();
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/a")).click();
				Thread.sleep(2000);
				object.ViewCart();
				System.out.println(driver.getCurrentUrl());
				object.Proceedtocheckout();
				driver.findElement(By.xpath("//*[@id=\"checkoutModal\"]/div/div/div[2]/p[2]/a/u")).click();
				object.signup("ssssss", "sssss123@gmail.com");
				object.registeruser();
				driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b")).getText();
				driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();
				driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a")).getText();
				driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")).click();
				object.Proceedtocheckout();
				
				driver.findElement(By.id("address_delivery")).isDisplayed();
				driver.findElement(By.id("cart_info")).isDisplayed();
				driver.findElement(By.xpath("//*[@id=\"ordermsg\"]/textarea")).sendKeys("This is a test");
				driver.findElement(By.xpath("//*[@id=\"cart_items\"]/div/div[7]/a")).click();
				object.PaymentDetails();
				driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/p")).isDisplayed();
				driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/a")).click();
				
				driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();
				object.deleteacc();
				driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b")).isDisplayed();
				driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();
				
				Thread.sleep(2000);
			}
			
			//25
			@Test(priority = 25)
			public void ScrollUpUsingArrow() throws InterruptedException {
				object = new pom(driver);
				System.out.println(driver.getCurrentUrl());
				
				WebElement bottom = driver.findElement(By.id("susbscribe_email"));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", bottom);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/div/div[2]/div/h2")).isDisplayed();
				driver.findElement(By.id("scrollUp")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"slider-carousel\"]/div/div[3]/div[1]/h2")).isDisplayed();

				Thread.sleep(2000);
			}
			
			//26
			@Test(priority = 26)
			public void ScrollUpWithoutUsingArrow() throws InterruptedException {
				object = new pom(driver);
				System.out.println(driver.getCurrentUrl());
				
				WebElement bottom = driver.findElement(By.id("susbscribe_email"));
				WebElement top = driver.findElement(By.id("slider-carousel"));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", bottom);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/div/div[2]/div/h2")).isDisplayed();
				js.executeScript("arguments[0].scrollIntoView();", top);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"slider-carousel\"]/div/div[3]/div[1]/h2")).isDisplayed();

				Thread.sleep(2000);
			}
			
			
			
			
			
			@AfterTest
			public void Aftertest() {
				driver.quit();
				
			}
					
		
	}

