package toolsqa_tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Base;
import toolsqa_pages.Frames_page;

public class Frames_test extends Base {

	Frames_page frame;

	@BeforeTest
	public void Setupbrowser() {

		driver.get("https://demoqa.com/");
		frame = new Frames_page();
	}

	@Test(priority = 1)
	public void ClickOnAlert() {

		frame.ClickOnAlert();
	}

	@Test(priority = 2)
	public void ClickOnFrame() {

		frame.ClickOnFrame();
	}

}
