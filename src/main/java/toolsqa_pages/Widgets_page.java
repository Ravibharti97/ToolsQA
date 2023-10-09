package toolsqa_pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class Widgets_page extends Base {

	public Widgets_page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h5[text()='Widgets']")
	private WebElement Widgetsbtn;

	@FindBy(xpath = "//span[text()='Accordian']")
	private WebElement Accordianbtn;

	@FindBy(xpath = "//div[@id='section1Heading']")
	private WebElement FirstHeading;

	@FindBy(xpath = "//div[@id='section1Content']/p")
	private WebElement FirstTheory;

	@FindBy(xpath = "//div[@id='section2Heading']")
	private WebElement SecondHeading;

	List<WebElement> ele = driver.findElements(By.xpath("//div[@id='section2Content']/p"));

	@FindBy(id = "section3Heading")
	private WebElement ThirdHeading;

	@FindBy(xpath = "//div[@id='section3Content']/p")
	private WebElement ThirdTheory;

	public void ClickOnWidgets() {

		Widgetsbtn.click();
		Accordianbtn.click();
	}

	public void GetHeadingsText() {

		System.out.println(FirstHeading.getText());
		System.out.println(FirstTheory.getText());

		System.out.println(SecondHeading.getText());
		SecondHeading.click();

		for (WebElement heading : ele) {

			String value = heading.getText();
			System.out.println(value);

		}

	}

}
