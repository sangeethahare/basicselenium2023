package javaScriptExecutorInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisabledElement {
	public static void main(String[] args) throws InterruptedException {
		//launch browser
	WebDriver	driver=new ChromeDriver();
	//pre codition
	driver.manage().window().maximize();
	//load the URL
	driver.get("https://demoapp.skillrary.com/");
	//identify the disabled element
	WebElement disabledtextfield = driver.findElement(By.xpath("//input[@class='form-control']"));
	//downcasting
	JavascriptExecutor js=(JavascriptExecutor) driver;
	//enter data into disabled textfield
	js.executeScript("arguments[0].value='qspider'", disabledtextfield);//this is the only way to enter text in enabled/disabled textfield
	Thread.sleep(4000);
	driver.quit();
	}

}
