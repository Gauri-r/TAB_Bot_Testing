package TAB_Automation.TAB_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import PageObjects.UserChatHistoryObjects;
import Resources.BrowserDriver;

public class UserChatHistory extends BrowserDriver
	{

		public void botUserChatHistory(WebDriver driver) throws InterruptedException
			{
				UserChatHistoryObjects logObjects = new UserChatHistoryObjects(driver);
				Thread.sleep(3000);
				logObjects.getSelectDate().sendKeys("07/07/2020");
				// System.out.println("Driver at botConversationLogOperation : "+driver);
				Thread.sleep(1000);
				driver.switchTo().alert().accept();
				Thread.sleep(2000);
				String MainWindow = driver.getWindowHandle();
				driver.switchTo().window(MainWindow);

				Thread.sleep(3000);
				Select selectUsername = new Select(logObjects.getSelectUsername());
				logObjects.getSelectUsername().click();
				selectUsername.selectByIndex(3);

				logObjects.getSelectUserSessionId().click();
				Select selectUserSessionId = new Select(logObjects.getSelectUserSessionId());
				selectUserSessionId.selectByIndex(1);
				Thread.sleep(5000);
				logObjects.getClickShow().click();
				Thread.sleep(8000);
			}

	}
