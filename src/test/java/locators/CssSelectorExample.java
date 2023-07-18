package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorExample {
	public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
//	driver.findElement(By.cssSelector("[id='username']")).sendKeys("admin");
	//using id attribute using shortcut # for username field
	driver.findElement(By.cssSelector("#username")).sendKeys("admin");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("[type='password']")).sendKeys("manager");
	Thread.sleep(3000);
//	driver.findElement(By.cssSelector("[class='initial']")).click();
	//using class attribute shortcut .
	driver.findElement(By.cssSelector(".initial")).click();
	Thread.sleep(3000);
	driver.quit();
	}

}
