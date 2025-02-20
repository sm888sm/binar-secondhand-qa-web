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

def email_address = GlobalVariable.SellerEmail

Date date = new Date()

String time = date.format('yyyyMMddHHmmss')

String productName = GlobalVariable.ProductName

WebUI.comment("Product Name: $productName")

String productNameEdited = GlobalVariable.ProductName + ' Edited'

String productID = GlobalVariable.ProductID

WebUI.openBrowser('')

WebUI.navigateToUrl('https://secondhand.binaracademy.org/')

WebUI.click(findTestObject('Object Repository/Page_SecondHand/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_Email_useremail'), email_address)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_SecondHand/input_Password_userpassword'), '4IKJKomARpjPH7aiyRZ0CQ==')

WebUI.click(findTestObject('Object Repository/Page_SecondHand/input_Password_commit'))

WebUI.click(findTestObject('Object Repository/Page_SecondHand/Navbar/a_Produk Saya'))

WebUI.delay(10)

// TODO find product in list

WebUI.navigateToUrl('https://secondhand.binaracademy.org/products/' + productID)

WebUI.click(findTestObject('Object Repository/Page_SecondHand/Product_Page/a_Edit'))

WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_Nama Produk_productname'), productNameEdited)

WebUI.setText(findTestObject('Object Repository/Page_SecondHand/Product_Form/input_Price'), '8000000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_SecondHand/select_Pilih KategoriHobiKendaraanBajuElekt_20972a'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Page_SecondHand/textarea_Deskripsi_productdescription'), 'Windows 11 Home - ASUS recommends Windows 11 Pro for business\nUp to 12th Gen Intel Core™ i7 processor\nUp to NVIDIA® GeForce® RTX3060\n2.8K 120Hz 0.2ms OLED display\nUp to DDR5 32GB 4800MHz\nUp to 2TB SSD\nASUS IceCool Pro thermal technology')

WebUI.uploadFile(findTestObject('Object Repository/Page_SecondHand/input_Deskripsi_productimages'), 'C://Uploads//laptop-2.jpeg\nC://Uploads//laptop-3.jpg')

WebUI.click(findTestObject('Object Repository/Page_SecondHand/Product_Form/label_Terbitkan'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/p_Windows 11 Home - ASUS recommends Windows_4c773f'), 
    'Windows 11 Home - ASUS recommends Windows 11 Pro for business Up to 12th Gen Intel Core™ i7 processor Up to NVIDIA® GeForce® RTX3060 2.8K 120Hz 0.2ms OLED display Up to DDR5 32GB 4800MHz Up to 2TB SSD ASUS IceCool Pro thermal technology')

WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/Product_Page/h5_Product_Name'), productNameEdited)

WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/Product_Page/p_Product_Category'), 'Hobi')

WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/p_Rp 5.000.000'), 'Rp 8.000.000')

WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/div_Seller QA Group 03 Wave 10'), 'Seller QA Group 03 Wave 10')

WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/Navbar/div_City'), 'Jakarta')

//WebUI.verifyElementPresent(findTestObject('Object Repository/Page_SecondHand/img_Product was successfully created_w-100'), 
//    0)

GlobalVariable.ProductNameEdited = productNameEdited

WebUI.closeBrowser()

