package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysandClickAction {
public static void main(String[] args) throws InterruptedException {
	
WebDriver	driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://localhost:8888/");
Thread.sleep(2000);
Actions act=new Actions(driver);
//using sendKeys directly by using driver reference
//act.sendKeys("admin").perform();
WebElement username = driver.findElement(By.name("user_name"));
WebElement loginbutton = driver.findElement(By.id("submitButton"));
act.sendKeys(username,"admin",Keys.TAB,"admin").perform();
Thread.sleep(2000);
act.click(loginbutton).perform();
Thread.sleep(2000);
driver.quit();

}
}
