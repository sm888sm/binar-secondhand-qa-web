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



class SellerEditProduct {
	def generateUniqueProductName(String productName) {
		def timestamp = System.currentTimeMillis()
		def randomNum = Math.abs(new Random().nextInt())

		def generatedUniqueProductName = "${productName} ${timestamp}"

		GlobalVariable.ProductNameForDelete = generatedUniqueProductName

		return generatedUniqueProductName
	}

	@And('the seller navigates to the "Product Saya" page')
	def clickProdukSaya() {
		WebUI.click(findTestObject('Object Repository/Page_SecondHand/Navbar/a_Produk Saya'))

		WebUI.delay(5)
	}

	@And('the seller clicks on the product')
	def clickProductToEdit() {
		def productName = GlobalVariable.ProductNameForDelete

		def productID = GlobalVariable.ProductIDForDelete

		TestObject productItemObject = new TestObject('Product Item')

		def dynamicXPath = "//h5[contains(text(), '$productName')]"

		productItemObject.addProperty('xpath', ConditionType.EQUALS, dynamicXPath)

		WebUI.verifyElementPresent(productItemObject, 10)

		WebUI.enhancedClick(productItemObject)

		// WebUI.navigateToUrl('https://secondhand.binaracademy.org/products/' + productID)
	}

	@And('the seller clicks on the "Edit" button')
	def clickEditButton() {
		WebUI.delay(5)

		WebUI.click(findTestObject('Object Repository/Page_SecondHand/Product_Page/a_Edit'))

		WebUI.delay(5)
	}

	@When('the seller leaves the to-be-edited product category field empty and fills valid product name (.*), price (.*), description (.*) and image (.*)')
	def enterInvalidCategory(String productName, String price, String description, String image) {
		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_Nama Produk_productname'), productName)

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/Product_Form/input_Price'), price)

		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_SecondHand/select_Pilih KategoriHobiKendaraanBajuElekt_20972a'),
				'', true)

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/textarea_Deskripsi_productdescription'), description)

		WebUI.enhancedClick(findTestObject('Object Repository/Page_SecondHand/Product_Form/button_Delete_Image_1'))

		WebUI.uploadFile(findTestObject('Object Repository/Page_SecondHand/input_Deskripsi_productimages'), image)
	}

	@When('the seller enters an empty the to-be-edited product name and fills valid product price (.*), category (.*), description (.*) and image (.*)')
	def enterInvalidName(String price, String category, String description, String image) {
		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_Nama Produk_productname'), '')

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/Product_Form/input_Price'), price)

		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_SecondHand/select_Pilih KategoriHobiKendaraanBajuElekt_20972a'),
				category, true)

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/textarea_Deskripsi_productdescription'), description)

		// WebUI.enhancedClick(findTestObject('Object Repository/Page_SecondHand/Product_Form/button_Delete_Image_1'))

		WebUI.uploadFile(findTestObject('Object Repository/Page_SecondHand/input_Deskripsi_productimages'), image)
	}

	@When('the seller leaves the to-be-edited product price field empty and fills valid product name (.*), category (.*), description (.*) and image (.*)')
	def enterInvalidPrice(String productName, String category, String description,  String image) {
		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_Nama Produk_productname'), productName)

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/Product_Form/input_Price'), '')

		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_SecondHand/select_Pilih KategoriHobiKendaraanBajuElekt_20972a'),
				category, true)

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/textarea_Deskripsi_productdescription'), description)

		// WebUI.enhancedClick(findTestObject('Object Repository/Page_SecondHand/Product_Form/button_Delete_Image_1'))

		WebUI.uploadFile(findTestObject('Object Repository/Page_SecondHand/input_Deskripsi_productimages'), image)
	}

	@When('the seller leaves the to-be-edited product description field empty and fills valid product name (.*), price (.*), category (.*) and image (.*)')
	def enterInvalidDescription(String productName, String price, String category, String image) {
		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_Nama Produk_productname'), productName)

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/Product_Form/input_Price'), price)

		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_SecondHand/select_Pilih KategoriHobiKendaraanBajuElekt_20972a'),
				category, true)

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/textarea_Deskripsi_productdescription'), '')

		// WebUI.enhancedClick(findTestObject('Object Repository/Page_SecondHand/Product_Form/button_Delete_Image_1'))

		WebUI.uploadFile(findTestObject('Object Repository/Page_SecondHand/input_Deskripsi_productimages'), image)
	}

	@When('the seller fills valid to-be-edited product name (.*), price (.*), category (.*), description (.*) and image (.*)')
	def enterValidData(String productName, String price, String category, String desciption, String image) {
		def productNameUnique = generateUniqueProductName(productName)

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_Nama Produk_productname'), productNameUnique)

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/Product_Form/input_Price'), price)

		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_SecondHand/select_Pilih KategoriHobiKendaraanBajuElekt_20972a'),
				category, true)

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/textarea_Deskripsi_productdescription'), desciption)

		WebUI.uploadFile(findTestObject('Object Repository/Page_SecondHand/input_Deskripsi_productimages'), image)
	}

	@When('the edited product is submitted with valid information (.*), (.*), (.*), (.*), (.*)')
	def productEditSuccess(String categoryName, String priceFormatted, String description, String sellerName, String sellerCity) {
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

		GlobalVariable.ProductID = (urlComponents[4])
	}

	@And('the seller remains on the "Edit Product" page')
	def verifyRemainOnEditPage() {
		def productIDForDelete = GlobalVariable.ProductIDForDelete

		def currentURL = WebUI.getUrl()

		currentURL = WebUI.getUrl()

		String[] urlComponents = currentURL.split('/')

		WebUI.comment("Product ID: $urlComponents[4]")

		if (productIDForDelete != (urlComponents[4])) {
			KeywordUtil.markFailed('productID is not matched')
		}
	}
}