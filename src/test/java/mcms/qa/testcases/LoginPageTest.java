package mcms.qa.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import mcms.qa.base.TestBase;
import mcms.qa.pages.LoginPage;
import mcms.qa.util.TestUtil;

public class LoginPageTest extends TestBase {
	LoginPage lpage;
	

	@BeforeMethod(alwaysRun=true)
	public void setup() throws Throwable {
		initialization();
		lpage = new LoginPage();
	}

	@AfterMethod(alwaysRun=true)
	public void close() {
		 closesession();
	}

	@DataProvider(name="differentLanagugeDataset")
	public Object[][] getData() {
		Object[][] lang = new Object [2][2];
		// 1st row
		lang[0][0] ="English";
		lang[0][1] = "What do you want to do on Texel? See what De Krim Texel has to offer!";

		// 2nd row
		lang[1][0] ="German";
		lang[1][1] = "Was möchten Sie auf Texel unternehmen? Entdecken Sie die Möglichkeiten von De Krim Texel";
		
		return lang;
		
	}

//	@Test(dataProvider="differentLanagugeDataset",enabled=false)
//	public void verifyLanguageChange(String lang, String title) {
//		lpage.selectlan(lang);
//		Assert.assertTrue(
//				lpage.validateloginpageTitle(title));
//	}
//	
	@Test
	public void cretereservtion()
	{
		
		lpage.SelectResort();
		lpage.dateSelection(TestUtil.getFutureDate(6));
		lpage.selectDuration();
	
		
		lpage.SelectAccomodation();
		lpage.SelectSubject();
  
		lpage.continueToAccmmodationpage();
	}

}
