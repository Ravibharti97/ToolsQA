package toolsqa_pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.Base;

public class Toolsqa_page extends Base {

	public Toolsqa_page() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h5[text()='Elements']")
	private WebElement Elemntbtn;

	@FindBy(xpath = "//span[text()='Text Box']")
	private WebElement Textboxtbn;

	@FindBy(xpath = "//input[@id='userName']")
	private WebElement Inputname;

	@FindBy(xpath = "//input[@id='userEmail']")
	private WebElement Inputemail;

	@FindBy(xpath = "//textarea[@id='currentAddress']")
	private WebElement Currentfield;

	@FindBy(xpath = "//textarea[@id='permanentAddress']")
	private WebElement Permanentfield;

	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement Submitbtn;

	List<WebElement> data = driver.findElements(By.xpath("//div[@class='border col-md-12 col-sm-12']/p"));

	public void VerifyTitle() {

		String Title = driver.getTitle();
		Assert.assertEquals(Title, "DEMOQA");
		System.out.println("Title is Successfully Verified");

	}

	public void clickonElement() {
		Elemntbtn.click();
		Textboxtbn.click();
	}

	public void FillForm() {
		Inputname.sendKeys(getreaddata("Name"));
		Inputemail.sendKeys(getreaddata("Email"));
		Currentfield.sendKeys(getreaddata("Current"));
		Permanentfield.sendKeys(getreaddata("Paddress"));
		Submitbtn.click();

	}

	public void VerifyData() {

		for (WebElement a : data) {
			String output = a.getText();
			System.out.println(output);
		}

	}

}
