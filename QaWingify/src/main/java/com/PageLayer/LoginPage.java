package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class LoginPage extends TestBase {
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	//--------obj repo-------------
	@FindBy(xpath="//input[@id='username']")
	private WebElement username_txtbox;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password_txtbox;

	@FindBy(xpath="//button[@id='log-in']")
	private WebElement login_btn;
	

	//-------action methods---------
	public void enterUsername()
	{
		username_txtbox.sendKeys("Saniya");	
	}
    public void enterPassword()
    {
    	password_txtbox.sendKeys("Pass@123");
    }
    public void clickOnLogin()
    {
    	login_btn.click();
    }
}

