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

WebUI.enhancedClick(findTestObject('SF_Classic/Sales/Account_Object/TC01_To Verify that the user is able to create Account from Account home page/Click on Account Object'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Classic/Sales/Account_Object/TC05_To verify user is able to Delete the Account from the Detail page/Click on Acc name'))

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('SF_Classic/Sales/Account_Object/TC14_To Verify user is able to create new task from Account Related List/Click on New task'))

WebUI.delay(5)

WebUI.setText(findTestObject('SF_Classic/Sales/Account_Object/TC14_To Verify user is able to create new task from Account Related List/Add subject'), 
    'Email')

WebUI.enhancedClick(findTestObject('SF_Classic/Sales/Account_Object/TC10_To verify user is able create New opportunity from Account Related List/Save'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('SF_Classic/Sales/Account_Object/TC14_To Verify user is able to create new task from Account Related List/Verify task'), 
    5)

WebUI.closeBrowser()

