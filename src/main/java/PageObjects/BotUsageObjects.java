package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BotUsageObjects
	{

		WebDriver driver;

		public BotUsageObjects(WebDriver driver)
			{
				// TODO Auto-generated constructor stub
				this.driver = driver;
			}

		By weekUsage = By.xpath("//span[contains(text(),'W')]");
		By monthUsage = By.xpath("//span[contains(text(),'M')]");
		By lastQuaterUsage = By.xpath("//span[contains(text(),'Q')]");
		By lastYearUsage = By.xpath("//span[contains(text(),'Y')]");
		By dateRangeSearchBox = By.xpath("//input[@id='daterange4']");
		/*
		 * By leftDatePanel=By.
		 * xpath("//div[@class='calendar left']//div[@class='calendar-table']"); By
		 * rightDatePanel=By.xpath("");
		 */
		By rightGridCell = By.xpath("//div[@class='calendar right']/div/following-sibling::div[1]/table/thead/following-sibling::tbody[1]/tr/following-sibling::tr[1]/td[contains(@class,'available')]");
		By leftGridCell = By.xpath("//td[contains(@class,'available')]");

		By selectLeftDate = By.xpath("//td[@class='available in-range'][contains(text(),'23')]");
		By selectRightDate = By.xpath("//td[@class='in-range available'][contains(text(),'12')]");
		By clickApply = By.xpath("//button[@class='applyBtn btn btn-sm btn-success']");

		By search = By.xpath("//i[@class='fa fa-search']");

		public WebElement getWeekUsage()
			{
				return (driver.findElement(weekUsage));
			}

		public WebElement getMonthUsage()
			{
				return (driver.findElement(monthUsage));
			}

		public WebElement getLastQuaterUsage()
			{
				return (driver.findElement(lastQuaterUsage));
			}

		public WebElement getLastYearUsage()
			{
				return (driver.findElement(lastYearUsage));
			}

		public WebElement getDateRangeSearchBox()
			{
				return (driver.findElement(dateRangeSearchBox));
			}

		/*
		 * public WebElement getLeftDatePanel() {
		 * return(driver.findElement(leftDatePanel)); } public WebElement
		 * getRightDatePanel() { return(driver.findElement(rightDatePanel)); }
		 */

		public By getLeftGridCell()
			{
				return (leftGridCell);
			}

		public By getRightGridCell()
			{
				return (rightGridCell);
			}

		/*
		 * public By getSelectLeftDate() { return(selectLeftDate); }
		 * 
		 * public WebElement getSelectRightDate() {
		 * return(driver.findElement(selectLeftDate)); }
		 */

		public WebElement getClickApply()
			{
				return (driver.findElement(clickApply));
			}

		public WebElement getSearch()
			{
				return (driver.findElement(search));
			}
	}
