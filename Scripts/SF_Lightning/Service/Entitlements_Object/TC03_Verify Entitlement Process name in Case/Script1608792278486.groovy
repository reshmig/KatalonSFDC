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

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj01_CreateEntitlement/SC_DD_Entitlements'))

WebUI.click(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj01_CreateEntitlement/Entitlements_New B'))

WebUI.setText(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj01_CreateEntitlement/Ent_Account Name'), 'Katalon new Account')

WebUI.sendKeys(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj01_CreateEntitlement/Ent_Account Name'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj01_CreateEntitlement/Ent_Search Entitlement Process'), 
    'Test Ent Process 01')

WebUI.sendKeys(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj01_CreateEntitlement/Ent_Search Entitlement Process'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj02_Create Case from Entitlement related list/Ent_Save B'))

WebUI.verifyTextPresent('These required fields must be completed: Entitlement Name', false)

WebUI.setText(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj01_CreateEntitlement/Ent_entitlement name'), 'Test JK Ent Name')

WebUI.click(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj02_Create Case from Entitlement related list/Ent_Save B'))

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj01_CreateEntitlement/Ent_Related Tab'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj02_Create Case from Entitlement related list/Ent_RL_Case HEader Link'))

WebUI.refresh()

WebUI.click(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj02_Create Case from Entitlement related list/Ent_RL_Case_New B'))

WebUI.setText(findTestObject('SF_Lightning/Sales/Account_Object/Obj26_Create Case_From Account Related List/Account_RL_Cases_Subject'), 
    'Test_Case Created from Entitlement RL')

WebUI.setText(findTestObject('SF_Lightning/Sales/Account_Object/Obj26_Create Case_From Account Related List/Account_RL_Cases_Description'), 
    'Case created successfully from Entitlement related list')

WebUI.click(findTestObject('SF_Lightning/Sales/Account_Object/Obj26_Create Case_From Account Related List/Account_RL_Cases_Case Origin'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Account_Object/Obj26_Create Case_From Account Related List/Account_RL_Cases_Case Origin_Email'))

WebUI.click(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj03_Verify Entitlement Process name in Case/Ent_RL_Case_Priority'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj03_Verify Entitlement Process name in Case/Ent_RL_Case_Priority_High'))

WebUI.click(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj02_Create Case from Entitlement related list/Ent_RL_Case_Save B'))

WebUI.delay(3)

WebUI.refresh()

WebUI.verifyElementText(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj03_Verify Entitlement Process name in Case/Case_Milestone Name'), 
    'Test EP 01_Milestone')

WebUI.click(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj03_Verify Entitlement Process name in Case/Case_Drop Down'))

WebUI.click(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj03_Verify Entitlement Process name in Case/Case_DD_Delete B'))

WebUI.click(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj02_Create Case from Entitlement related list/Ent_DD_Delete_Confirm Delete'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj01_CreateEntitlement/SC_Tab Drop Down'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj01_CreateEntitlement/SC_DD_Entitlements'))

WebUI.click(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj01_CreateEntitlement/Ent_First item'))

WebUI.click(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj02_Create Case from Entitlement related list/Ent_Drop Down'))

WebUI.click(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj02_Create Case from Entitlement related list/Ent_DD_Delete B'))

WebUI.click(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj02_Create Case from Entitlement related list/Ent_DD_Delete_Confirm Delete'))

WebUI.delay(5)

WebUI.closeBrowser()

