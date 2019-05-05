package mcms.qa.pages;

import java.awt.Button;
import java.awt.Checkbox;
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
import org.apache.poi.hslf.model.TextBox;
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

	public class CustomerPage extends TestBase {

		@FindBy(css="input[name='user']")
		TextBox euser;
		
		@FindBy(css="input[name='password']")
		TextBox epassword;
		
		@FindBy(xpath="//span[contains(text(),'Inloggen')]")
		Select login;
		
		@FindBy(css="input[name='newsletterAndConditionsCont:accept']")
	    Checkbox accept;
		
		@FindBy(xpath="//span[text()='Bevestigen']")
		Button confirmBooking;
		
		@FindBy(xpath="//*[text()='Ik heb al eerder geboekt bij De Krim']")
		Label actualyourdetailspagename;
		
		
		
		/*public CustomerPage verifyYourStaystep(){
			actualyourdetailspagename.processAndClick();
			String ayourdetailspagename= actualyourdetailspagename.getText();
			System.out.println(ayourdetailspagename);
			String expectedyourdetailspagename="Ik heb al eerder geboekt bij De Krim";
			if(ayourdetailspagename.equals(expectedyourdetailspagename)){
				System.out.println("Step name is Your details");
				ExtentTestManager.logMessage("Current Step name is YOUR DETAILS");
			}
			else{
				System.out.println("Step name is not YOUR DETAILS");}
					return this;
		}
		
		public CustomerPage exisitingCustomer(String email, String password){
			
			waitForSomeTime(4);
			this.euser.sendKeys(email);
			waitForSomeTime(2);
			this.epassword.sendKeys(password);
			this.login.click();
			waitForSomeTime(6);
			
			this.accept.click();
			ExtentTestManager.logMessage(" Successfully logged in with existing customer");
		
			return this;	
		}
		
		
		public CustomerPage confirmBooking() {
			this.waitForSomeTime(5);
			confirmBooking.click();
			System.out.println("booking Successfull");
			ExtentTestManager.logMessage("booking Successfull");
			this.waitForSomeTime(20);
			return this;
		}*/
	}