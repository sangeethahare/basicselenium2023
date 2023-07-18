package webelementsinterface;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckAllCheckBoxes {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Tasks']/parent::a")).click();
	Thread.sleep(2000);
	List<WebElement> checkBox = driver.findElements(By.xpath("//div[@class='img']"));
	for(WebElement element:checkBox)
	{
		element.click();
		Thread.sleep(1000);
		break;
	}
	driver.quit();
	}

}
