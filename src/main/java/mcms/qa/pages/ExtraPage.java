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

	public class ExtraPage extends TestBase {

		/*
		@FindBy(xpath="//a[@class='label']/label")
		Button comforttravelinsurance;*/
		
		@FindBy(css="select[name='quantityWrapper:quantity']")
		Select quantity;
		
		@FindBy(xpath="//span[text()='Add']")
		Button addextra;
		
		
		@FindBy(css="i.icon-arrow-down")
		Button continueToYourDetailsfinal1;
		
		@FindBy(xpath=".//i[@class='icon-arrow-down']/following-sibling::span[2]")
		Label checkDetailsorConfirmB;
		
		
		@FindBy(xpath="//span[text()='Confirm your booking']")
		Button confirmBooking;
		
		@FindBy(xpath="//a[@class='label']/label")
		Label insuranceExtra;
		
		@FindBy(xpath="//*[text()='Extras']")
		Label actualextraspagename;
		
		@FindBy(css=".count.display-inline")
		List<Label> reserveditems;
		
		@FindBy(tagName="a")
		 List<Hyperlink> links;
		
		@FindBy(xpath="//span[text()='Total']")
		 Label totalinbill;
		
		@FindBy(css = "a.right.bg-book")
		Select confirmbtn;
		
		@FindBy(css = "#idf9")
		Select ClickonCalendar;


		   
		   /* public ExtrasPage verifyExtrasstep(){
			actualextraspagename.processAndClick();
			String aextraspagename= actualextraspagename.getText();
			System.out.println(aextraspagename);
			String expectedextraspagename="2.EXTRAS";
			if(aextraspagename.equals(expectedextraspagename)){
				System.out.println("Step name is EXTRAS");
				ExtentTestManager.logMessage("Current Step name is EXTRAS");
			}else{System.out.println("Step name is not EXTRAS");}
					return this;
		}
		
		
		
		public ExtrasPage addelectricbike(){
			this.insuranceExtra.processAndClick();;
			//this.quantity.selectByIndex(2);
			//this.waitForSometime(1);
			this.addextra.processAndClick();
			ExtentTestManager.logMessage("Insurance is added successfully");
			return this;
		}
		
		
		
		public void continueToYourDetailpage() {
			//waitForSomeTime(5);
			confirmbtn.processAndClick();
			waitForSomeTime(5);
			System.out.println("Clikced on bybook Next button ");
			//waitForSomeTime(10);

		}*/
	
	
	}
		
		
		
	