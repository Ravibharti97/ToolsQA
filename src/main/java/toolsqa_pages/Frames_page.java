package toolsqa_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class Frames_page extends Base {

	public Frames_page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
	private WebElement Alertsbtn;

	@FindBy(xpath = "//span[text()='Frames']")
	private WebElement Framebtn;

	@FindBy(xpath = "//iframe[@id='frame1']")
	private WebElement Frame1;

	@FindBy(xpath = "//iframe[@id='frame2']")
	private WebElement Frame2;

	@FindBy(xpath = "//h1[@id='sampleHeading']")
	private WebElement Messagetext;

	public void ClickOnAlert() {

		Alertsbtn.click();
		Framebtn.click();

	}

	public void ClickOnFrame() {

		Frame(Frame1);
		System.out.println(Messagetext.getText());
		driver.switchTo().defaultContent();
		Frame(Frame2);
		System.out.println(Messagetext.getText());
		driver.switchTo().defaultContent();
	}

}
