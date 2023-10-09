package toolsqa_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import base.Base;

public class Buttons_page extends Base {

	public Buttons_page() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//h5[text()='Elements']")
	private WebElement Elemntbtn;

	@FindBy(xpath = "//span[text()='Buttons']")
	private WebElement buttonbtn;

	@FindBy(xpath = "//button[text()='Double Click Me']")
	private WebElement Doubleclickbtn;

	@FindBy(xpath = "//button[text()='Right Click Me']")
	private WebElement Rightclick;

	@FindBy(xpath = "//button[text()='Click Me']")
	private WebElement clickbtn;

	@FindBy(xpath = "//p[@id='doubleClickMessage']")
	private WebElement Doublebtnmessage;

	@FindBy(xpath = "//p[@id='rightClickMessage']")
	private WebElement Rightbtnmessage;

	@FindBy(xpath = "//p[@id='dynamicClickMessage']")
	private WebElement Clickbtnmessage;

	public void ClickOnButtons() throws InterruptedException {

		Elemntbtn.click();
		buttonbtn.click();
		doubleclick(Doubleclickbtn);

		String Message = Doublebtnmessage.getText();

		Thread.sleep(3000);
		Rightclick(Rightclick);
		String RMessage = Rightbtnmessage.getText();

		clickbtn.click();
		String CMessage = Clickbtnmessage.getText();
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(Message, "You have done a double click");
		soft.assertEquals(RMessage, "You have done a right click");
		soft.assertEquals(CMessage, "You have done a dynamic click");
		soft.assertAll();

	}

}
