package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TABLoginObjects
	{

		WebDriver driver;

		public TABLoginObjects(WebDriver driver)
			{
				// TODO Auto-generated constructor stub
				this.driver = driver;
			}

		By userName = By.xpath("//input[@placeholder='Access ID']");
		By password = By.xpath("//input[@placeholder='Passcode']");
		By login = By.xpath("//button[@type='button']");

		public WebElement getuserName()
			{
				return (driver.findElement(userName));
			}

		public WebElement getpassword()
			{
				return (driver.findElement(password));
			}

		public WebElement getLogin()
			{
				return (driver.findElement(login));
			}
	}
