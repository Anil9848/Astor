package com.astorcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.astorcrm.genericLib.BaseTest;

public class NewCasePage {
	@FindBy(xpath="//input[@value='New Case']")private WebElement NewCase;

	public WebElement getNewCase() {
		return NewCase;
	}
	public NewCasePage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	public void NewTab() throws InterruptedException {
		Thread.sleep(1000);
		NewCase.click();
	}
	
	
}
