package TAB_Automation.TAB_Testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyDownAction;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.AdminHomePage;
import PageObjects.TABLoginObjects;
import Resources.BrowserDriver;

public class TABLoginPage extends BrowserDriver
	{

		@BeforeTest
		public void initialization() throws IOException
			{
				driver = initializeDriver();
				driver.get(prop.getProperty("url"));
				System.out.println("Driver Initialized AND URL get loaded");

			}

		@Test(dependsOnMethods = { "loginPageNaviagation" })
		public void FAQNavigation() throws IOException, AWTException, InterruptedException
			{
				AdminHomePage home = new AdminHomePage(driver);

				// To open in new window ... but doesnt open in new tab or window
				// act.moveToElement(home.getFAQ()).contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();;
				// System.out.println("New window opened");

				// To open in new window...Works in a proper manner but opens window in new tab
				// rather than in new window???
				/*
				 * act.moveToElement(home.getFAQ()).contextClick().build().perform(); Robot
				 * rbt=new Robot(); rbt.keyPress(KeyEvent.VK_DOWN);
				 * rbt.keyPress(KeyEvent.VK_DOWN); rbt.keyRelease(KeyEvent.VK_DOWN);
				 * rbt.keyPress(KeyEvent.VK_ENTER); rbt.keyRelease(KeyEvent.VK_ENTER);
				 */

				home.getFAQ().click();
				FAQPage FAQpageOperation = new FAQPage();
				FAQpageOperation.FAQOperation(driver);

				driver.navigate().back();
			} 

		/*@Test(dependsOnMethods = { "loginPageNaviagation" })
		public void Usage_DashboardeNavigation() throws IOException, InterruptedException
			{
				AdminHomePage home = new AdminHomePage(driver);

				home.getUsage_Dashboard().click();
				BotUsagePage botPageOperation = new BotUsagePage();
				botPageOperation.botUsageOperation(driver);
				driver.navigate().back();
			}  
		
	 @Test(dependsOnMethods = { "loginPageNaviagation" })
		public void Test_BotNavigation() throws IOException, InterruptedException
			{
				AdminHomePage home = new AdminHomePage(driver);

				home.getTest_Bot().click();
				TestBotPage botPage=new TestBotPage();
				botPage.botChat(driver);
				driver.navigate().back();
			} 
*/
	 	@Test(dependsOnMethods = { "loginPageNaviagation" })
		public void LKPSearchNavigation() throws InterruptedException
			{
				AdminHomePage home = new AdminHomePage(driver);

				home.getLKP_Search().click();
				driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
				LKPSearchPage searchPage=new LKPSearchPage();
				searchPage.botLKPSearchOperation(driver);
				driver.navigate().back();
			}
		 
/*
		@Test(dependsOnMethods = { "loginPageNaviagation" })
		public void BotUserChatHistory() throws IOException, InterruptedException
			{
				AdminHomePage home = new AdminHomePage(driver);
				home.getUserChat_History().click();

				UserChatHistory logPage = new UserChatHistory();
				logPage.botUserChatHistory(driver);

				driver.navigate().back();
			}
			
		 //Failed Chats
		@Test(dependsOnMethods = { "loginPageNaviagation" })
		public void BotConversationLog() throws IOException, InterruptedException
			{
				AdminHomePage home = new AdminHomePage(driver);
				home.getConversation_Log().click();

				ConversationLogPage logPage = new ConversationLogPage();
				logPage.botConversationLog(driver);

				driver.navigate().back();
			}
			 */
		
		@Test
		public void loginPageNaviagation() throws IOException
			{

				TABLoginObjects login = new TABLoginObjects(driver);
				login.getuserName().sendKeys("Avdhut@Bond.ai");
				login.getpassword().sendKeys("Asdf@1234");
				login.getLogin().click();

				/*
				 * AdminHomePage home=new AdminHomePage(driver);
				 * 
				 * driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
				 * home.getFAQ().click(); home.getTest_Bot().click();
				 * home.getUsage_Dashboard().click(); home.getBot_Usage().click();
				 * home.getLKP_Search().click();
				 */

			}

		

		/*
		 * @AfterTest public void tearDown() { driver.close(); }
		 */

	}
