package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class singledropdownUsingSelectclass {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/select-menu");
	WebElement dropdown = driver.findElement(By.id("oldSelectMenu"));
	Select sel = new Select(dropdown);
	//to get all options in dropdown
	List<WebElement> opt = sel.getOptions();
	int count=0;
	for(WebElement ele:opt)
	{
		String name = ele.getText();
		
		System.out.println(name);
		count++;
	}
	System.out.println(count);
	//using index selecting option
	sel.selectByIndex(10);
	Thread.sleep(2000);
	//using value selecting option
	sel.selectByValue("4");
	Thread.sleep(2000);
	//using visible text selecting option
	sel.selectByVisibleText("Green");
	Thread.sleep(2000);
	driver.quit();
	}

}
