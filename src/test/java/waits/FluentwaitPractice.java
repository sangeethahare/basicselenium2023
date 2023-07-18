package waits;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentwaitPractice {
	public static void main(String[] args) {
		//to launch the browser
		WebDriver driver=new ChromeDriver();
		//to maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//to load URL into browser
		driver.get("http://localhost:8888/");
		//identify the username textfield
	WebElement usernametextfield = driver.findElement(By.name("user_name"));
	//action on sending value
	usernametextfield.sendKeys("admin");
	
	//identify the password textfield
	WebElement pwdtextfield = driver.findElement(By.name("user_password"));
	//action on sending value
	pwdtextfield.sendKeys("admin");
	
	//identify login button
	WebElement loginbutton = driver.findElement(By.id("submitButton"));
	//action to click login button
	loginbutton.click();
	FluentWait wait=new FluentWait(driver);
	//modifying the polling interval
	wait.pollingEvery(Duration.ofMillis(200));
	//time duration
	wait.withTimeout(Duration.ofSeconds(5));
	//optional statements for avoiding suchkind of exceptions
	wait.ignoring(NoSuchElementException.class);
	wait.ignoring(NoAlertPresentException.class);
	//fluent wait also working for conditions using until method
	wait.until(ExpectedConditions.urlContains("Home"));
	System.out.println("url contains home");
	wait.until(ExpectedConditions.titleContains("Administrator"));
	System.out.println("yes..it has administrator");
	driver.quit();
	

	}

}
