package launchBrower;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MytraExa {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop-global.malaicha.com/login");
		String showpasswordTagName = driver.findElement(By.xpath("//p[text()=' Password']")).getTagName();
		System.out.println("showpasswordTagName="+showpasswordTagName);
		Rectangle rectValue = driver.findElement(By.xpath("//button[text()='Register']")).getRect();
		int startX = rectValue.getX();
		System.out.println("startX="+startX);
		int startY = rectValue.getY();
		System.out.println("startY="+startY);
		int height= rectValue.getHeight();
		System.out.println("height="+height);
		int width = rectValue.getWidth();
		System.out.println("width="+width);
		String cssValue = driver.findElement(By.xpath("//button[text()='Sign In']")).getCssValue("margin-top");
		System.out.println("cssValue="+cssValue);
		Thread.sleep(2000);
		driver.quit();
	}

}
