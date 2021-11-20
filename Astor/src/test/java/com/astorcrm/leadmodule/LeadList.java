package com.astorcrm.leadmodule;

import org.testng.annotations.Test;

import com.astorcrm.genericLib.BaseTest;
import com.astorcrm.genericLib.FileLib;
import com.astorcrm.genericLib.WebDriverCommonLib;
import com.astorcrm.pages.LeadPage;
import com.astorcrm.pages.LeadslistPage;
import com.astorcrm.pages.Signin;

public class LeadList extends BaseTest
{
  @Test
  public  void SigninPage() throws Throwable
	
  {
	    Signin sp = new Signin();
  	    FileLib fl = new FileLib();
  	  WebDriverCommonLib wlib = new WebDriverCommonLib();
  	  sp.login(fl.readPropData(PROP_PATH,"username"),fl.readPropData(PROP_PATH,"password"));
  	  wlib.verify(fl.readPropData(PROP_PATH,"loginTitle"), "Zoho CRM - Sign in",fl.readPropData(PROP_PATH,"loginTitle") );
	    
	    LeadPage lp = new LeadPage();
        lp.Lead();
        
      LeadslistPage lpage = new LeadslistPage();
      lpage.Leadlist();
}
}
