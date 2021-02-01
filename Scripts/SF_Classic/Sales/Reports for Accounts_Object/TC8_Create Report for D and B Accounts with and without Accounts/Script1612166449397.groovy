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

WebUI.callTestCase(findTestCase('SF_Classic/Login sales'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('SF_Classic/Sales/Reports for Accounts_Object/Obj08_Create Report for D and B Accounts with and without Accounts/Reports tab'))

WebUI.click(findTestObject('SF_Classic/Sales/Reports for Accounts_Object/Obj08_Create Report for D and B Accounts with and without Accounts/New Report button'))

WebUI.click(findTestObject('SF_Classic/Sales/Reports for Accounts_Object/Obj08_Create Report for D and B Accounts with and without Accounts/Accounts_and_Contacts Maximize button'))

WebUI.click(findTestObject('SF_Classic/Sales/Reports for Accounts_Object/Obj08_Create Report for D and B Accounts with and without Accounts/SH D and B Accounts Report Type'))

WebUI.click(findTestObject('SF_Classic/Sales/Reports for Accounts_Object/Obj08_Create Report for D and B Accounts with and without Accounts/Create button'))

WebUI.click(findTestObject('SF_Classic/Sales/Reports for Accounts_Object/Obj08_Create Report for D and B Accounts with and without Accounts/From Date icon'))

WebUI.click(findTestObject('SF_Classic/Sales/Reports for Accounts_Object/Obj08_Create Report for D and B Accounts with and without Accounts/Month back button'))

WebUI.click(findTestObject('SF_Classic/Sales/Reports for Accounts_Object/Obj08_Create Report for D and B Accounts with and without Accounts/Date Picker'))

WebUI.click(findTestObject('SF_Classic/Sales/Reports for Accounts_Object/Obj08_Create Report for D and B Accounts with and without Accounts/Report Save button'))

WebUI.click(findTestObject('SF_Classic/Sales/Reports for Accounts_Object/Obj08_Create Report for D and B Accounts with and without Accounts/Report Name'))

WebUI.sendKeys(findTestObject('SF_Classic/Sales/Reports for Accounts_Object/Obj08_Create Report for D and B Accounts with and without Accounts/Report Name'), 
    'SH D & B Accounts Report')

WebUI.click(findTestObject('SF_Classic/Sales/Reports for Accounts_Object/Obj08_Create Report for D and B Accounts with and without Accounts/Report Unique Name'))

WebUI.delay(2)

WebUI.click(findTestObject('SF_Classic/Sales/Reports for Accounts_Object/Obj08_Create Report for D and B Accounts with and without Accounts/Save Report'))

WebUI.delay(2)

WebUI.click(findTestObject('SF_Classic/Sales/Reports for Accounts_Object/Obj08_Create Report for D and B Accounts with and without Accounts/Run Report button'))

WebUI.delay(2)

WebUI.click(findTestObject('SF_Classic/Sales/Reports for Accounts_Object/Obj08_Create Report for D and B Accounts with and without Accounts/Reports tab'))

WebUI.verifyElementPresent(findTestObject('SF_Classic/Sales/Reports for Accounts_Object/Obj08_Create Report for D and B Accounts with and without Accounts/Verify Report name'), 
    0)

WebUI.closeBrowser()

