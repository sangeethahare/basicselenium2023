package framesandpopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertHandling {
public static void main(String[] args) throws InterruptedException {
WebDriver	driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://demoqa.com/alerts");
driver.findElement(By.id("alertButton")).click();
driver.switchTo().alert().accept();
Thread.sleep(2000);
//handling confirmation alert
driver.findElement(By.id("confirmButton")).click();
driver.switchTo().alert().dismiss();
WebElement confirm = driver.findElement(By.id("confirmResult"));
System.out.println("text="+confirm.getText());
Thread.sleep(2000);
//prompt alert handling
driver.findElement(By.id("promtButton")).click();
Alert pmt = driver.switchTo().alert();
pmt.sendKeys("kaniyamudhan");
//getting text of alert popup

System.out.println(pmt.getText());
pmt.accept();

System.out.println("prompt text="+driver.findElement(By.id("promptResult")).getText());
Thread.sleep(2000);
driver.quit();
	
}

}
