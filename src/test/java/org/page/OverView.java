package org.page;

import org.global.SeleniumBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverView extends SeleniumBase{
	public OverView() {
		PageFactory.initElements(driver,this);
	}
	
   @FindBy(xpath="//a[@class='btn_action cart_button']")
   private WebElement Finish;
   public WebElement getFinish() {
		return Finish;		   
   }
   @FindBy(xpath="//div[text()='Checkout: Overview']")
   private WebElement ValidateOverViewPage;
   public WebElement getValidateOverViewPage() {
	   return ValidateOverViewPage;
   }
}
