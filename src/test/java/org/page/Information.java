package org.page;

import org.global.SeleniumBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Information extends SeleniumBase {
	public Information() {
		PageFactory.initElements(driver,this);
	}
	
   @FindBy(xpath="//input[@id='first-name']")
   private WebElement FirstName;
   public WebElement getFirstName() {
		return FirstName;		   
   }
   @FindBy(xpath="//input[@id='last-name']")
   private WebElement LastName;
   public WebElement getLastName() {
	return LastName;   
   }
   @FindBy(xpath="//input[@id='postal-code']")
   private WebElement Pincode;
   public WebElement getPincode() {
	return Pincode;  
   }
   @FindBy(xpath="//input[@class='btn_primary cart_button']")
   private WebElement Continue;
   public WebElement getContinue() {
	return Continue;  
   }
   
   @FindBy(xpath="//div[@id='shopping_cart_container']")
   private WebElement ValidateInformationPage;
   public WebElement getValidateInformationPage() {
	return ValidateInformationPage;
	   
   }
}
