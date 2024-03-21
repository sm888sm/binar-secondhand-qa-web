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

// String productNameEdited = GlobalVariable.ProductNameEdited

String productName = GlobalVariable.ProductName

String productID = GlobalVariable.ProductID

String buyerEmail = GlobalVariable.BuyerEmail

// String productNameSearch = productNameEdited.substring(0, 18) + '...'

String productNameSearch = productName

WebUI.openBrowser('')

WebUI.navigateToUrl('https://secondhand.binaracademy.org/')

WebUI.click(findTestObject('Object Repository/Page_SecondHand/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_Email_useremail'), buyerEmail)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_SecondHand/input_Password_userpassword'), 'QJblfja5Cso=')

WebUI.click(findTestObject('Object Repository/Page_SecondHand/input_Password_commit'))

WebUI.setText(findTestObject('Object Repository/Page_SecondHand/Navbar/input_Search'), productName)

WebUI.sendKeys(findTestObject('Object Repository/Page_SecondHand/Navbar/input_Search'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/h5_Laptop 20230817200'), productNameSearch)

// WebUI.click(findTestObject('Object Repository/Page_SecondHand/div_Laptop 20230817200.      Hobi      Rp 8_84e215'))

WebUI.navigateToUrl('https://secondhand.binaracademy.org/products/' + productID)

WebUI.delay(3)

/* 
currentURL = WebUI.getUrl()

String[] urlComponents = currentURL.split('/')

WebUI.comment("Product ID: $urlComponents[4]")

if (productID != (urlComponents[4])) {
    KeywordUtil.markFailed('productID is not matched')
}
*/



WebUI.setText(findTestObject('Object Repository/Page_SecondHand/Product_Page/input_Offer_Price'), '4000000')

WebUI.click(findTestObject('Object Repository/Page_SecondHand/Product_Page/input_Send_Offer'))

WebUI.delay(3)

WebUI.closeBrowser()



