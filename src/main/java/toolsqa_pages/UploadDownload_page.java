package toolsqa_pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class UploadDownload_page extends Base {

	public UploadDownload_page() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//h5[text()='Elements']")
	private WebElement Elementbtn;

	@FindBy(xpath = "//span[text()='Upload and Download']")
	private WebElement Uploadanddownloadbtn;

	@FindBy(xpath = "//a[text()='Download']")
	private WebElement Downloadbtn;

	@FindBy(xpath = "//input[@id='uploadFile']")
	private WebElement Uploadfilebtn;

	public void ClickonElementbtn() {

		Elementbtn.click();

		scrollIntoView(Uploadanddownloadbtn);

		Uploadanddownloadbtn.click();

	}

	public void ClickonDownload() {
		Downloadbtn.click();
	}

	public void Clickonuploadbtn() {

		Uploadfilebtn.sendKeys("/home/ravi/datadriven.csv.txt");

	}
}
