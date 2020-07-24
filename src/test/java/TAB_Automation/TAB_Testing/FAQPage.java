package TAB_Automation.TAB_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import PageObjects.AdminHomePage;
import PageObjects.FAQObjects;
import Resources.BrowserDriver;

public class FAQPage extends BrowserDriver
	{

		public void FAQOperation(WebDriver driver) throws InterruptedException
			{
				FAQObjects fObject = new FAQObjects(driver);
				System.out.println("Driver in FAQOperation  : " + driver);

				fObject.getQuestionSearch().sendKeys("Card");
				Thread.sleep(3000);
				fObject.getButtonSearch().click();

				Thread.sleep(5000);
				WebElement tableDriver = fObject.getTable();

				int noRows = fObject.getLastColumnClass();
				System.out.println("Number of Cells in last column : " + noRows);

				for (int i = 0; i < noRows; i++)
					{
						// Below line also works but we provide page objects through pageObject class
						// tableDriver.findElements(By.cssSelector("tbody[class='ng-scope'] tr
						// td:nth-child(7) button:nth-child(2)")).get(i).click();
						tableDriver.findElements(fObject.getPreview()).get(i).click();
						Thread.sleep(2000);
						fObject.getClosePreview().click();
						Thread.sleep(2000);
						// System.out.println(num);
					}
			}
	}
