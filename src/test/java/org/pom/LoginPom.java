package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPom extends BaseClass{
	
	
	public LoginPom() {

	PageFactory.initElements(driver, this);
	}
	
//login button
	@FindBy(xpath="//button[text()= 'Log in']")
	private WebElement login;

	@FindBy(xpath="//input[@id='login-phone']")
	private WebElement txtUser;
	
	@FindBy(xpath="//div[@class= 'control__indicator']")
	private WebElement LoginAgree;

	@FindBy(xpath="//button[text()= 'Submit']")
	private WebElement submitUser;
	
	@FindBy(id="login-password")
	private WebElement txtPass;
	
	@FindBy(xpath="	(//button[text()= 'Submit'])[2]")
	private WebElement submitPass;

	
	

	public WebElement getLogin() {
		return login;
	}

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getLoginAgree() {
		return LoginAgree;
	}

	public WebElement getSubmitUser() {
		return submitUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getSubmitPass() {
		return submitPass;
	}


	
		
}

