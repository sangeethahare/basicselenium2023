package framesandpopups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindow {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.linkText("Open New Seperate Windows")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
Set<String> windows = driver.getWindowHandles();
for(String wid:windows)
{
String title = driver.switchTo().window(wid).getTitle();
if(title.contains("Selenium"))
{
	System.out.println("webpage title="+title);
	break;}
}
driver.findElement(By.xpath("//span[.='Projects']")).click();
Thread.sleep(2000);
for(String wid:windows)
{
String title = driver.switchTo().window(wid).getTitle();
if(title.contains("Frames"))
{
	System.out.println("webpage title="+title);
	break;}
}
driver.findElement(By.linkText("WebTable")).click();
Thread.sleep(2000);
driver.quit();
		
	}



}
