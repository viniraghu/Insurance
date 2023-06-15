package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BrowserFactory {
	
	 static WebDriver driver;
	 @BeforeTest
		@Parameters("browser")
	public static WebDriver startBrowser(String browserName,String url) throws Exception
	{
		
		if(browserName.equalsIgnoreCase("Edge"))
		{
			  driver = new EdgeDriver();
		}
		else if(browserName.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
		
		}
		else
		{
			throw new Exception("Browser is not correct");

		}
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}

}
