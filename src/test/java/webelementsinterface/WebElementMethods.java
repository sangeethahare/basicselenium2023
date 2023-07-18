package webelementsinterface;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(2000);
		// driver.findElement(By.id("username")).clear();
		// getting tagName using getTagName()
		String userNametag = driver.findElement(By.id("username")).getTagName();
		System.out.println("userNametag=" + userNametag);
		// getting tagtext using getText()
		String passwordtext = driver.findElement(By.name("pwd")).getText();
		System.out.println(" passwordtext=" + passwordtext);
		// getting attribute value using getAttribute()
		String attributevalue = driver.findElement(By.id("loginButton")).getAttribute("class");
		// there no given attribute in dom it return null
		System.out.println("attributevalue=" + attributevalue);
//		Point position = driver.findElement(By.id("keepLoggedInCheckBox")).getLocation();
//		int startX = position.getX();
//		int startY=position.getY();
//		System.out.println("startX and startY="+startX+" "+startY);
//		Dimension sizeofusernametextfield = driver.findElement(By.id("username")).getSize();
//		int height = sizeofusernametextfield.getHeight();
//		int width = sizeofusernametextfield.getWidth();
//		System.out.println("height and width="+height+" "+width);
		// getting position and size of element using getRect()
		Rectangle rectvalue = driver.findElement(By.id("username")).getRect();
		int startx = rectvalue.getX();
		int startY = rectvalue.getY();
		int height = rectvalue.getHeight();
		int width = rectvalue.getWidth();
		System.out.println("startx andstartY and height and width=" + startx + " " + startY + " " + height + " " + width);
		String cssvalue = driver.findElement(By.id("loginButton")).getCssValue("display");
		
		System.out.println("cssvalue=" + cssvalue);
		//getting role of webelement using getAriaRole()
		String usernameRole = driver.findElement(By.id("username")).getAriaRole();
		System.out.println("usernameRole="+usernameRole);
		Thread.sleep(2000);
		driver.quit();
	}

}
