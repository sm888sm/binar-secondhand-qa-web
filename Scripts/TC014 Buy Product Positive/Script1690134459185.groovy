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

WebUI.click(findTestObject('Object Repository/Buy Positive/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/Buy Positive/input_Email_useremail'), 'kel03_03@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Buy Positive/input_Password_userpassword'), 'O9Z43x2lAxM=')

WebUI.click(findTestObject('Object Repository/Buy Positive/input_Password_commit'))

WebUI.click(findTestObject('Object Repository/Buy Positive/img_Rp 1.111_card-img img-product-thumbnail_9678d8'))

WebUI.click(findTestObject('Object Repository/Buy Positive/button_Saya tertarik dan ingin nego'))

WebUI.setText(findTestObject('Object Repository/Buy Positive/input_Harga Tawar_offerprice'), '12345')

WebUI.click(findTestObject('Object Repository/Buy Positive/input_Password_commit'))

