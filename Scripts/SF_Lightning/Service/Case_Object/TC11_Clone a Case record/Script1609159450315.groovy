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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('SF_Lightning/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

//WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/viewall'))
WebUI.setText(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/searchsales'), 'Service Console')

WebUI.click(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj01_CreateEntitlement/App Launcher_Service Console'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj01_CreateEntitlement/SC_Tab Drop Down'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj03_Verify Entitlement Process name in Case/SC_DD_Cases'))

WebUI.click(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj04_Verify Entitlement Success on Case/Case_New B'))

WebUI.setText(findTestObject('SF_Lightning/Sales/Account_Object/Obj26_Create Case_From Account Related List/Account_RL_Cases_Subject'), 
    'Test_Case Created from Case Home Page')

WebUI.setText(findTestObject('SF_Lightning/Sales/Account_Object/Obj26_Create Case_From Account Related List/Account_RL_Cases_Description'), 
    'Case created successfully from Case Home Page')

WebUI.click(findTestObject('SF_Lightning/Sales/Account_Object/Obj26_Create Case_From Account Related List/Account_RL_Cases_Case Origin'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Account_Object/Obj26_Create Case_From Account Related List/Account_RL_Cases_Case Origin_Email'))

WebUI.click(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj03_Verify Entitlement Process name in Case/Ent_RL_Case_Priority'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj03_Verify Entitlement Process name in Case/Ent_RL_Case_Priority_High'))

WebUI.click(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj04_Verify Entitlement Success on Case/Case_New_Save B'))

WebUI.delay(5)

WebUI.click(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj03_Verify Entitlement Process name in Case/Case_Drop Down'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Case_Object/Obj11_Clone a Case record/Case_DD_Clone B'))

WebUI.setText(findTestObject('SF_Lightning/Sales/Account_Object/Obj26_Create Case_From Account Related List/Account_RL_Cases_Subject'), 
    'Successfully cloned')

WebUI.setText(findTestObject('SF_Lightning/Sales/Account_Object/Obj26_Create Case_From Account Related List/Account_RL_Cases_Description'), 
    'Case is cloned successfully from details page')

WebUI.click(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj04_Verify Entitlement Success on Case/Case_New_Save B'))

WebUI.delay(3)

WebUI.refresh()

WebUI.delay(3)

WebUI.click(findTestObject('SF_Lightning/Service/Case_Object/Obj11_Clone a Case record/Case_Drop down 2'))

WebUI.click(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj03_Verify Entitlement Process name in Case/Case_DD_Delete B'))

WebUI.click(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj02_Create Case from Entitlement related list/Ent_DD_Delete_Confirm Delete'))

WebUI.delay(3)

WebUI.closeBrowser()

