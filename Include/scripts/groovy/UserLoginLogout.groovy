import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class UserLoginLogout {
	@When('the user enters an invalid email address (.*) and a valid password (.*)')
	def enterInvalidEmailAddress(String emailAddress, String password) {
		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_Email_useremail'), emailAddress)

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_SecondHand/input_Password_userpassword'), password)
	}

	@And('the user clicks on "Login"')
	def clickLogin() {
		WebUI.click(findTestObject('Object Repository/Page_SecondHand/input_Password_commit'))

		WebUI.delay(3)
	}

	@Then('the user is still on the login page')
	def verifyStillOnLoginPage() {
		WebUI.delay(5)

		def currentURL= WebUI.getUrl()

		WebUI.verifyMatch(currentURL, 'https://secondhand.binaracademy.org/users/sign_in', false)
	}

	@When('the user enters a valid email address (.*) and an invalid password (.*)')
	def enterInvalidPassword(String emailAddress, String password) {
		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_Email_useremail'), emailAddress)

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_SecondHand/input_Password_userpassword'), password)
	}

	@Then('the user sees an "Invalid Email or password" message')
	def verifyErrorMessageLogin() {
		WebUI.delay(3)

		WebUI.waitForElementPresent(findTestObject('Object Repository/Page_SecondHand/div_Invalid Email or password'), 0)

		WebUI.waitForElementVisible(findTestObject('Object Repository/Page_SecondHand/div_Invalid Email or password'), 0)

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_SecondHand/div_Invalid Email or password'), 0)

		WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/div_Invalid Email or password'), 'Invalid Email or password.')
	}

	@When('the user enters a valid email address (.*) and an empty password')
	def enterEmptyPassword(String emailAddress) {
		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_Email_useremail'), emailAddress)

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_SecondHand/input_Password_userpassword'), '')
	}

	@When('the user enters a valid email address (.*) a valid password (.*)')
	def enterValidData(String emailAddress, String password) {
		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_Email_useremail'), emailAddress)

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_SecondHand/input_Password_userpassword'), password)
	}

	@And('the user clicks on "Keluar"')
	def clickLogout() {

		WebUI.click(findTestObject('Object Repository/Page_SecondHand/button_Keluar'))
	}

	@Then('the user is logged out and sees the "Masuk" link')
	def confirmLogout() {
		WebUI.delay(5)

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_SecondHand/a_Masuk'), 0)

		WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/a_Masuk'), 'Masuk')
	}
}