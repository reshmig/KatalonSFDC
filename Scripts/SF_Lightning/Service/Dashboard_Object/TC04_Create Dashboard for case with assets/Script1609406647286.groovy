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
WebUI.setText(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/searchsales'), 'Service Console')

WebUI.delay(3)

WebUI.click(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj01_CreateEntitlement/App Launcher_Service Console'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj01_CreateEntitlement/SC_Tab Drop Down'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Dashboard_Object/Obj01_Create Dashboard/SC_Dashboard Tab'))

WebUI.click(findTestObject('SF_Lightning/Sales/Dashboard_Object/Obj01_Create Dashboard with different chart types/Dashboard_New B'))

WebUI.switchToFrame(findTestObject('SF_Lightning/Sales/Dashboard_Object/Obj01_Create Dashboard with different chart types/Switched to Dashboard Frame'), 
    0)

WebUI.setText(findTestObject('SF_Lightning/Sales/Dashboard_Object/Obj01_Create Dashboard with different chart types/Dashboard_New_Name'), 
    'Test_Create DB for Cases with Assets')

WebUI.click(findTestObject('SF_Lightning/Sales/Dashboard_Object/Obj01_Create Dashboard with different chart types/Dashboard_New_Create B'))

WebUI.delay(5)

WebUI.refresh()

WebUI.delay(5)

WebUI.switchToFrame(findTestObject('SF_Lightning/Sales/Dashboard_Object/Obj01_Create Dashboard with different chart types/Switched to Dashboard Frame'), 
    0)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Dashboard_Object/Obj01_Create Dashboard with different chart types/Add Component B'))

WebUI.setText(findTestObject('SF_Lightning/Sales/Dashboard_Object/Obj01_Create Dashboard with different chart types/Add C_Search field'), 
    'New Cases with Assets Report_Test')

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Dashboard_Object/Obj01_Create Dashboard with different chart types/Add C_1st Item'))

WebUI.delay(5)

WebUI.click(findTestObject('SF_Lightning/Sales/Dashboard_Object/Obj01_Create Dashboard with different chart types/Add C_Select B'))

WebUI.delay(3)

WebUI.click(findTestObject('SF_Lightning/Sales/Dashboard_Object/Obj01_Create Dashboard with different chart types/Chart_iTem 2'))

WebUI.click(findTestObject('SF_Lightning/Sales/Dashboard_Object/Obj01_Create Dashboard with different chart types/Chart_Add B'))

WebUI.delay(3)

WebUI.click(findTestObject('SF_Lightning/Sales/Dashboard_Object/Obj01_Create Dashboard with different chart types/Dashboard_Save B'))

WebUI.delay(3)

WebUI.click(findTestObject('SF_Lightning/Sales/Dashboard_Object/Obj01_Create Dashboard with different chart types/Done_B'))

WebUI.verifyElementText(findTestObject('SF_Lightning/Sales/Dashboard_Object/Obj01_Create Dashboard with different chart types/Dashboard_Record_Title'), 
    'Test_Create DB for Cases with Assets')

WebUI.delay(3)

WebUI.closeBrowser()

