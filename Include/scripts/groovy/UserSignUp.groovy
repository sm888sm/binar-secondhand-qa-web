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



class UserSignUp {

	def generateRandomEmail() {
		def timestamp = System.currentTimeMillis()
		def randomNum = Math.abs(new Random().nextInt())

		def generatedEmailAddress = "qae10_gr03_buyer_${timestamp}_${randomNum}@example.com"

		GlobalVariable.BuyerEmail = generatedEmailAddress

		return generatedEmailAddress
	}


	@Given('the user opens the website "https://https://secondhand.binaracademy.org"')
	def openHomepage() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://secondhand.binaracademy.org/')
	}



	@And('the user clicks on "Daftar di sini"')
	def clickOnDaftar() {
		WebUI.click(findTestObject('Object Repository/Page_SecondHand/a_Daftar di sini'))
	}


	@And('the user enters their full name empty, email address and password (.*)')
	def enterInvalidFullName(String password) {

		def randomEmail = generateRandomEmail()

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_Nama_username'), '')

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_Email_useremail'), randomEmail)

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_SecondHand/input_Password_userpassword'), password)

		WebUI.click(findTestObject('Object Repository/Page_SecondHand/input_Password_commit'))
	}

	@And('the user enters their full name (.*), invalid email address and password (.*)')
	def enterInvalidEmailAddress(String fullName, String password) {
		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_Nama_username'), fullName)

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_Email_useremail'), 'johnsmithbinar.com')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_SecondHand/input_Password_userpassword'), password)
	}

	@And('the user enters their full name (.*), email address and empty password')
	def enterInvalidPassword(String fullName) {
		def randomEmail = generateRandomEmail()

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_Nama_username'), fullName)

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_Email_useremail'), randomEmail)

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_SecondHand/input_Password_userpassword'), '')
	}

	@And('the user enters their full name (.*), already registered email address (.*) and password (.*)')
	def enterAlreadyRegisteredEmail(String fullName, String emailAddress, String password) {
		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_Nama_username'), fullName)

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_Email_useremail'), emailAddress)

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_SecondHand/input_Password_userpassword'), password)
	}

	@And('the user enters their full name (.*), unique email address and password (.*)')
	def enterValidData(String fullName, String password) {
		def randomEmail = generateRandomEmail()

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_Nama_username'), fullName)

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_Email_useremail'), randomEmail)

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_SecondHand/input_Password_userpassword'), password)
	}

	@And('the user clicks on "Daftar"')
	def clicksOnDaftarButton() {
		WebUI.click(findTestObject('Object Repository/Page_SecondHand/input_Password_commit'))

		WebUI.delay(3)
	}

	@Then('the user is still on the sign-up page')
	def verifyStillOnSignUpPage() {
		WebUI.delay(5)

		def currentURL = WebUI.getUrl()

		WebUI.verifyMatch(currentURL, 'https://secondhand.binaracademy.org/users/sign_up', false)
	}

	@Then('the error message "Email has already been taken" is displayed')
	def verifyErrorMessageEmail() {
		WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/div_Email has already been taken'), 'Email has already been taken')
	}
}