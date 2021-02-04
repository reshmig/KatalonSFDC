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

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('SF_Classic/Sales/Reports for Opportunity/Obj02_ Creation of report for Opportunity with contact Roles/Reports Tab'))

WebUI.click(findTestObject('SF_Classic/Sales/Reports for Opportunity/Obj02_ Creation of report for Opportunity with contact Roles/New Reports Button'))

WebUI.click(findTestObject('SF_Classic/Sales/Reports for Opportunity/Obj02_ Creation of report for Opportunity with contact Roles/Opportunities'))

WebUI.enhancedClick(findTestObject('SF_Classic/Sales/Reports for Opportunity/Obj09_Creation of Reports for Opportunities with Contact Roles Products/Opportunities with Roles Products Link'))

WebUI.click(findTestObject('SF_Classic/Sales/Reports for Opportunity/Obj02_ Creation of report for Opportunity with contact Roles/Create Button'))

WebUI.delay(5)

WebUI.click(findTestObject('SF_Classic/Sales/Reports for Opportunity/Obj09_Creation of Reports for Opportunities with Contact Roles Products/Product Look up'))

WebUI.switchToWindowIndex(1)

WebUI.delay(3)

WebUI.sendKeys(findTestObject('SF_Classic/Sales/Reports for Opportunity/Obj09_Creation of Reports for Opportunities with Contact Roles Products/Look up Window field'), 
    'GenWatt Diesel 1000kW')

WebUI.click(findTestObject('SF_Classic/Sales/Assets_Object/Obj01_CreateAsset/search go'))

WebUI.click(findTestObject('SF_Classic/Sales/Reports for Opportunity/Obj02_ Creation of report for Opportunity with contact Roles/Save Button'))

WebUI.sendKeys(findTestObject('SF_Classic/Sales/Reports for Opportunity/Obj02_ Creation of report for Opportunity with contact Roles/Rep Name'), 
    ' Opp with prod and roles SR')

WebUI.click(findTestObject('SF_Classic/Sales/Assets_Object/Obj01_CreateAsset/Account lookup'))

WebUI.click(findTestObject('SF_Classic/Sales/Reports for Opportunity/Obj02_ Creation of report for Opportunity with contact Roles/Rep Uniq Name'))

WebUI.delay(3)

WebUI.click(findTestObject('SF_Classic/Sales/Reports for Opportunity/Obj02_ Creation of report for Opportunity with contact Roles/Save and Run Report'))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('SF_Classic/Sales/Reports_Object/Obj01_Create Report for Accounts/Reports tab'))

WebUI.verifyTextPresent('Opportunities trends 123', false)

WebUI.closeBrowser()

