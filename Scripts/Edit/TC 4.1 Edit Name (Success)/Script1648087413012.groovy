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

WebUI.navigateToUrl('http://alumni3.cyberlifecafe.com/')

WebUI.click(findTestObject('Object Repository/Page_/a_'))

WebUI.setText(findTestObject('Object Repository/Page_/input__StudentID'), '634259015')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input__Password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_/button_'))

WebUI.click(findTestObject('Object Repository/Page_/a__1'))

WebUI.click(findTestObject('Object Repository/Page_/input__Firstname'))

WebUI.click(findTestObject('Object Repository/Page_/input__Firstname'))

WebUI.setText(findTestObject('Object Repository/Page_/input__Firstname'), 'วัชรากร 63/50')

WebUI.click(findTestObject('Object Repository/Page_/button__1'))

WebUI.click(findTestObject('Object Repository/Page_/a__1_2'))

WebUI.verifyTextPresent('เข้าสู่ระบบ', false)

WebUI.closeBrowser()

