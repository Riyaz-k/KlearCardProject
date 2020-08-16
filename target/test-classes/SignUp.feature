Feature: SignUp & Login page Module

Background: 
Given user has to launch "<browser>" and "<url>"
				|chrome|firefox|IE|https://dev.klearcard.com/|
	
@Smoke_test	
Scenario: user has to enter required details in SignUp module
Given user to click signUp button 
When user has to fill Company Information
				|klearcard pvt ltd|
				|Chennai|
				|620001|
				|9345611873|
And user has to fill Main Details
				|Riyaz|
				|Ahamed|
				|riyaz@gmail.com|
				|Riyaz1177|
				|Riyaz1177|
And user has to fill User Verification
				|8807276226|
				|06/01/2025|
				|06/01/1994|
				|Indian|
				|Chennai|
				|620001|
And user has to fill Mobile Verification
				|57575575|
				|123456|
And user has to fill Choose a Plan
				|4242424242424242|
				|Riyaz|
				|06/25|
				|987|
Then user has to validate Terms and Conditions

@Regression_test	
Scenario: user has to enter required details in Login module
Given user to click login button 
When user has to fill mandatory field
				|57575575|
				|Riyaz1177|
Then To validate whether user entered into dashboard