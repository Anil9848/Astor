package com.astorcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.astorcrm.genericLib.BaseTest;

public class Clone {
	@FindBy(xpath="(//input[@value='Clone'])[1]")private WebElement Clone;
	@FindBy(xpath="(//input[@value='Save'])[1]") private WebElement Save;


public WebElement getSave() {
		return Save;
	}
public Clone() {
	PageFactory.initElements(BaseTest.driver, this);
}
public WebElement getClone() {
	return Clone;
}
public void clon() throws InterruptedException {
	Thread.sleep(1000);
	Clone.click();
	Save.click();
	
}
}