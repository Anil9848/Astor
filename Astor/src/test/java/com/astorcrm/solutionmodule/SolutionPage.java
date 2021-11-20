package com.astorcrm.solutionmodule;

import org.testng.annotations.Test;

import com.astorcrm.genericLib.BaseTest;
import com.astorcrm.genericLib.FileLib;
import com.astorcrm.genericLib.WebDriverCommonLib;
import com.astorcrm.pages.Signin;
import com.astorcrm.pages.SolutionsPage;

public class SolutionPage extends BaseTest
{
@Test
		public  void SigninPage() throws Throwable
		{	
	
         Signin sp = new Signin();
     	 FileLib fl = new FileLib();
     	WebDriverCommonLib wlib = new WebDriverCommonLib();
     	  sp.login(fl.readPropData(PROP_PATH,"username"),fl.readPropData(PROP_PATH,"password"));
     	  wlib.verify(fl.readPropData(PROP_PATH,"loginTitle"), "Zoho CRM - Sign in",fl.readPropData(PROP_PATH,"loginTitle") );
	     
	     SolutionsPage sol = new SolutionsPage();
		 sol.Solutions();
		 Thread.sleep(3000);
		}
}
