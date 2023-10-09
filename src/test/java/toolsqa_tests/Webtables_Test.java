package toolsqa_tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Base;
import toolsqa_pages.Webtables_Page;

public class Webtables_Test extends Base {

	Webtables_Page ob;

	@BeforeTest
	public void Setupbrowser() {

		driver.get(getreaddata("url"));
		ob = new Webtables_Page();

	}

	@Test(priority = 1)
	public void ClickonAddbtn() {
		ob.ClickonAddbtn();
	}

	@Test(priority = 2)
	public void filldetails() {
		ob.filldetails();
	}

}
