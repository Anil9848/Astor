package com.astorcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.astorcrm.genericLib.BaseTest;

public class PurchaseOdersPage {
	@FindBy(xpath = "//img[@id='scrollright']")
	private WebElement Scrollright;
	@FindBy(xpath = "//a[@id='PurchaseOrderstab']")
	private WebElement podr;

	public WebElement getPodr() {
		return podr;
	}

	public WebElement getScr() {
		return Scrollright;
	}

	public PurchaseOdersPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	public void Scrbtn() throws Throwable {
		for (int i = 0; i <= 36; i++) {
			Thread.sleep(500);
			Scrollright.click();

		}
		Thread.sleep(1000);
		podr.click();
	}

}
