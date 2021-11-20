package com.astorcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.astorcrm.genericLib.BaseTest;

public class LeadCreateTask 
{
   @FindBy(xpath="//input[@value='602']") private WebElement click;
   @FindBy(xpath="//input[@value='Create Task']") private WebElement createtask;
   
 public WebElement getClick() {
	return click;
}
public WebElement getCreatetask() {
	return createtask;
}
public LeadCreateTask()
   {
	   PageFactory.initElements(BaseTest.driver,this);
   }
   public void CreateTasktoLead()
   {
	   click.click();
	   createtask.click();
   }
}