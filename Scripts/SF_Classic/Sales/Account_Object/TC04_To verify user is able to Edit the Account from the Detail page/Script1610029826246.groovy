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

WebUI.enhancedClick(findTestObject('SF_Classic/Sales/Account_Object/TC01_To Verify that the user is able to create Account from Account home page/Click on New'))

WebUI.delay(3)

WebUI.setText(findTestObject('SF_Classic/Sales/Account_Object/TC01_To Verify that the user is able to create Account from Account home page/Enter text on account name'), 
    'Test Account')

WebUI.setText(findTestObject('SF_Classic/Sales/Account_Object/TC01_To Verify that the user is able to create Account from Account home page/Set phone num'), 
    '12345678')

WebUI.enhancedClick(findTestObject('SF_Classic/Sales/Account_Object/TC01_To Verify that the user is able to create Account from Account home page/Click save'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Classic/Sales/Account_Object/TC04_To verify user is able to Edit the Account from the Detail page/Click on Edit'))

WebUI.delay(3)

WebUI.setText(findTestObject('SF_Classic/Sales/Account_Object/TC02_To Verify that a user is able to edit a account record from the List view/Set text in website'), 
    'www.test.com')

WebUI.enhancedClick(findTestObject('SF_Classic/Sales/Account_Object/TC01_To Verify that the user is able to create Account from Account home page/Click save'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('SF_Classic/Sales/Account_Object/TC01_To Verify that the user is able to create Account from Account home page/Verify account'), 
    5)

WebUI.closeBrowser()

