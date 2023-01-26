package com.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class HomePage extends TestBase {
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//---------obj repo-------------
	@FindBy(xpath="//th[@class='text-right']")
	private WebElement Amount_Header;
	

	//--------action methods--------
	public void clickOnAmount()
	{
		Amount_Header.click();
	}
	
	
	public void checkTransactionAmount()
	{
		String data;
			for(int k=1;k<=6;k++)
			{
				data=driver.findElement(By.xpath("//table/tbody/tr["+k+"]/td[5]")).getText();
				System.out.println(data);
			}
	}

}
