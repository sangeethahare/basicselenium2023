package javaScriptExecutorInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToactitimeUsingJsExecutor {
	public static void main(String[] args) throws InterruptedException {
		//launch the browser
	
	WebDriver driver=new ChromeDriver();
	//maximizing the window
	driver.manage().window().maximize();
	//load the URL
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(2000);
	//find username textfield
WebElement untextfield = driver.findElement(By.id("username"));
WebElement pwd = driver.findElement(By.name("pwd"));
WebElement loginbutton = driver.findElement(By.id("loginButton"));

//downcasting driver reference
JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("arguments[0].value='admin'",untextfield);
Thread.sleep(2000);
js.executeScript("arguments[0].value='manager'", pwd);
Thread.sleep(2000);
js.executeScript("arguments[0].click()",loginbutton);
Thread.sleep(2000);
//get the title of the weppage
 String webpagetitle = js.executeScript("return document.title", "").toString();
 System.out.println("webpagetitle"+webpagetitle);
driver.quit();

	}

}
