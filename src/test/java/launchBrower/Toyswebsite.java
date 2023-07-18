package launchBrower;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toyswebsite {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magicpin.in/india/Coimbatore/Town-Hall/Toy-Store/");
		Thread.sleep(3000);
		WebElement locationbutton = driver.findElement(By.xpath("//div[@class='buttonContainer vertical']/child::button[@class='change']"));
		locationbutton.click();
		Thread.sleep(3000);
		driver.quit();
	}

}
