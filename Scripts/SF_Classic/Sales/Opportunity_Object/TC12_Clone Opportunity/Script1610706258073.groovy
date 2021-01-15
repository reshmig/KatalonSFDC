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

WebUI.click(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj12_Clone Opportunity/Opportunity tab'))

WebUI.click(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj12_Clone Opportunity/Go'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj12_Clone Opportunity/Opportunity Name Record'))

WebUI.click(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj12_Clone Opportunity/Clone button'))

WebUI.click(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj12_Clone Opportunity/Opportunity Name'))

WebUI.clearText(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj12_Clone Opportunity/Opportunity Name'))

WebUI.sendKeys(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj12_Clone Opportunity/Opportunity Name'), 'Jack')

WebUI.click(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj12_Clone Opportunity/Opportunity Type'))

WebUI.selectOptionByValue(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj12_Clone Opportunity/Opportunity Type'), 
    'New Customer', false)

WebUI.click(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj12_Clone Opportunity/Lead Source'))

WebUI.selectOptionByValue(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj12_Clone Opportunity/Lead Source'), 'Web', 
    false)

WebUI.click(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj12_Clone Opportunity/Amount'))

WebUI.clearText(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj12_Clone Opportunity/Amount'))

WebUI.sendKeys(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj12_Clone Opportunity/Amount'), '10000')

WebUI.click(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj12_Clone Opportunity/Closed Date'))

WebUI.click(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj12_Clone Opportunity/Save'))

WebUI.delay(2)

WebUI.click(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj12_Clone Opportunity/Opportunity tab'))

WebUI.click(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj12_Clone Opportunity/Opportunity View'))

WebUI.selectOptionByLabel(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj12_Clone Opportunity/Opportunity View'), 
    'Recently Viewed Opportunities', false)

WebUI.verifyTextPresent('Jack', false)

WebUI.closeBrowser()

