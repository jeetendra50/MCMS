package mcms.qa.pages;

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

	public class ObjectPage extends TestBase {

		@FindBy(xpath = "//a[contains(text(), 'Lees meer')]")
		Select ClickonAccmd;

		@FindBy(xpath = "a[contains(text(),'Boek nu')]")
		Select ClickonObject;

		@FindBy(css = "button.btn.btn") // button.btn.btn
		Select Clickonbookbtn;

		@FindBy(css = "a.right")
		Select ClickonNextbtn;

		@FindBy(css = "a.closeModal")
		Select Canclbtn;

		@FindBy(css = "a.right.bg-book")
		Select confirmbtn;

		@FindBy(xpath = "//*[text()='Bekijk de verschillende objecten van De Krim Texel']")
		Label actualyourdetailspagename;

		// public ObjectPage SelectAccmd(int index)
		// {
		// waitForSomeTime(5);
		// getWrappedDriver().findElements(By.cssSelector("div~div>a.button.button")).get(index).click();
		// waitForSomeTime(5);
		// return this;
		// }
		//

		// public ObjectPage SelectObject(int index)
		// {
		//
		// waitForSomeTime(10);
		//
		// List<WebElement>
		// AccmList=getWrappedDriver().findElements(By.cssSelector("div~div>a.button.button"));
		// //List<WebElement>
		// AccmList=getWrappedDriver().findElements(By.xpath(".//*[text()='Boek
		// nu']"));
		// System.out.println("Size of list is "+AccmList.size());
		//
		// /*for(WebElement option1 : AccmList)
		// {
		// System.out.println("*********************"+option1.getText() +"*******"
		// +index);
		// if(option1.getText().equals(index))
		// {
		// */
		// waitForSomeTime(20);
		// JavascriptExecutor executor = (JavascriptExecutor)getWrappedDriver();
		// executor.executeScript("arguments[0].click();", AccmList.get(0));
		// // AccmList.get(0).click();
		// waitForSomeTime(20);
		// System.out.println("After click ");
		// waitForSomeTime(60);
		// return this;
		// }

		
		/*public ObjectPage verifyObjectsstep() {
			actualyourdetailspagename.processAndClick();
			String ayourdetailspagename = actualyourdetailspagename.getText();
			System.out.println(ayourdetailspagename);
			String expectedyourdetailspagename = "Bekijk de verschillende objecten van De Krim Texel";
			if (ayourdetailspagename.equals(expectedyourdetailspagename)) {
				System.out.println("Step name is OBJECTS");
				ExtentTestManager.logMessage("Current Step name is OBJECTS");
			} else {
				System.out.println("Step name is not OBJECTS");
			}
			return this;
		}

		public ObjectPage SelectObject(String objclick) {
			waitForSomeTime(10);
			List<WebElement> objlist = getWrappedDriver().findElements(By.cssSelector("a.button.button.book-btn"));
			System.out.println("Size of list is " + objlist.size());
			for (WebElement option1 : objlist) {
				System.out.println("*********************" + option1.getText() + "*******" + objclick);
				if (option1.getText().equalsIgnoreCase(objclick)) {
					waitForSomeTime(10);
					option1.click();
					waitForSomeTime(5);
					
					System.out.println("Object is selected successfully ");
					ExtentTestManager.logMessage("Object is selected successfully");
					waitForSomeTime(5);

					break;
				}
			}
			return this;
		}

		public void Clickonbook() {
			// waitForSomeTime(10);
			Clickonbookbtn.processAndClick();
			// waitForSomeTime(10);
			System.out.println("Clicked on Bill Book now ");
			// waitForSomeTime(10);
		}

		public void ClickonNextbtn() {
			// waitForSomeTime(5);
			ClickonNextbtn.processAndClick();
			waitForSomeTime(5);
			System.out.println("Clicked on discount Next button");
			// waitForSomeTime(10);
		}

		public void Cancellationbtn() {
			// waitForSomeTime(25);
			Canclbtn.processAndClick();
			waitForSomeTime(5);
			System.out.println("Clicked on Cancellation button ");
			// waitForSomeTime(10);
		}

	}


}
*/
	}