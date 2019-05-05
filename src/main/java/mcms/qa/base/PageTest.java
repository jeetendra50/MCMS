package mcms.qa.base;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageTest {
      PageDriver pagedriver = new PageDriver();
	
	@Test
	public void Login()
	{
		pagedriver.typeValueInField(By.id("loginbutton"), "amargaykawd");
		pagedriver.typeValueInField(By.id("loginbutton"), "password");
		pagedriver.clickElement(By.name("amar"));
		Assert.assertTrue(pagedriver.verifyPageTitle("InboxPage"));
		
		
	}
	
}
