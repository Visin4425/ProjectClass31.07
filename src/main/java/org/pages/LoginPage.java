package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	
public LoginPage() {
	PageFactory.initElements(driver, this);
}

 @CacheLookup
 @FindBys({@FindBy(id = "email"), @FindBy(xpath = "//input[@id='email']")})
 private WebElement txtUsername;
 
 @FindBys({@FindBy(id = "pass"), @FindBy(xpath = "//input[@id='pass']")})
 private WebElement txtPassword;
 
 @FindBy(name = "login")
 private WebElement btnLogin;

 public WebElement gettxtUsername() {
	 return txtUsername;
 }
 public WebElement gettxtPassword() {
	 return txtPassword;	 
 }
public WebElement getbtnLogin() {
	return btnLogin;
}
 
 
	
	
}
