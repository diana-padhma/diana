package org.page;

import org.global.SeleniumBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout extends SeleniumBase {
	public Checkout() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@class='btn_action checkout_button']")
	private  WebElement checkout;
	public WebElement getcheckout() {
		return checkout;
	}
	@FindBy(xpath="//div[text()='Your Cart']")
	private WebElement ValidateCardPage;
	public WebElement getValidateCardPage() {
		return ValidateCardPage;
		
	}
}
