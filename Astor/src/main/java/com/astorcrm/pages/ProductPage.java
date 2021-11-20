package com.astorcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.astorcrm.genericLib.BaseTest;

public class ProductPage {
	@FindBy(xpath = "//a[text()='Products']")
	private WebElement productTab;

	public WebElement getProductTab() {
		return productTab;
	}

	public ProductPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	public void Product()
	{
		productTab.click();
	}
}
