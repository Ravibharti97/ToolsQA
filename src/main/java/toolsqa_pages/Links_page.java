package toolsqa_pages;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class Links_page extends Base {

	public Links_page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h5[text()='Elements']")
	private WebElement Elementbtn;

	@FindBy(xpath = "//span[text()='Links']")
	private WebElement Linksbtn;

	@FindBy(id = "simpleLink")
	private WebElement HomeLink;

	@FindBy(id = "dynamicLink")
	private WebElement DynamicLink;

	public void ClickOnElementsbtn() {

		Elementbtn.click();
		Linksbtn.click();

	}

	public void ClickOnHomeLink() {

		HomeLink.click();
		System.out.println(driver.getCurrentUrl() + " " + "User has Successfully Navigate to Home Page");
		Set<String> li = driver.getWindowHandles();
		ArrayList<String> arr = new ArrayList<String>(li);
		driver.switchTo().window(arr.get(1));
		driver.close();
		driver.switchTo().window(arr.get(0));

	}

	public void ClickOnDynamicLink() {

		{
			DynamicLink.click();
			System.out.println(
					driver.getCurrentUrl() + " " + "User has Successfully Navigate to Home Page using Dynamic Link");
			Set<String> li = driver.getWindowHandles();
			ArrayList<String> arr = new ArrayList<String>(li);
			driver.switchTo().window(arr.get(1));
			driver.close();
			driver.switchTo().window(arr.get(0));
		}
	}

}
