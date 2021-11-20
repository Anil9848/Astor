package com.astorcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.astorcrm.genericLib.BaseTest;

public class NewLeadPage 
{
 @FindBy(xpath="//input[@value='New Lead']") private WebElement newlead;
 @FindBy(xpath="//select[@name='property(saltName)']")private WebElement saltname;
 @FindBy(xpath="//input[@name='property(First Name)']")private WebElement firstname;
 @FindBy(xpath="//input[@name='property(Designation']")private WebElement designation ;
 @FindBy(xpath="//input[@name='property(Phone)']")private WebElement phone ;
 @FindBy(xpath="//select[@name='property(Lead Source)']")private WebElement leadsource;
 @FindBy(xpath="//select[@name='property(property(Industry))']")private WebElement industry;
 @FindBy(xpath="//input[@name='property(Company)']")private WebElement company;
 @FindBy(xpath="property(Last Name)")private WebElement lastname ;
// @FindBy(xpath="")private WebElement ;
// @FindBy(xpath="")private WebElement ;
// @FindBy(xpath="")private WebElement ;
 public NewLeadPage()
 {
	 PageFactory.initElements(BaseTest.driver, this);
 }
 public void clickNewLead()
 {
	 newlead.click();
 }
}
