package loginTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base
{
	 WebDriver driver;
	 @BeforeMethod
	public void browserInitialization()
	{
		 driver=new ChromeDriver();
		 driver.get("https://www.saucedemo.com/v1/");
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//implicit wait for 5 seconds
		 driver.manage().window().maximize();
	}
	// @AfterMethod
	public void quitAndClose()
	{
		driver.quit();
	}
}
