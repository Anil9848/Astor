package com.astorcrm.genericLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CaseCancel {
	
	@FindBy(xpath="(//input[@name='Cancel'])[1]") private WebElement cancel;

	public WebElement getCancel() {
		return cancel;
	}

	
public CaseCancel() {
	PageFactory.initElements(BaseTest.driver, this);
	
}
public void cancel()
{
	cancel.click();
}
}
