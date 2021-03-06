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

WebUI.click(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj2_Edit Opportunity from List View/Opportunity tab'))

WebUI.click(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj2_Edit Opportunity from List View/Go'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj3_Edit Opportunity From Detail Page/Opportunity Name Record'))

WebUI.click(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj3_Edit Opportunity From Detail Page/Edit Button'))

WebUI.click(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj3_Edit Opportunity From Detail Page/Opportunity Name'))

WebUI.clearText(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj3_Edit Opportunity From Detail Page/Opportunity Name'))

WebUI.sendKeys(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj3_Edit Opportunity From Detail Page/Opportunity Name'), 
    'Ricky')

WebUI.selectOptionByValue(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj3_Edit Opportunity From Detail Page/Lead Source'), 
    'Phone Inquiry', false)

WebUI.click(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj3_Edit Opportunity From Detail Page/Amount'))

WebUI.clearText(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj3_Edit Opportunity From Detail Page/Amount'))

WebUI.sendKeys(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj3_Edit Opportunity From Detail Page/Amount'), '7000')

WebUI.selectOptionByLabel(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj3_Edit Opportunity From Detail Page/Stage'), 
    'Qualification', false)

WebUI.click(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj3_Edit Opportunity From Detail Page/Save'))

WebUI.verifyTextPresent('Ricky', false)

WebUI.closeBrowser()

