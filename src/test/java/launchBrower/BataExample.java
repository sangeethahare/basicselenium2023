package launchBrower;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BataExample {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bata.in/cart");
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//a[@title='Visit Home Page']")).click();
		driver.findElement(By.xpath("//span[text()='Stores']/parent::a/child::*[local-name()='svg']")).click();
	//	driver.findElement(By.xpath("//span[normalize-space(text())='Login']/parent::a[@class='cc-headerBar-link loginLink']/child::*[local-name()='svg']")).click();
		Thread.sleep(4000);
		driver.quit();
	}

}
