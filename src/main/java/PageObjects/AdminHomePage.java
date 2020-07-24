package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Resources.BrowserDriver;

public class AdminHomePage extends BrowserDriver
	{
		WebDriver driver;

		public AdminHomePage(WebDriver driver)
			{
				// TODO Auto-generated constructor stub
				this.driver = driver;
			}

		By FAQ = By.xpath("//div[@class='col-md-12 row']//div[@id='FAQBotImg']//div[@class='linkBoxes']");
		By Test_Bot = By.xpath("//div[@id='TestBotImg']//div[@class='linkBoxes']");
		By LKP_Search = By.xpath("//div[@id='LookupMaintImg']//div[@class='linkBoxes']");
		By Usage_Dashboard = By.xpath("//div[@id='UsageDashboardImg']//div[@class='linkBoxes']");
		By UserChatHistory = By.xpath("//div[@id='ChatHistoryImg']//div[@class='linkBoxes']"); 
		By ConversationLog = By.xpath("//div[@id='FailedChats']//img"); 
		
		public WebElement getFAQ()
			{
				System.out.println("Driver at FAQ  : " + driver);
				driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

				return (driver.findElement(FAQ));
			}

		public WebElement getTest_Bot()
			{
				System.out.println("Driver at getTest_Bot  : " + driver);

				return (driver.findElement(Test_Bot));
			}

		public WebElement getLKP_Search()
			{
				System.out.println("Driver at getLKP_Search  : " + driver);

				return (driver.findElement(LKP_Search));
			}

		public WebElement getUsage_Dashboard()
			{
				System.out.println("Driver at getUsage_Dashboard  : " + driver);

				return (driver.findElement(Usage_Dashboard));
			}

		public WebElement getUserChat_History()
			{

				System.out.println("Driver at getUserChat_History  : " + driver);
				driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

				return (driver.findElement(UserChatHistory));
			}

		public WebElement getConversation_Log()
			{

				System.out.println("Driver at getConversation_Log  : " + driver);
				driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

				return (driver.findElement(ConversationLog));
			}
	}
