package com.astorcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.astorcrm.genericLib.BaseTest;

public class Sol {
	
	@FindBy(xpath = "// a [text()= 'Solutions']")
	private WebElement soltab;

	public WebElement getSoltab() {
		return soltab;
	}
	
	public Sol() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void sltab() {
		soltab.click();
	}

}
