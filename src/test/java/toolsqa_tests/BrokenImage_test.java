package toolsqa_tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Base;
import toolsqa_pages.BrokenImage_page;
import toolsqa_pages.Buttons_page;

public class BrokenImage_test extends Base {

	BrokenImage_page ob;

	@BeforeTest
	public void Setupbrowser() {

		driver.get(getreaddata("url"));
		ob = new BrokenImage_page();
	}

	@Test(priority = 1)
	public void CheckBrokenLink() throws InterruptedException {
		ob.CheckBrokenLink();
	}

	@Test(priority = 2)
	public void CheckBrokenimg() {
		ob.CheckBrokenimg();
	}
}
