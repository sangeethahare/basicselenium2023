package pomClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToActitime {
	public static void main(String[] args) throws Throwable {
				WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.actitime.com/login.do");
//		driver.findElement(By.id("username")).sendKeys("admin");
//		driver.findElement(By.name("pwd")).sendKeys("manager");
//		WebElement loginButton = driver.findElement(By.id("loginButton"));
//		loginButton.click();
		
		//using property file to read username and password
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\commondata.properties");
		Properties p=new Properties();
		p.load(fis);
		String UN = p.getProperty("username");
		String PWd = p.getProperty("password");
		LoginPage lp=new LoginPage(driver);
//	//calling getter methods
//	lp.getUsernameEdt().sendKeys(UN);
//	lp.getPasswordEdt().sendKeys(PWd);
//	lp.getLoginLnk().click();
	//for code optimation calling Business library
	lp.loginToApp(UN, PWd);
	Thread.sleep(2000);
	System.out.println("Login successful");
	driver.quit();
	}
}
