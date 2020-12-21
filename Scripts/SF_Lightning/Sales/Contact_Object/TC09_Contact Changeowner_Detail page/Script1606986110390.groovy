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

WebUI.enhancedClick(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/TC09_Contact Changeowner_Detail page/Page_Home  Salesforce/p_Sales'))

WebUI.enhancedClick(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/TC09_Contact Changeowner_Detail page/Page_Home  Salesforce/span_Contacts'))

WebUI.click(findTestObject('SF_Lightning/Sales/Contact_Object/TC09_Contact Changeowner_Detail page/Page_Recently Viewed  Contacts  Salesforce/Select first con rec'))

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/TC09_Contact Changeowner_Detail page/Page_New Contact from account  Salesforce/lightning-primitive-icon'))

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/TC09_Contact Changeowner_Detail page/Page_New Contact from account  Salesforce/span_Change Owner'))

WebUI.setText(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/TC09_Contact Changeowner_Detail page/Page_New Contact from account  Salesforce/input_Close this window_73562a'), 
    'Manjary001')

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/TC09_Contact Changeowner_Detail page/Page_New Contact from account  Salesforce/div_Manjary001'))

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/TC09_Contact Changeowner_Detail page/Page_New Contact from account  Salesforce/span_Submit'))

WebUI.delay(5)

WebUI.closeBrowser()

