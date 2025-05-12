package org.page;

import org.global.SeleniumBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends SeleniumBase  {
	public LogInPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement userName;
	public WebElement getUserName() {
		return userName;
	}
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	public WebElement getPassword() {
		return password;
	}
	@FindBy(xpath="//input[@type='submit']")
	private WebElement login;
	public WebElement getLogin() {
		return login;
	}
	@FindBy(xpath="//div[@class='login_logo']")
	private WebElement ValidateLoginPage;
	public WebElement getValidateLoginPage() {
		return ValidateLoginPage;
		
	}



}
