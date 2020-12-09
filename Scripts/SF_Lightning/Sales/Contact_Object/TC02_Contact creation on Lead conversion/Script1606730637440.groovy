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

WebUI.enhancedClick(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/Contact creation on lead conversion/Page_Home  Salesforce/span_Leads'))

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/Contact creation on lead conversion/Page_Recently Viewed  Leads  Salesforce/div_New'))

WebUI.setText(findTestObject('SF_Lightning/Sales/Contact_Object/Contact creation on lead conversion/Page_New Lead  Salesforce/Lead Last name'), 
    'katalon Lead 01 Conversion')

WebUI.setText(findTestObject('SF_Lightning/Sales/Contact_Object/Contact creation on lead conversion/Page_New Lead  Salesforce/Company'), 
    'Marlabs')

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/Contact creation on lead conversion/Page_New Lead  Salesforce/span_Save'))

WebUI.click(findTestObject('SF_Lightning/Sales/Contact_Object/Contact creation on lead conversion/Page_katalon Lead 01 Conversion  Salesforce/Lead details tab'))

WebUI.click(findTestObject('SF_Lightning/Sales/Contact_Object/Contact creation on lead conversion/Page_katalon Lead 01 Conversion  Salesforce/Convert button on Lead detail'))

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/Contact creation on lead conversion/Page_katalon Lead 01 Conversion  Salesforce/span_Convert'))

WebUI.verifyTextPresent('katalon Lead 01 Conversion', true)

WebUI.closeBrowser()

