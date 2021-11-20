package com.astorcrm.forecastmodule;

import org.testng.annotations.Test;

import com.astorcrm.genericLib.BaseTest;
import com.astorcrm.genericLib.FileLib;
import com.astorcrm.genericLib.WebDriverCommonLib;
import com.astorcrm.pages.ForecastsPage;
import com.astorcrm.pages.Signin;

public class Forecasts extends BaseTest
{
@Test
		public  void SigninPage() throws Throwable
		{	
	
         Signin sp = new Signin();
     	 FileLib fl = new FileLib();
     	 WebDriverCommonLib wlib = new WebDriverCommonLib();
     	  sp.login(fl.readPropData(PROP_PATH,"username"),fl.readPropData(PROP_PATH,"password"));
     	  wlib.verify(fl.readPropData(PROP_PATH,"loginTitle"), "Zoho CRM - Sign in",fl.readPropData(PROP_PATH,"loginTitle") );	 
     	  
	     ForecastsPage fst = new ForecastsPage();
         fst.ForeCast();
         Thread.sleep(3000);
		}
}
