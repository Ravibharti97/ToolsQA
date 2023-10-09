package toolsqa_tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Base;
import toolsqa_pages.Frames_page;
import toolsqa_pages.Nested_Frame_page;

public class Nested_Frame_test extends Base {

	Nested_Frame_page nested;

	@BeforeTest
	public void Setupbrowser() {

		driver.get("https://demoqa.com/");
		nested = new Nested_Frame_page();
	}

	@Test(priority = 1)
	public void ClickOnAlert() {

		nested.ClickOnAlert();
	}

	@Test(priority = 2)
	public void ClickOnFrame() {

		nested.ClickOnFrame();
	}
}
