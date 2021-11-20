package com.astorcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.astorcrm.genericLib.BaseTest;
import com.astorcrm.genericLib.WebDriverCommonLib;

public class SaveAndNew {
	
	
	@FindBy(xpath="//input[@name=\"property(Subject)\"]")private WebElement productname;
	
	  @FindBy(xpath="(//select[@name=\"property(Case Origin)\"])[1]") private WebElement propertyy;

	@FindBy(xpath="(//input[@name='Button'])[2]")private WebElement saveandnew;

	public WebElement getProductname() {
		return productname;
	}

	public WebElement getPropertyy() {
		return propertyy;
	}

	public WebElement getSaveandnew() {
		return saveandnew;
	}


public SaveAndNew() {
	PageFactory.initElements(BaseTest.driver, this);
	
}


public void savenew(String pn) {
	productname.sendKeys(pn);
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	wlib.selectOption(propertyy,"Phone");
	saveandnew.click();
}
}






