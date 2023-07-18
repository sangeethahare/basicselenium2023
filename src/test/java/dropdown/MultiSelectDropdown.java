package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/select-menu");
	WebElement multiselectdd = driver.findElement(By.id("cars"));//base element
	//to check single or multi selet dropdown using isMultiple
	Select value=new Select(multiselectdd);
	boolean sel = value.isMultiple();
	if(sel==true)
		System.out.println("yes.. it is multi select dropdown");
	else
		System.out.println("it is not multi select dropdown");
	//select more than one option
	List<WebElement> opt = value.getOptions();
	int count=0;
	for(WebElement ele:opt)
	{
		count++;
		System.out.println(ele.getText());
	}
	System.out.println("count="+count);
	value.selectByIndex(0);
	Thread.sleep(2000);
	value.selectByValue("opel");
	value.selectByVisibleText("Audi");//subelement
	Thread.sleep(2000);
	//deselect audi from selected option
	value.deselectByVisibleText("Audi");
	Thread.sleep(2000);
	//deselect all selected option
//	value.deselectAll();
//	Thread.sleep(2000);
	//get all selected options
	List<WebElement> allOpt = value.getAllSelectedOptions();
	for(WebElement ele:allOpt)
	{
		System.out.println(ele.getText());
	}
	Thread.sleep(2000);
	//get first selected option
	WebElement firstOpt = value.getFirstSelectedOption();
	System.out.println("first selected option="+firstOpt.getText());
	Thread.sleep(2000);
	//get all subelements present in base element
	WebElement wrapperedele = value.getWrappedElement();
	System.out.println("all webelements="+wrapperedele.getText());
	Thread.sleep(2000);
	driver.quit();
	}

}
