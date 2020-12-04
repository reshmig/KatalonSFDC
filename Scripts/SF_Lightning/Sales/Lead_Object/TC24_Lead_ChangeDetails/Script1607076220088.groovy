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

WebUI.callTestCase(findTestCase('SF_Lightning/Sales/Lead_Object/TC01_Lead_Add_Manual'), [('lastname') : '', ('company') : ''], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('SF_Lightning/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/searchsales'), 'sales')

WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/selectsales'))

//WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/salesoption'))
WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/leadobject'))

WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Edit_Detailpage/LeadEditDet_select'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Edit_Detailpage/Leadedit_sel_dropdown'))

WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Edit_Detailpage/Lead_Edit_Detail'))

WebUI.clearText(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Edit_Detailpage/Lead_Edit_Mobile'))

WebUI.sendKeys(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Edit_Detailpage/Lead_Edit_Mobile'), '2356789543')

WebUI.sendKeys(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_ChangeDetails/title'), 'QA')

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Edit_Detailpage/EditLead_Save'))

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Edit_Detailpage/span_Leads'))

WebUI.verifyElementPresent(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Edit_Detailpage/Lead_Mobileverify'), 
    5)

WebUI.delay(5)

WebUI.closeBrowser()

