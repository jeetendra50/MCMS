package mcms.qa.pages;

import java.awt.Button;
import java.awt.Label;
    import java.net.HttpURLConnection;
	import java.net.MalformedURLException;
	import java.net.URL;
	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.time.LocalDate;
	import java.util.ArrayList;
	import java.util.Calendar;
	import java.util.Collections;
	import java.util.Date;
	import java.util.Iterator;
	import java.util.List;
	import java.util.logging.LogManager;

	import com.google.common.base.Function;
	import com.google.common.base.Strings;

import mcms.qa.base.TestBase;

import org.apache.poi.common.usermodel.Hyperlink;
import org.omg.CORBA.PUBLIC_MEMBER;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.NoSuchElementException;
	import org.openqa.selenium.StaleElementReferenceException;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.ui.ExpectedConditions;
    import org.openqa.selenium.support.ui.Select;
    import org.testng.Assert;

	//import com.google.common.base.Function;
	
	//import com.testauto.themes.theme2.pages.SearchPage;

	public class AccommodationPage extends TestBase {

		@FindBy(xpath = "//a[contains(text(), 'Lees meer')]")
		Select ClickonAccmd;

		@FindBy(xpath = "a[contains(text(),'Boek nu')]")
		Select ClickonObject;

		@FindBy(css = "[class*='book-btn']")
		Select ClickonAccmd1;
		
		@FindBy(xpath="//*[text()='Vakantiepark De Krim: het best uitgeruste vakantiepark van Texel!']")
		Label actualyourdetailspagename;

		
		/*public AccommodationPage SelectAccmd() {
			waitForSomeTime(5);
			// getWrappedDriver().findElement(By.cssSelector("div~div>a.button.button")).click();
			ClickonAccmd.click();
			waitForSomeTime(5);
			return this;
		}

		// public AccommodationPage SelectAccmd1(int index)
		// {
		// waitForSomeTime(5);
		// List<WebElement>
		// AccmList=getWrappedDriver().findElements(By.cssSelector("[class*='book-btn']"));
		// for(WebElement option : AccmList)
		// {
		// System.out.println("###############"+option.getText() +"*******" +index);
		// if(option.getText().equals(index))
		// {
		//
		// option.click();
		// waitForSomeTime(20);
		// break;
		// }
		// }
		// return this;
		//
		// }
		
		public AccommodationPage VerifyAccomodationstep(){
			waitForSomeTime(10);
			actualyourdetailspagename.processAndClick();
			waitForSomeTime(5);
			String youraccomdpagename=actualyourdetailspagename.getText();
			System.out.println("youraccomdpagename");
			String expectedaccmdpadename="Vakantiepark De Krim: het best uitgeruste vakantiepark van Texel!";
			if(youraccomdpagename.equals(expectedaccmdpadename)){
				System.out.println("Step name is Accommodation");
				ExtentTestManager.logMessage("current Step name is Accommodation");
			}
			else{
				System.out.println("Step name is not Accommodation");
				}
			return this;
			}
		
		public AccommodationPage VerifyAccomodationstep1(){
			String title = getWrappedDriver().getTitle();
			if(title=="Vakantiepark De Krim: het best uitgeruste vakantiepark van Texel!" ){
			System.out.println("Title verified");
				}
			Assert.assertEquals(title, "Vakantiepark De Krim: het best uitgeruste vakantiepark van Texel!");
			return this;
			}
		
		public AccommodationPage SelectAccmd1(String accname) {
			waitForSomeTime(10);
			List<WebElement> AccmList = getWrappedDriver().findElements(By.cssSelector("a.button.button.book-btn"));
			System.out.println("Size of list is " + AccmList.size());
			for (WebElement option : AccmList) {
				System.out.println("###############" + option.getText() + "*******" + accname);
				if (option.getText().equals(accname)) {
					waitForSomeTime(10);
					option.click();
					waitForSomeTime(5);
					
					System.out.println("accomodation type is selected successfully");
					ExtentTestManager.logMessage("accomodation type is selected successfully");
					//waitForSomeTime(5);

					break;
				}
			}
			return this;

		}

*/	
		
}

		
	