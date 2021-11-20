package com.astorcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.astorcrm.genericLib.BaseTest;

public class ForeCastEditPage
{
  @FindBy(xpath="//input[@name='forecastQuota1']") private WebElement april;
  @FindBy(xpath="//input[@name='commitAmount1']") private WebElement committedamount1;
  @FindBy(xpath="//input[@name='bestcaseAmount1']") private WebElement bestcaseamount1;
  @FindBy(xpath="(//input[@value='Save'])[1]") private WebElement Save;

public WebElement getApril() {
	return april;
}
public WebElement getCommittedamount1() {
	return committedamount1;
}
public WebElement getBestcaseamount1() {
	return bestcaseamount1;
}
public WebElement getSave() {
	return Save;
}

   public ForeCastEditPage()
   {
	   PageFactory.initElements(BaseTest.driver,this);
   }
   public void ForeCastEdit1(String april1,String committedamount,String bestcaseamount) throws Throwable
   {
	   april.sendKeys(april1);
	   committedamount1.sendKeys(committedamount);
	   bestcaseamount1.sendKeys(bestcaseamount);
	   Thread.sleep(2000);
	   Save.click();
   }

	
}

