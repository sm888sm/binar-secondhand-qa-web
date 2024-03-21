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



class SellerPreviewProduct {
	def generateUniqueProductNameForPreview(String productName) {
		def timestamp = System.currentTimeMillis()
		def randomNum = Math.abs(new Random().nextInt())

		def generatedUniqueProductName = "${productName} ${timestamp}"

		GlobalVariable.ProductNameForDelete = generatedUniqueProductName

		return generatedUniqueProductName
	}

	@When('the seller fills valid the to-be-previewed product name (.*), price (.*), category (.*), description (.*) and image (.*)')
	def enterValidData(String productName, String price, String category, String desciption, String image) {
		def productNameUnique = generateUniqueProductNameForPreview(productName)

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_Nama Produk_productname'), productNameUnique)

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/Product_Form/input_Price'), price)

		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_SecondHand/select_Pilih KategoriHobiKendaraanBajuElekt_20972a'),
				category, true)

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/textarea_Deskripsi_productdescription'), desciption)

		WebUI.uploadFile(findTestObject('Object Repository/Page_SecondHand/input_Deskripsi_productimages'), image)
	}

	@Then('the to-be-previewed product is submitted with valid information (.*), (.*), (.*), (.*), (.*)')
	def productPublishSuccess(String categoryName, String priceFormatted, String description, String sellerName, String sellerCity) {
		def productName = GlobalVariable.ProductNameForDelete

		WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/Product_Page/p_Product_Description'),
				description)

		WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/Product_Page/h5_Product_Name'), productName)

		WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/Product_Page/p_Product_Category'), categoryName)

		WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/Product_Page/p_Product_Price'), priceFormatted)

		WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/Product_Page/div_Seller_Name'), sellerName)

		WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/Product_Page/div_Seller_City'), sellerCity)

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_SecondHand/Product_Page/img_Product_Image_Single'),
				0)

		def currentURL = WebUI.getUrl()

		String[] urlComponents = currentURL.split('/')

		WebUI.comment("Product ID: $urlComponents[4]")

		GlobalVariable.ProductIDForDelete = (urlComponents[4])
	}


	@And('clicks on the "Preview" button')
	def clickPreviewButton() {
		WebUI.click(findTestObject('Object Repository/Page_SecondHand/Product_Form/label_Preview'))
	}

	@When('the seller clicks on the "Terbitkan" button on product page')
	def clickPreviewButtonOnProductPage() {
		WebUI.click(findTestObject('Object Repository/Page_SecondHand/Product_Page/input_Publish'))

		WebUI.delay(3)
	}

	@Then('the "Terbitkan" button disappears')
	def confirmTerbitkanButtonDiappears() {
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_SecondHand/Product_Page/input_Publish'), 0)
	}

	@And('the product page refreshes and the product is submitted with valid information (.*), (.*), (.*), (.*), (.*)')
	def refreshAndConfirmProductPublishSuccess(String categoryName, String priceFormatted, String description, String sellerName, String sellerCity) {
		def productName = GlobalVariable.ProductNameForDelete

		WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/Product_Page/p_Product_Description'),
				description)

		WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/Product_Page/h5_Product_Name'), productName)

		WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/Product_Page/p_Product_Category'), categoryName)

		WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/Product_Page/p_Product_Price'), priceFormatted)

		WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/Product_Page/div_Seller_Name'), sellerName)

		WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/Product_Page/div_Seller_City'), sellerCity)

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_SecondHand/Product_Page/img_Product_Image_Single'),
				0)

		def currentURL = WebUI.getUrl()

		String[] urlComponents = currentURL.split('/')

		WebUI.comment("Product ID: $urlComponents[4]")

		GlobalVariable.ProductIDForDelete = (urlComponents[4])
	}
}