package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropAction {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html ");
	Thread.sleep(2000);
	WebElement rome = driver.findElement(By.id("box6"));
	WebElement italy = driver.findElement(By.id("box106"));
	Actions act=new Actions(driver);
	act.dragAndDrop(rome, italy).perform();
	Thread.sleep(2000);
	WebElement copen = driver.findElement(By.id("box4"));
	WebElement den = driver.findElement(By.id("box104"));
	act.dragAndDrop(copen, den).perform();
	Thread.sleep(2000);
	driver.quit();
	
	}

}
