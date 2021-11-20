package com.astorcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.astorcrm.genericLib.BaseTest;

public class NewProductPage 
{
 @FindBy(xpath="//input[@value='New Product']")private WebElement newproduct;
 public WebElement getNBTN() {
	return newproduct;
}
public NewProductPage() 
 {
	 PageFactory.initElements(BaseTest.driver, this);
 }
public void NewProdut()
{
	newproduct.click();
}

}
