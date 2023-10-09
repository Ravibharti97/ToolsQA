package toolsqa_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class Dynamic_Properties_page extends Base {

	public Dynamic_Properties_page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h5[text()='Elements']")
	private WebElement Elementbtn;

	@FindBy(xpath = "//span[text()='Dynamic Properties']")
	private WebElement Dynamicbtn;

	@FindBy(xpath = "//button[@id='enableAfter']")
	private WebElement Enablebtn;

	@FindBy(xpath = "//button[@id='colorChange']")
	private WebElement Colorbtn;

	@FindBy(xpath = "//button[@id='visibleAfter']")
	private WebElement Visiblebtn;

	public void ClickonElementbtn() {

		Elementbtn.click();
		Dynamicbtn.click();

	}

	public void ClickOnBtns() {

		String temp = Colorbtn.getCssValue("color");
		String c = Color.fromString(temp).asHex();
		System.out.println(c + " " + "This color code stands for White Color");

		elementtobeclickable(Enablebtn);
		System.out.println(Enablebtn.getText() + " " + "Element Successfully Clicked");

		String tempp = Colorbtn.getCssValue("color");
		String cc = Color.fromString(tempp).asHex();
		System.out.println(cc + " " + "This color code stands for Red Color");
		System.out.println("Hex code for color" + c);

		System.out.println();
		elementtobeclickable(Visiblebtn);
		System.out.println(Visiblebtn.getText() + " " + "Successfully clicked ");

	}

}
