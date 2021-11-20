package com.astorcrm.leadmodule;

import org.testng.annotations.Test;

import com.astorcrm.genericLib.BaseTest;
import com.astorcrm.genericLib.FileLib;
import com.astorcrm.genericLib.WebDriverCommonLib;
import com.astorcrm.pages.ChangeStatusPage;
import com.astorcrm.pages.LeadCreateTask;
import com.astorcrm.pages.LeadPage;
import com.astorcrm.pages.LeadslistPage;
import com.astorcrm.pages.NewTaskPage;
import com.astorcrm.pages.Signin;

public class ChangeStatus extends BaseTest
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
	        Thread.sleep(2000);
	        
	        LeadslistPage lpage = new LeadslistPage();
	        lpage.Leadlist();
	        Thread.sleep(2000);
	        
	        ChangeStatusPage cspage = new ChangeStatusPage();
	        cspage.NewStatus();
	        Thread.sleep(2000);
	       
	        LeadCreateTask lct = new LeadCreateTask();
	        lct.CreateTasktoLead();
	        Thread.sleep(2000);
	         
	      NewTaskPage ntask = new NewTaskPage();
	      ntask.CreateTask(fl.readPropData(PROP_PATH,"Sub"), fl.readPropData(PROP_PATH,"Description"), fl.readPropData(PROP_PATH,"DueDate"));
	      Thread.sleep(2000);
}
}