package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPom extends BaseClass{
	
	
	public SignUpPom() {

	PageFactory.initElements(driver, this);
	}
	
//Company Information
	@FindBy(xpath="//button[text()= 'Sign up']")
	private WebElement signUp;

	@FindBy(name="name")
	private WebElement companyName;

	@FindBy(name="address")
	private WebElement companyAddress;
	
	@FindBy(name="zipCode")
	private WebElement companyPostCode;

	@FindBy(name="number")
	private WebElement companyNumber;
	
	@FindBy(xpath="//button[text()= 'Continue']")
	private WebElement submit;
	
	
//Main Details
	@FindBy(name="firstName")
	private WebElement firstName;
	
	@FindBy(name="lastName")
	private WebElement lastName;
	
	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy(name="_password")
	private WebElement ReEnterPass;
	
//User Verification
	@FindBy(name="document_id")
	private WebElement docId;
	
	@FindBy(name="doc_expired")
	private WebElement docExpiry;
	
	@FindBy(name="birthday")
	private WebElement dob;
	
	@FindBy(xpath="//label[text()= 'Female']")
	private WebElement gender;
	
	@FindBy(xpath="//span[text()='Singaporean']")
	private WebElement drop;
	
	@FindBy(xpath="//input[@type='search']")
	private WebElement dropSearch;
	
	@FindBy(name="residential_address")
	private WebElement resAddress;
	
	@FindBy(name="residential_zipCode")
	private WebElement respostCode;
	
//User Verification
	@FindBy(name="phoneNumber")
	private WebElement phoneNumber;
		
	@FindBy(xpath="//button[text()= 'Send code']")
	private WebElement sendCode;
	
	@FindBy(name="verificationCode")
	private WebElement otp;
	
	@FindBy(xpath="//button[text()= 'Submit code']")
	private WebElement submitCode;
	
	
//User Verification
	@FindBy(xpath="(//a[text()= 'Select'])[3]")
	private WebElement selectPlan;
			
	@FindBy(xpath="//input[@class='credit-card-input']")
	private WebElement cardNumber;
	
	@FindBy(name="name-on-card")
	private WebElement cardHolder;
	
	@FindBy(name="expired")
	private WebElement cardExpiry;
		
	@FindBy(name="cvc")
	private WebElement cvv;
		
//User Verification
	@FindBy(xpath="//div[@class= 'control__indicator']")
	private WebElement agree;
	
//KYB Process
	@FindBy(xpath="//a[text()= 'complete KYB Process later']")
	private WebElement later;

	public WebElement getSignUp() {
		return signUp;
	}

	public WebElement getCompanyName() {
		return companyName;
	}

	public WebElement getCompanyAddress() {
		return companyAddress;
	}

	public WebElement getCompanyPostCode() {
		return companyPostCode;
	}

	public WebElement getCompanyNumber() {
		return companyNumber;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getReEnterPass() {
		return ReEnterPass;
	}

	public WebElement getDocId() {
		return docId;
	}

	public WebElement getDocExpiry() {
		return docExpiry;
	}

	public WebElement getDob() {
		return dob;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getDrop() {
		return drop;
	}
	
	public WebElement getDropSearch() {
		return dropSearch;
	}

	public WebElement getResAddress() {
		return resAddress;
	}

	public WebElement getRespostCode() {
		return respostCode;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getSendCode() {
		return sendCode;
	}

	public WebElement getOtp() {
		return otp;
	}

	public WebElement getSubmitCode() {
		return submitCode;
	}

	public WebElement getSelectPlan() {
		return selectPlan;
	}

	public WebElement getCardNumber() {
		return cardNumber;
	}

	public WebElement getCardHolder() {
		return cardHolder;
	}

	public WebElement getCardExpiry() {
		return cardExpiry;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getAgree() {
		return agree;
	}

	public WebElement getLater() {
		return later;
	}
	
	
						
}
