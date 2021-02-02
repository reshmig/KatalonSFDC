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
    'James')

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj18_Submitting a Lead for Approval for Single Stage/Last Name'))

WebUI.sendKeys(findTestObject('SF_Classic/Sales/Lead_Object/Obj19_Submitting a Lead for Approval for Multi Stage/Last Name'), 
    'Cook')

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj19_Submitting a Lead for Approval for Multi Stage/Company'))

WebUI.sendKeys(findTestObject('SF_Classic/Sales/Lead_Object/Obj19_Submitting a Lead for Approval for Multi Stage/Company'), 
    'Marlabs')

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj19_Submitting a Lead for Approval for Multi Stage/Industry dropdown'))

WebUI.selectOptionByValue(findTestObject('SF_Classic/Sales/Lead_Object/Obj19_Submitting a Lead for Approval for Multi Stage/Industry dropdown'), 
    'Agriculture', false)

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj19_Submitting a Lead for Approval for Multi Stage/Save button'))

WebUI.delay(2)

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj19_Submitting a Lead for Approval for Multi Stage/Submit for Approval'))

WebUI.acceptAlert()

WebUI.scrollToPosition(100, 600)

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj19_Submitting a Lead for Approval for Multi Stage/Approve_Reject link'))

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj19_Submitting a Lead for Approval for Multi Stage/Approve_Reject Comment'))

WebUI.sendKeys(findTestObject('SF_Classic/Sales/Lead_Object/Obj19_Submitting a Lead for Approval for Multi Stage/Approve_Reject Comment'), 
    'Approved by QA Katalon')

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj19_Submitting a Lead for Approval for Multi Stage/Approve_Reject Request Approve button'))

WebUI.delay(2)

WebUI.scrollToPosition(100, 600)

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj19_Submitting a Lead for Approval for Multi Stage/User icon'))

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj19_Submitting a Lead for Approval for Multi Stage/Logout button'))

WebUI.delay(3)

WebUI.setText(findTestObject('SF_Classic/Sales/Lead_Object/Obj18_Submitting a Lead for Approval for Single Stage/Username'), 
    GlobalVariable.Username)

WebUI.setText(findTestObject('SF_Classic/Sales/Lead_Object/Obj18_Submitting a Lead for Approval for Single Stage/Password'), 
    GlobalVariable.Password)

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj19_Submitting a Lead for Approval for Multi Stage/Login button'))

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj19_Submitting a Lead for Approval for Multi Stage/Approve_Reject link'))

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj19_Submitting a Lead for Approval for Multi Stage/Approve_Reject Comment'))

WebUI.sendKeys(findTestObject('SF_Classic/Sales/Lead_Object/Obj19_Submitting a Lead for Approval for Multi Stage/Approve_Reject Comment'), 
    'Approved by James')

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj19_Submitting a Lead for Approval for Multi Stage/Approve_Reject Request Approve button'))

WebUI.delay(3)

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj19_Submitting a Lead for Approval for Multi Stage/User icon'))

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj19_Submitting a Lead for Approval for Multi Stage/Logout button'))

WebUI.setText(findTestObject('SF_Classic/Sales/Lead_Object/Obj18_Submitting a Lead for Approval for Single Stage/Username'), 
    GlobalVariable.username)

WebUI.setText(findTestObject('SF_Classic/Sales/Lead_Object/Obj18_Submitting a Lead for Approval for Single Stage/Password'), 
    GlobalVariable.password)

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj19_Submitting a Lead for Approval for Multi Stage/Login button'))

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj19_Submitting a Lead for Approval for Multi Stage/Leads Tab'))

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj19_Submitting a Lead for Approval for Multi Stage/Recent Leads'))

WebUI.scrollToPosition(100, 600)

WebUI.verifyElementPresent(findTestObject('SF_Classic/Sales/Lead_Object/Obj19_Submitting a Lead for Approval for Multi Stage/Overall Status Approved'), 
    3)

WebUI.closeBrowser()

