import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.testobject.ConditionType as ConditionType

def email_address = GlobalVariable.SellerEmail

// String productNameEdited = GlobalVariable.ProductNameEdited
// String categoryEdited = GlobalVariable.CategoryEdited
String productName = GlobalVariable.ProductName

String category = GlobalVariable.Category

String productID = GlobalVariable.ProductID

// WebUI.comment('productNameEdited ' + productNameEdited)
// String productNameSearch = productNameEdited.substring(0, 18) + '...'
String productNameSearch = productName

WebUI.openBrowser('')

WebUI.navigateToUrl('https://secondhand.binaracademy.org/')

WebUI.click(findTestObject('Object Repository/Page_SecondHand/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_Email_useremail'), email_address)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_SecondHand/input_Password_userpassword'), '4IKJKomARpjPH7aiyRZ0CQ==')

WebUI.click(findTestObject('Object Repository/Page_SecondHand/input_Password_commit'))

WebUI.click(findTestObject('Object Repository/Page_SecondHand/i_Keluar_bi bi-person me-4 me-lg-0'))

WebUI.click(findTestObject('Object Repository/Page_SecondHand/a_Diminati'))

/*
WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/h5_Laptop 20230818020344'), productNameSearch)

WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/Product_Page/p_Product_Category'), category)

WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/h5_Rp 5.000.000'), 'Rp 5.000.000')

WebUI.click(findTestObject('Object Repository/Page_SecondHand/div_Laptop 20230818020344      Elektronik  _91b84f'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/p_Windows 11 Home - ASUS recommends Windows_4c773f'), 
    'Windows 11 Home - ASUS recommends Windows 11 Pro for business\nUp to 12th Gen Intel Core™ i9 processor\nUp to NVIDIA® GeForce® RTX3070 Ti\n3.2K 120Hz 0.2ms OLED display\nUp to DDR5 32GB 4800MHz\nUp to 2TB SSD ASUS IceCool Pro thermal technology')
*/
TestObject listObject = new TestObject('Product Offer')

def dynamicXPath = "//*[contains(text(), '$productNameSearch')]"

listObject.addProperty('xpath', ConditionType.EQUALS, dynamicXPath)

WebUI.verifyElementPresent(listObject, 10)

/*
currentURL = WebUI.getUrl()

String[] urlComponents = currentURL.split('/')

WebUI.comment("Product ID: $urlComponents[4]")

if (productID != (urlComponents[4])) {
	KeywordUtil.markFailed('productID is not matched')
}

*/
WebUI.navigateToUrl("https://secondhand.binaracademy.org/products/$productID")

WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/h5_Laptop 20230818045925'), productName)

WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/Product_Page/p_Product_Category'), category)

WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/p_Rp 5.000.000'), 'Rp 5.000.000')

WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/p_Windows 11 Home - ASUS recommends Windows_4c773f'), 
    'Windows 11 Home - ASUS recommends Windows 11 Pro for business Up to 12th Gen Intel Core™ i9 processor Up to NVIDIA® GeForce® RTX3070 Ti 3.2K 120Hz 0.2ms OLED display Up to DDR5 32GB 4800MHz Up to 2TB SSD ASUS IceCool Pro thermal technology')

WebUI.closeBrowser()

