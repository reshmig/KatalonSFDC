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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('SF_Classic/Login sales'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj01_Create Opportunity From Opportunity Home Page/Opportunity tab'))

WebUI.delay(3)

WebUI.click(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj01_Create Opportunity From Opportunity Home Page/Opportunity_New tab'))

WebUI.sendKeys(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj01_Create Opportunity From Opportunity Home Page/Opportunity Name'), 
    'Adam')

WebUI.click(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj01_Create Opportunity From Opportunity Home Page/Opportunity Type'))

WebUI.selectOptionByValue(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj01_Create Opportunity From Opportunity Home Page/Opportunity Type'), 
    'New Customer', false)

WebUI.selectOptionByValue(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj01_Create Opportunity From Opportunity Home Page/Lead Source'), 
    'Web', false)

WebUI.sendKeys(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj01_Create Opportunity From Opportunity Home Page/Amount'), 
    '5000')

WebUI.click(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj01_Create Opportunity From Opportunity Home Page/Closed Date'))

WebUI.click(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj01_Create Opportunity From Opportunity Home Page/Stage'))

WebUI.selectOptionByValue(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj01_Create Opportunity From Opportunity Home Page/Stage'), 
    'Prospecting', false)

WebUI.click(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj01_Create Opportunity From Opportunity Home Page/Save'))

WebUI.delay(3)

WebUI.click(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj01_Create Opportunity From Opportunity Home Page/Opportunity tab'))

WebUI.click(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj01_Create Opportunity From Opportunity Home Page/Opportunity View'))

WebUI.selectOptionByLabel(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj01_Create Opportunity From Opportunity Home Page/Opportunity View'), 
    'Recently Viewed Opportunities', false)

WebUI.verifyTextPresent('Adam', false)

WebUI.closeBrowser()

