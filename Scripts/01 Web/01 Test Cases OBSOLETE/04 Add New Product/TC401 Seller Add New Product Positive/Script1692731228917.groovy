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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUIdef

def email_address = GlobalVariable.SellerEmail

Date date = new Date()

String time = date.format('yyyyMMddHHmmss')

String productName = 'Laptop ' + time

WebUI.openBrowser('')

WebUI.navigateToUrl('https://secondhand.binaracademy.org/')

WebUI.click(findTestObject('Object Repository/Page_SecondHand/a_Masuk (2)'))

WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_Email_useremail (2)'), email_address)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_SecondHand/input_Password_userpassword (2)'), '4IKJKomARpjPH7aiyRZ0CQ==')

WebUI.click(findTestObject('Object Repository/Page_SecondHand/input_Password_commit (2)'))

WebUI.click(findTestObject('Object Repository/Page_SecondHand/a_Jual (1)'))

WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_Nama Produk_productname (2)'), productName)

WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_Harga Produk_productprice (2)'), '5000000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_SecondHand/select_Pilih KategoriHobiKendaraanBajuElekt_20972a (2)'), 
    '4', true)

WebUI.setText(findTestObject('Object Repository/Page_SecondHand/textarea_Deskripsi_productdescription (2)'), 'Windows 11 Home - ASUS recommends Windows 11 Pro for business\nUp to 12th Gen Intel Core™ i9 processor\nUp to NVIDIA® GeForce® RTX3070 Ti\n3.2K 120Hz 0.2ms OLED display\nUp to DDR5 32GB 4800MHz\nUp to 2TB SSD\nASUS IceCool Pro thermal technology')

WebUI.uploadFile(findTestObject('Object Repository/Page_SecondHand/input_Deskripsi_productimages (1)'), 'C://Uploads//laptop-1.jpg')

WebUI.click(findTestObject('Object Repository/Page_SecondHand/label_Terbitkan (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/p_Windows 11 Home - ASUS recommends Windows_4c773f (1)'), 
    'Windows 11 Home - ASUS recommends Windows 11 Pro for business Up to 12th Gen Intel Core™ i9 processor Up to NVIDIA® GeForce® RTX3070 Ti 3.2K 120Hz 0.2ms OLED display Up to DDR5 32GB 4800MHz Up to 2TB SSD ASUS IceCool Pro thermal technology')

WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/Product_Page/h5_Product_Name'), productName)

WebUI.verifyElementText(findTestObject('null'), 'Elektronik')

WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/p_Rp 5.000.000 (1)'), 'Rp 5.000.000')

WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/div_Seller QA Group 03 Wave 10 (1)'), 'Seller QA Group 03 Wave 10')

WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/Jakarta'), 'Jakarta')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_SecondHand/img_Product was successfully created_w-100 (1)'), 
    0)

GlobalVariable.ProductName = productName

currentURL = WebUI.getUrl()

String[] urlComponents = currentURL.split('/')

WebUI.comment("Product ID: $urlComponents[4]")

GlobalVariable.ProductID = (urlComponents[4])

WebUI.closeBrowser()

