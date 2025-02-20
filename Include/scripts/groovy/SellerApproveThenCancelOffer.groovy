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



class SellerApproveThenCancelOffer {
	@When('the seller clicks on the "Terima" button')
	def clickAcceptButton() {
		WebUI.enhancedClick(findTestObject('Object Repository/Page_SecondHand/Offer_List/label_Accept_Button_1'))

		WebUI.delay(3)
	}

	@Then('the the negotiated product item displays "Penawaran produk diterima" text')
	def verifyAcceptedProduct() {
		WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/Offer_List/h6_Offer_Status_1'), "Penawaran produk diterima")
	}

	@And('the the negotiated product item displays "Status" and "Hubungi di" button')
	def verifyAcceptedProductButtons() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_SecondHand/Offer_List/label_Status_Button_1'), 10)

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_SecondHand/Offer_List/a_Whatsapp_1'), 10)
	}

	@When('the seller clicks "Status" button')
	def clickStatusButton() {
		WebUI.enhancedClick(findTestObject('Object Repository/Page_SecondHand/Offer_List/label_Status_Button_1'))

		WebUI.delay(3)
	}

	@And('the seller clicks "Batalkan transaksi" button and clicks "Kirim"')
	def clickCancelButton() {
		WebUI.enhancedClick(findTestObject('Object Repository/Page_SecondHand/Offer_List/button_Cancel_Offer_1'))

		WebUI.enhancedClick(findTestObject('Object Repository/Page_SecondHand/Offer_List/input_Kirim_Button'))

		WebUI.delay(3)
	}

	@Then('the the negotiated product item displays "Penjualan dibatalkan" text')
	def verifyCancelledProduct() {
		WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/Offer_List/h6_Offer_Status_1'), "Penjualan dibatalkan")
	}
}