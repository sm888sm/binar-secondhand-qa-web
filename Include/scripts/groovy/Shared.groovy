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

import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW



class Shared {

	// From UserSignUp
	@When('the user clicks on "Masuk"')
	def clickOnMasuk() {
		WebUI.click(findTestObject('Object Repository/Page_SecondHand/a_Masuk'))
	}

	@Then('the user is redirected to the homepage')
	def redirectToHomepage() {
		WebUI.delay(5)

		def currentURL = WebUI.getUrl()

		WebUI.verifyMatch(currentURL, 'https://secondhand.binaracademy.org/', false)
	}

	@And('the user clicks on "Profil Saya"')
	def clickOnProfilSaya() {
		WebUI.click(findTestObject('Object Repository/Page_SecondHand/a_Profil Saya'))
	}

	@Then("the user's name (.*) is displayed")
	def verifyProfileFirstName(String firstName) {
		WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/Navbar/div_First_Name'), firstName)
	}

	@And('the user navigates to the home page')
	def navigateToHomepage() {
		WebUI.navigateToUrl('https://secondhand.binaracademy.org/')
	}

	@Given('the seller is logged in (.*) (.*)')
	def loginSeller(String email, String password) {

		WebUI.click(findTestObject('Object Repository/Page_SecondHand/a_Masuk'))

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_Email_useremail'), email)

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_SecondHand/input_Password_userpassword'), password)

		WebUI.click(findTestObject('Object Repository/Page_SecondHand/input_Password_commit'))

		WebUI.delay(5)

		def currentURL= WebUI.getUrl()

		WebUI.verifyMatch(currentURL, 'https://secondhand.binaracademy.org/', false)
	}

	@Given('the buyer is logged in (.*) (.*)')
	def loginBuyer(String email, String password) {

		WebUI.click(findTestObject('Object Repository/Page_SecondHand/a_Masuk'))

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_Email_useremail'), email)

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_SecondHand/input_Password_userpassword'), password)

		WebUI.click(findTestObject('Object Repository/Page_SecondHand/input_Password_commit'))

		WebUI.delay(5)

		def currentURL= WebUI.getUrl()

		WebUI.verifyMatch(currentURL, 'https://secondhand.binaracademy.org/', false)
	}

	@Given('the buyer negotiates for a product')
	def buyerNegotiateProduct() {
		CucumberKW.runFeatureFile('Include/features/08 Buyer Negotiate Product.feature')

		WebUI.click(findTestObject('Object Repository/Page_SecondHand/a_Profil Saya'))

		WebUI.click(findTestObject('Object Repository/Page_SecondHand/button_Keluar'))

		WebUI.delay(3)
	}

	@And('the user closes the browser')
	def closeBrowser() {
		WebUI.closeBrowser()
	}

}