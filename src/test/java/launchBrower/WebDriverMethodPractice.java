package launchBrower;

import java.net.URL;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodPractice {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dassault-aviation.com/en/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.dassault-aviation.com/en/group/");
		Thread.sleep(2000);
		//driver.navigate().back();
		URL mainURL = new URL("https://www.dassault-aviation.com/en/");
		URL defence=new URL(mainURL,"defense/");
		Thread.sleep(2000);
		driver.navigate().to(defence);
		
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		for(String wid:driver.getWindowHandles())
		{
//			String Url=driver.switchTo().window(wid).getCurrentUrl();
//			if(Url.equals("https://www.facebook.com/login/"))
//			{
//				String winid = driver.getWindowHandle();
//				System.out.println("winid="+winid);
//			}
//			else if(Url.equals("https://www.dassault-aviation.com/en/"))
//			{
//			driver.manage().window().minimize();	
//			}
			System.out.println(wid);
				
		}
		Thread.sleep(2000);
		
		driver.quit();
	}

}
