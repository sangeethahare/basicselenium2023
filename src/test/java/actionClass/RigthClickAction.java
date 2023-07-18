package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RigthClickAction {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		WebElement rightclickbutton = driver.findElement(By.xpath("//span[.='right click me']"));
		Actions act = new Actions(driver);
		act.contextClick(rightclickbutton).perform();
		Thread.sleep(2000);
		WebElement paste = driver.findElement(By.xpath("//span[.='Paste']"));
		act.click(paste).perform();
		Thread.sleep(2000);
//WebElement doubleclickbutton = driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
//act.doubleClick(doubleclickbutton).perform();
		Thread.sleep(2000);
		driver.quit();

	}

}
