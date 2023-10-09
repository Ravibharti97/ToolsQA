package toolsqa_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class Webtables_Page extends Base {

	public static String excelpath = "/home/ravi/eclipse-workspace/ToolsQA/Test Data/Updateddata.xlsx";

	public Webtables_Page() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//h5[text()='Elements']")
	private WebElement Elemntbtn;

	@FindBy(xpath = "//span[text()='Web Tables']")
	private WebElement Webtablebtn;

	@FindBy(xpath = "//button[text()='Add']")
	private WebElement Addbtn;

	@FindBy(xpath = "//input[@id='firstName']")
	private WebElement Firstnamefield;

	@FindBy(xpath = "//input[@id='lastName']")
	private WebElement Lastnamefield;

	@FindBy(xpath = "//input[@id='userEmail']")
	private WebElement Emailfield;

	@FindBy(xpath = "//input[@id='age']")
	private WebElement Agefield;

	@FindBy(xpath = "//input[@id='salary']")
	private WebElement Salaryfield;

	@FindBy(xpath = "//input[@id='department']")
	private WebElement Departmentfield;

	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement Submitbtn;

	public void ClickonAddbtn() {

		Elemntbtn.click();
		Webtablebtn.click();
	}

	public void filldetails() {

		for (int i = 1; i <= 4; i++) {
			Addbtn.click();
			Firstnamefield.sendKeys(getreaddataexcel(excelpath, 0, i));
			Lastnamefield.sendKeys(getreaddataexcel(excelpath, 1, i));
			Emailfield.sendKeys(getreaddataexcel(excelpath, 2, i));
			Agefield.sendKeys(getreaddataexcel(excelpath, 3, i));
			Salaryfield.sendKeys(getreaddataexcel(excelpath, 4, i));
			Departmentfield.sendKeys(getreaddataexcel(excelpath, 5, i));
			Submitbtn.click();

		}

	}
}
