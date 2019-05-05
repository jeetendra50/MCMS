package mcms.qa.util;

import java.time.LocalDate;

import mcms.qa.base.TestBase;

public class TestUtil extends TestBase {
	
	 
	public static long PAGE_LOAD_TIMEOUT=50;
	public static long IMPLICIT_WAIT=10;

	
	public void SwitchToFrame() {
		
		getWebdriver().switchTo().frame("mainpanel");
		
	}

	public   static int getDate() {
 	    return LocalDate.now().getDayOfMonth();
 	  }

 	  public static String getTodaysDate() {
 	    return Integer.toString(getDate());
 	  }

 	  public static String getFutureDate(int numberOfDaysToAdd) {
 	    return Integer.toString(getDate() + numberOfDaysToAdd);
 	  }

	
}
