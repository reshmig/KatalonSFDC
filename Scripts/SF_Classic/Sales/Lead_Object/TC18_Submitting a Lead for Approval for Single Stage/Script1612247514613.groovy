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

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj18_Submitting a Lead for Approval for Single Stage/Leads Tab'))

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj18_Submitting a Lead for Approval for Single Stage/New Lead Button'))

WebUI.delay(2)

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj18_Submitting a Lead for Approval for Single Stage/First Name'))

WebUI.sendKeys(findTestObject('SF_Classic/Sales/Lead_Object/Obj18_Submitting a Lead for Approval for Single Stage/First Name'), 
    'Mike')

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj18_Submitting a Lead for Approval for Single Stage/Last Name'))

WebUI.sendKeys(findTestObject('SF_Classic/Sales/Lead_Object/Obj18_Submitting a Lead for Approval for Single Stage/Last Name'), 
    'John')

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj18_Submitting a Lead for Approval for Single Stage/Company'))

WebUI.sendKeys(findTestObject('SF_Classic/Sales/Lead_Object/Obj18_Submitting a Lead for Approval for Single Stage/Company'), 
    'Marlabs')

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj18_Submitting a Lead for Approval for Single Stage/Phone'))

WebUI.sendKeys(findTestObject('SF_Classic/Sales/Lead_Object/Obj18_Submitting a Lead for Approval for Single Stage/Phone'), 
    '(876) 533-4521')

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj18_Submitting a Lead for Approval for Single Stage/Save button'))

WebUI.delay(2)

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj18_Submitting a Lead for Approval for Single Stage/Submit for Approval'))

WebUI.acceptAlert()

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj18_Submitting a Lead for Approval for Single Stage/Next Approver'))

WebUI.sendKeys(findTestObject('SF_Classic/Sales/Lead_Object/Obj18_Submitting a Lead for Approval for Single Stage/Next Approver'), 
    'James')

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj18_Submitting a Lead for Approval for Single Stage/Send to Next Approver'))

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj18_Submitting a Lead for Approval for Single Stage/User icon'))

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj18_Submitting a Lead for Approval for Single Stage/Logout button'))

WebUI.delay(2)

WebUI.setText(findTestObject('SF_Classic/Sales/Lead_Object/Obj18_Submitting a Lead for Approval for Single Stage/Username'), 
    GlobalVariable.Username)

WebUI.setText(findTestObject('SF_Classic/Sales/Lead_Object/Obj18_Submitting a Lead for Approval for Single Stage/Password'), 
    GlobalVariable.Password)

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj18_Submitting a Lead for Approval for Single Stage/Login button'))

WebUI.delay(4)

WebUI.scrollToPosition(100, 600)

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj18_Submitting a Lead for Approval for Single Stage/Approve_Reject link'))

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj18_Submitting a Lead for Approval for Single Stage/Approve_Reject Comment'))

WebUI.sendKeys(findTestObject('SF_Classic/Sales/Lead_Object/Obj18_Submitting a Lead for Approval for Single Stage/Approve_Reject Comment'), 
    'Approve')

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj18_Submitting a Lead for Approval for Single Stage/Approve_Reject Request Approve button'))

WebUI.delay(2)

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj18_Submitting a Lead for Approval for Single Stage/User icon'))

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj18_Submitting a Lead for Approval for Single Stage/Logout button'))

WebUI.delay(3)

WebUI.setText(findTestObject('SF_Classic/Sales/Lead_Object/Obj18_Submitting a Lead for Approval for Single Stage/Username'), 
    GlobalVariable.username)

WebUI.setText(findTestObject('SF_Classic/Sales/Lead_Object/Obj18_Submitting a Lead for Approval for Single Stage/Password'), 
    GlobalVariable.password)

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj18_Submitting a Lead for Approval for Single Stage/Login button'))

WebUI.delay(3)

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj18_Submitting a Lead for Approval for Single Stage/Leads Tab'))

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj18_Submitting a Lead for Approval for Single Stage/Recent Leads'))

WebUI.scrollToPosition(100, 600)

WebUI.verifyElementPresent(findTestObject('SF_Classic/Sales/Lead_Object/Obj18_Submitting a Lead for Approval for Single Stage/Overall Status Approved'), 
    3)

WebUI.closeBrowser()

