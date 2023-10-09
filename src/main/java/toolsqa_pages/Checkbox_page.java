package toolsqa_pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class Checkbox_page extends Base {

	public Checkbox_page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h5[text()='Elements']")
	private WebElement Elementbtn;

	@FindBy(xpath = "//span[text()='Check Box']")
	private WebElement Checkboxbtn;

	@FindBy(xpath = "//*[local-name()='svg' and @class=\"rct-icon rct-icon-expand-close\"]")
	private WebElement Expendhomebtn;

	@FindBy(xpath = "//*[local-name()='svg' and @class=\"rct-icon rct-icon-expand-all\"]")
	private WebElement Expendallbtn;

	@FindBy(xpath = "")
	private WebElement ExpenDocumentsbtn;

	@FindBy(xpath = "")
	private WebElement ExpenDownloadbtn;

	List<WebElement> AllCheckbox = driver
			.findElements(By.xpath("//*[local-name()='svg' and @class=\"rct-icon rct-icon-uncheck\"]"));

	public void ClickOnElementbtn() {
		Elementbtn.click();
		Checkboxbtn.click();

	}

	public void ClickOnCheckbox() {
		Expendhomebtn.click();

		Expendallbtn.click();

		WebElement ram = driver.findElement(By.xpath(
				"(//*[local-name()='svg' and @fill=\"currentColor\"]/*[@d=\"M19 5v14H5V5h14m0-2H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2z\"])[1]"));
		jsclick(ram);
		System.out.println(AllCheckbox.size());
		int size = AllCheckbox.size();
		System.out.println(size);
	}

}
