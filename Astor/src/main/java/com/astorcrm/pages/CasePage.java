package com.astorcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.astorcrm.genericLib.BaseTest;

public class CasePage {
	
	@FindBy(xpath="//a[text()='Cases']")private WebElement Cases;

	public WebElement getCases() {
		return Cases;
	}
	public CasePage()
	{
		PageFactory.initElements(BaseTest.driver, this);
		
	}

	public void CaseTab() throws InterruptedException
	{
		Thread.sleep(1000);
		Cases.click();
	}
	
			

}
