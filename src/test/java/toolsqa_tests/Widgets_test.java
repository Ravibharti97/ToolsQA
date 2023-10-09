package toolsqa_tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Base;
import toolsqa_pages.Widgets_page;

public class Widgets_test extends Base {

	Widgets_page widget;

	@BeforeTest
	public void Setupbrowser() {

		driver.get("https://demoqa.com/");
		widget = new Widgets_page();
	}

	@Test(priority = 1)
	public void ClickOnWidgets() {

		widget.ClickOnWidgets();
	}

	@Test(priority = 2)
	public void GetHeadingsText() {

		widget.GetHeadingsText();
	}

}
