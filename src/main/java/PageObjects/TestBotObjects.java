package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestBotObjects
	{

		WebDriver driver;
		public TestBotObjects(WebDriver driver)
			{
				// TODO Auto-generated constructor stub
				this.driver=driver;
			}
		
		By botClick=By.xpath("//div[@class='back']");
		By inputText=By.xpath("//input[@id='txtMessage']");
		By submitText=By.xpath("//button[@class='no-border']//i//img");
		
		public WebElement getBotClick()
			{
				return(driver.findElement(botClick));
			}
		
		public WebElement getInputText()
			{
				return(driver.findElement(inputText));
			}
		
		public WebElement getSubmitText()
			{
				return(driver.findElement(submitText));
			}
		
	}
