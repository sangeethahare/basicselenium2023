package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *  This is pom class for loginpage of actitime application
 * @author Hareprasath S
 *
 */
public class LoginPage {     //rule1:create classname as webpage title
	//rule 2: identify elements using @FindBy,@FindBys,@FindAll annotations
	@FindBy(id="username") private WebElement usernameEdt;//edt-edit
	@FindBy(name="pwd") private WebElement passwordEdt;
	@FindBy(id="loginButton") private WebElement loginLnk;//lnk-link
	
//rule3: provide constructor for this class
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);//this is consists current driver reference
	}
	//rule 4:proide getters for webelements

	public WebElement getUsernameEdt() {
		return usernameEdt;
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getLoginLnk() {
		return loginLnk;
	}
	/**
	 * Business Library-creating the method for the elements related to this page
	 * @param UN
	 * @param PWd
	 */
	public void loginToApp(String UN,String PWd)
	{
		usernameEdt.sendKeys(UN);
		passwordEdt.sendKeys(PWd);
		loginLnk.click();
	}

	
}
