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
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

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

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class SellerSearchProduct {

	def productName = GlobalVariable.ProductName
	def productID = GlobalVariable.ProductID

	@When('the user enters the product name in the search field')
	def inputProductName() {
		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/Navbar/input_Search'), productName)
	}

	@And('presses the Enter key')
	def submitSearchProduct() {
		WebUI.sendKeys(findTestObject('Object Repository/Page_SecondHand/Navbar/input_Search'), Keys.chord(Keys.ENTER))

		WebUI.delay(5)
	}

	@Then('the search results should display the product name, category (.*) and price (.*)')
	def displaySearchProductItem(String categoryName, String priceFormatted) {
		TestObject productItemNameObject = new TestObject('Product Item')
		TestObject productItemCategoryObject = new TestObject('Product Item Category')
		TestObject productItemPriceObject = new TestObject('Product Item Price')

		def dynamicXPathName = "//h5[contains(text(), '$productName')]"
		def dynamicXPathCategory = "${dynamicXPathName}/following-sibling::p"
		def dynamicXPathPrice = "${dynamicXPathName}/following-sibling::h5"

		productItemNameObject.addProperty('xpath', ConditionType.EQUALS, dynamicXPathName)
		productItemCategoryObject.addProperty('xpath', ConditionType.EQUALS, dynamicXPathCategory)
		productItemPriceObject.addProperty('xpath', ConditionType.EQUALS, dynamicXPathPrice)

		WebUI.verifyElementPresent(productItemNameObject, 10)
		WebUI.verifyElementPresent(productItemCategoryObject, 10)
		WebUI.verifyElementPresent(productItemPriceObject, 10)
		
		WebUI.verifyElementText(productItemNameObject, productName)
		WebUI.verifyElementText(productItemCategoryObject, categoryName)
		WebUI.verifyElementText(productItemPriceObject, priceFormatted)
	}

	@When('the user clicks on the desired product from the search results')
	def clickSearchProductItem( ) {
		WebUI.delay(5)
		
		TestObject productItemNameObject = new TestObject('Product Item')

		def dynamicXPathName = "//h5[contains(text(), '$productName')]"

		productItemNameObject.addProperty('xpath', ConditionType.EQUALS, dynamicXPathName)

		WebUI.scrollToElement(productItemNameObject, 3)

		WebUI.enhancedClick(productItemNameObject)
	}

	@Then('the user is redirected to the product details page')
	def redirectToProductPage() {
		WebUI.delay(3)

		def currentURL = WebUI.getUrl()

		String[] urlComponents = currentURL.split('/')

		WebUI.comment("Product ID: $urlComponents[4]")

		if (productID != (urlComponents[4])) {
			KeywordUtil.markFailed('productID is not matched')
		}
	}
}