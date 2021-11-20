package com.astorcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.astorcrm.genericLib.BaseTest;

public class Edit {
	
	@FindBy(xpath="//a[text()='Cases']")private WebElement Cases;
	@FindBy(xpath="//div[@align='center']//a[@class='link'][normalize-space()='Edit']")private WebElement edit;
	public WebElement getCases() {
		return Cases;
	

	}
	public WebElement getEdit() {
		return edit;
	}

public Edit() 
{
	PageFactory.initElements(BaseTest.driver, this);
}
public void edi() throws InterruptedException

{
	Thread.sleep(1000);
	Cases.click();
	edit.click();
}}