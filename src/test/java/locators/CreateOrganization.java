package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateOrganization {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost:8888/");
	Thread.sleep(3000);
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.id("submitButton")).click();
	driver.findElement(By.linkText("Organizations")).click();
	driver.findElement(By.cssSelector("[title='Create Organization...']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("success");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();
	Thread.sleep(3000);
	
	driver.quit();
	
}
}
