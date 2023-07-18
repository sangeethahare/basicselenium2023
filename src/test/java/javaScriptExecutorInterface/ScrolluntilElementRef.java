package javaScriptExecutorInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrolluntilElementRef {
	public static void main(String[] args) throws InterruptedException {
WebDriver		driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.selenium.dev/downloads/");
Thread.sleep(2000);
WebElement ref = driver.findElement(By.xpath("//h2[.='Selenium Level Sponsors']"));
int yaxis = ref.getRect().getY();
WebElement clickOn = driver.findElement(By.xpath("//img[@alt='BrowserStack']"));
JavascriptExecutor js=(JavascriptExecutor) driver;
//js.executeScript("arguments[0].scrollIntoView()",ref);
js.executeScript("window.scrollBy(0,"+yaxis+")", ref);
Thread.sleep(2000);

clickOn.click();
Thread.sleep(2000);
driver.quit();

	}

}
