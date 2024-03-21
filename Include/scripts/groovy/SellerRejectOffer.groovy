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



class SellerRejectOffer {
	@When('clicks on the "Notifikasi" button')
	def clickNotificationButton() {
		WebUI.maximizeWindow()

		WebUI.enhancedClick(findTestObject('Object Repository/Page_SecondHand/Navbar/a_Notifikasi_Button'))

		WebUI.delay(3)
	}

	@Then('the notification on the navbar displays the product name, price (.*) and offer amount (.*)')
	def verifyNotificationDisplaysProduct(String priceFormatted, String offerFormatted) {
		def productName = GlobalVariable.ProductName

		def notificationText = "${productName}\n${priceFormatted}\nDitawar ${offerFormatted}"

		WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/Navbar/div_Notification_Text_1'), notificationText)
	}

	@When('the seller clicks on the "Penawaran produk" notification')
	def clickProductOnNotificationNavbar() {
		WebUI.enhancedClick(findTestObject('Object Repository/Page_SecondHand/Navbar/div_Notification_Text_1'))

		WebUI.delay(3)
	}

	@Then('the notification list displays the product name, price (.*) and offer amount (.*)')
	def clickProductOnNotificationPage(String priceFormatted, String offerFormatted) {
		def productName = GlobalVariable.ProductName

		def notificationText = "${productName}\n${priceFormatted}\nDitawar ${offerFormatted}"

		WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/Offer_List/div_Offer_Description_1'), notificationText)
	}

	@When('the seller clicks on the "Tolak" button')
	def clickAcceptButton() {
		WebUI.enhancedClick(findTestObject('Object Repository/Page_SecondHand/Offer_List/label_Reject_Button_1'))

		WebUI.delay(3)
	}

	@Then('the the negotiated product item displays "Penawaran produk ditolak" text')
	def verifyRejectedProduct() {
		WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/Offer_List/h6_Offer_Status_1'), "Penawaran produk ditolak")
	}
}