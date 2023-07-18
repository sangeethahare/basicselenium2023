package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWaitPractice {
	public static void main(String[] args) throws InterruptedException {
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
	WebElement element = driver.findElement(By.id("submitButton"));
	waitAndClick(element);
	}
	public static void waitAndClick(WebElement element) throws InterruptedException
	{
		int count=0;
		while(count<10)
		{
			try {
				element.click();
				System.out.println("element clicked");
				break;
			}
			catch(Exception e)
			{
				Thread.sleep(1000);
				count++;
			}
		}
	}
}
