package toolsqa_tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Base;
import toolsqa_pages.Buttons_page;

public class Buttons_test extends Base {

	Buttons_page ob;

	@BeforeTest
	public void Setupbrowser() {

		driver.get(getreaddata("url"));
		ob = new Buttons_page();
	}

	@Test(priority = 1)
	public void ClickOnButtons() throws InterruptedException {

		ob.ClickOnButtons();
	}

}
