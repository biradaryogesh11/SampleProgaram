package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;

public class LoginPage extends TestBase
{

	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//input[@id='txt_mobilenumber']")
	private WebElement mobile_number ;
	public void entermobilenumber(String num)
	{
		mobile_number.sendKeys(num);
	}


	@FindBy(xpath="//a[@id='lnk_submitmobnumber']")
	private WebElement submit_button ;
	public void clickOnSubmitbutton()
	{
		submit_button.click();
	}

	@FindBy(xpath="//input[@id='txt_accesspin']")
	private WebElement enter_pin;
	public void enter4DigitPin(String pin)
	{
		enter_pin.sendKeys(pin);
	}

	@FindBy(xpath="//a[@id='lnk_submitaccesspin']")
	private WebElement submit_2;
	public void clickOnSubmit2()
	{
		submit_2.click();
	}

}
