package com.astorcrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.astorcrm.genericLib.BaseTest;
import com.astorcrm.genericLib.WebDriverCommonLib;

public class CreatePage {
	
	@FindBy(xpath="//input[@name='property(Subject)']") private WebElement subject;
    @FindBy(xpath="//input[@value='Save'][1]")private WebElement save;
    @FindBy(xpath="(//select[@name=\"property(Case Origin)\"])[1]") private WebElement property
;    
    
    
	public WebElement getSave() {
		return save;
	}



	public WebElement getProperty() {
		return property;
	}



	public WebElement getSubject() {
		return subject;
	}

	public CreatePage() {
		PageFactory.initElements(BaseTest.driver, this);
	
		
	}
	public void Create(String sub) throws InterruptedException {
		Thread.sleep(1000);
		
		subject.sendKeys(sub);
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		wlib.selectOption(property,"Phone");
		
		save.click();
		
		
		
	}
}
