package toolsqa_tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Base;
import toolsqa_pages.Toolsqa_page;

public class Toolsqa_test extends Base {

	Toolsqa_page Tools;

	@BeforeTest
	public void Setupbrowser() {

		driver.get(getreaddata("url"));
		Tools = new Toolsqa_page();

	}

	@Test(priority = 1)
	public void VerifyTitle() {
		Tools.VerifyTitle();
	}

	@Test(priority = 2)
	public void clickonElement() {
		Tools.clickonElement();
	}

	@Test(priority = 3)
	public void FillForm() {
		Tools.FillForm();
	}

}
