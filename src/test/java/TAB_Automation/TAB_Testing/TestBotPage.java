package TAB_Automation.TAB_Testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import PageObjects.TestBotObjects;
import Resources.BrowserDriver;

public class TestBotPage extends BrowserDriver
	{

		public void botChat(WebDriver driver) throws IOException, InterruptedException
			{
				Actions act=new Actions(driver);
						
				TestBotObjects botObjects = new TestBotObjects(driver);
				//botObjects.getBotClick().click();
				act.moveToElement(botObjects.getBotClick()).click().build().perform();
				botObjects.getInputText().sendKeys(" 2 Credit Card");
				botObjects.getSubmitText().click();

				FileInputStream fis = new FileInputStream("F:\\Gauri\\EclipseOxygen\\TAB_Testing\\TABBotQuestions.xlsx");
				XSSFWorkbook workBook = new XSSFWorkbook(fis);
				int numOfSheets = workBook.getNumberOfSheets();
				System.out.println("Number of sheets : "+numOfSheets);
				// ArrayList<String> botQuestions= new ArrayList<String>();
				for (int i = 0; i < numOfSheets; i++)
					{
						XSSFSheet sheet = workBook.getSheetAt(i);
						System.out.println("Sheet Name before Checking : "+sheet.getSheetName());
						if (sheet.getSheetName().equalsIgnoreCase("ChatBot"))
							{
								System.out.println("Sheet Name : " + sheet.getSheetName());
								int column = 0, count = 0;
								Iterator<Row> rows=sheet.iterator();
								Row nextRow=rows.next();
								Iterator<Cell> cells=nextRow.cellIterator();
								while (cells.hasNext())
									{
										Cell nextCell=cells.next();
										String cellText=nextCell.getStringCellValue();
										if(cellText.contains("Description"))
											{
												System.out.println("Column Name :"+cellText);
												column = count;
											}
										count++;
									}
								while (rows.hasNext())
									{
										
										Row row=rows.next();
										Cell questionCell=row.getCell(column);
										System.out.println(questionCell.getStringCellValue());
										if(questionCell.getStringCellValue().isEmpty())
											{
												break;
											}
										else
											{
										botObjects.getInputText().sendKeys(questionCell.getStringCellValue());
										Thread.sleep(2000);
										botObjects.getSubmitText().click();
										Thread.sleep(5000);
											}
									}
							}

						
					}

			}
	}
