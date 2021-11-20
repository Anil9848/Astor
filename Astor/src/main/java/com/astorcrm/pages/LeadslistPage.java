package com.astorcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.astorcrm.genericLib.BaseTest;

public class LeadslistPage 
{
   @FindBy(xpath="//input[@value='602']") private WebElement select;
   @FindBy(xpath="//input[@value='Change Status']") private WebElement ChangeStatus;
   public WebElement getSelect() {
	return select;
}
public WebElement getChangeStatus() {
	return ChangeStatus;
}

public LeadslistPage()
   {
	   PageFactory.initElements(BaseTest.driver,this);
   }
   public void Leadlist()
   {
	   select.click();
	   ChangeStatus.click();

   }
}
