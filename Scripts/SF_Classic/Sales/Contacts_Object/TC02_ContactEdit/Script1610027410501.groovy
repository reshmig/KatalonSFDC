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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('SF_Classic/Login sales'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SF_Classic/Sales/Contacts_Object/TC01_NewContract/contacts tab'))

WebUI.delay(3)

WebUI.click(findTestObject('SF_Classic/Sales/Contacts_Object/TC02_ContactEdit/contactselect'))

WebUI.click(findTestObject('SF_Classic/Sales/Contacts_Object/TC02_ContactEdit/edit'))

WebUI.selectOptionByValue(findTestObject('SF_Classic/Sales/Contacts_Object/TC01_NewContract/salutation'), 'Mr.', false)

WebUI.setText(findTestObject('SF_Classic/Sales/Contacts_Object/TC01_NewContract/lastname'), 'KatalonContact_updated')

WebUI.click(findTestObject('SF_Classic/Sales/Contacts_Object/TC01_NewContract/save'))

WebUI.delay(5)

WebUI.closeBrowser()

