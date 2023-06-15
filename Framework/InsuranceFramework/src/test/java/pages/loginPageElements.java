package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

//page object model with page factory
public class loginPageElements {
	
	WebDriver driver; 
	
	/*  first find all elements and write methods 
	 * then create web driver and constructor  */
	
	//create constructor 
	public loginPageElements(WebDriver driver)
	{
		this.driver =driver;
		                                                                                                        

		//this.driver is public getting local driver
	}
	
	//findallElements for login
	//First way 
	@FindBy(id="lnkLoginButton") 
	WebElement login_Button;
	
	//Second way
	@FindBy(how=How.ID,using="login-email")
	WebElement login_email;

		@FindBy(how=How.NAME,using="Password")
		WebElement login_password;
		@FindBy(how=How.ID,using="btnLogin")
		WebElement btnLogin;
	//Method Switch to window pop up
		 @SuppressWarnings("deprecation")
		public void windowPopup() {
			 //page is taking time so added wait
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			 login_Button.click();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

				}
    //create method for the elements
       public void login(String username, String password)     //with parameter
    {
	 login_email.sendKeys(username);
	 login_password.sendKeys(password);
	 btnLogin.click();
	
 }


}
