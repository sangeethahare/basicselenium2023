package framesandpopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingHiddenDivisionPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(3000);
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		
		loginButton.click();
		Thread.sleep(2000);
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.xpath("//div[.='3D modelling']/ancestor::tr/descendant::div[@class='img']")).click();
		driver.findElement(By.xpath("(//div[.='Copy to'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[.='Copy']/following-sibling::div[.='Cancel'])[3]")).click();
		System.out.println("clicked");
		Thread.sleep(2000);
		
driver.quit();
	}

}
