package webelementsinterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindRadioButton {
	public static void main(String[] args) throws InterruptedException {
WebDriver		driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
Thread.sleep(3000);
driver.findElement(By.linkText("Create new account")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//label[text()='Female']/parent::span/child::input")).click();
Thread.sleep(2000);
boolean radiobutton = driver.findElement(By.xpath("//label[text()='Female']/parent::span/child::input")).isSelected();
if(radiobutton==true)
{
	System.out.println("selected");}
else
{driver.findElement(By.xpath("//label[text()='Female']/parent::span/child::input")).click();

	}
Thread.sleep(3000);
driver.quit();

	}

}
