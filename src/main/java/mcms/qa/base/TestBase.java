package mcms.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import mcms.qa.util.TestUtil;

public class TestBase {
	
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	public static Properties prop;
	
	public static WebDriver getWebdriver() {
		return driver.get();
	}
	
	public TestBase()  {
		try 
		{
			
			prop= new Properties();
			FileInputStream ip = new FileInputStream("/Users/Amar/eclipse-workspace/MCMS FrameWork/src/main/java/mcms"
					+ "/qa/config/config.properties");
			prop.load(ip);
		}
		
			catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void initialization()
	{
		String browserName = prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "C:/Users/Amar/eclipse-workspace/MCMS FrameWork/chromedriver.exe");
			driver.set(new ChromeDriver());
		}
		else if(browserName.equals("FF")) 
		{
		     System.setProperty("webdriver.firefox.marionette", "D:\\geckodriver.exe");
			driver.set(new FirefoxDriver());
		}
		System.out.println(driver);
		getWebdriver().manage().window().maximize();
		getWebdriver().manage().deleteAllCookies();
		getWebdriver().manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		getWebdriver().manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS );
		getWebdriver().get(prop.getProperty("url"));
				
			
		
		
	}
	
	public static void closesession()
	{
		
		getWebdriver().close();
	}
	
	

}
