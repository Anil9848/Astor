package com.astorcrm.leadmodule;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.astorcrm.genericLib.BaseTest;
import com.astorcrm.genericLib.FileLib;
import com.astorcrm.genericLib.WebDriverCommonLib;
import com.astorcrm.pages.LeadPage;
import com.astorcrm.pages.NewLeadPage;
import com.astorcrm.pages.Signin;

public class WindowHandling extends BaseTest{

	@Test
	public void handle() throws Throwable
	{
		 Signin sp = new Signin();
	  	    FileLib fl = new FileLib();
	  	    WebDriverCommonLib wlib = new WebDriverCommonLib();
	  	    sp.login(fl.readPropData(PROP_PATH,"username"),fl.readPropData(PROP_PATH,"password"));
	  	    wlib.verify(fl.readPropData(PROP_PATH,"loginTitle"), "Zoho CRM - Sign in",fl.readPropData(PROP_PATH,"loginTitle") );
		    
		    LeadPage lp = new LeadPage();
	        lp.Lead();
	        Thread.sleep(1000);
		
	        NewLeadPage nlp=new NewLeadPage();
	        nlp.clickNewLead();
	        Thread.sleep(1000);
		WebElement ele = BaseTest.driver.findElement(By.xpath("//img[@title=\"Campaign Name Lookup\"]"));
		ele.click();
		Thread.sleep(1000);
		Set<String> allwhs = driver.getWindowHandles();
		/*
		 * for(String wh:allwhs) { String title
		 * =driver.switchTo().window(wh).getTitle();
		 * if(title.contains("Zoho CRM - Vendor Name Lookup")) {
		 * driver.manage().window().maximize(); }
		 * 
		 * }
		 */
        Iterator<String> it = allwhs.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
	       driver.switchTo().window(childWindow);
	       driver.manage().window().maximize();
	       
	       List<WebElement> campaignlist = driver.findElements(By.xpath("//table//tr[@class='tableHeadBg']/following-sibling::tr//td[1]"));
	       
	       campaignlist.get(0).click();
	       System.out.println(campaignlist.size());
	       
	       
	       
	       
	       
	       
	}
}
