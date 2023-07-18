package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToApp {
	public static void main(String[] args) throws Throwable {
		//to launch the browser
		WebDriver driver=new ChromeDriver();
		//to maximize the browser
		driver.manage().window().maximize();
		//to load URL into browser
		driver.get("http://localhost:8888/");
		//identify the username textfield
	WebElement usernametextfield = driver.findElement(By.name("user_name"));
	//action on sending value
	usernametextfield.sendKeys("admin");
	Thread.sleep(3000);
	//identify the password textfield
	WebElement pwdtextfield = driver.findElement(By.name("user_password"));
	//action on sending value
	pwdtextfield.sendKeys("admin");
	Thread.sleep(3000);
	//identify login button
	WebElement loginbutton = driver.findElement(By.id("submitButton"));
	//action to click login button
	loginbutton.click();
	//click on contact link
//	driver.findElement(By.linkText("Contacts")).click();
	driver.findElement(By.partialLinkText("Conta")).click();
	Thread.sleep(3000);
	driver.quit();
	
	
	
	
	
	
	
	
	
	}

}
