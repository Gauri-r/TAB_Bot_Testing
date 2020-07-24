package TAB_Automation.TAB_Testing;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.AdminHomePage;
import PageObjects.LKPSearchObjects;
import Resources.BrowserDriver;

public class LKPSearchPage extends BrowserDriver
	{

		public void botLKPSearchOperation(WebDriver driver) throws InterruptedException
			{
				LKPSearchObjects searchLKP=new LKPSearchObjects(driver);
				searchLKP.getTableName().sendKeys("Lkp_1098");
				searchLKP.getTableValue().sendKeys("form 1098");
				Thread.sleep(3000);
				searchLKP.getSearch().click();
				Thread.sleep(5000);
				
				WebElement tableDriver = searchLKP.getTable();

				int noRows = tableDriver.findElements(searchLKP.getLastColumn()).size();
						
				System.out.println("Number of Cells in last column in LKP Search : " + noRows);

				/*tableDriver.findElement(By.xpath("//img[@id='previewLookupImg_3']")).click();
				Thread.sleep(3000);
				tableDriver.findElement(By.xpath("//button[contains(text(),'Close')]")).click();
				Thread.sleep(3000);
				tableDriver.findElement(By.xpath("//img[@id='previewLookupImg_2']")).click();
				Thread.sleep(3000);
				tableDriver.findElement(By.xpath("//button[contains(text(),'Close')]")).click();
				Thread.sleep(3000);  */
				
				
				for (int i = 0; i < noRows; i++)
					{
						// Below line also works but we provide page objects through pageObject class
						// tableDriver.findElements(By.cssSelector("tbody[class='ng-scope'] tr
						// td:nth-child(7) button:nth-child(2)")).get(i).click();
						tableDriver.findElements(searchLKP.getPreview()).get(i).click();
						Thread.sleep(2000);
						searchLKP.getClosePreview().click();
						Thread.sleep(2000);
						// System.out.println(num);
					} 
				
			}
	}
