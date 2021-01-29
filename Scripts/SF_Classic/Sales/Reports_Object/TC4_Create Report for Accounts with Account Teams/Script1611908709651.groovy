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

WebUI.enhancedClick(findTestObject('SF_Classic/Sales/Reports_Object/Obj03_Create Report for Accounts with Partners/Reports tab'))

WebUI.click(findTestObject('SF_Classic/Sales/Reports_Object/Obj03_Create Report for Accounts with Partners/New Report button'))

WebUI.click(findTestObject('SF_Classic/Sales/Reports_Object/Obj03_Create Report for Accounts with Partners/Accounts_and_Contacts Maximize button'))

WebUI.click(findTestObject('SF_Classic/Sales/Reports_Object/Obj04_Create Report for Accounts with Account Teams/Account with Account Teams Report Type'))

WebUI.click(findTestObject('SF_Classic/Sales/Reports_Object/Obj04_Create Report for Accounts with Account Teams/Create button'))

WebUI.click(findTestObject('SF_Classic/Sales/Reports_Object/Obj04_Create Report for Accounts with Account Teams/From Date icon'))

WebUI.click(findTestObject('SF_Classic/Sales/Reports_Object/Obj04_Create Report for Accounts with Account Teams/Date Picker'))

WebUI.click(findTestObject('SF_Classic/Sales/Reports_Object/Obj04_Create Report for Accounts with Account Teams/Report Save button'))

WebUI.click(findTestObject('SF_Classic/Sales/Reports_Object/Obj04_Create Report for Accounts with Account Teams/Report Name'))

WebUI.sendKeys(findTestObject('SF_Classic/Sales/Reports_Object/Obj04_Create Report for Accounts with Account Teams/Report Name'), 
    'SH Account with Account Teams Report')

WebUI.click(findTestObject('SF_Classic/Sales/Reports_Object/Obj04_Create Report for Accounts with Account Teams/Report Unique Name'))

WebUI.delay(2)

WebUI.click(findTestObject('SF_Classic/Sales/Reports_Object/Obj04_Create Report for Accounts with Account Teams/Save Report'))

WebUI.delay(2)

WebUI.click(findTestObject('SF_Classic/Sales/Reports_Object/Obj04_Create Report for Accounts with Account Teams/Run Report button'))

WebUI.delay(2)

WebUI.click(findTestObject('SF_Classic/Sales/Reports_Object/Obj04_Create Report for Accounts with Account Teams/Reports tab'))

WebUI.verifyElementPresent(findTestObject('SF_Classic/Sales/Reports_Object/Obj04_Create Report for Accounts with Account Teams/Verify Report name'), 
    0)

WebUI.closeBrowser()

