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

def email_name = GlobalVariable.BuyerEmail

WebUI.openBrowser('')

WebUI.navigateToUrl('https://secondhand.binaracademy.org/')

WebUI.click(findTestObject('Object Repository/Page_SecondHand/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_Email_useremail'), email_name)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_SecondHand/input_Password_userpassword'), 'QJblfja5Cso=')

WebUI.click(findTestObject('Object Repository/Page_SecondHand/input_Password_commit'))

WebUI.click(findTestObject('Object Repository/Page_SecondHand/a_Profil Saya'))

WebUI.click(findTestObject('Object Repository/Page_SecondHand/Navbar/div_First_Name'))

WebUI.uploadFile(findTestObject('Object Repository/Page_SecondHand/input_Lengkapi Info Akun_useravatar'), 'C://Uploads//profile-pic.jpg')

WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_Nama_username'), 'John Doe Smith')

WebUI.setText(findTestObject('Object Repository/Page_SecondHand/textarea_Jl. Budi Mulia 01'), 'Jl. Budi Mulia 01')

WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_No Handphone_userphone_number'), '08123456789')

WebUI.click(findTestObject('Object Repository/Page_SecondHand/input_Password_commit'))

WebUI.delay(3)

currentURL = WebUI.getUrl()

WebUI.verifyMatch(currentURL, 'https://secondhand.binaracademy.org/profiles', false)

WebUI.closeBrowser()

