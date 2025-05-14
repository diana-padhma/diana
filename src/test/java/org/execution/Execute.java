package org.execution;

import org.global.SeleniumBase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.page.LogInPage;
import org.page.OverView;
import org.page.AddProduct;
import org.page.Checkout;
import org.page.Finish;
import org.page.Information;

public class Execute extends SeleniumBase {
	public static SeleniumBase SeleniumBase;
	public static LogInPage LogInPage;
	public static AddProduct AddProduct ;
	public static Checkout Checkout;
	public static Information Information;
	public static Finish Finish;
	@BeforeClass
	public static  void Lanuch() {
	SeleniumBase=new SeleniumBase();
	SeleniumBase.initDriver(getDataFromExcel(1,0));
	SeleniumBase.applicationLaunch(getDataFromExcel(1,1));
	SeleniumBase.windMax();
	SeleniumBase.waitimp();
	}
	@Before
	public void login() throws InterruptedException {
		LogInPage=new LogInPage();
		if(LogInPage.getValidateLoginPage().isDisplayed()) {
			System.out.println("User in Login Page");
		}
		WebElement userName = LogInPage.getUserName();
		SeleniumBase.sendKeysByJava(userName,getDataFromExcel(1,2));
		WebElement password = LogInPage.getPassword();
		SeleniumBase.sendKeysByJava(password,getDataFromExcel(1,3));
		WebElement login = LogInPage.getLogin();
		Thread.sleep(2000);
		SeleniumBase.clickByJava(login);
	}
	@Test
	public void ProductAdd() throws InterruptedException {
		AddProduct = new AddProduct();
		if(AddProduct.getValidateAddProductPage().isDisplayed()) {
			System.out.println("User in AddToCard Page");
		}
	
		WebElement addProduct1=AddProduct.getaddProduct1();
		SeleniumBase.clickByJava(addProduct1);
		Thread.sleep(4000);
//		WebElement addProduct2 = AddProduct.getaddProduct2();
  //		SeleniumBase.clickByJava(addProduct2);
		WebElement addlogo = AddProduct.getaddlogo();
		SeleniumBase.clickByJava(addlogo);
		Thread.sleep(4000);
		Checkout = new Checkout();
		if(Checkout.getValidateCardPage().isDisplayed()) {
			System.out.println("User in CheckOut Page");
		}
		WebElement checkout = Checkout.getcheckout();
		SeleniumBase.clickByJava(checkout);
		Thread.sleep(4000);
	
		Information = new Information();
		Thread.sleep(3000);
		try {
			if(Information.getValidateInformationPage().isDisplayed()) {
				System.out.println("User in Information Page");
			}
			
		WebElement firstName = Information.getFirstName();
		firstName.clear();
		Thread.sleep(3000);
		SeleniumBase.sendKeysByJava(firstName,getDataFromExcel(1,4));
		WebElement LastName = Information.getLastName();
		Thread.sleep(3000);
		SeleniumBase.sendKeysByJava(LastName,getDataFromExcel(1,5));
		WebElement Pincode = Information.getPincode();
		SeleniumBase.sendKeysByJava(Pincode,getDataFromExcel(1,6));
		WebElement Continue= Information.getContinue();
		SeleniumBase.clickByJava(Continue);
		if(Information.getValidateInformationPage().isDisplayed()) {
			System.out.println("User in Information Page");
		}
		
		}catch(Exception e) {
			
		}
		
	
		
		OverView view = new OverView();
		if(view.getValidateOverViewPage().isDisplayed()) {
			System.out.println("User in OverView Page");
		}
		WebElement finsh= view.getFinish();
		SeleniumBase.clickByJava(finsh);
		
	
	}
	
	@AfterClass
	public static void finish1() throws InterruptedException {
		Finish = new Finish();
		if(Finish.getValidateFinishPage().isDisplayed()) {
			System.out.println("User in Finish Page");
		}
		WebElement openmenu = Finish.getOpenMenu();
		SeleniumBase.clickByJava(openmenu);
		WebElement Logout = Finish.getLogout();
		SeleniumBase.clickByJSE(Logout);
		System.out.println("Tester is completed");
	}
			
}
