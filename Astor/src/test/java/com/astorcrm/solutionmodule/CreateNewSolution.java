package com.astorcrm.solutionmodule;

import org.testng.annotations.Test;

import com.astorcrm.genericLib.BaseTest;
import com.astorcrm.genericLib.FileLib;
import com.astorcrm.genericLib.WebDriverCommonLib;
import com.astorcrm.pages.CreateSolutionPage;
import com.astorcrm.pages.NewSolutionPage;
import com.astorcrm.pages.Signin;
import com.astorcrm.pages.Sol;
import com.astorcrm.pages.SolutionsPage;

public class CreateNewSolution extends BaseTest
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
	     
		 
		 NewSolutionPage ns = new NewSolutionPage();	
		 ns.Newsolution();
		 Thread.sleep(3000);
		 
		 CreateSolutionPage csl = new CreateSolutionPage();
         csl.Createsolution(fl.readPropData(PROP_PATH,"solution"),fl.readPropData(PROP_PATH,"Question"), fl.readPropData(PROP_PATH,"Answer"));
         Thread.sleep(3000);
     	  
		}
}
