package com.astorcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.astorcrm.genericLib.BaseTest;

public class CreateSolutionPage 
{
@FindBy(xpath="//input[@name=\"property(Solution Title)\"]") private WebElement solutiontitle;
@FindBy(xpath="//textarea[@name=\"property(Question)\"]") private WebElement question;
@FindBy(xpath="//textarea[@name=\"property(Answer)\"]") private WebElement answer;
@FindBy(xpath="(//input[@value='Save'])[1]") private WebElement SA;
public WebElement getSot() {
	return solutiontitle;
}
public WebElement getQus() {
	return question;
}
public WebElement getAns() {
	return answer;
}
public CreateSolutionPage ()
{
	PageFactory.initElements(BaseTest.driver,this);
}
public void Createsolution(String sln,String Ques,String Answ) 
{
	solutiontitle.sendKeys(sln);
	question.sendKeys(Ques);
	answer.sendKeys(Answ);
	SA.click();
}
}
