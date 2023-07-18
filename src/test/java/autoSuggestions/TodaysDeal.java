package autoSuggestions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TodaysDeal {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//gives implicitly wait for every driver and findelement action
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//span[normalize-space(text())=\"Don't Change\"]/preceding-sibling::input"))
				.click();
		
		driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]")).click();
		//Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Electronics']/parent::a")).click();
		System.out.println("selected");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ref = driver.findElement(By.xpath("//div[.='Amazon Luna Gaming']"));
		WebElement clickon = driver.findElement(By.xpath("//div[.='Echo Frames']"));
////	List<WebElement> deal = driver.findElements(By.xpath("//div[@class='BadgeAutomated-module__badgeOneLineContainer_yYupgq1lKxb5h3bfDqA-B']"));
////	for(WebElement d:deal)
////	{
////		System.out.println(d.getText());
////	}
//		ref.click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()",ref);
		clickon.click();
	
		driver.quit();

	}

}
