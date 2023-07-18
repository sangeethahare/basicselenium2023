import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfKeys {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		Thread.sleep(2000);
		WebElement u = driver.findElement(By.name("user_name"));
		u.sendKeys("admin");
		u.sendKeys(Keys.CONTROL+"a");
		u.sendKeys(Keys.CONTROL+"c");
		driver.findElement(By.name("user_password")).sendKeys(Keys.CONTROL+"v");
		driver.findElement(By.id("submitButton")).submit();
		//Thread.sleep(2000);
		Thread.sleep(2000);
		driver.quit();
		
	}

}
