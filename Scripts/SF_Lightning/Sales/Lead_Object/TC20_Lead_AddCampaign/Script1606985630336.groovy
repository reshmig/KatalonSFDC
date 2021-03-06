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

//WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/viewall'))
WebUI.setText(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/searchsales'), 'sales')

WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/selectsales'))

//WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/salesoption'))
WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/leadobject'))

WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Edit_Newtask/LeadEditDet_select'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_AddCampaign/campaignsel'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_AddCampaign/campaignadd'))

WebUI.sendKeys(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_AddCampaign/campaigntext'), 'campaigntest')

WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_AddCampaign/select'))

WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_AddCampaign/next'))

WebUI.delay(5)

WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_AddCampaign/status'))

WebUI.delay(5)

WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_AddCampaign/statusselect'))

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_AddCampaign/save'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_AddCampaign/campaign'))

WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_AddCampaign/campaignseladd'))

WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_AddCampaign/all'))

WebUI.verifyElementPresent(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_AddCampaign/verify'), 0)

WebUI.delay(3)

WebUI.closeBrowser()

