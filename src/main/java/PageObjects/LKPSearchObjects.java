package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LKPSearchObjects
	{

		WebDriver driver;
		public LKPSearchObjects(WebDriver driver)
			{
				// TODO Auto-generated constructor stub
				this.driver=driver;
			}
		By tableName=By.xpath("//input[@id='inpQue']");
		By tableValue=By.xpath("//input[@id='inpAns']");
		By search=By.xpath("//button[@class='btn btn-success float-left']");
		By table= By.xpath("//table[contains(@class,'table table-bordered')]");
		
		By lastColumn=By.cssSelector("tbody[class='ng-scope'] tr td:nth-child(6)");
		//By preview=By.cssSelector("tbody[class='ng-scope'] tr td:nth-child(6) button:nth-child(2)");
		By preview=By.cssSelector("tbody[class='ng-scope'] tr td:nth-child(6) button:nth-child(2) img");
		By closePreview=By.xpath("//button[contains(text(),'Close')]");
		public WebElement getTableName()
			{
				return(driver.findElement(tableName));
			}
		
		public WebElement getTableValue()
			{
				return(driver.findElement(tableValue));
			}
		
		public WebElement getSearch()
			{
				return(driver.findElement(search));
			}
		public WebElement getTable()
			{
				return(driver.findElement(table));
			}
		
		public By getLastColumn()
			{
				return(lastColumn);
			}
		
		public By getPreview()
			{
				return(preview);
			}
		
		
		public WebElement getClosePreview()
			{
				return(driver.findElement(closePreview));
			}
	}
