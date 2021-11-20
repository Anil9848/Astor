package com.astorcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.astorcrm.genericLib.BaseTest;

public class NewForecastspage 
{
@FindBy(xpath="//input[@value='New Forecast']") private WebElement newforecasttab;

public WebElement getNewforecasttab() {
	return newforecasttab;
}
public NewForecastspage()
{
	PageFactory.initElements(BaseTest.driver,this);
}
public void NewForeCast()
{
	newforecasttab.click();
}
}
