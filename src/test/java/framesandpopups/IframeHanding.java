package framesandpopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IframeHanding {
	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
	driver.get("https://jqueryui.com/droppable/");
	//handling frames
	driver.switchTo().frame(0);
	System.out.println("driver controll is switched to frame");
	WebElement drag = driver.findElement(By.id("draggable"));
	WebElement drop = driver.findElement(By.id("droppable"));
	Actions act=new Actions(driver);
	//drag and drop
	act.dragAndDrop(drag, drop).perform();
	System.out.println("drap and drop successfull");
	driver.switchTo().defaultContent();
	WebElement accept = driver.findElement(By.linkText("Accept"));
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	wait.until(ExpectedConditions.elementToBeClickable(accept));
	System.out.println("clicked");
	accept.click();
	driver.quit();
	}

}
