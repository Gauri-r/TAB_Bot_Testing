package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConversationLogObjects
	{
		WebDriver driver;

		public ConversationLogObjects(WebDriver driver)
			{
				// TODO Auto-generated constructor stub
				this.driver = driver;
			}

		By firstCalendar = By.xpath("//input[@id='date1']");
		By secondCalendar = By.xpath("//input[@id='date2']");
		By fallbackCheckBox = By.xpath("//label[@class='custom-control-label']");
		By showConversationLog = By.xpath("//button[@class='btn btn-success float-left']");

		public WebElement getFirstCalendar()
			{
				return (driver.findElement(firstCalendar));
			}

		public WebElement getSecondCalendar()
			{
				return (driver.findElement(secondCalendar));
			}

		public WebElement getFallbackCheckBox()
			{
				return (driver.findElement(fallbackCheckBox));
			}

		public WebElement getShowConversationLog()
			{
				return (driver.findElement(showConversationLog));
			}

	}
