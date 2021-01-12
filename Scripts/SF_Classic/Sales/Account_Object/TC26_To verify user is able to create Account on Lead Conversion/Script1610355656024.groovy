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

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('SF_Classic/Sales/Lead_Object/Obj01_Create Lead from Lead Home Page/Lead_Tab'))

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj01_Create Lead from Lead Home Page/Lead_New B'))

WebUI.selectOptionByValue(findTestObject('SF_Classic/Sales/Account_Object/TC26_To verify user is able to create Account on Lead Conversion/Select salution'), 
    'Mr.', false)

//WebUI.setText(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/lastname'), lastname)
WebUI.setText(findTestObject('SF_Classic/Sales/Lead_Object/Obj01_Create Lead from Lead Home Page/Lead_Last Name'), 'Test')

WebUI.setText(findTestObject('SF_Classic/Sales/Lead_Object/Obj01_Create Lead from Lead Home Page/Lead_Company'), 'Marlabs')

//WebUI.setText(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/company'), company)
WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj01_Create Lead from Lead Home Page/Lead_Save B'))

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('SF_Classic/Sales/Account_Object/TC26_To verify user is able to create Account on Lead Conversion/Click on convert'))

WebUI.delay(5)

WebUI.setText(findTestObject('SF_Classic/Sales/Account_Object/TC26_To verify user is able to create Account on Lead Conversion/Enter subject'), 
    'Call')

WebUI.enhancedClick(findTestObject('SF_Classic/Sales/Account_Object/TC26_To verify user is able to create Account on Lead Conversion/Click on convert after leadcreation'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('SF_Classic/Sales/Account_Object/TC26_To verify user is able to create Account on Lead Conversion/Verify lead conversion'), 
    5)

WebUI.closeBrowser()

