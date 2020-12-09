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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('SF_Lightning/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

//WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/viewall'))
WebUI.setText(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/searchsales'), 'Sales')

WebUI.click(findTestObject('SF_Lightning/Sales/Account_Object/Obj01_Account_Add_Manual/b_Sales_App Launcher'), FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/Contact creation from account/Page_Home  Salesforce/span_Accounts'))

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/Contact creation from account/Page_Recently Viewed  Accounts  Salesforce/div_New'))

WebUI.setText(findTestObject('SF_Lightning/Sales/Contact_Object/Contact creation from account/Page_New Account  Salesforce/Account name'), 
    'Katalon new Account')

WebUI.setText(findTestObject('SF_Lightning/Sales/Contact_Object/Contact creation from account/Page_New Account  Salesforce/Phone'), 
    '9876543210')

WebUI.setText(findTestObject('SF_Lightning/Sales/Contact_Object/Contact creation from account/Page_New Account  Salesforce/Employees on account'), 
    '25')

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/Contact creation from account/Page_New Account  Salesforce/span_Save'))

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/Contact creation from account/Page_Katalon new Account  Salesforce/a_Details'))

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/Contact creation from account/Page_Katalon new Account  Salesforce/button_New Contact'))

WebUI.setText(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/Contact creation from account/Page_New Contact  Salesforce/input_First Name_39030'), 
    'New ')

WebUI.setText(findTestObject('SF_Lightning/Sales/Contact_Object/Contact creation from account/Page_New Contact  Salesforce/Contact last name'), 
    'Contact from account')

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/Contact creation from account/Page_New Contact  Salesforce/span_Save'))

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/Contact creation from account/Page_Katalon new Account  Salesforce/a_Related'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/Contact creation from account/Page_Katalon new Account  Salesforce/a_New Contact from account'))

