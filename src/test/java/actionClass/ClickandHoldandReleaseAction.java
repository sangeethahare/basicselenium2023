package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickandHoldandReleaseAction {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/buttons");
	Thread.sleep(2000);
	WebElement clickbutton = driver.findElement(By.xpath("//button[.='Click Me']"));
	Actions act=new Actions(driver);
	act.clickAndHold(clickbutton).perform();
	System.out.println("clicked and held");
	Thread.sleep(2000);
	act.release(clickbutton).perform();
	System.out.println("button released");
	Thread.sleep(2000);
	driver.quit();
	
	}

}
