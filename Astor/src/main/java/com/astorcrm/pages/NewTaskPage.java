package com.astorcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.astorcrm.genericLib.BaseTest;
import com.astorcrm.genericLib.WebDriverCommonLib;

public class NewTaskPage 
{
 @FindBy(xpath="//input[@name='property(subject)']") private WebElement subject;
 @FindBy(xpath="//textarea[@name='property(comments)']")private WebElement description;
 @FindBy(xpath="//input[@name='property(duedate)']") private WebElement duedate;
 @FindBy(xpath="//select[@name='property(status)']") private WebElement status;
 @FindBy(xpath="//select[@name='property(priority)']") private WebElement priority;
 @FindBy(xpath="//input[@value='Save']") private WebElement save;
public WebElement getSubject() {
	return subject;
}
public WebElement getDescription() {
	return description;
}
public WebElement getDuedate() {
	return duedate;
}
public WebElement getStatus() {
	return status;
}
public WebElement getPriority() {
	return priority;
}
public WebElement getSave() {
	return save;
}
 public NewTaskPage()
 {
	 PageFactory.initElements(BaseTest.driver,this);
 }
 public void CreateTask(String Sub, String Description, String DueDate )
 {
	 subject.sendKeys(Sub);
	 description.sendKeys(Description);
	 duedate.sendKeys(DueDate);
     WebDriverCommonLib wlib = new WebDriverCommonLib();
     wlib.selectOption(status, "Waiting on someone else");
     wlib.selectOption(priority, "Highest");
     save.click();
 }
}
