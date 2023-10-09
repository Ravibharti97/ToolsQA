package toolsqa_pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Base;

public class Form_page extends Base {

	public Form_page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//H5[text()='Forms']")
	private WebElement Formbtn;

	@FindBy(xpath = "//span[text()='Practice Form']")
	private WebElement PracticeFormbtn;

	@FindBy(xpath = "//input[@id='firstName']")
	private WebElement firstNameField;

	@FindBy(xpath = "//input[@id='lastName']")
	private WebElement LastNameField;

	@FindBy(xpath = "//input[@id='userEmail']")
	private WebElement UseremailField;

	@FindBy(xpath = "//div[text()='Gender']/following-sibling::div/div/input[@id='gender-radio-1']")
	private WebElement genderCheckbox;

	@FindBy(xpath = "//input[@id='userNumber']")
	private WebElement UserNumberfield;

	@FindBy(xpath = "//input[@id='dateOfBirthInput']")
	private WebElement DobField;

	@FindBy(className = "react-datepicker__month-select")
	private WebElement Monthname;

	@FindBy(className = "react-datepicker__year-select")
	private WebElement Years;

	@FindBy(xpath = "//div[@aria-label='Choose Friday, October 10th, 2025']")
	private WebElement Fixdate;

	@FindBy(xpath = "//input[@id='subjectsInput']")
	private WebElement SubjectField;

	@FindBy(xpath = "//div[@class='col-md-3 col-sm-12']/following-sibling::div/div/input[@value='1']")
	private WebElement hobbybtn;

	@FindBy(xpath = "//input[@id='uploadPicture']")
	private WebElement UploadProfile;

	@FindBy(xpath = "//textarea[@id='currentAddress']")
	private WebElement CurrentAddressField;

	@FindBy(xpath = "//input[@id='react-select-3-input']")
	private WebElement StateField;

	@FindBy(xpath = "//div[@class=' css-1hwfws3']/div[text()='Select City']/following::div/div/input")
	private WebElement CityField;

	@FindBy(xpath = "//*[text()='Submit']")
	private WebElement Submitbtn;

	List<WebElement> Dates = driver.findElements(By.xpath("//div[@class=\"react-datepicker__month\"]/div/div"));

	public void ClickOnFormBtn() {

		Formbtn.click();
		PracticeFormbtn.click();

	}

	public void FillForm() throws InterruptedException {

		firstNameField.sendKeys("Ravi");
		LastNameField.sendKeys("Singh");
		UseremailField.sendKeys("abc1232@gmail.com");
		jsclick(genderCheckbox);

		UserNumberfield.sendKeys("8541240120");

		DobField.click();
		selectbyvisibletext(Monthname, "October");
		selectbyvisibletext(Years, "2025");
		Thread.sleep(3000);
		jsclick(Fixdate);

		SubjectField.sendKeys("Computer");
		SubjectField.sendKeys(Keys.ARROW_DOWN);
		SubjectField.sendKeys(Keys.ENTER);
		jsclick(hobbybtn);

		UploadProfile.sendKeys("/home/ravi/Downloads/Profilepic_Sample.jpeg");

		CurrentAddressField.sendKeys(" H. No. 100 Pratap Vihar Ghaziabad");

		scrollIntoView(StateField);
		StateField.sendKeys(Keys.ARROW_DOWN);
		StateField.sendKeys(Keys.ARROW_DOWN);
		StateField.sendKeys(Keys.ENTER);
		System.out.println("State is sucessfully Selected");
		
		Thread.sleep(3000);
		scrollIntoView(CityField);
	
		CityField.sendKeys(Keys.ARROW_DOWN);
		CityField.sendKeys(Keys.ENTER);
		System.out.println("City is sucessfully Selected");

		jsclick(Submitbtn);
		Thread.sleep(3000);

	}

}
