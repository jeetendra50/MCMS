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

	public class ConfirmationPage extends TestBase {

		@FindBy(xpath="//h2[text()='THANK YOU FOR YOUR RESERVATION']")
		Label Confirmation;
		
		@FindBy(xpath="//h2[text()='Confirmation']")
		Label actualcofirmationpagename;
		
		@FindBy(tagName="a")
		 List<Hyperlink> links;
		
		@FindBy(xpath="//p[contains(text(),'Your reservation number:')]")
		static
		Label reservationno;
		
		
		/*public void verifyLinksConfirmationPage(){
			HttpURLConnection huc = null;
			Iterator<Hyperlink> itr = links.iterator();
			String homeUrl =  "http://test.book.newyse.com/hbv2/";
			System.out.println("Total links = "+links.size());
			while(itr.hasNext()){
			   
			   try {
			    Hyperlink hrl = itr.next();
			    String urlStr = hrl.getHref();
			    if(Strings.isNullOrEmpty(urlStr)){
			     continue;
			    }
			    if(!urlStr.startsWith(homeUrl)){
			     continue;
			    }
			    
			    URL url = new URL(urlStr);
			    huc = (HttpURLConnection) (url.openConnection());
			    huc.setRequestMethod("HEAD");
			    huc.connect();
			    int respCode = huc.getResponseCode();
			    System.out.println(" - "+respCode);
			    System.out.println(urlStr + " - "+ respCode);
			    if(respCode >= 400){
			     System.out.println(hrl.getText() + " is broken URL");
			    }
			   } catch (StaleElementReferenceException e) {
			    System.out.println("Stale element - " );
			    continue;
			   
			   }
			   catch(MalformedURLException e){
			    e.printStackTrace();
			   } catch (IOException e) {
			    e.printStackTrace();
			   }
			
			
			
			  }
		}
		
		
		public ConfirmationPage varifyConfirmationstep(){
			actualcofirmationpagename.waitForElement();
			actualcofirmationpagename.processAndClick();
			String aconfirmationpagename= actualcofirmationpagename.getText();
			System.out.println(aconfirmationpagename);
			String expectedyourdetailspagename="CONFIRMATION";
			if(aconfirmationpagename.equals(expectedyourdetailspagename)){
				System.out.println("Step name is CONFIRMATION");
				ExtentTestManager.logMessage("Current Step name is CONFIRMATION");
			}else{System.out.println("Step name is not CONFIRMATION");}
					return this;
		}
		
		
		
		public ConfirmationPage verifyisreservationsuccessfull(){
			
			String actual=this.Confirmation.getText();
			String expected="THANK YOU FOR YOUR RESERVATION";
			Assert.assertEquals(actual, expected);
			ExtentTestManager.logMessage("Reservation is successful");
			return this;
		}
		public static String reservationumber;
		
		public ConfirmationPage getReservationNumber(){
			waitForSomeTime(5);
			reservationno.waitForElement();
			String yourresno= reservationno.getText();
			System.out.println(yourresno);
			String [] arr =yourresno.split(":"); 
			reservationumber= arr[1];
			System.out.println(reservationumber);
			return this;
					
		}
		
*/	
		}
