package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class MouseHoveringAction {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		//move by offset values
		act.moveByOffset(20, 20).click().perform();
		//driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//div[.='Electronics']"));
		//mousehovering action
		//act.moveToElement(element, 30, 30).perform();
		act.moveToElement(element).perform();
		WebElement gaming = driver.findElement(By.xpath("//a[.='Gaming']"));
		act.moveToElement(gaming).perform();
		Thread.sleep(2000);
		WebElement gamingmouse = driver.findElement(By.linkText("Gaming Consoles"));
		act.moveToElement(gamingmouse).perform();
		Thread.sleep(2000);
		driver.quit();

	}

}
