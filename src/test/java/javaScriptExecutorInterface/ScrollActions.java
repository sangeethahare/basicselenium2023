package javaScriptExecutorInterface;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollActions {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/downloads/");
	Thread.sleep(2000);
	//downcasting to make use of javascriptexecutor methods
	JavascriptExecutor js=(JavascriptExecutor)driver;
	//scrolldown action
	js.executeScript("window.scrollBy(0,1000)","");
	Thread.sleep(2000);
	//scroll up action
	js.executeScript("window.scrollBy(0,-1000)", "");
	Thread.sleep(2000);
	//scroll right
	js.executeScript("window.scrollBy(200,0)", "");
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(-200,0)", "");
	Thread.sleep(2000);
	//scroll utill the bottom of page
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
	Thread.sleep(2000);
	//scroll utill the complete upwards
	js.executeScript("window.scrollTo(0,-document.body.scrollHeight)", "");
	Thread.sleep(2000);
	
	driver.quit();
	}

}
