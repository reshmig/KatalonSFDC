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

WebUI.enhancedClick(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/Contact Creation/Page_Home  Salesforce/div_Sales'))

WebUI.enhancedClick(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/Contact Creation/Page_Home  Salesforce/span_Contacts'))

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/Contact Creation/Page_Recently Viewed  Contacts  Salesforce/New Button'))

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/TC11_Opp creation from Contact detail/Page_New Contact  Salesforce/a_--None--'))

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/TC11_Opp creation from Contact detail/Page_New Contact  Salesforce/a_Ms'))

WebUI.setText(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/TC11_Opp creation from Contact detail/Page_New Contact  Salesforce/First Name'), 
    'Contact creation')

WebUI.setText(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/TC11_Opp creation from Contact detail/Page_New Contact  Salesforce/Contact lastname'), 
    'katalonn 071')

WebUI.setText(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/TC11_Opp creation from Contact detail/Page_New Contact  Salesforce/Phone'), 
    '9876543321')

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/TC11_Opp creation from Contact detail/Page_New Contact  Salesforce/span_Save'))

WebUI.enhancedClick(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/TC11_Opp creation from Contact detail/Page_Contact creation katalonn 111  Salesforce/span_Opportunities'))

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/TC11_Opp creation from Contact detail/Page_Opportunities  Salesforce/div_New'))

WebUI.setText(findTestObject('SF_Lightning/Sales/Contact_Object/TC11_Opp creation from Contact detail/Page_New Opportunity  Salesforce/Opp name'), 
    'Opp from con detail')

WebUI.setText(findTestObject('SF_Lightning/Sales/Contact_Object/TC11_Opp creation from Contact detail/Page_New Opportunity  Salesforce/Opp Close date'), 
    '12/13/2020')

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/TC11_Opp creation from Contact detail/Page_New Opportunity  Salesforce/a_--None--'))

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/TC11_Opp creation from Contact detail/Page_New Opportunity  Salesforce/a_Id. Decision Makers'))

WebUI.click(findTestObject('SF_Lightning/Sales/Contact_Object/TC11_Opp creation from Contact detail/Page_New Opportunity  Salesforce/Con_opp creation_save'))

