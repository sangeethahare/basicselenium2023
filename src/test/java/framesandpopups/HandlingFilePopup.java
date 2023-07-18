package framesandpopups;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFilePopup {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.foundit.in/seeker/registration");
		//if element contains type='file',directly we pass location of the file using sendKeys
	WebElement uploadresume = driver.findElement(By.xpath("//input[@type='file']"));
//	uploadresume.sendKeys("C:\\Users\\Hareprasath S\\Documents\\Sangeetha Resume.docx");
//		System.out.println("file uploaded");
	//upload file using AutoIT
	Runtime.getRuntime().exec("E:\\resumee.exe");
	Thread.sleep(2000);
		
		driver.quit();
	}

}
