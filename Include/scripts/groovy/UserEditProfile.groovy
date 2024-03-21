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



class UserEditProfile {

	@Given('the user logs in with previously created account')
	def loginNewAccount() {
		def generatedEmailAddress = GlobalVariable.BuyerEmail

		WebUI.click(findTestObject('Object Repository/Page_SecondHand/a_Masuk'))

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_Email_useremail'), generatedEmailAddress)

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_SecondHand/input_Password_userpassword'), 'QJblfja5Cso=')

		WebUI.click(findTestObject('Object Repository/Page_SecondHand/input_Password_commit'))

		WebUI.delay(5)

		def currentURL= WebUI.getUrl()

		WebUI.verifyMatch(currentURL, 'https://secondhand.binaracademy.org/', false)
	}

	@And('the user navigates to "Edit Profile" page')
	def navigateToEditProfile() {
		WebUI.click(findTestObject('Object Repository/Page_SecondHand/a_Profil Saya'))

		WebUI.click(findTestObject('Object Repository/Page_SecondHand/Navbar/div_First_Name'))
	}

	@When('the user uploads a profile picture, enters a name (.*), enters an address (.*), enters a phone number (.*) and leaves the city field empty')
	def enterInvalidCity(String fullName, String address, String phoneNumber) {
		WebUI.uploadFile(findTestObject('Object Repository/Page_SecondHand/input_Lengkapi Info Akun_useravatar'), 'C://Uploads//profile-pic.jpg')

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_Nama_username'), fullName)

		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_SecondHand/select_Pilih KotaSoloJogjaJakartaBandungSemarang'),
				'', true)

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/textarea_Jl. Budi Mulia 01'), address)

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_No Handphone_userphone_number'), phoneNumber)
	}

	@When('the user uploads a profile picture, selects a city (.*), enters an address (.*), enters a phone number (.*) and leaves the name field empty')
	def enterInvalidFullName(String city, String address, String phoneNumber) {
		WebUI.uploadFile(findTestObject('Object Repository/Page_SecondHand/input_Lengkapi Info Akun_useravatar'), 'C://Uploads//profile-pic.jpg')

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_Nama_username'), '')

		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_SecondHand/select_Pilih KotaSoloJogjaJakartaBandungSemarang'),
				city, true)

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/textarea_Jl. Budi Mulia 01'), address)

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_No Handphone_userphone_number'), phoneNumber)
	}

	@When('the user uploads a profile picture, enters a name (.*), selects a city (.*), enters a phone number (.*) and leaves the address field empty')\
	def enterInvalidAddress(String fullName, String city, String phoneNumber) {
		WebUI.uploadFile(findTestObject('Object Repository/Page_SecondHand/input_Lengkapi Info Akun_useravatar'), 'C://Uploads//profile-pic.jpg')

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_Nama_username'), fullName)

		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_SecondHand/select_Pilih KotaSoloJogjaJakartaBandungSemarang'),
				city, true)

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/textarea_Jl. Budi Mulia 01'), '')

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_No Handphone_userphone_number'), phoneNumber)
	}

	@When('the user uploads a profile picture, enters a name (.*), selects a city (.*), enters an address (.*) and leaves the phone number field empty')
	def enterInvalidPhoneNumber(String fullName, String city, String address) {
		WebUI.uploadFile(findTestObject('Object Repository/Page_SecondHand/input_Lengkapi Info Akun_useravatar'), 'C://Uploads//profile-pic.jpg')

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_Nama_username'), fullName)

		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_SecondHand/select_Pilih KotaSoloJogjaJakartaBandungSemarang'),
				city, true)

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/textarea_Jl. Budi Mulia 01'), address)

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_No Handphone_userphone_number'), '')
	}

	@When('the user uploads a profile picture, enters a name (.*), selects a city (.*), enters an address (.*) and enters a phone number (.*)')
	def enterValidData(String fullName, String city, String address, String phoneNumber) {
		WebUI.uploadFile(findTestObject('Object Repository/Page_SecondHand/input_Lengkapi Info Akun_useravatar'), 'C://Uploads//profile-pic.jpg')

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_Nama_username'), 'John Doe Smith')

		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_SecondHand/select_Pilih KotaSoloJogjaJakartaBandungSemarang'),
				'3', true)

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/textarea_Jl. Budi Mulia 01'), 'Jl. Budi Mulia 01')

		WebUI.setText(findTestObject('Object Repository/Page_SecondHand/input_No Handphone_userphone_number'), '08123456789')
	}


	@And('the user clicks on "Save Changes"')
	def clickSaveProfile() {
		WebUI.click(findTestObject('Object Repository/Page_SecondHand/input_Password_commit'))
	}

	@Then('the user remains on the profile edit page')
	def verifyRemainOnProfilePage() {
		WebUI.delay(5)

		def currentURL = WebUI.getUrl()

		WebUI.verifyMatch(currentURL, 'https://secondhand.binaracademy.org/profiles', false)
	}

	@Then("the user's name (.*) and city (.*) are displayed")
	def verifyProfileFirstName(String firstName, String cityName) {
		WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/Navbar/div_First_Name'), firstName)

		WebUI.verifyElementText(findTestObject('Object Repository/Page_SecondHand/Navbar/div_City'), cityName)
	}
}