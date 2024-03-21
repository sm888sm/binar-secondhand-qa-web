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
import com.kms.katalon.core.testobject.ConditionType as ConditionType

def email_address = GlobalVariable.SellerEmail

String productName = GlobalVariable.ProductName

// String productNameEdited = GlobalVariable.ProductNameEdited

// WebUI.comment('productNameEdited ' + productNameEdited)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://secondhand.binaracademy.org/')

WebUI.click(findTestObject('Object Repository/Page_SecondHand/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_Email_useremail'), email_address)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_SecondHand/input_Password_userpassword'), '4IKJKomARpjPH7aiyRZ0CQ==')

WebUI.click(findTestObject('Object Repository/Page_SecondHand/input_Password_commit'))

WebUI.click(findTestObject('Object Repository/Page_SecondHand/Navbar/a_Notifikasi_Button'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/div_Penawaran produk'), 'Penawaran produk')

// WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/div_Laptop 20230818004348 EditedRp 8.000.00_b400d2'), 
//     productNameEdited + '\nRp 8.000.000\nDitawar Rp 7.000.000')

// WebUI.click(findTestObject('Object Repository/Page_SecondHand/div_Penawaran produk'))

// WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/div_Laptop 20230818010506 Edited           _9563b8'), 
//    productName + '\nRp 5.000.000\nDitawar Rp 4.000.000')

TestObject offerObject = new TestObject('Product Offer')

def dynamicXPath = "//div[contains(text(), '$productName')]/parent::div/parent::a"

offerObject.addProperty('xpath', ConditionType.EQUALS, dynamicXPath)

offerObject.getXpaths()

WebUI.verifyElementPresent(offerObject, 10)

WebUI.enhancedClick(offerObject)

WebUI.click(findTestObject('Object Repository/Page_SecondHand/button_Status'))

WebUI.click(findTestObject('Object Repository/Page_SecondHand/input_Perbarui status penjualan produkmu_of_74f228'))

WebUI.click(findTestObject('Object Repository/Page_SecondHand/input_Password_commit'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/h6_Berhasil terjual'), 'Berhasil terjual')

WebUI.closeBrowser()


