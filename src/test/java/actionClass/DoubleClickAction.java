package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/product.php?product=java");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		WebElement add = driver.findElement(By.id("add"));
		WebElement minus = driver.findElement(By.id("minus"));
		act.doubleClick(add).perform();
		System.out.println("item added");
		Thread.sleep(2000);
		act.doubleClick(minus).perform();
		System.out.println("item removed");
		Thread.sleep(2000);
		driver.quit();

	}

}
