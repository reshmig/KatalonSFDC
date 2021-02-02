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

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj19_Submitting a Lead for Approval for Multi Stage/Leads Tab'))

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj19_Submitting a Lead for Approval for Multi Stage/New Lead Button'))

WebUI.delay(2)

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj19_Submitting a Lead for Approval for Multi Stage/First Name'))

WebUI.sendKeys(findTestObject('SF_Classic/Sales/Lead_Object/Obj19_Submitting a Lead for Approval for Multi Stage/First Name'), 
    'Iron')

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj18_Submitting a Lead for Approval for Single Stage/Last Name'))

WebUI.sendKeys(findTestObject('SF_Classic/Sales/Lead_Object/Obj19_Submitting a Lead for Approval for Multi Stage/Last Name'), 
    'Man')

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj19_Submitting a Lead for Approval for Multi Stage/Company'))

WebUI.sendKeys(findTestObject('SF_Classic/Sales/Lead_Object/Obj19_Submitting a Lead for Approval for Multi Stage/Company'), 
    'Marlabs')

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj19_Submitting a Lead for Approval for Multi Stage/Industry dropdown'))

WebUI.selectOptionByValue(findTestObject('SF_Classic/Sales/Lead_Object/Obj19_Submitting a Lead for Approval for Multi Stage/Industry dropdown'), 
    'Agriculture', false)

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj19_Submitting a Lead for Approval for Multi Stage/Save button'))

WebUI.delay(2)

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj20_Delete the Lead from the list Detail Page/Delete button'))

WebUI.acceptAlert()

WebUI.delay(2)

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj20_Delete the Lead from the list Detail Page/Go button for Lead'))

WebUI.verifyElementNotPresent(findTestObject('SF_Classic/Sales/Lead_Object/Obj20_Delete the Lead from the list Detail Page/Verify Lead value'), 
    2)

WebUI.closeBrowser()

