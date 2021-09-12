package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.Testbase;

public class Homepage  {

	WebDriver Ldriver;
	public Homepage(WebDriver Gdriver) {
		Ldriver =Gdriver;
		PageFactory.initElements( Gdriver,this);
	}
	@FindBy (xpath="//body/nav[@id='narvbarx']/a[@id='nava']/img[1]")
	WebElement Logo;
	
	public void Verifylogo() {
		boolean logostatus=Logo.isDisplayed();
		if(logostatus==true) {
		System.out.println("Logo is visible "+logostatus);
	
		}

}}
