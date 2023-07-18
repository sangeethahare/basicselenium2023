package webelementsinterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop-global.malaicha.com/registration");
		boolean checkboxD = driver.findElement(By.name("tncAccepted")).isDisplayed();
		if(checkboxD==true)
		{
			System.out.println("it is displayed");
			driver.findElement(By.name("tncAccepted")).click();
		}
		else {
			System.out.println("it is not displayed");
		}
		Thread.sleep(2000);
		boolean mobileNum = driver.findElement(By.name("mobileNumber")).isEnabled();
		if(mobileNum==true)
		{
			System.out.println("element is enabled");
		}
		else
		{
			System.out.println("element is not enabled");
		}
		Thread.sleep(2000);
		
		boolean checkboxS = driver.findElement(By.name("tncAccepted")).isSelected();
		if(checkboxS==true)
		{
			System.out.println("element is selected");
		}
		else
		{
			System.out.println("element is not selected");
		}
		driver.findElement(By.name("tncAccepted")).click();
		boolean selected = driver.findElement(By.name("tncAccepted")).isSelected();
		if(selected==true)
		{
			System.out.println("element selected");
		}
		else
		{
			System.out.println("not selected");
		}
		driver.quit();
	}

}
