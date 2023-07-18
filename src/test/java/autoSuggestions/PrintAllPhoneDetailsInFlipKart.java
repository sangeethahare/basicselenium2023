package autoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllPhoneDetailsInFlipKart {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Redmi phones");

		Thread.sleep(2000);
		driver.findElement(By.className("L0Z3Pu")).click();
		Thread.sleep(3000);

		//List<WebElement> redmiPhones = driver.findElements(By.xpath("//div[text()='REDMI A1+ (Light Blue, 32 GB)']"));
		List<WebElement> redmiPhones = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		for (WebElement phone : redmiPhones) {
			String p = phone.getText();
			System.out.println(p);
		}
		driver.quit();
	}

}
