package toolsqa_tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Base;
import toolsqa_pages.Checkbox_page;

public class Checkbox_test extends Base {

	Checkbox_page Checkbox;

	@BeforeTest
	public void Setupbrowser() {

		driver.get(getreaddata("url"));
		Checkbox = new Checkbox_page();
	}

	@Test(priority = 1)
	public void ClickOnElementbtn() {
		Checkbox.ClickOnElementbtn();
	}

	@Test(priority = 2)
	public void ClickOnCheckbox() {
		Checkbox.ClickOnCheckbox();
	}

}