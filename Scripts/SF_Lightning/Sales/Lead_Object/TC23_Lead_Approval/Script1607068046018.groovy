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

WebUI.callTestCase(findTestCase('SF_Lightning/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/searchsales'), 'sales')

WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/selectsales'))

//WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/salesoption'))
WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/leadobject'))

WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/newlead'))

WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/salutation'))

CustomKeywords.'Marlabscustom.Salutation'('Mrs.')

//WebUI.setText(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/lastname'), lastname)
WebUI.setText(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/lastname'), 'Alice')

WebUI.setText(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/company'), 'Marlabs')

WebUI.setText(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Approval/leadphone'), '(876) 533-4521')

//WebUI.setText(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/company'), company)
WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/save'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/leadobject'))

WebUI.verifyElementPresent(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/verifylead'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.verifyTextPresent('Alice', false)

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/leadobject'))

WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Approval/LeadEditDet_select'))

WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Approval/approve'))

WebUI.sendKeys(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Approval/comments'), 'testapprove')

WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Approval/approvesubmit'))

WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Approval/selectapprover'))

WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Approval/seljames'))

WebUI.delay(10)

WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Approval/submit2'))

WebUI.delay(7)

WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Approval/sellogout'))

WebUI.delay(5)

WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Approval/logout'))

WebUI.delay(5)

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.setText(findTestObject('SF_Lightning/Login/username'), 'qamarlabsapprover@gmail.com')

WebUI.setText(findTestObject('SF_Lightning/Login/password'), 'marlabs5678')

WebUI.click(findTestObject('SF_Lightning/Login/login'))

WebUI.delay(7)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Approval/bellicon'))

WebUI.delay(5)

WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Approval/approvenote'))

WebUI.delay(3)

WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Approval/approvefinal'))

WebUI.sendKeys(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Approval/commentsfinal'), 'approved')

WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Approval/approvefinalbutton'))

WebUI.delay(10)

WebUI.closeBrowser()

