
package mcms.qa.base;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageDriver {

	private int waitTimeout = 60;

	/**
	 * This method is used to get specific attribute value which user want to read.
	 * 
	 * @param by        - Locator strategy by which want to find element on UI.
	 * @param attribute - Specific attribute tag for which user want to read its
	 *                  value.
	 * @return String - It will return value of passed attribute tag.
	 */
	public String getFieldAttribute(By by, String attribute) {
		WebElement ctrl = this.getVisibleElement(by);
		String attrib = ctrl.getAttribute(attribute);
		return attrib;
	}

	/**
	 * This method is used to get text of webelement.
	 * 
	 * @param by - Locator strategy by which want to find element on UI.
	 * @return String - It will return text value of element.
	 */
	public String getSelectedText(By by) {
		WebElement webElement = getVisibleElement(by);
		Select select = new Select(webElement);
		String value = select.getFirstSelectedOption().getText();
		return value;
	}

	/**
	 * This method is used to check presence of text in page source
	 * 
	 * @param text - Text which want to look up in page in page source.
	 * @return boolean - It will return true if passed text is present in page
	 *         source else return false.
	 */
	public boolean isTextPresent(String text) {
		return TestBase.getWebdriver().getPageSource().contains(text);
	}

	public boolean isAlertPresent() {
		try {
			TestBase.getWebdriver().switchTo().alert();
			return true;
		} catch (NoSuchWindowException e) {
			return false;
		}
	}

	public void waitForElementNotDisplayed(By by) {
		for (int second = 0;; second++) {
			if (second >= waitTimeout) {
				break;
			}
			try {
				if (!isElementDisplayed(by))
					break;
			} catch (Exception e) {
			}
			pause(500);
		}
	}

	/**
	 * This method is used to select value in drop down by element visible text.
	 * 
	 * @param by   - Locator strategy by which want to find element on UI.
	 * @param text - Text by which user want to select element in drop down.
	 */
	public void selectLabel(By by, String text) {
		WebElement webElement = getVisibleElement(by);
		Select select = new Select(webElement);
		select.selectByVisibleText(text);
	}

	/**
	 * This method is used to select value in drop down by element value.
	 * 
	 * @param by    - Locator strategy by which want to find element on UI.
	 * @param value - Value by which user want to select element in drop down.
	 */
	public void selectValue(By by, String value) {
		WebElement webElement = getVisibleElement(by);
		Select select = new Select(webElement);
		select.selectByValue(value);
	}

	public String getText(By by) {
		String text = getVisibleElement(by).getText();
		return text;
	}

	/*
	 * isElementPresent1
	 * 
	 */
	public boolean isElementPresent(By by) {
		return TestBase.getWebdriver().findElements(by).size() > 0;
	}

	/**
	 * waitForElementVisible
	 * 
	 * @param by
	 */
	public void waitForElementVisible(By by) {
		WebElement element = null;
		try {
			element = this.getVisibleElement(by);
			if (element != null) {

				System.out.println("Element  visible: {}" + by.toString());
			}
		} catch (Exception e) {
			System.out.println("Element not visible: {}" + by.toString());
		}
	}

	/**
	 * waitForElementGone
	 * 
	 * @param by
	 */
	public void waitForElementGone(By by) {
		for (int second = 0;; second++) {
			if (second >= waitTimeout) {
				break;
			}
			try {
				if (!isElementPresent(by))
					break;
			} catch (Exception e) {
			}
			pause(500);
		}
	}

	/**
	 * isElementDisplayed
	 * 
	 * @param by
	 * @return boolean
	 */
	public boolean isElementDisplayed(By by) {
		boolean isElementVisible = false;
		WebElement element = null;
		try {
			element = TestBase.getWebdriver().findElement(by);
			isElementVisible = element.isDisplayed();
		} catch (Exception e) {
		}
		return isElementVisible;
	}

	/**
	 * clickElement
	 * 
	 * @param by
	 */
	public void clickElement(By by) {
		getVisibleElement(by).click();
	}

	/**
	 * clickElement
	 * 
	 * @param WebElement
	 */
	public void clickElement(WebElement element) {
		element.click();
	}

	public boolean verifyPageTitle(String page) {
		return TestBase.getWebdriver().getTitle().contains(page);
	}

	/**
	 * This function is used to Mouse over on element & click under its child element.
	 * 
	 * @param cssSelector
	 * @param cssSelector2
	 * @param lan
	 */
	public void ClickonelemenetwithMouseover(By cssSelector, By cssSelector2, String lan) {
		WebElement element = this.getVisibleElement(cssSelector);
		Actions action = new Actions(TestBase.getWebdriver());
		action.moveToElement(element).build().perform();
		this.clickElement(cssSelector2);
	}

	/**
	 * This function is used to Click On element with Text match.
	 * 
	 * @param by          - By - By object to search locator.
	 * @param textToCheck - String - Text value to match with element Text.
	 */
	public void clickElementWithText(By by, String textToCheck) {
		WebElement element = getVisibleElements(by).stream().filter(ele -> ele.getText().equalsIgnoreCase(textToCheck))
				.findFirst().get();
		element.click();
	}

	private List<WebElement> getVisibleElements(By by) {
		this.waitForElement(by);
		return TestBase.getWebdriver().findElements(by);
	}

	/**
	 * waitForElement
	 * 
	 * @param by Waits for an element to be available
	 */
	public void waitForElement(By by) {
		WebElement element = null;
		try {
			element = this.getVisibleElement(by);
			if (element != null) {
				System.out.println("Element  visible: {}" + by.toString());
			}
		} catch (Exception e) {
			System.out.println("Element not visible: {}" + by.toString());
		}
	}

	public void waitforElementEnabled(By by) {
		for (int second = 0;; second++) {
			if (second >= waitTimeout) {
				break;
			}
			try {
				boolean enabled = TestBase.getWebdriver().findElement(by).isEnabled();
				if (enabled)
					break;
			} catch (Exception e) {
			}
			pause(100);
		}
	}

	/*
	 * typeValueInField Public method for typing value with condition based to clear
	 * field or not
	 */
	public void typeValueInField(By by, String inputValue, boolean clearFieldBeforeTyping) {
		WebElement webElement = getVisibleElement(by);
		if (clearFieldBeforeTyping) {
			webElement.click();// set focus
			webElement.clear();
		}
		webElement.sendKeys(inputValue);
	}

	/*
	 * typeValueInField Public method for typing text with set focus and clear field
	 */
	public void typeValueInField(By by, String inputValue) {
		typeValueInField(by, inputValue, true);
	}

	/**
	 * getFieldTextByCss
	 * 
	 * @param css
	 * @return String
	 */
	public String getFieldTextBy(By by) {
		String text = this.getText(by);
		return text;
	}

	/**
	 * getHtmlSource
	 * 
	 * @return String
	 */
	public String getHtmlSource() {
		return TestBase.getWebdriver().getPageSource();
	}

	/*
	 * selectOptionText Private method for select option text
	 */
	public void selectOptionText(By by, String text) {
		WebElement selectField = TestBase.getWebdriver().findElement(by);
		List<WebElement> allOptions = selectField.findElements(By.tagName("option"));
		for (WebElement option : allOptions) {
			if (text.equals(option.getAttribute("text"))) {
				option.click();
				break;
			}
		}
	}

	/*
	 * checkBox Private method for CheckBox clicking
	 */
	public void checkBox(By by, boolean checked) {
		WebElement webElement = TestBase.getWebdriver().findElement(by);
		String checkAttribute = webElement.getAttribute("checked");
		boolean isChecked = false;
		if (checkAttribute != null && checkAttribute.equalsIgnoreCase("true")) {
			isChecked = true;
		}
		if (checked) {
			if (!isChecked) {
				webElement.click();
			}
		} else {
			if (isChecked) {
				webElement.click();
			}
		}
	}

	/**
	 * This method is used to pause the execution.This value must be pass in
	 * milliseconds.
	 * 
	 * @param integer - User should pass amount of value for which want to hold
	 *                execution.
	 */
	public void pause(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (Exception e) {
			System.out.println("Error in pause {} " + e.getMessage());
		}
	}

	/**
	 * setWaitTimeout
	 * 
	 * @param timeout A setter for the wait timeout
	 */
	public void setWaitTimeout(int timeout) {
		waitTimeout = timeout;
	}

	/**
	 * selectRadioButton
	 * 
	 * @param by This method will first check whether option is selected or not, if
	 *           it already selected then it will not perform any action.
	 */
	public void selectRadioButton(By by) {
		WebElement element = null;
		try {
			element = this.getVisibleElement(by);
			String checkStatus = element.getAttribute("checked");
			System.out.println("Current radio button state is {} " + checkStatus);
			if (checkStatus.equalsIgnoreCase("false")) {
				element.click();
			}
		} catch (Exception e) {
			System.out.println("Error in get select radio button {} " + e.getMessage());
		}
	}

	public List<WebElement> getListOfElements(By by) {
		List<WebElement> list = null;
		try {
			list = this.getVisibleElements(by);
		} catch (Exception e) {
		}
		return list;
	}

	/**
	 * @param By - Locator strategy by which want to find element on UI with
	 *           visibility check.
	 * @return WebElement - Webelement if founds else exception
	 */

	public WebElement getVisibleElement(By by) {
		@SuppressWarnings("deprecation")
		Wait<WebDriver> wait = new FluentWait<WebDriver>(TestBase.getWebdriver()).withTimeout(1, TimeUnit.MINUTES)
				.pollingEvery(10, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		WebElement waitingElement = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(by);
			}
		});
		return waitingElement;
	}

	/**
	 * This function is used to accept alert.
	 */
	public void acceptAlert() {
		TestBase.getWebdriver().switchTo().alert().accept();
	}

	/**
	 * This function is used to navigate back.
	 */
	public void navigateBack() {
		TestBase.getWebdriver().navigate().back();
	}

}
