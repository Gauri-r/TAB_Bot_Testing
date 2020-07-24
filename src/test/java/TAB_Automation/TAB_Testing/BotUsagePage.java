package TAB_Automation.TAB_Testing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageObjects.BotUsageObjects;
import Resources.BrowserDriver;

public class BotUsagePage extends BrowserDriver
	{

		public void botUsageOperation(WebDriver driver) throws InterruptedException
			{
				BotUsageObjects usageObject = new BotUsageObjects(driver);
				System.out.println("Driver in botUsageOperation  : " + driver);
				usageObject.getWeekUsage().click();
				Thread.sleep(5000);
				usageObject.getMonthUsage().click();
				Thread.sleep(5000);
				usageObject.getLastQuaterUsage().click();
				Thread.sleep(5000);
				usageObject.getLastYearUsage().click();
				Thread.sleep(5000);
				usageObject.getDateRangeSearchBox().click();
				Thread.sleep(5000);

				// WebElement leftDatePanel=usageObject.getLeftDatePanel();
				// WebElement rightDatePanel=usageObject.getRightDatePanel();
				List<WebElement> leftPanelDates = driver.findElements(usageObject.getLeftGridCell());
				List<WebElement> rightPanelDates = driver.findElements(usageObject.getRightGridCell());

				int noOfDates = driver.findElements(usageObject.getLeftGridCell()).size();
				int noOfDatesright = driver.findElements(usageObject.getRightGridCell()).size();
				System.out.println("Size of Left Grid Calendar: " + noOfDates);
				System.out.println("Size of Right Grid Calendar: " + noOfDatesright);

				for (int i = 0; i < noOfDates; i++)
					{
						String dateLeft = driver.findElements(usageObject.getLeftGridCell()).get(i).getText();
						if (dateLeft.equalsIgnoreCase("23"))
							{
								driver.findElements(usageObject.getLeftGridCell()).get(i).click();
								break;
							}
					}

				for (int j = 0; j < noOfDates; j++)
					{
						String dateRight = driver.findElements(usageObject.getRightGridCell()).get(j).getText();
						if (dateRight.equalsIgnoreCase("12"))
							{
								driver.findElements(usageObject.getRightGridCell()).get(j).click();
								break;
							}
					}

				/*
				 * leftDatePanel.findElement(usageObject.getSelectLeftDate()).click();
				 * 
				 * 
				 * //usageObject.getSelectLeftDate().click(); Thread.sleep(5000);
				 * usageObject.getSelectRightDate().click(); Thread.sleep(5000);
				 * //driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
				 */

				usageObject.getClickApply().click();
				usageObject.getSearch().click();
				Thread.sleep(8000);

			}

	}
