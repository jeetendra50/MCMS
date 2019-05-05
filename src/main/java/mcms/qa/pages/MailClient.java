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

	public class MailClient extends TestBase {

		@FindBy(xpath="//*[@type='email']")
		TextBox email;
		
		@FindBy(xpath="//span[text()='Next']")
		Button next;
		
		@FindBy(xpath="//*[@type='password']")
		TextBox password;
		
		@FindBy(xpath="//span[text()='Next']")
		Button next2;
		
		@FindBy(xpath="//*[@class='zF']")
		List unreademeil;
		
		@FindBy(xpath="//p[contains(text(),'Your reservation number:')]")
		Label reservationno;
		
		@FindBy(xpath=".//*[@id='aso_search_form_anchor']/div/input")
	    TextBox searchbox;
		
		@FindBy(css=".yW")
		Label searchedmail;
		
		@FindBy(xpath=".//*[@aria-label='Search Mail']")
		Button searchButton;
		
		//WebDriver driver=new ChromeDriver();
		
		/*public Mailclient openGmail(){
			this.getWrappedDriver().get("https://mail.google.com/mail/");
			this.waitForSomeTime(10);
			return this;
		}
		public Mailclient loginTOEmail(String email, String password){
			this.email.sendKeys(email);
			next.processAndClick();
			this.password.waitForElement();
			this.password.sendKeys(password);
			next2.processAndClick();
			waitForSomeTime(6);
			return this;
			
		}	
			public Mailclient verifyMailIsPresent (){
				waitForSomeTime(5);
				searchbox.waitForElement();
				searchbox.sendKeys(ConfirmationPage.reservationumber);
				searchButton.processAndClick();
				if(searchedmail.isDisplayed()){
					System.out.println("Confirmation mail has been recieved with Reservation number " +ConfirmationPage.reservationumber);
					ExtentTestManager.logMessage("Confirmation mail has been recieved with Reservation number " +ConfirmationPage.reservationumber);
				}else{
					System.out.println("Confirmation mail has not been recieved with Reservation number");
					ExtentTestManager.logMessage("Confirmation mail has not been recieved with Reservation number");
				}
				
				searchedmail.click();
				this.takeScreenShot("Mailscreen");
		

				return this;
			}
	*/		
	}
		
		
		
	