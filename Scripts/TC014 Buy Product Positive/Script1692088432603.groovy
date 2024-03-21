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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://secondhand.binaracademy.org/')

WebUI.click(findTestObject('Object Repository/TC014_Buy_Positive/Page_SecondHand/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/TC014_Buy_Positive/Page_SecondHand/input_Email_useremail'), 'kel03_03@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/TC014_Buy_Positive/Page_SecondHand/input_Password_userpassword'), 
    'O9Z43x2lAxM=')

WebUI.click(findTestObject('Object Repository/TC014_Buy_Positive/Page_SecondHand/input_Password_commit'))

WebUI.setText(findTestObject('TC014_Buy_Positive/input_Produk Saya_q'), 'jual kesehatan')

WebUI.sendKeys(findTestObject('Object Repository/TC014_Buy_Positive/Page_SecondHand/input_Produk Saya_q'), Keys.chord(Keys.ENTER))

WebUI.scrollToElement(findTestObject('TC014_Buy_Positive/Telusuri Kategori'), 0)

WebUI.click(findTestObject('Object Repository/TC014_Buy_Positive/Page_SecondHand/img_Kesehatan_card-img img-product-thumbnai_e42683'))

WebUI.verifyElementVisible(findTestObject('Object Repository/TC014_Buy_Positive/Page_SecondHand/button_Saya tertarik dan ingin nego'))

not_run: WebUI.setText(findTestObject('Object Repository/TC014_Buy_Positive/Page_SecondHand/input_Harga Tawar_offerprice'), 
    '')

not_run: WebUI.click(findTestObject('Object Repository/TC014_Buy_Positive/Page_SecondHand/input_Password_commit'))

WebUI.closeBrowser()

