package toolsqa_tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Base;
import toolsqa_pages.Dynamic_Properties_page;
import toolsqa_pages.UploadDownload_page;

public class Dynamic_Properties_test extends Base {

	Dynamic_Properties_page ob;

	@BeforeTest
	public void Setupbrowser() {

		driver.get(getreaddata("url"));
		ob = new Dynamic_Properties_page();
	}

	@Test(priority = 1)
	public void ClickonElementbtn() {
		ob.ClickonElementbtn();
	}

	@Test(priority = 2)
	public void ClickOnBtns() {
		ob.ClickOnBtns();
	}

}
