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

WebUI.click(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj08_Edit Product from Existing Product Action Menu drop down/Opportunity tab'))

WebUI.click(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj08_Edit Product from Existing Product Action Menu drop down/Go'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj08_Edit Product from Existing Product Action Menu drop down/Opportunity Name Record'))

WebUI.click(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj11_Change Owner of Opportunity from Detail Page/Change link'))

WebUI.sendKeys(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj11_Change Owner of Opportunity from Detail Page/Owner'), 
    'James')

WebUI.click(findTestObject('SF_Classic/Sales/Opportunity_Object/Obj11_Change Owner of Opportunity from Detail Page/Save button'))

WebUI.verifyTextPresent('James Clifton', false)

WebUI.closeBrowser()

