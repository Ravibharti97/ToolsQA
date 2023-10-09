package toolsqa_pages;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class BrokenImage_page extends Base {

	public BrokenImage_page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h5[text()='Elements']")
	private WebElement Elemntbtn;

	@FindBy(xpath = "//span[text()='Broken Links - Images']")
	private WebElement Brokenbtn;

	List<WebElement> links = driver.findElements(By.tagName("a"));

	List<WebElement> Img = driver.findElements(By.xpath("//div[@class='col-12 mt-4 col-md-6']/div/img"));

	public void CheckBrokenLink() throws InterruptedException {

		Elemntbtn.click();
		Brokenbtn.click();
		System.out.println(links.size());
		Thread.sleep(3000);
		for (int i = 0; i <= links.size(); i++) {

			WebElement link = links.get(i);
			String url = link.getAttribute("href");
			System.out.println(url);

		}

//		for(WebElement data: links)
//		{
//			
//			String Output= data.getAttribute("href");
//			
//			System.out.println(Output);
//			
//		}
//		
//		for(int i=0;i<=links.size();i++)
//        {
//            WebElement link= links.get(i);
//            String url= link.getAttribute("href");
//            System.out.println(url);
//        

//		 try
//	        {
//	            URL urll = new URL(url);
//
//	            HttpURLConnection httpURLConnect=(HttpURLConnection)urll.openConnection();
//	            httpURLConnect.setConnectTimeout(5000);
//	            httpURLConnect.connect();
//	            if(httpURLConnect.getResponseCode()>=400)
//	            {
//	            	System.out.println(url+" - "+httpURLConnect.getResponseMessage()+"is a broken link");
//	            }    

//	            else{
//	                System.out.println(url+" - "+httpURLConnect.getResponseMessage());
//	            }
//	        }catch (Exception e) {
//	        }
//	   
//        }

	}

	public void CheckBrokenimg() {

		for (WebElement a : Img) {

			String Output2 = a.getAttribute("src");

			System.out.println(Output2);

		}

	}

}
