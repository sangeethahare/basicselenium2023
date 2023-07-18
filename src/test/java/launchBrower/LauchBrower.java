package launchBrower;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LauchBrower {
	public static void main(String[] args) throws Throwable {
//		ChromeDriver driver= new ChromeDriver();
//		System.out.println("BrowserLaunched");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		//to load URL
		driver.get("http://flipkart.com");
		//to get page title
		String WebpageTitle = driver.getTitle();
		System.out.println("WebpageTitle="+WebpageTitle);
		//to get currentURL
		String currentURL = driver.getCurrentUrl();
		System.out.println("currentURL="+currentURL);
		//String pageSourceCode = driver.getPageSource();
	//	System.out.println("pageSourceCode="+pageSourceCode);
		
		driver.quit();
		
	}

}
