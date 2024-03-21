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



class SellerAddProduct {
	def generateUniqueProductName(String productName) {
		def timestamp = System.currentTimeMillis()
		def randomNum = Math.abs(new Random().nextInt())

		def generatedUniqueProductName = "${productName} ${timestamp}"

		GlobalVariable.ProductName = generatedUniqueProductName

		return generatedUniqueProductName
	}

	@And('the seller navigates to the "Add New Product" page')
	def navigateToAddProductPage() {
		WebUI.click(findTestObject('Object Repository/Page_SecondHand/a_Jual'))
	}

	@When('the seller leaves the product category field empty and fills valid product name (.*), price (.*), description (.*) and image (.*)')
	def enterInvalidCategory(String productName, String price, String description, String image) {
		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_Nama Produk_productname'), productName)

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/Product_Form/input_Price'), price)

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/textarea_Deskripsi_productdescription'), description)

		WebUI.uploadFile(findTestObject('Object Repository/Page_SecondHand/input_Deskripsi_productimages'), image)
	}

	@When('the seller enters an empty product name and fills valid product price (.*), category (.*), description (.*) and image (.*)')
	def enterInvalidName(String price, String category, String description, String image) {
		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_Nama Produk_productname'), '')

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/Product_Form/input_Price'), price)

		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_SecondHand/select_Pilih KategoriHobiKendaraanBajuElekt_20972a'),
				category, true)

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/textarea_Deskripsi_productdescription'), description)

		WebUI.uploadFile(findTestObject('Object Repository/Page_SecondHand/input_Deskripsi_productimages'), image)
	}

	@When('the seller leaves the product price field empty and fills valid product name (.*), category (.*), description (.*) and image (.*)')
	def enterInvalidPrice(String productName, String category, String description,  String image) {
		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_Nama Produk_productname'), productName)

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/Product_Form/input_Price'), '')

		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_SecondHand/select_Pilih KategoriHobiKendaraanBajuElekt_20972a'),
				category, true)

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/textarea_Deskripsi_productdescription'), description)

		WebUI.uploadFile(findTestObject('Object Repository/Page_SecondHand/input_Deskripsi_productimages'), image)
	}

	@When('the seller leaves the product description field empty and fills valid product name (.*), price (.*), category (.*) and image (.*)')
	def enterInvalidDescription(String productName, String price, String category, String image) {
		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_Nama Produk_productname'), productName)

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/Product_Form/input_Price'), price)

		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_SecondHand/select_Pilih KategoriHobiKendaraanBajuElekt_20972a'),
				category, true)

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/textarea_Deskripsi_productdescription'), '')

		WebUI.uploadFile(findTestObject('Object Repository/Page_SecondHand/input_Deskripsi_productimages'), image)
	}

	@When('the seller fills valid product name (.*), price (.*), category (.*), description (.*) and image (.*)')
	def enterValidData(String productName, String price, String category, String desciption, String image) {
		def productNameUnique = generateUniqueProductName(productName)

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_Nama Produk_productname'), productNameUnique)

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/Product_Form/input_Price'), price)

		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_SecondHand/select_Pilih KategoriHobiKendaraanBajuElekt_20972a'),
				category, true)

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/textarea_Deskripsi_productdescription'), desciption)

		WebUI.uploadFile(findTestObject('Object Repository/Page_SecondHand/input_Deskripsi_productimages'), image)
	}

	@And('clicks on the "Terbitkan" button')
	def clickTerbitkan() {
		WebUI.delay(3)

		WebUI.enhancedClick(findTestObject('Object Repository/Page_SecondHand/Product_Form/label_Terbitkan'))
	}

	@Then('an error message for the empty product category should be displayed')
	def displayErrorEmptyCategory() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_SecondHand/div_Category must exist'), 0)

		WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/div_Category must exist'), 'Category must exist')
	}

	@Then('an error message for the empty product name should be displayed')
	def displayErrorEmptyName() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_SecondHand/div_Name cant be blank'), 0)

		WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/div_Name cant be blank'), 'Name can\'t be blank')
	}

	@Then('an error message for the empty product price should be displayed')
	def displayErrorEmptyPrice() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_SecondHand/div_Price cant be blank'), 0)

		WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/div_Price cant be blank'), 'Price can\'t be blank')
	}

	@Then('an error message for the empty product description should be displayed')
	def displayErrorEmptyDescription() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_SecondHand/div_Description cant be blank'), 0)

		WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/div_Description cant be blank'), 'Description can\'t be blank')
	}

	@And('the seller remains on the "Add New Product" page')
	def verifyRemainOnAddProductPage() {
		WebUI.delay(3)

		def currentURL = WebUI.getUrl()

		WebUI.verifyMatch(currentURL, 'https://secondhand.binaracademy.org/products', false)
	}

	@Then('the product is submitted with valid information (.*), (.*), (.*), (.*), (.*)')
	def productPublishSuccess(String categoryName, String priceFormatted, String description, String sellerName, String sellerCity) {
		def productName = GlobalVariable.ProductName

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

	@Then('the seller is redirected to the edit profile page')
	def redirectToEditProfilePage() {
		WebUI.delay(5)

		def currentURL = WebUI.getUrl()

		WebUI.verifyMatch(currentURL, 'https://secondhand.binaracademy.org/profiles?redirect_url=%2Fproducts%2Fnew', false)
	}
}