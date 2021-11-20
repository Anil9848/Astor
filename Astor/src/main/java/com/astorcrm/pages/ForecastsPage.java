package com.astorcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.astorcrm.genericLib.BaseTest;

public class ForecastsPage 
{
	@FindBy(xpath="//a[text()='Forecasts']") private WebElement forecast;

	public WebElement getFcst() {
		return forecast;
	}
	public ForecastsPage() 
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
  public void ForeCast()
  {
	  forecast.click();
  }
}
