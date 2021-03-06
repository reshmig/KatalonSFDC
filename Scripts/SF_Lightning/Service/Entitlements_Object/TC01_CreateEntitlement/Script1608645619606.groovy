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

WebUI.click(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj01_CreateEntitlement/SC_Tab Drop Down'))

WebUI.click(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj01_CreateEntitlement/SC_DD_Entitlements'))

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

WebUI.delay(3)

WebUI.closeBrowser()

