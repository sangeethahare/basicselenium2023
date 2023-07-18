package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysandClickActioninActitime {
	public static void main(String[] args) throws InterruptedException {
WebDriver		driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.actitime.com/login.do");
Thread.sleep(2000);
Actions act=new Actions(driver);
 WebElement username = driver.findElement(By.id("username"));
 act.sendKeys(username,"admin",Keys.TAB,"manager").perform();
 Thread.sleep(2000);
 WebElement loginbutton = driver.findElement(By.id("loginButton"));
 act.click(loginbutton).perform();
 Thread.sleep(2000);
 driver.quit();
	}

}
