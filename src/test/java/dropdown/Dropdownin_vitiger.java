package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownin_vitiger {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost:8888/");
	driver.findElement(By.name("user_name")).sendKeys("admin",Keys.TAB);
	Thread.sleep(2000);
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.id("submitButton")).submit();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Organizations")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("accountname")).sendKeys("leaf");
	Thread.sleep(2000);
	WebElement industry = driver.findElement(By.name("industry"));
	Select ind=new Select(industry);
	ind.selectByValue("Electronics");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='button'])[3]")).click();
	
	Thread.sleep(2000);
	driver.quit();
}
}
