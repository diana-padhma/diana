package org.page;

import org.global.SeleniumBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Finish extends SeleniumBase {
	public Finish() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//h2[text()='THANK YOU FOR YOUR ORDER']")
	private WebElement ValidateFinishPage;
	public WebElement getValidateFinishPage() {
		return ValidateFinishPage;
	}
	
   @FindBy(xpath="//button[text()='Open Menu']")
   private WebElement OpenMenu;
   public WebElement getOpenMenu() {
	return OpenMenu;
   }
   
   @FindBy(xpath="//a[@id='logout_sidebar_link']")
    private WebElement Logout;
    public WebElement getLogout() {
		return Logout;
    	
    }
}
