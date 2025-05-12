package org.page;

import org.global.SeleniumBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProduct extends SeleniumBase{
	public AddProduct() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="(//button[@class='btn_primary btn_inventory'])[1]")
	private WebElement addProduct1;
	public WebElement getaddProduct1() {
		return addProduct1;
	}
	@FindBy(xpath="(//button[@class='btn_primary btn_inventory'])[3]")
	private WebElement addProduct2;
	public WebElement getaddProduct2() {
		return addProduct2;
	}
	@FindBy(xpath="//span[@class='fa-layers-counter shopping_cart_badge']")
	private WebElement addlogo;
	public WebElement getaddlogo() {
		return addlogo;
		
	}
	@FindBy(xpath="//div[@class='product_label']")
	private WebElement ValidateAddProductPage;
	public WebElement getValidateAddProductPage() {
		return ValidateAddProductPage;
	
	}
	
}
