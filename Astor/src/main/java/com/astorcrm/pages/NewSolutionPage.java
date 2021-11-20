package com.astorcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.astorcrm.genericLib.BaseTest;

public class NewSolutionPage {
	@FindBy(xpath="//input[@value='New Solution']")private WebElement newsolution;

	public WebElement getNs() {
		return newsolution;
	}
	public NewSolutionPage()
	{
		
	PageFactory.initElements(BaseTest.driver,this);	
	}
	public void Newsolution()
	{
		newsolution.click();
		
	}
	

}
