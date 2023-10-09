package toolsqa_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class ModalDialogs_page extends Base {

	public ModalDialogs_page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
	private WebElement Alertsbtn;

	@FindBy(xpath = "//span[text()='Modal Dialogs']")
	private WebElement Modalbtn;

	@FindBy(xpath = "//button[text()='Small modal']")
	private WebElement Smallbtn;

	@FindBy(xpath = "//div[@class='modal-body']")
	private WebElement SmallbtnMessage;

	@FindBy(xpath = "//button[text()='Close']")
	private WebElement SmallClose;

	@FindBy(xpath = "//button[text()='Large modal']")
	private WebElement Largebtn;

	@FindBy(xpath = "//div[@class='modal-body']/p")
	private WebElement LargebtnMessage;

	@FindBy(xpath = "//button[@id='closeLargeModal']")
	private WebElement LargeClose;

	public void ClickOnAlertbtn() {

		Alertsbtn.click();
		Modalbtn.click();
	}

	public void ClickOnModels() {

		Smallbtn.click();
		System.out.println(SmallbtnMessage.getText());
		SmallClose.click();
		Largebtn.click();
		System.out.println(LargebtnMessage.getText());
		LargeClose.click();
	}

}
