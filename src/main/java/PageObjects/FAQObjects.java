package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FAQObjects
	{
		WebDriver driver;

		public FAQObjects(WebDriver driver)
			{
				// TODO Auto-generated constructor stub
				this.driver = driver;
			}

		By questionSearch = By.xpath("//input[@id='inpQue']");
		By answerSearch = By.xpath("//input[@id='inpAns']");
		By buttonSearch = By.xpath("//button[@class='btn btn-success float-left']");
		By table = By.xpath("//table[contains(@class,'table table-bordered')]");
		By lastColumnClass = By.cssSelector("tbody[class='ng-scope'] tr td:nth-child(7)");
		// By preview=By.xpath("//table[contains(@class,'table table-bordered')]");
		By preview = By.cssSelector("tbody[class='ng-scope'] tr td:nth-child(7) button:nth-child(2)");
		By closePreview = By.xpath("//div[@id='content']//button[@class='close'][contains(text(),'×')]");

		public WebElement getQuestionSearch()
			{
				return (driver.findElement(questionSearch));
			}

		public WebElement getAnswerSearch()
			{
				return (driver.findElement(answerSearch));
			}

		public WebElement getButtonSearch()
			{
				return (driver.findElement(buttonSearch));
			}

		public WebElement getTable()
			{
				return (driver.findElement(table));
			}

		public int getLastColumnClass()
			{
				return (driver.findElements(lastColumnClass).size());
			}

		public By getPreview()
			{
				return (preview);
			}

		public WebElement getClosePreview()
			{
				return (driver.findElement(closePreview));
			}
	}
