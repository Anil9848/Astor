package com.astorcrm.productmodule;

import org.testng.annotations.Test;

import com.astorcrm.genericLib.BaseTest;
import com.astorcrm.genericLib.FileLib;
import com.astorcrm.genericLib.WebDriverCommonLib;
import com.astorcrm.pages.CreateproductPage;
import com.astorcrm.pages.NewProductPage;
import com.astorcrm.pages.ProductPage;
import com.astorcrm.pages.Signin;

public class CreateNewProduct extends BaseTest
{

@Test
public  void SigninPage() throws Throwable
	
{
	    Signin sp = new Signin();
	    FileLib fl = new FileLib();
	    WebDriverCommonLib wlib = new WebDriverCommonLib();
	    sp.login(fl.readPropData(PROP_PATH,"username"),fl.readPropData(PROP_PATH,"password"));
	    wlib.verify(fl.readPropData(PROP_PATH,"loginTitle"), "Zoho CRM - Sign in",fl.readPropData(PROP_PATH,"loginTitle") );
	 
	    ProductPage pdt = new ProductPage();
	    pdt.Product();
		
		NewProductPage pag = new NewProductPage();
				pag.NewProdut();
		 
		 CreateproductPage cpt = new CreateproductPage();
		 cpt.createProduct(fl.readPropData(PROP_PATH,"productcode1"),fl.readPropData(PROP_PATH,"productname1"), fl.readPropData(PROP_PATH,"vendorname1"));
		 Thread.sleep(3000);
	    
}
}