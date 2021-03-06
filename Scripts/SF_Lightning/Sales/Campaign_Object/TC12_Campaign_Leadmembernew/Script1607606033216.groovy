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
WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Campaign_Object/Obj01_AddCampaign/campaign'))

WebUI.click(findTestObject('SF_Lightning/Sales/Campaign_Object/Obj03_EditCampaignDetail/selcampaign'))

WebUI.click(findTestObject('SF_Lightning/Sales/Campaign_Object/Obj12_CampaignLeadmembernew/dropdown'))

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Campaign_Object/Obj12_CampaignLeadmembernew/lead'))

WebUI.click(findTestObject('SF_Lightning/Sales/Campaign_Object/Obj07_CampaignContact/salutationclick'))

WebUI.click(findTestObject('SF_Lightning/Sales/Campaign_Object/Obj07_CampaignContact/salutationsel'))

WebUI.setText(findTestObject('SF_Lightning/Sales/Campaign_Object/Obj07_CampaignContact/lastname'), 'campaigntest_lead')

WebUI.setText(findTestObject('SF_Lightning/Sales/Campaign_Object/Obj12_CampaignLeadmembernew/company'), 'Marlabs')

WebUI.click(findTestObject('SF_Lightning/Sales/Campaign_Object/Obj06_CampaignCase/save'))

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Campaign_Object/Obj12_CampaignLeadmembernew/leadobj'))

WebUI.verifyElementPresent(findTestObject('SF_Lightning/Sales/Campaign_Object/Obj12_CampaignLeadmembernew/verify'), 5)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Campaign_Object/Obj01_AddCampaign/campaign'))

WebUI.click(findTestObject('SF_Lightning/Sales/Campaign_Object/Obj03_EditCampaignDetail/selcampaign'))

WebUI.scrollToElement(findTestObject('SF_Lightning/Sales/Campaign_Object/Obj09_Campaign_Contactmember/scroll'), 0)

WebUI.click(findTestObject('SF_Lightning/Sales/Campaign_Object/Obj11_CampaignLeadmember/leadadd'))

WebUI.delay(10)

WebUI.setText(findTestObject('SF_Lightning/Sales/Campaign_Object/Obj11_CampaignLeadmember/search'), 'campaigntest_lead')

WebUI.delay(10)

WebUI.click(findTestObject('SF_Lightning/Sales/Campaign_Object/Obj12_CampaignLeadmembernew/sellead'))

WebUI.click(findTestObject('SF_Lightning/Sales/Campaign_Object/Obj09_Campaign_Contactmember/next'))

WebUI.delay(5)

WebUI.click(findTestObject('SF_Lightning/Sales/Campaign_Object/Obj09_Campaign_Contactmember/submit'))

WebUI.click(findTestObject('SF_Lightning/Sales/Campaign_Object/Obj09_Campaign_Contactmember/viewall'))

WebUI.verifyElementPresent(findTestObject('SF_Lightning/Sales/Campaign_Object/Obj11_CampaignLeadmember/verify'), 0)

WebUI.delay(5)

WebUI.closeBrowser()

