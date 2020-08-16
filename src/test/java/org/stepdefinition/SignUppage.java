package org.stepdefinition;

import java.io.IOException;
import java.util.List;

import org.baseclass.BaseClass;
import org.openqa.selenium.Keys;
import org.pom.LoginPom;
import org.pom.SignUpPom;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUppage extends BaseClass{
	SignUpPom signup;;
	LoginPom login;
	List<String> list;

	@Given("user has to launch {string} and {string}")
	public void user_has_to_launch_and(String browser, String http, io.cucumber.datatable.DataTable dataTable) {
		list = dataTable.asList();
		launch(list.get(0));
		waitTime(15);
		URL(list.get(3));
	}

	@Given("user to click signUp button")
	public void user_to_click_signUp_button() {
		signup =  new SignUpPom();
	  btnClick(signup.getSignUp()); 
	}

	@When("user has to fill Company Information")
	public void user_has_to_fill_Company_Information(io.cucumber.datatable.DataTable dataTable) {
		list = dataTable.asList();
		signup =  new SignUpPom();
		fill(list.get(0), signup.getCompanyName());
		fill(list.get(1), signup.getCompanyAddress());
		fill(list.get(2), signup.getCompanyPostCode());
		fill(list.get(3), signup.getCompanyNumber());
		btnClick(signup.getSubmit());
	}

	@When("user has to fill Main Details")
	public void user_has_to_fill_Main_Details(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		list = dataTable.asList();
		signup =  new SignUpPom();
		fill(list.get(0), signup.getFirstName());
		fill(list.get(1), signup.getLastName());
		fill(list.get(2), signup.getEmail());
		fill(list.get(3), signup.getPass());
		fill(list.get(4), signup.getReEnterPass());
		scroll();
		btnClick(signup.getSubmit());
	}

	@When("user has to fill User Verification")
	public void user_has_to_fill_User_Verification(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		list = dataTable.asList();
		signup =  new SignUpPom();
		fill(list.get(0), signup.getDocId());
		fill(list.get(1), signup.getDocExpiry());
		fill(list.get(2), signup.getDob());
		btnClick(signup.getGender());
		btnClick(signup.getDrop());
		dropDownValue(list.get(3), signup.getDropSearch());
		scroll();
		fill(list.get(4), signup.getResAddress());
		fill(list.get(5), signup.getRespostCode());
		btnClick(signup.getSubmit());
	}

	@When("user has to fill Mobile Verification")
	public void user_has_to_fill_Mobile_Verification(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		list = dataTable.asList();
		fill(list.get(0), signup.getPhoneNumber());
		btnClick(signup.getSendCode());
		fill(list.get(1), signup.getOtp());
		btnClick(signup.getSubmitCode());
	}

	@When("user has to fill Choose a Plan")
	public void user_has_to_fill_Choose_a_Plan(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		list = dataTable.asList();
		signup =  new SignUpPom();
		btnClick(signup.getSelectPlan());
		scroll();
		fill(list.get(0), signup.getCardNumber());
		fill(list.get(1), signup.getCardHolder());
		fill(list.get(2), signup.getCardExpiry());
		fill(list.get(3), signup.getCvv());
		btnClick(signup.getSubmit());
		
	}

	@Then("user has to validate Terms and Conditions")
	public void user_has_to_validate_Terms_and_Conditions() throws InterruptedException {
		signup =  new SignUpPom();
		btnClick(signup.getAgree());
		btnClick(signup.getSubmit());
		btnClick(signup.getLater());
		delay(5000);
		Assert.assertEquals(driver.getCurrentUrl(), "https://dev.klearcard.com/dashboard", "Assertion failed: Verify url");
		System.out.println("User is on dashboard");
	}
	
	@Given("user to click login button")
	public void user_to_click_login_button() {
		login = new LoginPom();
		btnClick(login.getLogin());
	}

	@When("user has to fill mandatory field")
	public void user_has_to_fill_mandatory_field(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		list = dataTable.asList();
		login = new LoginPom();
		fill(list.get(0), login.getTxtUser());
		btnClick(login.getLoginAgree());
		btnClick(login.getSubmitUser());
		fill(list.get(1), login.getTxtPass());
		btnClick(login.getSubmitPass());
	}

	@Then("To validate whether user entered into dashboard")
	public void to_validate_whether_user_entered_into_dashboard() throws InterruptedException {
		delay(5000);
		Assert.assertEquals(driver.getCurrentUrl(), "https://dev.klearcard.com/dashboard", "Assertion failed: Verify url");
		System.out.println("User is on dashboard");
	}


}
