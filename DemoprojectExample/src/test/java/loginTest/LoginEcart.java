package loginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginEcart extends Base
{
	@Test
	public void loginWithValidCredentials()
	{
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		String user="standard_user";
		username.sendKeys(user);
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		String pass="secret_sauce";
		password.sendKeys(pass);
		WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();
	}
	@Test
	public void loginWithNoCredentials()
	{
		WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();
	}
	@Test
	public void loginWithBothInvalidCredentials()
	{
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		String user="standard_usr";
		username.sendKeys(user);
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		String pass="secret_sauc";
		password.sendKeys(pass);
		WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();
	}
	@Test
	public void loginWithValidUsernameAndInvalidpassword()
	{
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		String user="standard_user";
		username.sendKeys(user);
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		String pass="secret_sauc";
		password.sendKeys(pass);
		WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();
	}
}
