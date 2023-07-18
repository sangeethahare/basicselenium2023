package launchBrower;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://flipkart.com");
		 String windowID = driver.getWindowHandle();
		 System.out.println("windowID="+windowID);
		 Thread.sleep(3000);
		 driver.quit();
	}

}
