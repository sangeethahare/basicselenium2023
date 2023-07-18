package autoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print4StarratingLaptops {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptops");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3000);
		List<WebElement> lapName = driver.findElements(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']"));
		//Thread.sleep(3000);
		for (WebElement name: lapName) {
			 
			if(name.getText().contains("HP"))
			{
			name.click();
			//break;
			}
			
		}

		driver.quit();

	}

}
