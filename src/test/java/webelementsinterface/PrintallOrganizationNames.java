package webelementsinterface;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintallOrganizationNames {
	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost:8888/");
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.id("submitButton")).click();
	driver.findElement(By.linkText("Organizations")).click();
	List<WebElement> orgNames = driver.findElements(By.xpath("//a[@title='Organizations']"));
	for(WebElement name:orgNames)
	{
		String value = name.getText();
		System.out.println("name="+value);
	}
	driver.quit();
	}

}
