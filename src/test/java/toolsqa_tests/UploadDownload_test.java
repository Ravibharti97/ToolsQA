package toolsqa_tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Base;
import toolsqa_pages.BrokenImage_page;
import toolsqa_pages.UploadDownload_page;

public class UploadDownload_test extends Base {

	UploadDownload_page ob;

	@BeforeTest
	public void Setupbrowser() {

		driver.get(getreaddata("url"));
		ob = new UploadDownload_page();
	}

	@Test(priority = 1)
	public void ClickonElementbtn() {
		ob.ClickonElementbtn();
	}

	@Test(priority = 2)
	public void ClickonDownload() {
		ob.ClickonDownload();

	}

	@Test(priority = 3)
	public void Clickonuploadbtn() {
		ob.Clickonuploadbtn();

	}
}
