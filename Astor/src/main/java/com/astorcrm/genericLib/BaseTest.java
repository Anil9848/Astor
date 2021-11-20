package com.astorcrm.genericLib;
//Anil
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest implements IAutoConstants {
//anil
	public static WebDriver driver;

	@BeforeClass
	
	public void openBrowser() throws Throwable {
		
		FileLib fs = new FileLib();
		
		String browser = fs.readPropData(PROP_PATH, "browser");
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver = new FirefoxDriver();

		}

		else {
			Reporter.log("Enter Proper Browser name", true);
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		String appUrl = fs.readPropData(PROP_PATH, "url");
		driver.get(appUrl);

		WebDriverCommonLib wlib = new WebDriverCommonLib();
		Thread.sleep(3000);
		wlib.verify(wlib.getPageTitle(),
				fs.readPropData(PROP_PATH, "loginTitle"), "Login Page");
	}

	@AfterClass(enabled = false)
	public void closeBrowser() {
		driver.quit();
	}
}
