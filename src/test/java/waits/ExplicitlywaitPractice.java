package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlywaitPractice {
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
			WebElement ele = driver.findElement(By.linkText("Organizations"));
			
			//creating WebDriverWait class object for explicitlywait
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			//wait util the element is clickable or not
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			System.out.println("element is clickable");
			//check whether the title contains particular text or not
			wait.until(ExpectedConditions.titleContains("Home"));
			System.out.println("title contains home");
			driver.quit();
			
	}

}
