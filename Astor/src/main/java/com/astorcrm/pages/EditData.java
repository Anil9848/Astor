package com.astorcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.astorcrm.genericLib.BaseTest;
import com.astorcrm.genericLib.WebDriverCommonLib;

public class EditData {
	
	@FindBy(xpath="//input[@name='property(Subject)']") private WebElement subjectTab;
	
	@FindBy(xpath="(//input[@value='Save & New'])[1]") private WebElement savenew;
	
	@FindBy(xpath="(//select[@name=\"property(Case Origin)\"])[1]") private WebElement property;
	public WebElement getProperty() {
		return property;
	}
	public EditData()
	{
		PageFactory.initElements(BaseTest.driver, this);
		
	}
	public WebElement getSubjectTab() {
		return subjectTab;
	}
	
	public WebElement getSavenew() {
		return savenew;
	}
	public void Editd(String st) throws Throwable {
		
		subjectTab.clear();
		Thread.sleep(1000);
		subjectTab.sendKeys(st);
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		wlib.selectOption(property,"Phone");
		
		
		savenew.click();
		
		
		
		
		
		
		
		
		
	}

}
