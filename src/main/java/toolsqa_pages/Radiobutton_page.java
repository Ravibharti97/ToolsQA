package toolsqa_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import base.Base;

public class Radiobutton_page extends Base {

	public Radiobutton_page() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//h5[text()='Elements']")
	private WebElement Elemntbtn;

	@FindBy(xpath = "//span[text()='Radio Button']")
	private WebElement Radiobtn;

	@FindBy(xpath = "//input[@id='yesRadio']/following::label[@for='yesRadio']")
	private WebElement Yesbox;

	@FindBy(xpath = "//input[@id='impressiveRadio']/following::label[@for='impressiveRadio']")
	private WebElement impressivebox;

	@FindBy(xpath = "//input[@id='noRadio']")
	private WebElement Nobtn;

	SoftAssert Soft = new SoftAssert();

	public void ClickonRadiobtn() {

		Elemntbtn.click();
		Radiobtn.click();
		Yesbox.click();

		String Yesbtn = driver.findElement(By.xpath("//p[@class='mt-3']")).getText();
		System.out.println(Yesbtn);
		impressivebox.click();
		String impressivebtn = driver.findElement(By.xpath("//p[@class='mt-3']")).getText();
		System.out.println(impressivebtn);

		Soft.assertEquals(Yesbtn, "You have selected Yes");
		Soft.assertEquals(impressivebtn, "You have selected Impressive");
		Soft.assertEquals(Nobtn.isDisplayed(), false);
		Soft.assertAll();
		
//		System.out.println(Nobtn.isDisplayed());

	}

}
