package com.astorcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.astorcrm.genericLib.BaseTest;

public class Dnmslokesh {
	@FindBy(xpath="(//a[text()='dnmslokesh'])[1]") private WebElement lokesh;


public Dnmslokesh() {
	PageFactory.initElements(BaseTest.driver, this);
}
public WebElement getLokesh() {
	return lokesh;
}
public void loki() {
	lokesh.click();
}
}