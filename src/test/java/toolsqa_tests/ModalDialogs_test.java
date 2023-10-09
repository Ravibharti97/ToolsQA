package toolsqa_tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Base;
import toolsqa_pages.Alearts_page;
import toolsqa_pages.ModalDialogs_page;

public class ModalDialogs_test extends Base {

	ModalDialogs_page Modal;

	@BeforeTest
	public void Setupbrowser() {

		driver.get("https://demoqa.com/");
		Modal = new ModalDialogs_page();
	}

	@Test(priority = 1)
	public void ClickOnAlertbtn() {

		Modal.ClickOnAlertbtn();
	}

	@Test(priority = 2)
	public void ClickOnModels() {

		Modal.ClickOnModels();
	}

}
