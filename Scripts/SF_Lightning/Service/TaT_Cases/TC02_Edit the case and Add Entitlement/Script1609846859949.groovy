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

WebUI.refresh()

WebUI.delay(4)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/TaT_Cases/Case_Edit B'))

WebUI.click(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj03_Verify Entitlement Process name in Case/Ent_RL_Case_Priority'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj03_Verify Entitlement Process name in Case/Ent_RL_Case_Priority_High'))

WebUI.setText(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj04_Verify Entitlement Success on Case/Case_Ent Name'), 
    'Test_Entitlement')

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/TaT_Cases/Case_Ent Name_1st ITem'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('SF_Lightning/Sales/Account_Object/Obj26_Create Case_From Account Related List/Account_RL_Cases_Subject'), 
    'Service Cloud case_updated and Entitlement Added')

WebUI.click(findTestObject('SF_Lightning/Service/TaT_Cases/Case_Edit_Save B'))

WebUI.delay(5)

