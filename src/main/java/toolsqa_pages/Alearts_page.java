package toolsqa_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Base;

public class Alearts_page extends Base {

	public Alearts_page() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
	private WebElement Alerts;

	@FindBy(xpath = "//span[text()='Alerts']")
	private WebElement Alertsbtn;

	@FindBy(xpath = "//button[@id='alertButton']")
	private WebElement SeeAlertbtn;

	@FindBy(xpath = "//button[@id='timerAlertButton']")
	private WebElement Timealertbtn;

	@FindBy(xpath = "//button[@id='confirmButton']")
	private WebElement Confirmalertbtn;

	@FindBy(xpath = "//span[@id='confirmResult']")
	private WebElement Confirmalertmessage;

	@FindBy(xpath = "//button[@id='promtButton']")
	private WebElement promtalertbtn;

	@FindBy(xpath = "//span[@id='promptResult']")
	private WebElement promtalertmessage;

	public void ClickOnAlert() {

		Alerts.click();
		Alertsbtn.click();
	}

	public void ClickOnSeealert() {

		SeeAlertbtn.click();
		driver.switchTo().alert().accept();
		Timealertbtn.click();
		element(Timealertbtn);
		driver.switchTo().alert().accept();

	}

	public void ClickOnConfirmalert() {

		Confirmalertbtn.click();
		driver.switchTo().alert().accept();
		String Output = Confirmalertmessage.getText();
		System.out.println(Output);

		promtalertbtn.click();
		driver.switchTo().alert().sendKeys("Ram");

		driver.switchTo().alert().accept();
		String Output2 = promtalertmessage.getText();
		System.out.println(Output2);

	}

}
