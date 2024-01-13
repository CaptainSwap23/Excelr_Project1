package Project1;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class pom {

	WebDriver driver;
	//constructor
	public pom(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a") WebElement logsignbtn;
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]") WebElement signupname;
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]") WebElement signupemail;
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[3]/div/form/button") WebElement submitbtn;
	@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a") WebElement deleteaccbtn;
	@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a") WebElement logoutbtn;
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[1]/div/form/button") WebElement loginbtn;
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]") WebElement loginemail;
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]") WebElement loginpassword;
	@FindBy(xpath="//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u") WebElement viewCartbtn;
	@FindBy(xpath="//*[@id=\"do_action\"]/div[1]/div/div/a") WebElement Proceedtocheckoutbtn;
	@FindBy(xpath="//*[@id='header']/div/div/div/div[2]/div/ul/li[2]/a") WebElement productsbtn;
	
	public void logsignbtn() {
		logsignbtn.click();
	}
	public void Products() { 
		productsbtn.click();
	}
	public void logout() {
		logoutbtn.click();
	}
	public void deleteacc() {
		deleteaccbtn.click();
	}
	public void login(String email,String password) {
		
		loginemail.sendKeys(email);
		loginpassword.sendKeys(password);	
		loginbtn.click();
	}
	public void signup(String name,String email) {
		
		signupname.sendKeys(name);
		signupemail.sendKeys(email);	
		submitbtn.click();	
	}
	public void ViewCart() {
		viewCartbtn.click();
	}
	public void Proceedtocheckout() { 
		Proceedtocheckoutbtn.click();
	}
	public void registeruser() {
		driver.findElement(By.id("uniform-id_gender1")).click();
		driver.findElement(By.id("password")).sendKeys("123456789");
		
		Select d =new Select(driver.findElement(By.id("days")));
		d.selectByValue("23");
		Select m =new Select(driver.findElement(By.id("months")));
		m.selectByValue("6");
		Select y =new Select(driver.findElement(By.id("years")));
		y.selectByValue("2001");
		
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();

		driver.findElement(By.id("first_name")).sendKeys("Swapnil");
		driver.findElement(By.id("last_name")).sendKeys("Gandge");
		driver.findElement(By.id("company")).sendKeys("ExcelR");
		driver.findElement(By.id("address1")).sendKeys("Shahu-nagar");
		driver.findElement(By.id("address2")).sendKeys("Majalgaon");
		
		Select c = new Select(driver.findElement(By.id("country")));
		c.selectByVisibleText("India");
		
		driver.findElement(By.id("state")).sendKeys("Maharastra");
		driver.findElement(By.id("city")).sendKeys("Majalgaon");
		driver.findElement(By.id("zipcode")).sendKeys("431131");
		driver.findElement(By.id("mobile_number")).sendKeys("8600207280");
		
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button")).click();
	}
	public void PaymentDetails() {
		driver.findElement(By.name("name_on_card")).sendKeys("Swapnil");
		driver.findElement(By.name("card_number")).sendKeys("12345678912345");
		driver.findElement(By.name("cvc")).sendKeys("235");
		driver.findElement(By.name("expiry_month")).sendKeys("3");
		driver.findElement(By.name("expiry_year")).sendKeys("2027");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
	}
	

	
}
