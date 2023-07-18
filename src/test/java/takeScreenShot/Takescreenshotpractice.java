package takeScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
//mport org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//.;;;;;];];;;import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Takescreenshotpractice {
	public static void main(String[] args) throws InterruptedException, IOException {
WebDriver	driver	=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.actitime.com/login.do");
  driver.findElement(By.id("username")).sendKeys("admin");
 driver.findElement(By.name("pwd")).sendKeys("manager");
 driver.findElement(By.id("loginButton")).click();
//JavascriptExecutor js=(JavascriptExecutor) driver;
//js.executeScript("arguments[0].value='admin'", un);
//js.executeScript("arguments[0].value='manager'", pwd);
//js.executeScript("arguments[0].click()", loginbtn);
Thread.sleep(5000);
//cast the TakesScreenshot interface to the driver
TakesScreenshot ts=(TakesScreenshot) driver;
//call get screenshot as method
File srclocation = ts.getScreenshotAs(OutputType.FILE);
//create folder to store the screenshot
File dstlocation =new File("./ScreenShots/image1.png");
//copy the screenshot from src to dst
Files.copy(srclocation, dstlocation);
Thread.sleep(4000);
System.out.println("screen shot taken");
driver.quit();



	}

}
