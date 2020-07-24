package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserChatHistoryObjects
	{
		WebDriver driver;

		public UserChatHistoryObjects(WebDriver driver)
			{
				// TODO Auto-generated constructor stub
				this.driver = driver;
			}

		By selectDate = By.xpath("//input[@id='searchBondCreatedOn']");
		By selectUsername = By.xpath("//select[@id='searchUsername']");
		By selectUserSessionId = By.xpath("//select[@id='searchUserSessionId']");
		By clickShow = By.xpath("//button[@class='btn btn-success float-left outline-none']");

		public WebElement getSelectDate()
			{
				return (driver.findElement(selectDate));
			}

		public WebElement getSelectUsername()
			{
				return (driver.findElement(selectUsername));
			}

		public WebElement getSelectUserSessionId()
			{
				return (driver.findElement(selectUserSessionId));
			}

		public WebElement getClickShow()
			{
				return (driver.findElement(clickShow));
			}
	}
