package actionClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKartScenarioUsingActionclass {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// giving implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		Actions act = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//button[.='✕']"));
		act.click(element).perform();
		WebElement appliances = driver.findElement(By.xpath("//img[@alt='Appliances']"));
		act.click(appliances).perform();
		System.out.println("clicked");
		WebElement hf = driver.findElement(By.xpath("//span[.='Home & Furniture']"));
		act.moveToElement(hf).perform();
		WebElement paintings = driver.findElement(By.linkText("Paintings"));
		act.click(paintings).perform();
		WebElement pricerange = driver.findElement(By.xpath("//div[.='Price -- Low to High']"));
		act.click(pricerange).perform();
	List<WebElement> images = driver.findElements(By.xpath("//a[@class='s1Q9rs']"));
	for(WebElement ele:images)
	{
		String text = ele.getText();
		if(text.equals("Jitesh Arts Small Size Psychedelic Tiger face Vastu Fri..."))
		{
			ele.click();
		break;
		}
	}

		driver.quit();

	}

}
