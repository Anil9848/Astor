package com.astorcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.astorcrm.genericLib.BaseTest;

public class SolutionsPage {
@FindBy(xpath = "// img[@onmousedown='scrolright();']")
private WebElement right;
public WebElement getRight() {
	return right;
}
@FindBy(xpath="// a [text()= 'Solutions']") 
private WebElement sol;

public WebElement getSol() {
	return sol;
}
public SolutionsPage() 
{
	PageFactory.initElements(BaseTest.driver,this);
}
public void Solutions()
{
	
	right.click();
	sol.click();
}
}
