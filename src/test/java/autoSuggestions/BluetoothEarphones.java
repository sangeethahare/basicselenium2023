package autoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BluetoothEarphones {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space(text())=\"Don't Change\"]/preceding-sibling::input"))
				.click();
		Thread.sleep(2000);
		//using Keys enum ,doing keyboard strokes/actions
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Boult Bluetooth earphones",Keys.ENTER);
		//driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		List<WebElement> bluetoothName = driver.findElements(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']"));
	
		for(WebElement name:bluetoothName)
		{
			if(name.getText().contains("Boult"))
			{
				System.out.println(name.getText());
			}
		}
		
		driver.quit();

	}
}
