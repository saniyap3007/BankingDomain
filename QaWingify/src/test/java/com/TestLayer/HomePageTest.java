package com.TestLayer;

import org.testng.annotations.Test;

import com.PageLayer.HomePage;
import com.TestBase.TestBase;

public class HomePageTest extends TestBase{
	
	public class HomePsgeTest extends TestBase {
		@Test
		public void checkAmount()
		{
			HomePage home = new HomePage();
			home.clickOnAmount();
			home.checkTransactionAmount();
		}
	}
}
