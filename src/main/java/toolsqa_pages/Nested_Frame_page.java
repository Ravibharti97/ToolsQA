package toolsqa_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class Nested_Frame_page extends Base {

	public Nested_Frame_page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
	private WebElement Alertsbtn;

	@FindBy(xpath = "//span[text()='Nested Frames']")
	private WebElement Nestedbtn;

	@FindBy(xpath = "//iframe[@id='frame1']")
	private WebElement Frame1;

	@FindBy(xpath = "//iframe[@srcdoc='<p>Child Iframe</p>']")
	private WebElement Childframe;

	@FindBy(xpath = "//p[text()='Child Iframe']")
	private WebElement Childmessage;

	@FindBy(xpath = "//*[contains(text(),'Parent frame')]")
	private WebElement Parenttext;

	public void ClickOnAlert() {

		Alertsbtn.click();
		Nestedbtn.click();
	}

	public void ClickOnFrame() {

		Frame(Frame1);
		String Output2 = Parenttext.getText();
		Frame(Childframe);
		String output = Childmessage.getText();
		System.out.println(output);
		driver.switchTo().defaultContent();
		System.out.println(Output2);

	}

}
