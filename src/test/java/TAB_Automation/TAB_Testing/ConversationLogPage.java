package TAB_Automation.TAB_Testing;

import org.openqa.selenium.WebDriver;

import PageObjects.ConversationLogObjects;
import Resources.BrowserDriver;

public class ConversationLogPage extends BrowserDriver
	{

		public void botConversationLog(WebDriver driver) throws InterruptedException
			{

				ConversationLogObjects logObjects = new ConversationLogObjects(driver);
				logObjects.getFirstCalendar().sendKeys("07/07/2020");
				logObjects.getSecondCalendar().sendKeys("08/07/2020");
				logObjects.getFallbackCheckBox().click();
				Thread.sleep(3000);
				logObjects.getShowConversationLog().click();
				Thread.sleep(8000);

			}

	}
