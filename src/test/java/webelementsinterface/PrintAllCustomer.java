package webelementsinterface;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllCustomer {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Tasks']/parent::a")).click();
	Thread.sleep(2000);
	List<WebElement> customer = driver.findElements(By.xpath("//div[@class='namesContainer']"));
	for(WebElement name: customer)
	{
		String value = name.getText();
		System.out.println("cutomer="+value);
	}
	driver.quit();
	}

}
