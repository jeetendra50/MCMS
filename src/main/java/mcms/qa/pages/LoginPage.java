package mcms.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mcms.qa.base.PageDriver;
import mcms.qa.base.TestBase;

public class LoginPage extends PageDriver {

//	PageFactoory or  ObjectRepository

	@FindBy(css = "#startDate")
	WebElement calendar;

	@FindBy(xpath = "//span[contains(text(), 'Alle parken')]")
	WebElement resortdd;

	@FindBy(xpath = "//span[contains(text(),'Alle accommodaties')]")
	WebElement accommdkind;

	@FindBy(xpath = "//span[contains(text(),'Gezelschap')]")
	WebElement subject;

	@FindBy(xpath = "//button[contains(text(), 'Bevestig gezelschap')]")
	WebElement SaveSubject;

	@FindBy(xpath = "//button[contains(text(), 'Zoeken')]")
	WebElement Continuetoaccmd;

	@FindBy(xpath = "//span[contains(text(), 'Duur van het verblijf')]")
	WebElement clickonDuration;

//	Initializing the page object
	public LoginPage() throws Exception {
		PageFactory.initElements(TestBase.getWebdriver(), this);
	}

//    Actions
	public boolean validateloginpageTitle(String pageTitle) {
		return verifyPageTitle(pageTitle);
	}

	public void selectlan(String lan) {
		ClickonelemenetwithMouseover(By.cssSelector("span[data-reactid='67']"), By.cssSelector("button.dropdown-item"),
				lan);

	}

	public void dateSelection(String dateToSelect) {
		// pause(5000);
		clickElement(calendar);
		clickElementWithText(By.cssSelector("[class='CalendarDay CalendarDay--valid']>button"), dateToSelect);
	}

	public void SelectResort() {

		// pause(20000);
		clickElement(resortdd);

		// pause(4000);
		clickElementWithText(By.xpath("//div[@class='resort-list']//child::div"), "Vakantiepark De Krim");

	}

	public void SelectAccomodation() {

		clickElement(accommdkind);

		clickElementWithText(By.xpath("//div[@class='accokinds-list']//child::div"), "Bungalow");

	}

	public void SelectSubject() {
		clickElement(By.xpath("//span[contains(text(),'Gezelschap')]"));
		// pause(5000);
		typeValueInField(By.xpath("//div[text()='Volw. 50+']//child::input"), "2");

		// pause(1000);
		clickElement(SaveSubject);
		pause(1000);

	}

	public void selectDuration() {
		clickElement(By.xpath("//span[contains(text(), 'Duur van het verblijf')]"));
		clickElementWithText(By.xpath("//div[@class='stay-list']//div"), "Midweek");

	}

	public void continueToAccmmodationpage() {
		// pause(3000);
		clickElement(Continuetoaccmd);
		pause(3000);

	}

}
