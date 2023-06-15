package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import helper.BrowserFactory;


public class VerifyValidLogin {
	
  @Test
  public void ChromeValidUser() throws Exception
  {
	
	  WebDriver driver =BrowserFactory.startBrowser("Chrome", "http://traveluat.gettameeni.com/en");
	  loginPageElements  login_Page =PageFactory.initElements(driver, loginPageElements.class);
	  login_Page.windowPopup();
      login_Page.login("user@gmail.com", "123456");
      
  }
  @Test
  public void EdgeValidUser() throws Exception
  {
	
	  WebDriver driver =BrowserFactory.startBrowser("Edge", "http://traveluat.gettameeni.com/en");
	  loginPageElements  login_Page =PageFactory.initElements(driver, loginPageElements.class);
	  login_Page.windowPopup();
      login_Page.login("user@gmail.com", "123456");
      
  }
  
 
 
}
