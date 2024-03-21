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



class SellerDeleteProduct {
	@And('the user navigates to the to-be-deleted product page')
	def navigateToProductPage() {
		def productID = GlobalVariable.ProductIDForDelete

		WebUI.navigateToUrl('https://secondhand.binaracademy.org/products/' + productID)

		WebUI.delay(5)
	}

	@When('the seller clicks "Delete" button')
	def clickDeleteButton() {
		WebUI.click(findTestObject('Object Repository/Page_SecondHand/Product_Page/a_Delete'))
	}

	@Then('the page redirects to "Daftar Jual Saya" page')
	def redirectToProductListPage() {
		WebUI.delay(5)

		def currentURL= WebUI.getUrl()

		WebUI.verifyMatch(currentURL, 'https://secondhand.binaracademy.org/products', false)
	}

	@And("the deleted product doesn't exist in the product list")
	def verifyProductNotExist() {
		def productName = GlobalVariable.ProductNameForDelete

		WebUI.refresh()

		TestObject productItemNameObject = new TestObject('Product Item Deleted')

		def dynamicXPathName = "//h5[contains(text(), '$productName')]"

		productItemNameObject.addProperty('xpath', ConditionType.EQUALS, dynamicXPathName)

		WebUI.verifyElementNotPresent(productItemNameObject, 10)
	}
}