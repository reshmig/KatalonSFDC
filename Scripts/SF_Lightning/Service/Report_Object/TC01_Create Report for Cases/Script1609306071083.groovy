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
WebUI.setText(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/searchsales'), 'Service Console')

WebUI.click(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj01_CreateEntitlement/App Launcher_Service Console'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj01_CreateEntitlement/SC_Tab Drop Down'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Report_Object/Obj01_Create Report for Cases/SC_DD_Report Tab'))

WebUI.click(findTestObject('SF_Lightning/Sales/Report_Object/Obj01_Create Report for Account/Report_New B'))

WebUI.switchToFrame(findTestObject('SF_Lightning/Sales/Reports_object/TC01_To verify that the user is able create a report for Opportunity History/Switch to frame'), 
    2)

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Report_Object/Obj01_Create Report for Cases/Report_Customer Support Reports'))

WebUI.setText(findTestObject('SF_Lightning/Sales/Report_Object/Obj01_Create Report for Account/Page_Report Builder  Salesforce/Report_New_Search Field'), 
    'cases')

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Report_Object/Obj01_Create Report for Account/Page_Report Builder  Salesforce/Report_New_1st Item'))

WebUI.click(findTestObject('SF_Lightning/Service/Report_Object/Obj01_Create Report for Cases/Report_Continue B'))

WebUI.setText(findTestObject('SF_Lightning/Service/Report_Object/Obj01_Create Report for Cases/Report_Add Group Field'), 
    'Status')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('SF_Lightning/Service/Report_Object/Obj01_Create Report for Cases/Report_Add Group Field'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('Object Repository/SF_Lightning/Sales/Report_Object/Obj01_Create Report for Account/Page_Report Builder  Salesforce/button_Run'))

WebUI.click(findTestObject('SF_Lightning/Service/Report_Object/Obj01_Create Report for Cases/Report_Run_Drop Down'))

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Report_Object/Obj01_Create Report for Account/Page_Report Builder  Salesforce/a_Save'))

WebUI.delay(3)

WebUI.clearText(findTestObject('SF_Lightning/Service/Report_Object/Obj01_Create Report for Cases/Report_Save_Report Name'))

WebUI.setText(findTestObject('SF_Lightning/Service/Report_Object/Obj01_Create Report for Cases/Report_Save_Report Name'), 
    '_Test')

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Report_Object/Obj01_Create Report for Account/Page_Report Builder  Salesforce/input_Help_reportUniqueName'))

WebUI.setText(findTestObject('SF_Lightning/Sales/Report_Object/Obj01_Create Report for Account/Report_Description'), 'Test Report created on Cases')

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Report_Object/Obj01_Create Report for Account/Page_Report Builder  Salesforce/button_Save'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj01_CreateEntitlement/SC_Tab Drop Down'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Report_Object/Obj01_Create Report for Cases/SC_DD_Report Tab'))

WebUI.verifyElementText(findTestObject('SF_Lightning/Service/Report_Object/Obj01_Create Report for Cases/Report_List View_1st Item'), 
    'New Cases Report_Test')

WebUI.delay(3)

WebUI.closeBrowser()

