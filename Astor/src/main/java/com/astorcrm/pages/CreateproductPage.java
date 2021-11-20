package com.astorcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.astorcrm.genericLib.BaseTest;
import com.astorcrm.genericLib.WebDriverCommonLib;

public class CreateproductPage
{
 @FindBy(xpath="//input[@ name='property(Product Code)']") private WebElement productcode;
 @FindBy(xpath="//input[@name='property(Product Name)']") private WebElement productname;
 @FindBy(xpath="//input[@name='property(Vendor Name)']") private WebElement vendorname;
 @FindBy(xpath="(//input[@value='Save'])[1]") private WebElement Save;
 @FindBy(xpath="//select[@name='property(Product Category)']") private WebElement productCategoryDropDown;
 
 
 public WebElement getSa() {
	return Save;
}

public CreateproductPage()
 {
	 PageFactory.initElements(BaseTest.driver,this);	 
 }

public WebElement getPc() {
	return productcode;
}

public WebElement getPn() {
	return productname;
}

public WebElement getVc() {
	return productname;
}
public void createProduct(String productcode1,String productname1,String vendorname1) throws Throwable
{
	productcode.sendKeys(productcode1);
	productname.sendKeys(productname1);
	productname.sendKeys(vendorname1);
	Thread.sleep(2000);
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	wlib.selectOption(productCategoryDropDown, "Hardware");
	Thread.sleep(2000);
	Save.click();
	
}

public void details(String readPropData, String readPropData2, String readPropData3) {
	// TODO Auto-generated method stub
	
}

}
 