package framesandpopups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class NotificationPopup {
public static void main(String[] args) throws InterruptedException {
	//Browser setting
	ChromeOptions op=new ChromeOptions();
	op.addArguments("--disable-notifications");
	//launch the browser
	WebDriver driver=new ChromeDriver();
	//maximize the browser
	driver.manage().window().maximize();
	//giving implicitly wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//loading the website
	driver.get("https://yatra.com");
	Thread.sleep(3000);
	driver.quit();
	
}

}
